package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p33 implements n53 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final Object c;

    public /* synthetic */ p33(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) this.c;
                jm2 jm2Var = (jm2) obj;
                if (str != null) {
                    Bundle bundleY = i30.Y(jm2Var.a, "pii");
                    bundleY.putString("afai", str);
                    bundleY.putBoolean("is_afai_lat", this.b);
                    break;
                }
                break;
            default:
                Bundle bundle = ((jm2) obj).a;
                if (((Boolean) tw1.e.c.a(mz1.Q5)).booleanValue()) {
                    bundle.putBoolean("app_switched", this.b);
                }
                vi4 vi4Var = (vi4) this.c;
                if (vi4Var != null) {
                    int i = vi4Var.f;
                    if (i != 1) {
                        if (i == 2) {
                            bundle.putString("avo", "l");
                            break;
                        }
                    } else {
                        bundle.putString("avo", "p");
                        break;
                    }
                }
                break;
        }
    }
}
