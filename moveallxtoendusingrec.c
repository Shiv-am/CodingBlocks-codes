#include<iostream>
#include<string.h>
char* moveallxtoend(char *a,char *b,int n,int m)
{
	if(n==0)
	{
		b[m]='\0';
		return b;
	}
	char ch=a[0];
	if(ch=='x')
	{
		moveallxtoend(a+1,b,n-1,m-1);
		b[m-1]=ch;
	}
	else
	{
		b[0]=ch;
		moveallxtoend(a+1,b+1,n-1,m-1);
	}
	return b;
}
int main() {
	char a[10000],b[10000];
	int n,m;
      scanf("%s",a);
	  n=strlen(a);
      m=n;
	  printf("%s",moveallxtoend(a,b,n,m));
	return 0;
}