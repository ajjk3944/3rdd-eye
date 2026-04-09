package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lq implements em {

    /* renamed from: g, reason: collision with root package name */
    public static final em.a<lq> f30067g = new J0(4);

    /* renamed from: b, reason: collision with root package name */
    public final int f30068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30069c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30070d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f30071e;

    /* renamed from: f, reason: collision with root package name */
    private int f30072f;

    public lq(int i, int i10, int i11, byte[] bArr) {
        this.f30068b = i;
        this.f30069c = i10;
        this.f30070d = i11;
        this.f30071e = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static lq a(Bundle bundle) {
        return new lq(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lq.class == obj.getClass()) {
            lq lqVar = (lq) obj;
            if (this.f30068b == lqVar.f30068b && this.f30069c == lqVar.f30069c && this.f30070d == lqVar.f30070d && Arrays.equals(this.f30071e, lqVar.f30071e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f30072f == 0) {
            this.f30072f = Arrays.hashCode(this.f30071e) + ((((((this.f30068b + 527) * 31) + this.f30069c) * 31) + this.f30070d) * 31);
        }
        return this.f30072f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f30068b);
        sb.append(", ");
        sb.append(this.f30069c);
        sb.append(", ");
        sb.append(this.f30070d);
        sb.append(", ");
        return androidx.work.s.h(sb, this.f30071e != null, ")");
    }
}
