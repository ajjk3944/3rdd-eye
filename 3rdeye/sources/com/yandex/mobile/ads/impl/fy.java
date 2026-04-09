package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public abstract class fy<T extends dy> extends RecyclerView.F {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(View itemView) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
    }

    public abstract void a(T t10);
}
