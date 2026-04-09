package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class js3 implements th3 {
    public final th3 f;
    public Uri g = Uri.EMPTY;

    public js3(th3 th3Var) {
        this.f = th3Var;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) {
        th3 th3Var = this.f;
        this.g = ij3Var.a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jA = th3Var.a(ij3Var);
            Uri uriH = th3Var.h();
            if (uriH != null) {
                this.g = uriH;
            }
            th3Var.g();
            return jA;
        } catch (Throwable th) {
            Uri uriH2 = th3Var.h();
            if (uriH2 != null) {
                this.g = uriH2;
            }
            th3Var.g();
            throw th;
        }
    }

    @Override // defpackage.th3
    public final void b(ws3 ws3Var) {
        ws3Var.getClass();
        this.f.b(ws3Var);
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) {
        return this.f.d(bArr, i, i2);
    }

    @Override // defpackage.th3
    public final Map g() {
        return this.f.g();
    }

    @Override // defpackage.th3
    public final Uri h() {
        return this.f.h();
    }

    @Override // defpackage.th3
    public final void l() {
        this.f.l();
    }
}
