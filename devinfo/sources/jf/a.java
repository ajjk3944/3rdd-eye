package jf;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f27635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27636b;

    public a(String str, String str2) {
        this.f27635a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f27636b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f27635a.equals(aVar.f27635a) && this.f27636b.equals(aVar.f27636b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f27635a.hashCode() ^ 1000003) * 1000003) ^ this.f27636b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f27635a);
        sb2.append(", version=");
        return h.w(sb2, this.f27636b, "}");
    }
}
