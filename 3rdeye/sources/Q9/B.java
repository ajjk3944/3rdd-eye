package Q9;

import S9.v;

/* compiled from: ElementMarker.kt */
/* loaded from: classes3.dex */
public final class B {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f11388e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final O9.e f11389a;

    /* renamed from: b, reason: collision with root package name */
    public final v.a f11390b;

    /* renamed from: c, reason: collision with root package name */
    public long f11391c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f11392d;

    public B(O9.e descriptor, v.a aVar) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        this.f11389a = descriptor;
        this.f11390b = aVar;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f11391c = iF != 64 ? (-1) << iF : 0L;
            this.f11392d = f11388e;
            return;
        }
        this.f11391c = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.f11392d = jArr;
    }
}
