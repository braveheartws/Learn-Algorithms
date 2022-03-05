package com.havefun.learnalgorithms.bean;

public class BinaryTree {
    public int getMaxWidth(Node node) {

        int maxWidth = 0;
        int width;
        int h = getHeight(node);
        for (int i = 1; i <= h; i++) {
            width = getWidth(node, i);
            maxWidth = Math.max(width, maxWidth);
        }
        return maxWidth;
    }

    public int getHeight(Node root) {
        if (root == null) return 0;
        // 获取左子树的高度
        int leftHeight = getHeight(root.left);
        // 获取右子树的高度
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    public int getWidth(Node node, int level) {
        if (node == null) return 0;
        if (level == 1) return 1;
        int leftWidth = getWidth(node.left, level  - 1);
        int rightWidth = getWidth(node.right, level - 1);
        return leftWidth + rightWidth;
    }
}
