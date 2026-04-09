package defpackage;

import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class un2 extends f74 implements l32 {
    public final Bundle i;

    public un2(Set set) {
        super(set);
        this.i = new Bundle();
    }

    @Override // defpackage.l32
    public final synchronized void h(Bundle bundle, String str) {
        this.i.putAll(bundle);
        P1(sd2.m);
    }
}
