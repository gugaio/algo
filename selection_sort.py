def selection_sort(arr):
    n = len(arr)
    for step in range(n):
        min_idx = step
        for i in range(step+1,n):
            if arr[min_idx] > arr[i]:
                min_idx = i
        (arr[step],arr[min_idx])=(arr[min_idx],arr[step])



def print_list(arr):
    print(arr)

arr = [3,8,4,7,1,5]
#arr=[5]
#arr=[]
print_list(arr)
selection_sort(arr)
print_list(arr)
