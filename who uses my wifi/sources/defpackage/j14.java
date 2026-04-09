package defpackage;

import java.security.spec.ECParameterSpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j14 {
    public static final j14 c = new j14("NIST_P256", ru3.a);
    public static final j14 d = new j14("NIST_P384", ru3.b);
    public static final j14 e = new j14("NIST_P521", ru3.c);
    public final String a;
    public final ECParameterSpec b;

    public j14(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }

    public final String toString() {
        return this.a;
    }
}
