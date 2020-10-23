#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node * lc;
    struct node * rc;
};
struct node * newnode(int data){
    struct node * node =(struct node*)malloc(sizeof(struct node));
    node -> data= data;
    node ->lc = NULL;
    node ->rc = NULL;
    return node;
}

void preorder(struct node *node){
    if(node){
        printf("%d ",node->data);
        preorder(node->lc);
        preorder(node->rc);
    }
}

void postorder(struct node *node){
    if(node){
        postorder(node->lc);
        postorder(node->rc);
        printf("%d ",node->data);
    }
}

void inorder(struct node *node){
    if(node){
        inorder(node->lc);
        printf("%d ",node->data);
        inorder(node->rc);
    }
}


int main(){
    struct node * head= newnode(1);
    head ->lc = newnode(2);
    head ->lc->lc= newnode(4);
    head ->lc->rc= newnode(5);
    head ->lc->rc->lc= newnode(8);

    head ->rc = newnode(3);
    head ->rc->lc= newnode(6);
    head ->rc->rc= newnode(7);
    head ->rc->rc->lc= newnode(9);
    head ->rc->rc->rc= newnode(10);

    preorder(head);
    printf("\n");
    postorder(head);
    printf("\n");
    inorder(head);
    return 0;
}
