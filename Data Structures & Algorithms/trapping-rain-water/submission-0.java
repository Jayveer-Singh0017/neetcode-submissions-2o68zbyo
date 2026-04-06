class Solution {
    public int[]getLeftMax(int height[]){
        int left[] = new int[height.length];
        left[0] = height[0];

        for(int i=1; i<height.length; i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        return left;
    }

    public int[]getRightMax(int height[]){
        int n = height.length;
        int right[] = new int[n];
        right[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }

        return right;
    }

    public int trap(int[] height) {
        int left[] = getLeftMax(height);
        int right[] = getRightMax(height);

        int totalWater = 0;
        for(int i=0; i<height.length; i++){
            int water = Math.min(left[i],right[i]) - height[i];

            if(water > 0){
                totalWater += water;
            }
        }

        return totalWater;
    }
}
