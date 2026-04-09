package ql;

import android.view.MotionEvent;
import androidx.recyclerview.widget.i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf.e f32470a;

    public e(lf.e eVar) {
        this.f32470a = eVar;
    }

    @Override // androidx.recyclerview.widget.i1
    public final boolean a(MotionEvent motionEvent) {
        return this.f32470a.d(motionEvent);
    }

    @Override // androidx.recyclerview.widget.i1
    public final void onTouchEvent(MotionEvent motionEvent) {
        this.f32470a.d(motionEvent);
    }
}
