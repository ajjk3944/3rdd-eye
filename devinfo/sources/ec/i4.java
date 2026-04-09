package ec;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i4 extends qb.a {
    public static final Parcelable.Creator<i4> CREATOR = new androidx.recyclerview.widget.i0(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f22799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22800b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22801c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f22802d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22803e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22804f;
    public final Double g;

    public i4(int i4, String str, long j, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f22799a = i4;
        this.f22800b = str;
        this.f22801c = j;
        this.f22802d = l10;
        this.g = i4 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f22803e = str2;
        this.f22804f = str3;
    }

    public final Object a() {
        Long l10 = this.f22802d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f22803e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        androidx.recyclerview.widget.i0.b(this, parcel);
    }

    public i4(long j, Object obj, String str, String str2) {
        pb.y.e(str);
        this.f22799a = 2;
        this.f22800b = str;
        this.f22801c = j;
        this.f22804f = str2;
        if (obj == null) {
            this.f22802d = null;
            this.g = null;
            this.f22803e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f22802d = (Long) obj;
            this.g = null;
            this.f22803e = null;
        } else if (obj instanceof String) {
            this.f22802d = null;
            this.g = null;
            this.f22803e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f22802d = null;
                this.g = (Double) obj;
                this.f22803e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public i4(j4 j4Var) {
        this(j4Var.f22827d, j4Var.f22828e, j4Var.f22826c, j4Var.f22825b);
    }
}
