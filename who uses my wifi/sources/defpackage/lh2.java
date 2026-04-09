package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lh2 implements ca4 {
    public final hh2 a;

    public lh2(hh2 hh2Var) {
        this.a = hh2Var;
    }

    @Override // defpackage.ga4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String d() {
        w63 liteSdkVersion;
        nm2 nm2Var = (nm2) t83.S(this.a.a()).h;
        if (nm2Var != null) {
            try {
                liteSdkVersion = nm2Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.h;
        }
        return null;
    }
}
