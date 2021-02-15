package com.elbrus.geektechanimation;

import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.recyclerview.widget.RecyclerView;

public class MyAnimation {

    public static void startRecyclerAnimation(RecyclerView recyclerView, int animationId){
        LayoutAnimationController controller = null;
        controller = AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), animationId);
        recyclerView.setLayoutAnimation(controller);
        recyclerView.scheduleLayoutAnimation();
    }
}
