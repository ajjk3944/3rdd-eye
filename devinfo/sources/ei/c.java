package ei;

import d.h;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f23487a;

    public c(String str) {
        this.f23487a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k.a(this.f23487a, ((c) obj).f23487a);
    }

    public final int hashCode() {
        return this.f23487a.hashCode();
    }

    public final String toString() {
        return h.t("ApkFileModel(apkPath=", this.f23487a, ")");
    }
}
