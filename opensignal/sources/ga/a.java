package ga;

import ca.k;
import ca.l;
import ca.m;
import ca.o;
import ca.x;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import dj.i;
import fb.f;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    public m f9409b;

    /* renamed from: c, reason: collision with root package name */
    public int f9410c;

    /* renamed from: d, reason: collision with root package name */
    public int f9411d;

    /* renamed from: e, reason: collision with root package name */
    public int f9412e;

    /* renamed from: g, reason: collision with root package name */
    public MotionPhotoMetadata f9414g;

    /* renamed from: h, reason: collision with root package name */
    public l f9415h;

    /* renamed from: i, reason: collision with root package name */
    public i f9416i;
    public ja.l j;

    /* renamed from: a, reason: collision with root package name */
    public final f f9408a = new f(6);

    /* renamed from: f, reason: collision with root package name */
    public long f9413f = -1;

    public final void a() {
        b(new Metadata.Entry[0]);
        m mVar = this.f9409b;
        mVar.getClass();
        mVar.j();
        this.f9409b.r(new o(-9223372036854775807L));
        this.f9410c = 6;
    }

    public final void b(Metadata.Entry... entryArr) {
        m mVar = this.f9409b;
        mVar.getClass();
        x xVarN = mVar.n(1024, 4);
        g0 g0Var = new g0();
        g0Var.j = "image/jpeg";
        g0Var.f4150i = new Metadata(entryArr);
        xVarN.e(new Format(g0Var));
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        if (j == 0) {
            this.f9410c = 0;
            this.j = null;
        } else if (this.f9410c == 5) {
            ja.l lVar = this.j;
            lVar.getClass();
            lVar.c(j, j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015c  */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r26, ca.n r27) throws com.google.android.exoplayer2.y0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.a.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        f fVar = this.f9408a;
        fVar.v(2);
        lVar.p(fVar.f8800a, 0, 2);
        if (fVar.t() == 65496) {
            fVar.v(2);
            lVar.p(fVar.f8800a, 0, 2);
            int iT = fVar.t();
            this.f9411d = iT;
            if (iT == 65504) {
                fVar.v(2);
                lVar.p(fVar.f8800a, 0, 2);
                lVar.g(fVar.t() - 2);
                fVar.v(2);
                lVar.p(fVar.f8800a, 0, 2);
                this.f9411d = fVar.t();
            }
            if (this.f9411d == 65505) {
                lVar.g(2);
                fVar.v(6);
                lVar.p(fVar.f8800a, 0, 6);
                if (fVar.p() == 1165519206 && fVar.t() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ca.k
    public final void h(m mVar) {
        this.f9409b = mVar;
    }

    @Override // ca.k
    public final void release() {
        ja.l lVar = this.j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}
