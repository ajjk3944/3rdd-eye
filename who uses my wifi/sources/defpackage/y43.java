package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y43 implements n53 {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public y43(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        i30.p0("pn", bundle, this.a);
        Integer num = this.b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        i30.p0("vnm", bundle, this.c);
        i30.p0("dl", bundle, this.d);
        i30.p0("ins_pn", bundle, this.e);
        i30.p0("ini_pn", bundle, this.f);
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        Bundle bundle = ((jm2) obj).b;
        i30.p0("pn", bundle, this.a);
        i30.p0("dl", bundle, this.d);
    }
}
