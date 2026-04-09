package n2;

import android.graphics.PointF;

/* compiled from: DocumentData.java */
/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5348b {

    /* renamed from: a, reason: collision with root package name */
    public String f44248a;

    /* renamed from: b, reason: collision with root package name */
    public String f44249b;

    /* renamed from: c, reason: collision with root package name */
    public float f44250c;

    /* renamed from: d, reason: collision with root package name */
    public a f44251d;

    /* renamed from: e, reason: collision with root package name */
    public int f44252e;

    /* renamed from: f, reason: collision with root package name */
    public float f44253f;

    /* renamed from: g, reason: collision with root package name */
    public float f44254g;

    /* renamed from: h, reason: collision with root package name */
    public int f44255h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f44256j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44257k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f44258l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f44259m;

    /* compiled from: DocumentData.java */
    /* renamed from: n2.b$a */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public final int hashCode() {
        int iOrdinal = ((this.f44251d.ordinal() + (((int) (B4.g.n(this.f44248a.hashCode() * 31, 31, this.f44249b) + this.f44250c)) * 31)) * 31) + this.f44252e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f44253f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f44255h;
    }
}
