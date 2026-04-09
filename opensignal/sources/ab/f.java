package ab;

import com.google.android.exoplayer2.Format;
import pb.j0;
import pb.t0;

/* loaded from: classes.dex */
public abstract class f implements j0 {
    public final long B;
    public final long D;
    public final t0 E;

    /* renamed from: a, reason: collision with root package name */
    public final long f301a = ya.m.f26107e.getAndIncrement();

    /* renamed from: d, reason: collision with root package name */
    public final na.c f302d;

    /* renamed from: g, reason: collision with root package name */
    public final int f303g;

    /* renamed from: r, reason: collision with root package name */
    public final Format f304r;

    /* renamed from: x, reason: collision with root package name */
    public final int f305x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f306y;

    public f(pb.n nVar, na.c cVar, int i10, Format format, int i11, Object obj, long j, long j7) {
        this.E = new t0(nVar);
        this.f302d = cVar;
        this.f303g = i10;
        this.f304r = format;
        this.f305x = i11;
        this.f306y = obj;
        this.B = j;
        this.D = j7;
    }
}
