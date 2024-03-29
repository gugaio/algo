def merge_sort(arr):
    if len(arr)<=1:
        return
    
    mid = len(arr)//2
    
    left = arr[mid:]
    right = arr[:mid]
    
    merge_sort(left)
    merge_sort(right)
    
    i=j=k=0
    while i < len(left) and j < len(right):
        if left[i]<right[j]:
            arr[k]=left[i]
            i += 1
        else:
            arr[k]=right[j]
            j += 1
        k += 1

    while i < len(left):
        arr[k]=left[i]
        k += 1
        i += 1

    while j < len(right):
        arr[k]=right[j]
        k += 1
        j += 1


def selection_sort(arr):
    n = len(arr)
    for step in range(n):
        min_idx = step
        for i in range(step+1,n):
            if arr[min_idx] > arr[i]:
                min_idx = i
        (arr[step],arr[min_idx])=(arr[min_idx],arr[step])


def insertion_sort(arr):
    n = len(arr)
    for step in range(1,n):
        stepValue = arr[step]
        j = step - 1
        while j>=0 and arr[j] > stepValue:
            arr[j+1]=arr[j]
            j = j -1
        arr[j+1]=stepValue


def bubble_sort(arr):
    n = len(arr)
    for step in range(n-1):
        for j in range(n-1-step):
            if arr[j]>arr[j+1]:
                (arr[j],arr[j+1])=(arr[j+1],arr[j])
                swapped=True
        if not swapped:
            return


def print_list(arr):
    print(arr)


arr = [3,8,4,7,1,5]
#arr=[5]
#arr=[]
print_list(arr)
#selection_sort(arr)
#insertion_sort(arr)
#bubble_sort(arr)
merge_sort(arr)
print_list(arr)
