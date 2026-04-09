package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wc.h;
import zc.r3;

/* loaded from: classes.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new h(27);
    public final Double B;

    /* renamed from: a, reason: collision with root package name */
    public final int f5420a;

    /* renamed from: d, reason: collision with root package name */
    public final String f5421d;

    /* renamed from: g, reason: collision with root package name */
    public final long f5422g;

    /* renamed from: r, reason: collision with root package name */
    public final Long f5423r;

    /* renamed from: x, reason: collision with root package name */
    public final String f5424x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5425y;

    public zzpl(int i10, String str, long j, Long l10, Float f10, String str2, String str3, Double d6) {
        this.f5420a = i10;
        this.f5421d = str;
        this.f5422g = j;
        this.f5423r = l10;
        this.B = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d6;
        this.f5424x = str2;
        this.f5425y = str3;
    }

    public final Object d() {
        Long l10 = this.f5423r;
        if (l10 != null) {
            return l10;
        }
        Double d6 = this.B;
        if (d6 != null) {
            return d6;
        }
        String str = this.f5424x;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        h.b(this, parcel);
    }

    public zzpl(long j, Object obj, String str, String str2) {
        s.e(str);
        this.f5420a = 2;
        this.f5421d = str;
        this.f5422g = j;
        this.f5425y = str2;
        if (obj == null) {
            this.f5423r = null;
            this.B = null;
            this.f5424x = null;
            return;
        }
        if (obj instanceof Long) {
            this.f5423r = (Long) obj;
            this.B = null;
            this.f5424x = null;
        } else if (obj instanceof String) {
            this.f5423r = null;
            this.B = null;
            this.f5424x = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f5423r = null;
                this.B = (Double) obj;
                this.f5424x = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public zzpl(r3 r3Var) {
        this(r3Var.f27136d, r3Var.f27137e, r3Var.f27135c, r3Var.f27134b);
    }
}
