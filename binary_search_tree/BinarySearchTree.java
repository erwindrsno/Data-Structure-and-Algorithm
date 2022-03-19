package com.week2;

class BinarySearchTree<T extends Comparable<T>>{
    private Node root;

    private class Node{
        T info;
        Node left, right, parent;

        Node(T info){
            this.info = info;
        }

        @Override
        public String toString(){
            return "[" + this.info.toString()+"]";
        }
    }

    public void insert(T data){
        Node newNode = new Node(data);
        Node curr = this.root;
        Node parent = null;

        if(this.root == null){
            this.root = newNode;
        }
        else{
            while(curr != null){
                parent = curr;
                if(data.compareTo(curr.info) < 0){
                    curr = curr.left;
                }
                else{
                    curr = curr.right;
                }
            }
            newNode.parent = parent;
            if(data.compareTo(parent.info)<0){
                parent.left = newNode;
            }
            else{
                parent.right = newNode;
            }
        }    
    }

    @Override
    public String toString(){
        return inOrder(this.root);
    }

    private String inOrder(Node x){
        if(x == null){
            return "";
        }
        if(x.left == null && x.right == null){
            return x.toString();
        }
        else{
            return inOrder(x.left) + x.toString() + inOrder(x.right);
        }
    }

    public T search(T data){
        Node result = search(data, this.root);
        if(result == null){
            return null;
        }
        else{
            return result.info;
        }
    }

    private Node search(T data, Node curr){
        if(curr == null){
            return null;
        }
        else if(curr.info.compareTo(data) == 0){
            return curr;
        }
        else if(curr.info.compareTo(data) < 0){
            return search(data,curr.right);
        }
        else {
            return search(data,curr.left);
        }
    }

    public T min(){
        Node result = min(this.root);
        if(result == null){
            return null;
        }
        else{
            return result.info;
        }
    }

    private Node min(Node curr){
        if(curr == null){
            return null;
        }
        else{
            while(curr.left != null){
                curr = curr.left;
            }
            return curr;
        }
    }

    public T max(){
        Node result = max(this.root);
        if(result == null){
            return null;
        }
        else{
            return result.info;
        }
    }

    private Node max(Node curr){
        if(curr == null){
            return null;
        }
        else{
            while(curr.right != null){
                curr = curr.right;
            }
            return curr;
        }
    }

    public Node successor(Node curr){
        if(curr.right != null){
            return min(curr.right);
        }
        else{
            Node a = curr.parent;
            while(a != null && curr == a.right){
                curr = a;
                a = a.parent;
            }
            return a;
        }
    }

    public Node predecessor(Node curr){
        if(curr.left != null){
            return max(curr.left);
        }
        else{
            Node a = curr.parent;
            while(a != null && curr == a.left){
                curr = a;
                a = a.parent;
            }
            return a;
        }
    }

    public boolean delete(T data){
        Node del = search(data,this.root);
        if(del == null){
            return false;   //data doesn't exist
        }
        else{
            delete(this.root,del);
            return true;
        }
    }

    private void delete(Node curr, Node del){
        Node parent = null;
        while(curr.info.compareTo(del.info) != 0){  //curr sebagai pointer agar dapat traverse ke Node yang ingin ditujui (node yg ingin dihapus)
            if(curr.info.compareTo(del.info) < 0){
                if(curr.right == del){
                    parent = curr;
                }
                else if(curr.left == del){
                    parent = curr;
                }
                curr = curr.right;
            }
            else if(curr.info.compareTo(del.info) > 0){
                if(curr.right == del){
                    parent = curr;
                }
                else if(curr.left == del){
                    parent = curr;
                }
                curr = curr.left;
            }
        }
        //System.out.println("Curr.info = " + curr.info + " del.info = " + del.info + " Parent.info = " + parent.info);
        if(curr.left == null && curr.right == null){    //jika node yang ingin didelete adalah leave
            if(parent.left == curr){
                parent.left = null;
            }
            else if(parent.right == curr){
                parent.right = null;
            }
            //System.out.println("Ini adalah leave");
        }
        else{
            if(curr.left == null && curr.right != null){    //jika node hanya memiliki salah satu anak, yaitu anak kanan
                Node currTwo = curr;
                curr = curr.right;
                if(parent.left == currTwo){
                    parent.left = null;
                }
                else if(parent.right == currTwo){
                    parent.right = null;
                }
                curr.parent = parent;
            }
            else if(curr.left != null && curr.right == null){   //jika node hanya memiliki salah satu anak, yaitu anak kiri
                Node currTwo = curr;
                curr = curr.left;
                if(parent.left == currTwo){
                    parent.left = null;
                }
                else if(parent.right == currTwo){
                    parent.right = null;
                }
                curr.parent = parent;
                // parent.right = null;
                // curr = curr.left;
                //curr = null;
            }
            else if(curr.left != null && curr.right != null){   //jika node memiliki 2 anak
                curr = successor(curr);
                Node y = curr;
                delete(curr,y);
            }
        }
    }
}