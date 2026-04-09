package ab;

import ca.w;
import ca.x;
import com.google.android.exoplayer2.Format;
import qb.v;

/* loaded from: classes.dex */
public final class d implements x {

    /* renamed from: a, reason: collision with root package name */
    public final int f289a;

    /* renamed from: b, reason: collision with root package name */
    public final Format f290b;

    /* renamed from: c, reason: collision with root package name */
    public final ca.j f291c = new ca.j();

    /* renamed from: d, reason: collision with root package name */
    public Format f292d;

    /* renamed from: e, reason: collision with root package name */
    public x f293e;

    /* renamed from: f, reason: collision with root package name */
    public long f294f;

    public d(int i10, int i11, Format format) {
        this.f289a = i11;
        this.f290b = format;
    }

    @Override // ca.x
    public final void a(int i10, fb.f fVar) {
        x xVar = this.f293e;
        int i11 = v.f20828a;
        xVar.a(i10, fVar);
    }

    @Override // ca.x
    public final int c(pb.k kVar, int i10, boolean z10) {
        x xVar = this.f293e;
        int i11 = v.f20828a;
        return xVar.b(kVar, i10, z10);
    }

    @Override // ca.x
    public final void d(long j, int i10, int i11, int i12, w wVar) {
        long j7 = this.f294f;
        if (j7 != -9223372036854775807L && j >= j7) {
            this.f293e = this.f291c;
        }
        x xVar = this.f293e;
        int i13 = v.f20828a;
        xVar.d(j, i10, i11, i12, wVar);
    }

    @Override // ca.x
    public final void e(Format format) {
        Format format2 = this.f290b;
        if (format2 != null) {
            format = format.g(format2);
        }
        this.f292d = format;
        x xVar = this.f293e;
        int i10 = v.f20828a;
        xVar.e(format);
    }
}
