package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y73 extends hv1 {
    public final v73 f;
    public final s73 g;
    public final i83 h;
    public iu2 i;
    public boolean j;

    public y73(v73 v73Var, s73 s73Var, i83 i83Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.j = false;
        this.f = v73Var;
        this.g = s73Var;
        this.h = i83Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x022d A[Catch: all -> 0x0221, TryCatch #1 {, blocks: (B:148:0x0202, B:152:0x021a, B:158:0x0224, B:159:0x022d, B:161:0x0233, B:165:0x0247), top: B:173:0x0202, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0245 A[DONT_GENERATE] */
    @Override // defpackage.hv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A3(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y73.A3(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public final synchronized void B3(u10 u10Var) {
        ou1.h("destroy must be called on the main UI thread.");
        Context context = null;
        this.g.g.set(null);
        if (this.i != null) {
            if (u10Var != null) {
                context = (Context) oi0.l1(u10Var);
            }
            fn2 fn2Var = this.i.c;
            fn2Var.getClass();
            fn2Var.P1(new z71(20, context));
        }
    }

    public final synchronized boolean C3() {
        iu2 iu2Var = this.i;
        if (iu2Var != null) {
            if (!iu2Var.r.g.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void a3(u10 u10Var) {
        try {
            ou1.h("showAd must be called on the main UI thread.");
            if (this.i != null) {
                Activity activity = null;
                if (u10Var != null) {
                    Object objL1 = oi0.l1(u10Var);
                    if (objL1 instanceof Activity) {
                        activity = (Activity) objL1;
                    }
                }
                this.i.c(activity, this.j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o1(u10 u10Var) {
        ou1.h("resume must be called on the main UI thread.");
        if (this.i != null) {
            Context context = u10Var == null ? null : (Context) oi0.l1(u10Var);
            fn2 fn2Var = this.i.c;
            fn2Var.getClass();
            fn2Var.P1(new nc3(context, false));
        }
    }

    public final synchronized void z0(u10 u10Var) {
        ou1.h("pause must be called on the main UI thread.");
        if (this.i != null) {
            Context context = u10Var == null ? null : (Context) oi0.l1(u10Var);
            fn2 fn2Var = this.i.c;
            fn2Var.getClass();
            fn2Var.P1(new zj0(context));
        }
    }
}
