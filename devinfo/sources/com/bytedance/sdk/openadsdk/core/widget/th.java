package com.bytedance.sdk.openadsdk.core.widget;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th {
    boolean bly;
    int fkw;

    /* renamed from: le, reason: collision with root package name */
    int f8510le;

    /* renamed from: lh, reason: collision with root package name */
    float f8511lh;
    final ouw ouw;
    float yu;
    private final boolean tlj = false;
    public boolean vt = false;
    boolean ra = true;
    boolean pno = false;

    /* renamed from: cf, reason: collision with root package name */
    private final View.OnTouchListener f8509cf = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.th.1
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
        @Override // android.view.View.OnTouchListener
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.th.AnonymousClass1.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    };

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void jg();

        boolean vpp();
    }

    public th(ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final void ouw(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f8509cf);
        }
    }
}
