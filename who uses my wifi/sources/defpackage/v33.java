package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v33 implements n53 {
    public final Context a;
    public final Bundle b;
    public final String c;
    public final String d;
    public final ra4 e;
    public final String f;
    public final ul2 g;

    public v33(Context context, Bundle bundle, String str, String str2, ra4 ra4Var, String str3, ul2 ul2Var) {
        this.a = context;
        this.b = bundle;
        this.c = str;
        this.d = str2;
        this.e = ra4Var;
        this.f = str3;
        this.g = ul2Var;
    }

    public final void a(Bundle bundle) {
        if (((Boolean) tw1.e.c.a(mz1.b6)).booleanValue()) {
            try {
                lf4 lf4Var = hg4.C.c;
                bundle.putString("_app_id", lf4.M(this.a));
            } catch (RemoteException | RuntimeException e) {
                hg4.C.h.d("AppStatsSignal_AppId", e);
            }
        }
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        bundle.putBundle("quality_signals", this.b);
        bundle.putString("seq_num", this.c);
        if (!this.e.s()) {
            bundle.putString("session_id", this.d);
        }
        bundle.putBoolean("client_purpose_one", !r0.s());
        a(bundle);
        String str = this.f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            ul2 ul2Var = this.g;
            Long l = (Long) ul2Var.d.get(str);
            bundle2.putLong("dload", l == null ? -1L : l.longValue());
            Integer num = (Integer) ul2Var.b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) tw1.e.c.a(mz1.Aa)).booleanValue()) {
            hg4 hg4Var = hg4.C;
            if (hg4Var.h.l.get() > 0) {
                bundle.putInt("nrwv", hg4Var.h.l.get());
            }
        }
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        Bundle bundle = ((jm2) obj).b;
        bundle.putBundle("quality_signals", this.b);
        a(bundle);
    }
}
