package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d53 implements n53 {
    public final String a;
    public final int b;

    public d53(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        bundle.putString("request_id", this.a);
        if (this.b == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        ((jm2) obj).b.putString("request_id", this.a);
    }
}
