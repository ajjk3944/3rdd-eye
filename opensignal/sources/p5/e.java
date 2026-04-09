package p5;

import androidx.media3.common.r;
import b5.a0;
import o5.q;

/* loaded from: classes.dex */
public abstract class e implements r5.k {
    public final long B;
    public final long D;
    public final a0 E;

    /* renamed from: a, reason: collision with root package name */
    public final long f20264a;

    /* renamed from: d, reason: collision with root package name */
    public final b5.k f20265d;

    /* renamed from: g, reason: collision with root package name */
    public final int f20266g;

    /* renamed from: r, reason: collision with root package name */
    public final r f20267r;

    /* renamed from: x, reason: collision with root package name */
    public final int f20268x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f20269y;

    public e(b5.h hVar, b5.k kVar, int i10, r rVar, int i11, Object obj, long j, long j7) {
        this.E = new a0(hVar);
        kVar.getClass();
        this.f20265d = kVar;
        this.f20266g = i10;
        this.f20267r = rVar;
        this.f20268x = i11;
        this.f20269y = obj;
        this.B = j;
        this.D = j7;
        this.f20264a = q.f19025e.getAndIncrement();
    }
}
