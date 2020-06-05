class Solution {

int res = Integer.MIN_VALUE;
public int longestUnivaluePath(TreeNode root) {
    if(root==null)
        return 0;
    getlongvalue(root,root.val);
    return res;
}

public int getlongvalue(TreeNode node,int value){
    if(node == null)
        return 0;
    int leftpath = getlongvalue(node.left,node.val);
    int rightpath = getlongvalue(node.right,node.val);
    res = Math.max(res,leftpath+rightpath);
    if(node.val==value)
        return 1+Math.max(leftpath,rightpath);
    return 0;
}
}
