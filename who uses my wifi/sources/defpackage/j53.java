package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j53 implements n53 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public j53(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        i30.p0("gmp_app_id", bundle, this.a);
        i30.p0("fbs_aiid", bundle, this.b);
        i30.p0("fbs_aeid", bundle, this.c);
        i30.p0("apm_id_origin", bundle, this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        i30.p0("fbs_aeid", ((jm2) obj).b, this.c);
    }
}
