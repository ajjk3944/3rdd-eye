package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10694c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10695d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10696e;

    public e4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f10693b = str;
        this.f10694c = str2;
        this.f10695d = str3;
        this.f10696e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e4.class == obj.getClass()) {
            e4 e4Var = (e4) obj;
            if (Objects.equals(this.f10693b, e4Var.f10693b) && Objects.equals(this.f10694c, e4Var.f10694c) && Objects.equals(this.f10695d, e4Var.f10695d) && Arrays.equals(this.f10696e, e4Var.f10696e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10693b;
        return Arrays.hashCode(this.f10696e) + ((this.f10695d.hashCode() + ((this.f10694c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.g4
    public final String toString() {
        String str = this.f11366a;
        int length = String.valueOf(str).length();
        String str2 = this.f10693b;
        int iL = je.u.l(length, 11, String.valueOf(str2).length(), 11);
        String str3 = this.f10694c;
        int length2 = str3.length() + iL + 14;
        String str4 = this.f10695d;
        StringBuilder sb2 = new StringBuilder(str4.length() + length2);
        je.u.B(sb2, str, ": mimeType=", str2, ", filename=");
        return r5.c.m(sb2, str3, ", description=", str4);
    }
}
