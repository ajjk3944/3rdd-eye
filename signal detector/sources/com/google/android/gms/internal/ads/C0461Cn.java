package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import t2.C2925i;

/* renamed from: com.google.android.gms.internal.ads.Cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461Cn extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C2925i f7659a;

    public C0461Cn(Context context, View view, C2925i c2925i) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f7659a = c2925i;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f7659a.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof InterfaceC0828Yg) {
                arrayList.add((InterfaceC0828Yg) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC0828Yg) arrayList.get(i3)).destroy();
        }
    }
}
