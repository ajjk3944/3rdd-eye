package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z43 implements ca4 {
    public final ga4 a;
    public final ga4 b;
    public final ga4 c;

    public z43(ba4 ba4Var, ba4 ba4Var2, hh2 hh2Var) {
        this.a = ba4Var;
        this.b = ba4Var2;
        this.c = hh2Var;
    }

    @Override // defpackage.ga4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k33 d() {
        return new k33((ApplicationInfo) this.a.d(), (PackageInfo) this.b.d(), ((hh2) this.c).a(), 2);
    }
}
