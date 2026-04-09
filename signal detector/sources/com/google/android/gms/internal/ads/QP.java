package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class QP {

    /* renamed from: a, reason: collision with root package name */
    public final String f10616a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10617b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10618c;

    public QP(String str, boolean z6, boolean z7) {
        this.f10616a = str;
        this.f10617b = z6;
        this.f10618c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != QP.class) {
            return false;
        }
        QP qp = (QP) obj;
        return TextUtils.equals(this.f10616a, qp.f10616a) && this.f10617b == qp.f10617b && this.f10618c == qp.f10618c;
    }

    public final int hashCode() {
        return ((((this.f10616a.hashCode() + 31) * 31) + (true != this.f10617b ? 1237 : 1231)) * 31) + (true != this.f10618c ? 1237 : 1231);
    }
}
