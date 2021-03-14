package com.sky.week1;

import com.sky.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 429. N 叉树的层序遍历
 */
public class Q429 {
    List<List<Integer>> res;
    public List<List<Integer>> levelOrder(Node root) {
        res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        levelOrder(0, root);
        return res;
    }

    private void levelOrder(int level, Node root) {
        int index = level+1;
        if (root == null) {
            return;
        }
        if (res.size() < index) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        int childrenSize = root.children.size();
        for (int j = 0; j < childrenSize; j++){
            levelOrder(index, root.children.get(j));
        }
    }


}
