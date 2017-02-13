package com.getitstart.designpattern.strategy;

public class QuickSort implements Sorter {
	private Comparable[] data;
	
	@Override
	public void sort(Comparable[] data) {
		this.data = data;
		qSort(0, data.length - 1);
	}
	
	private void qSort(int pre, int post){
		int savedPre = pre;
		int savedPost = post;
		Comparable min =  data[(post + pre)/2];
		do{
			while(data[pre].compareTo(min) < 0){
				pre++;
			}
			while(min.compareTo(data[post]) < 0){
				post--;
			}
			if(pre <= post){
				Comparable tmp = data[pre];
				data[pre] = data[post];
				data[post] = tmp;
				pre++;
				post--;
			}
		}while(pre <= post);
		if(savedPre < post){
			qSort(savedPre, post);
		}
		if(pre < savedPost){
			qSort(pre, savedPost);
		}
	}
}
