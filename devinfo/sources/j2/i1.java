package j2;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i1 implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.k f27185a;

    public i1(com.google.android.gms.common.api.internal.k kVar) {
        this.f27185a = kVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        com.google.android.gms.common.api.internal.k kVar = this.f27185a;
        n nVar = (n) kVar.f9099e;
        if (!kVar.f9097c) {
            int i4 = kVar.f9098d;
            if (i4 == 1) {
                if (Math.abs(f10) > Math.abs(f11)) {
                    nVar.invoke(new n1.c(f10 > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (i4 == 2 && Math.abs(f11) > Math.abs(f10)) {
                nVar.invoke(new n1.c(f11 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
