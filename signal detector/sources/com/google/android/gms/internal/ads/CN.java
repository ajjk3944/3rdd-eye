package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class CN {

    /* renamed from: a, reason: collision with root package name */
    public final String f7582a;

    /* renamed from: b, reason: collision with root package name */
    public final TP f7583b;

    /* renamed from: c, reason: collision with root package name */
    public final TP f7584c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7585d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7586e;

    public CN(String str, TP tp, TP tp2, int i, int i3) {
        boolean z6;
        if (i != 0) {
            z6 = false;
            if (i3 == 0) {
                i3 = 0;
                z6 = true;
            }
        } else {
            z6 = true;
        }
        AbstractC0582Jp.m(z6);
        AbstractC0582Jp.m(true ^ TextUtils.isEmpty(str));
        this.f7582a = str;
        this.f7583b = tp;
        tp2.getClass();
        this.f7584c = tp2;
        this.f7585d = i;
        this.f7586e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CN.class == obj.getClass()) {
            CN cn = (CN) obj;
            if (this.f7585d == cn.f7585d && this.f7586e == cn.f7586e && this.f7582a.equals(cn.f7582a) && this.f7583b.equals(cn.f7583b) && this.f7584c.equals(cn.f7584c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7584c.hashCode() + ((this.f7583b.hashCode() + ((this.f7582a.hashCode() + ((((this.f7585d + 527) * 31) + this.f7586e) * 31)) * 31)) * 31);
    }
}
