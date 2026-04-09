package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class om2 implements ca4 {
    public final /* synthetic */ int a;
    public final mm2 b;

    public /* synthetic */ om2(mm2 mm2Var, int i) {
        this.a = i;
        this.b = mm2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return (Bundle) this.b.c;
            case 1:
                return Integer.valueOf(this.b.g);
            case 2:
                return (i83) this.b.d;
            default:
                return this.b.b();
        }
    }
}
