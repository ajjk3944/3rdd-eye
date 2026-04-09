package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ti2 implements si2 {
    public final /* synthetic */ int a;
    public final ra4 b;

    public /* synthetic */ ti2(ra4 ra4Var, int i) {
        this.a = i;
        this.b = ra4Var;
    }

    @Override // defpackage.si2
    public final void a(HashMap map) {
        switch (this.a) {
            case 0:
                boolean z = Boolean.parseBoolean((String) map.get("content_url_opted_out"));
                ra4 ra4Var = this.b;
                ra4Var.h();
                synchronized (ra4Var.a) {
                    try {
                        if (ra4Var.u == z) {
                            return;
                        }
                        ra4Var.u = z;
                        SharedPreferences.Editor editor = ra4Var.g;
                        if (editor != null) {
                            editor.putBoolean("content_url_opted_out", z);
                            ra4Var.g.apply();
                        }
                        ra4Var.i();
                        return;
                    } finally {
                    }
                }
            default:
                boolean z2 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
                ra4 ra4Var2 = this.b;
                ra4Var2.h();
                synchronized (ra4Var2.a) {
                    try {
                        if (ra4Var2.v == z2) {
                            return;
                        }
                        ra4Var2.v = z2;
                        SharedPreferences.Editor editor2 = ra4Var2.g;
                        if (editor2 != null) {
                            editor2.putBoolean("content_vertical_opted_out", z2);
                            ra4Var2.g.apply();
                        }
                        ra4Var2.i();
                        return;
                    } finally {
                    }
                }
        }
    }
}
