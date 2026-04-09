package com.google.android.play.core.install;

import A.f;

/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a, reason: collision with root package name */
    public final int f18619a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18620b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18621c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18622d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18623e;

    public zza(int i, long j6, long j7, int i3, String str) {
        this.f18619a = i;
        this.f18620b = j6;
        this.f18621c = j7;
        this.f18622d = i3;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f18623e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f18619a == zzaVar.f18619a && this.f18620b == zzaVar.f18620b && this.f18621c == zzaVar.f18621c && this.f18622d == zzaVar.f18622d && this.f18623e.equals(zzaVar.f18623e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f18619a ^ 1000003;
        long j6 = this.f18620b;
        long j7 = this.f18621c;
        return (((((((i * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f18622d) * 1000003) ^ this.f18623e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallState{installStatus=");
        sb.append(this.f18619a);
        sb.append(", bytesDownloaded=");
        sb.append(this.f18620b);
        f.v(sb, ", totalBytesToDownload=", this.f18621c, ", installErrorCode=");
        sb.append(this.f18622d);
        sb.append(", packageName=");
        sb.append(this.f18623e);
        sb.append("}");
        return sb.toString();
    }
}
