package O4;

import N7.B8;

/* compiled from: FirebaseInstallationId.kt */
/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final String f10272a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10273b;

    public O(String str, String str2) {
        this.f10272a = str;
        this.f10273b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return kotlin.jvm.internal.l.b(this.f10272a, o10.f10272a) && kotlin.jvm.internal.l.b(this.f10273b, o10.f10273b);
    }

    public final int hashCode() {
        String str = this.f10272a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10273b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f10272a);
        sb.append(", authToken=");
        return B8.j(sb, this.f10273b, ')');
    }
}
