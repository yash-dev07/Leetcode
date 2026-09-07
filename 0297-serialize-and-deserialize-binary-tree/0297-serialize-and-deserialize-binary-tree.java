/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "null,";
        }
        return root.val+","+serialize(root.left)+serialize(root.right);
        
    }
           
 int i=0;    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        i=0;
        
        return build(arr);

        
    }
    public TreeNode build(String[] arr){
        if(arr[i].equals("null")){
            i++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(arr[i++]));
        node.left=build(arr);
        node.right=build(arr);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));