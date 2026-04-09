package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g0 extends s1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f29138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29139b;

    public g0(List list, String str) {
        this.f29138a = list;
        this.f29139b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            g0 g0Var = (g0) ((s1) obj);
            String str2 = g0Var.f29139b;
            if (this.f29138a.equals(g0Var.f29138a) && ((str = this.f29139b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f29138a.hashCode() ^ 1000003) * 1000003;
        String str = this.f29139b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f29138a);
        sb2.append(", orgId=");
        return d.h.w(sb2, this.f29139b, "}");
    }
}
