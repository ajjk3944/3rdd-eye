package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n43 implements n53 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final Bundle c;
    public final String d;

    public n43(String str, Bundle bundle, String str2) {
        this.b = str;
        this.c = bundle;
        this.d = str2;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = ((jm2) obj).a;
                bundle.putString("consent_string", this.b);
                bundle.putString("fc_consent", this.d);
                Bundle bundle2 = this.c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                    break;
                }
                break;
            default:
                Bundle bundle3 = ((jm2) obj).a;
                bundle3.putString("rtb", this.b);
                if (((Boolean) tw1.e.c.a(mz1.C4)).booleanValue()) {
                    String str = this.d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = this.c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n43(String str, String str2, Bundle bundle) {
        this.b = str;
        this.d = str2;
        this.c = bundle;
    }
}
