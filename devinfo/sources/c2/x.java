package c2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i4) {
        super(1);
        this.f2695a = i4;
        this.f2696b = yVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f2695a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                mk.c cVar = this.f2696b.f2697a;
                if (cVar != null) {
                    cVar.invoke(motionEvent);
                    return yj.u.f37649a;
                }
                nk.k.k("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                mk.c cVar2 = this.f2696b.f2697a;
                if (cVar2 != null) {
                    cVar2.invoke(motionEvent2);
                    return yj.u.f37649a;
                }
                nk.k.k("onTouchEvent");
                throw null;
        }
    }
}
