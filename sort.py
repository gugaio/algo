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


def print_list(arr):
    print(arr)

arr = [3,8,4,7,1,5]
#arr=[5]
#arr=[]
print_list(arr)
#selection_sort(arr)
insertion_sort(arr)
print_list(arr)
