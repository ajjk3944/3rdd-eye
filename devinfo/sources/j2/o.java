package j2;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f27242b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, int i4) {
        super(0);
        this.f27241a = i4;
        this.f27242b = rVar;
    }

    @Override // mk.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f27241a) {
            case 0:
                return d0.e(this.f27242b);
            case 1:
                r rVar = this.f27242b;
                MotionEvent motionEvent = rVar.f27289t0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    rVar.f27291u0 = SystemClock.uptimeMillis();
                    rVar.post(rVar.f27301z0);
                }
                return yj.u.f37649a;
            default:
                return this.f27242b.get_viewTreeOwners();
        }
    }
}
