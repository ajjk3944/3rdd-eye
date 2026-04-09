package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19636b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19637a;

    public c0(int i4) {
        this.f19637a = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        int i4 = ((c0) obj).f19637a;
        int i10 = this.f19637a;
        if (i10 != 0) {
            return i10 == i4;
        }
        throw null;
    }

    public final int hashCode() {
        int i4 = this.f19637a;
        if (i4 != 0) {
            return ((i4 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i4 = this.f19637a;
        String str = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        StringBuilder sb2 = new StringBuilder("READ_AND_WRITE".length() + r5.c.f("".length() + 73, 91, str) + 1);
        je.u.B(sb2, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb2.append("}");
        return sb2.toString();
    }
}
