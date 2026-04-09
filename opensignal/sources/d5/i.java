package d5;

import android.content.Context;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements ne.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6997a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f6998d;

    public /* synthetic */ i(Context context, int i10) {
        this.f6997a = i10;
        this.f6998d = context;
    }

    @Override // ne.n
    public final Object get() {
        r5.g gVar;
        switch (this.f6997a) {
            case 0:
                return new bm.e(this.f6998d, 13);
            case 1:
                return new o5.m(this.f6998d, new u5.i());
            case 2:
                return new DefaultTrackSelector(this.f6998d);
            default:
                Context context = this.f6998d;
                oe.u0 u0Var = r5.g.J;
                synchronized (r5.g.class) {
                    try {
                        if (r5.g.P == null) {
                            r5.g.P = new l5.c(context, 2).o();
                        }
                        gVar = r5.g.P;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return gVar;
        }
    }
}
