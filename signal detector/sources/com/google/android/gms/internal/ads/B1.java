package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class B1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f7097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7098c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7099d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f7100e;

    /* renamed from: f, reason: collision with root package name */
    public final F1[] f7101f;

    public B1(String str, boolean z6, boolean z7, String[] strArr, F1[] f1Arr) {
        super("CTOC");
        this.f7097b = str;
        this.f7098c = z6;
        this.f7099d = z7;
        this.f7100e = strArr;
        this.f7101f = f1Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B1.class == obj.getClass()) {
            B1 b12 = (B1) obj;
            if (this.f7098c == b12.f7098c && this.f7099d == b12.f7099d && Objects.equals(this.f7097b, b12.f7097b) && Arrays.equals(this.f7100e, b12.f7100e) && Arrays.equals(this.f7101f, b12.f7101f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7097b.hashCode() + (((((this.f7098c ? 1 : 0) + 527) * 31) + (this.f7099d ? 1 : 0)) * 31);
    }
}
