package maxsumtwopath;

import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
     
        Node root = new Node(Integer.parseInt(ip[0]));
      

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);


        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            
            Node currNode = queue.peek();
            queue.remove();

            
            String currVal = ip[i];

            
            if (!currVal.equals("N")) {

               
                currNode.left = new Node(Integer.parseInt(currVal));
               
                queue.add(currNode.left);
            }

            
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            
            if (!currVal.equals("N")) {

              
                currNode.right = new Node(Integer.parseInt(currVal));

                
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);

            Maxsum g = new Maxsum();
            System.out.println(g.maxPathSum(root));
        }
    }
}

class Maxsumtwopath {
    static int res;
    static boolean isLeaf(Node node) {
        return ((node.left==null) && (node.right==null));
    }
    static int func(Node node) {
        if(node==null)
            return 0;
        if(isLeaf(node))
            return node.data;
        int ls=func(node.left);
        int rs=func(node.right);
        if((node.left!=null) && (node.right!=null)) {
            res=Math.max(res,ls+rs+node.data);
            return Math.max(ls,rs)+node.data;
        }
        return (((node.left==null)?rs:ls)+node.data);
    }
    public static int maxPathSum(Node root) {
        res=Integer.MIN_VALUE;
        func(root);
        return res;
    }
}
