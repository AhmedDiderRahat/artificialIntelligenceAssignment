package com.neub.cse_412_assignment_5.BFS_code;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Team : R & D_v.3
 */

public class GraphRepresentation {

    public int number_of_edge, size;

    public int number_of_node;
    public String src, dest;
    public String[] edge;

    public GraphRepresentation(String[] str, int a, int b) {
        number_of_node = a;
        number_of_edge = b;
        size = 100;
        edge = new String[size];

        System.arraycopy(str, 0, edge, 0, (number_of_edge * 2));

        src = str[number_of_edge * 2];
        dest = str[(number_of_edge * 2) + 1];
    }

    @SuppressWarnings("empty-statement")
    public String edgeList() {

        number_of_edge = number_of_edge * 2;

        String[] unique_edge = new String[size];
        int count = 0;
        boolean bl = true;
        for (int i = 0; i < number_of_edge; i++) {
            for (int j = 0; j < count; j++) {
                if (edge[i].equals(unique_edge[j])) {
                    bl = false;
                }
            }
            if (bl) {
                unique_edge[count++] = edge[i];
            }
            bl = true;
        }

        int[][] edge_list = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                edge_list[i][j] = -10;
            }
        }

        //System.out.println("");
        String temp = " ";
        for (int i = 0; i < number_of_node; i++) {
            int ind = 0;
            for (int j = 0; j < number_of_edge - 1; j += 2) {
                if (unique_edge[i].equals(edge[j])) {
                    temp = edge[j + 1];
                    for (int k = 0; k < number_of_node; k++) {
                        if (temp.equals(unique_edge[k])) {
                            edge_list[i][ind++] = k;
                        }
                    }
                } else if (unique_edge[i].equals(edge[j + 1])) {
                    temp = edge[j];
                    for (int k = 0; k < number_of_node; k++) {
                        if (temp.equals(unique_edge[k])) {
                            edge_list[i][ind++] = k;
                        }

                    }
                }
            }
        }

        for (int i = 0; i < number_of_node; i++) {
            for (int j = 0; j < size; j++) {
                if (edge_list[i][j] == -10) {
                    break;
                }
                //System.out.print(edge_list[i][j] + " ");
            }
            // System.out.println("");
        }

       // System.out.println("");
        int[] parent = new int[size];
        boolean[] color = new boolean[size];

        for (int i = 0; i < size; i++) {
            color[i] = false;
            parent[i] = -200;
        }

        //BFS Start : 
        Queue<Integer> queue = new LinkedList<Integer>();

        int start = -10, end = -10;
        for (int i = 0; i < number_of_node; i++) {
            if (unique_edge[i].equals(src)) {
                start = i;
            }
            if (unique_edge[i].equals(dest)) {
                end = i;
            }
        }
       
        color[start] = true;
        parent[start] = -100;

        queue.add(start);
        int u = -300, v = -300;
        while (!queue.isEmpty()) {
            u = queue.peek();
            queue.remove();

            for (int i = 0; i < size; i++) {
                v = edge_list[u][i];
                if (v == -10) {
                    break;
                };

                if (color[v] == false) {
                    color[v] = true;
                    parent[v] = u;
                    queue.add(v);
                }
            }
        }

        //patth print : 
        String[] path = new String[size];

        int idx = 0;

        // System.out.println("path : ");
        bl = true;
        while (true) {
            if (start == end) {
                path[idx++] = unique_edge[end];
                //System.out.print(start +  " ");
                //bl = false;
                break;
            }

            //System.out.print(end + " ");
            path[idx++] = unique_edge[end];

            end = parent[end];
            if (end < 0) {
                bl = false;
                break;
            }

        }
        //  System.out.println("");        
        String finalPath = "";
        if (bl) {
            finalPath = path[idx - 1];
            for (int i = idx - 2; i >= 0; i--) {
                finalPath = finalPath + "  - > " + path[i];
            }
        } else {
            finalPath = "No Path Exit...!!!";
        }
            
        return finalPath;
    }
}
