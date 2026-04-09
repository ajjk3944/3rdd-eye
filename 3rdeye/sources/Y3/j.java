package y3;

import java.util.Arrays;
import y3.r;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    public final String f48075a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f48076b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.e f48077c;

    /* compiled from: AutoValue_TransportContext.java */
    public static final class a extends r.a {

        /* renamed from: a, reason: collision with root package name */
        public String f48078a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f48079b;

        /* renamed from: c, reason: collision with root package name */
        public v3.e f48080c;

        public final j a() {
            String strConcat = this.f48078a == null ? " backendName" : "";
            if (this.f48080c == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new j(this.f48078a, this.f48079b, this.f48080c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        public final a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f48078a = str;
            return this;
        }
    }

    public j(String str, byte[] bArr, v3.e eVar) {
        this.f48075a = str;
        this.f48076b = bArr;
        this.f48077c = eVar;
    }

    @Override // y3.r
    public final String b() {
        return this.f48075a;
    }

    @Override // y3.r
    public final byte[] c() {
        return this.f48076b;
    }

    @Override // y3.r
    public final v3.e d() {
        return this.f48077c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f48075a.equals(rVar.b())) {
            return Arrays.equals(this.f48076b, rVar instanceof j ? ((j) rVar).f48076b : rVar.c()) && this.f48077c.equals(rVar.d());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f48075a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48076b)) * 1000003) ^ this.f48077c.hashCode();
    }
}
