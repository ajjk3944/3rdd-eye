package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class f0 {
    public Integer A;
    public Integer B;
    public CharSequence C;
    public CharSequence D;
    public CharSequence E;
    public Integer F;
    public Bundle G;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f1625a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f1626b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1627c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1628d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1629e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1630f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f1631g;

    /* renamed from: h, reason: collision with root package name */
    public u0 f1632h;

    /* renamed from: i, reason: collision with root package name */
    public u0 f1633i;
    public byte[] j;
    public Integer k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f1634l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f1635m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f1636n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f1637o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f1638p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f1639q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f1640r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f1641s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f1642t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f1643u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f1644v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f1645w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1646x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1647y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f1648z;

    public final void a(int i10, byte[] bArr) {
        if (this.j != null) {
            Integer numValueOf = Integer.valueOf(i10);
            int i11 = a5.d0.f105a;
            if (!numValueOf.equals(3) && a5.d0.a(this.k, 3)) {
                return;
            }
        }
        this.j = (byte[]) bArr.clone();
        this.k = Integer.valueOf(i10);
    }
}
