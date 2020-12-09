int[] mutateTheArray(int n, int[] a) {
    int b [] = new int [n];
    for (int i = 0 ; i<n ; i++){
        b[i] = (i!=0 ? a[i-1] : 0) + a[i] + (i!=n-1 ? a[i+1] : 0);
    }
    return b;
}
