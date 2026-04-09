package x8;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f25071a;

    /* renamed from: b, reason: collision with root package name */
    public String f25072b;

    /* renamed from: c, reason: collision with root package name */
    public float f25073c;

    /* renamed from: d, reason: collision with root package name */
    public b f25074d;

    /* renamed from: e, reason: collision with root package name */
    public int f25075e;

    /* renamed from: f, reason: collision with root package name */
    public float f25076f;

    /* renamed from: g, reason: collision with root package name */
    public float f25077g;

    /* renamed from: h, reason: collision with root package name */
    public int f25078h;

    /* renamed from: i, reason: collision with root package name */
    public int f25079i;
    public float j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f25080l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f25081m;

    public final int hashCode() {
        int iOrdinal = ((this.f25074d.ordinal() + (((int) (c7.a.g(this.f25072b, this.f25071a.hashCode() * 31, 31) + this.f25073c)) * 31)) * 31) + this.f25075e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f25076f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f25078h;
    }
}
