package bk;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends dr.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2817b;

    public i(byte[] bArr, Map map) {
        br.l.e(map, "headerFields");
        this.f2816a = bArr;
        this.f2817b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type com.opensignal.sdk.domain.network.RequestResult.Success");
        i iVar = (i) obj;
        return Arrays.equals(this.f2816a, iVar.f2816a) && br.l.a(this.f2817b, iVar.f2817b);
    }

    public final int hashCode() {
        return this.f2817b.hashCode() + (Arrays.hashCode(this.f2816a) * 31);
    }

    public final String toString() {
        return "Success(data=" + Arrays.toString(this.f2816a) + ", headerFields=" + this.f2817b + ')';
    }
}
