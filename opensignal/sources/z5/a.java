package z5;

import a5.v;
import androidx.media3.common.Metadata;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import dj.i;
import u5.a0;
import u5.k;
import u5.l;
import u5.m;
import u5.n;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    public m f26673b;

    /* renamed from: c, reason: collision with root package name */
    public int f26674c;

    /* renamed from: d, reason: collision with root package name */
    public int f26675d;

    /* renamed from: e, reason: collision with root package name */
    public int f26676e;

    /* renamed from: g, reason: collision with root package name */
    public MotionPhotoMetadata f26678g;

    /* renamed from: h, reason: collision with root package name */
    public l f26679h;

    /* renamed from: i, reason: collision with root package name */
    public i f26680i;
    public l6.k j;

    /* renamed from: a, reason: collision with root package name */
    public final v f26672a = new v(6);

    /* renamed from: f, reason: collision with root package name */
    public long f26677f = -1;

    public final void a() {
        b(new Metadata.Entry[0]);
        m mVar = this.f26673b;
        mVar.getClass();
        mVar.j();
        this.f26673b.u(new n(-9223372036854775807L));
        this.f26674c = 6;
    }

    public final void b(Metadata.Entry... entryArr) {
        m mVar = this.f26673b;
        mVar.getClass();
        a0 a0VarMo36n = mVar.mo36n(1024, 4);
        q qVar = new q();
        qVar.j = "image/jpeg";
        qVar.f1742i = new Metadata(entryArr);
        a0VarMo36n.c(new r(qVar));
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        if (j == 0) {
            this.f26674c = 0;
            this.j = null;
        } else if (this.f26674c == 5) {
            l6.k kVar = this.j;
            kVar.getClass();
            kVar.c(j, j7);
        }
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.f26673b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r26, ca.n r27) throws androidx.media3.common.k0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) {
        v vVar = this.f26672a;
        vVar.B(2);
        lVar.p(vVar.f165a, 0, 2);
        if (vVar.y() == 65496) {
            vVar.B(2);
            lVar.p(vVar.f165a, 0, 2);
            int iY = vVar.y();
            this.f26675d = iY;
            if (iY == 65504) {
                vVar.B(2);
                lVar.p(vVar.f165a, 0, 2);
                lVar.g(vVar.y() - 2);
                vVar.B(2);
                lVar.p(vVar.f165a, 0, 2);
                this.f26675d = vVar.y();
            }
            if (this.f26675d == 65505) {
                lVar.g(2);
                vVar.B(6);
                lVar.p(vVar.f165a, 0, 6);
                if (vVar.u() == 1165519206 && vVar.y() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u5.k
    public final void release() {
        l6.k kVar = this.j;
        if (kVar != null) {
            kVar.getClass();
        }
    }
}
