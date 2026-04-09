package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import b5.o;
import ig.b;
import ig.c;
import ig.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CpuStatusCard extends RecyclerView {
    public final e L0;
    public final o M0;

    public CpuStatusCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M0 = new o(18, this);
        setVerticalScrollBarEnabled(false);
        int i4 = Runtime.getRuntime().availableProcessors() != 2 ? 4 : 2;
        getContext();
        setLayoutManager(new b(i4));
        e eVar = new e(getContext(), new ArrayList());
        this.L0 = eVar;
        setAdapter(eVar);
        setItemAnimator(null);
        i(new c(this, i4));
    }
}
