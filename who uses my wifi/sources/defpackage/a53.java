package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a53 implements n53 {
    public final /* synthetic */ int a;
    public final Cloneable b;

    public /* synthetic */ a53(Cloneable cloneable, int i) {
        this.a = i;
        this.b = cloneable;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) this.b;
                jm2 jm2Var = (jm2) obj;
                if (bundle != null) {
                    jm2Var.a.putAll(bundle);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) this.b;
                jm2 jm2Var2 = (jm2) obj;
                if (!bundle2.isEmpty()) {
                    jm2Var2.a.putBundle("shared_pref", bundle2);
                    break;
                }
                break;
            default:
                ((jm2) obj).a.putStringArrayList("ad_types", (ArrayList) this.b);
                break;
        }
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) this.b;
                jm2 jm2Var = (jm2) obj;
                if (bundle != null) {
                    jm2Var.b.putAll(bundle);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) this.b;
                jm2 jm2Var2 = (jm2) obj;
                if (!bundle2.isEmpty()) {
                    jm2Var2.b.putBundle("shared_pref", bundle2);
                    break;
                }
                break;
            default:
                ((jm2) obj).b.putStringArrayList("ad_types", (ArrayList) this.b);
                break;
        }
    }
}
