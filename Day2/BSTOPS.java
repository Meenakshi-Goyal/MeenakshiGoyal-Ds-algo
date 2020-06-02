import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BSTOperations {
    
    class Node{
        int data;
        int pos;
        Node left,right;
         
        Node(int value,int position){
            this.pos = position;
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }
    Node root = null;
    public static StringBuilder sb ;
    public static boolean flag ;
    
    public void insert(int data){
        this.root = insert(data,this.root,1);
    }
    private Node insert(int data,Node node,int pos){
        if(node == null){
            node = new Node(data,pos);
            sb.append(pos);
            return node;
        }
        if(data<node.data){
            node.left = insert(data,node.left,2*pos);
        }else{
            node.right = insert(data,node.right,2*pos+1);
        }
        return node;
    }
    public int first(Node node){
        int min = Integer.MIN_VALUE;
        while(node!=null){
            min = node.data;
            node = node.left;
        }
        return min;
    }
    
    public void delete(int data){
        this.root = delete(this.root,data);
    }
    private Node delete(Node node, int data){
        if(node!=null){
            if(data<node.data){
                node.left = delete(node.left,data);
            }else if(data>node.data){
                node.right = delete(node.right,data);
            }else{
                if(!flag){
                    sb.append(node.pos);
                    flag = true;
                }
                if(node.left == null){
                    node = node.right;
                }else if(node.right == null){
                    node = node.left;
                }else{
                    node.data = first(node.right);
                    node.right = delete(node.right,node.data);
                } 
            }
            return node;
        }
        return node;
    }
    public static void main(String[] args) throws IOException
    {
        BSTOperations m = new BSTOperations();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine().trim());
        while(q!=0){
            String[] a = br.readLine().trim().split(" ");
            sb = new StringBuilder();
            flag = false;
            if(a[0].equals("i")){
                int an = Integer.parseInt(a[1]);
                m.insert(an);
            }else{
                int an = Integer.parseInt(a[1]);
                m.delete(an);
            }
            q--;
            System.out.println(sb.toString());
        }
        
    }
}
