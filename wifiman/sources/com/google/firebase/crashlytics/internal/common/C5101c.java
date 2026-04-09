package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.M;

/* renamed from: com.google.firebase.crashlytics.internal.common.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5101c extends M.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f38763a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38764b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38765c;

    C5101c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f38763a = str;
        this.f38764b = str2;
        this.f38765c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.M.a
    public String c() {
        return this.f38763a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.M.a
    public String d() {
        return this.f38765c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.M.a
    public String e() {
        return this.f38764b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M.a)) {
            return false;
        }
        M.a aVar = (M.a) obj;
        if (this.f38763a.equals(aVar.c()) && ((str = this.f38764b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f38765c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f38763a.hashCode() ^ 1000003) * 1000003;
        String str = this.f38764b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f38765c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f38763a + ", firebaseInstallationId=" + this.f38764b + ", firebaseAuthenticationToken=" + this.f38765c + "}";
    }
}
