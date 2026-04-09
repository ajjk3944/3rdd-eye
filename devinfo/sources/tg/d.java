package tg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f34567b;

    public /* synthetic */ d(int i4, View view) {
        this.f34566a = i4;
        this.f34567b = view;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        ViewParent parent;
        switch (this.f34566a) {
            case 0:
                nk.k.e((Context) obj, "context");
                return this.f34567b;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                nk.k.e(motionEvent, "event");
                int actionMasked = motionEvent.getActionMasked();
                View view = this.f34567b;
                if (actionMasked == 0) {
                    ViewParent parent2 = view.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((actionMasked == 1 || actionMasked == 3) && (parent = view.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                return Boolean.FALSE;
        }
    }
}
