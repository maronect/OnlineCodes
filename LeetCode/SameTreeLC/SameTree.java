package SameTreeLC;

import java.util.ArrayList;
import java.util.List;

class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    int [][] provisorylist;

        
    int [] lista1 = recurssiveMethod(p);
    int [] lista2 = recurssiveMethod(q);

    if(lista1 != lista2) return false;//SE der p comparar direto 2 listas
    return true;
        
    //se n, faz por for ou dicionario
    }

    public int [] recurssiveMethod (TreeNode a){
        provisorylist
    }

}


