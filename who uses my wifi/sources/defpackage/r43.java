package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r43 implements n53 {
    public final /* synthetic */ int a;
    public final Boolean b;

    public /* synthetic */ r43(Boolean bool, int i) {
        this.a = i;
        this.b = bool;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        switch (this.a) {
            case 0:
                jm2 jm2Var = (jm2) obj;
                Boolean bool = this.b;
                if (bool != null) {
                    jm2Var.a.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
            default:
                Bundle bundle = ((jm2) obj).a;
                Boolean bool2 = this.b;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        bundle.putInt("lft", 0);
                        break;
                    } else {
                        bundle.putInt("lft", 1);
                        break;
                    }
                } else {
                    bundle.putInt("lft", -1);
                    break;
                }
        }
    }
}
