package k8;

import android.graphics.Bitmap;
import ar.k;
import cv.y;
import cv.z;
import java.util.regex.Pattern;
import kc.f;
import lq.j;
import n0.b2;
import n0.g2;
import n0.x0;
import ou.c0;
import ou.h;
import ou.s;
import ou.v;
import q8.i;
import tt.l;
import w.g;

/* loaded from: classes.dex */
public final class b implements g2 {
    public Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14194a = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f14195d;

    /* renamed from: g, reason: collision with root package name */
    public long f14196g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14197r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f14198x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f14199y;

    public b(z zVar) throws NumberFormatException {
        final int i10 = 0;
        j jVar = j.NONE;
        this.f14198x = f.E(jVar, new ar.a(this) { // from class: k8.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f14193d;

            {
                this.f14193d = this;
            }

            @Override // ar.a
            public final Object c() {
                int i11 = i10;
                b bVar = this.f14193d;
                switch (i11) {
                    case 0:
                        h hVar = h.f19908n;
                        return ou.d.h((s) bVar.B);
                    default:
                        String strA = ((s) bVar.B).a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        Pattern pattern = v.f19976c;
                        try {
                            return ou.d.e(strA);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final boolean z10 = true ? 1 : 0;
        this.f14199y = f.E(jVar, new ar.a(this) { // from class: k8.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f14193d;

            {
                this.f14193d = this;
            }

            @Override // ar.a
            public final Object c() {
                int i11 = z10;
                b bVar = this.f14193d;
                switch (i11) {
                    case 0:
                        h hVar = h.f19908n;
                        return ou.d.h((s) bVar.B);
                    default:
                        String strA = ((s) bVar.B).a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        Pattern pattern = v.f19976c;
                        try {
                            return ou.d.e(strA);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f14195d = Long.parseLong(zVar.z(Long.MAX_VALUE));
        this.f14196g = Long.parseLong(zVar.z(Long.MAX_VALUE));
        this.f14197r = Integer.parseInt(zVar.z(Long.MAX_VALUE)) > 0;
        int i11 = Integer.parseInt(zVar.z(Long.MAX_VALUE));
        fh.f fVar = new fh.f(2);
        for (int i12 = 0; i12 < i11; i12++) {
            String strZ = zVar.z(Long.MAX_VALUE);
            Bitmap.Config[] configArr = i.f20736a;
            int iA0 = l.A0(strZ, ':', 0, 6);
            if (iA0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strZ).toString());
            }
            String strSubstring = strZ.substring(0, iA0);
            br.l.d(strSubstring, "substring(...)");
            String string = l.a1(strSubstring).toString();
            String strSubstring2 = strZ.substring(iA0 + 1);
            br.l.d(strSubstring2, "substring(...)");
            fVar.d(string, strSubstring2);
        }
        this.B = fVar.f();
    }

    public void a(y yVar) {
        s sVar = (s) this.B;
        yVar.h0(this.f14195d);
        yVar.writeByte(10);
        yVar.h0(this.f14196g);
        yVar.writeByte(10);
        yVar.h0(this.f14197r ? 1L : 0L);
        yVar.writeByte(10);
        yVar.h0(sVar.size());
        yVar.writeByte(10);
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            yVar.H(sVar.b(i10));
            yVar.H(": ");
            yVar.H(sVar.d(i10));
            yVar.writeByte(10);
        }
    }

    @Override // n0.g2
    public Object getValue() {
        return ((b2) ((x0) this.f14199y)).getValue();
    }

    public String toString() {
        switch (this.f14194a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("AnimationState(value=");
                sb2.append(((b2) ((x0) this.f14199y)).getValue());
                sb2.append(", velocity=");
                sb2.append(((k) ((om.f) this.f14198x).f19555g).a((w.l) this.B));
                sb2.append(", isRunning=");
                sb2.append(this.f14197r);
                sb2.append(", lastFrameTimeNanos=");
                sb2.append(this.f14195d);
                sb2.append(", finishedTimeNanos=");
                return g.h(sb2, this.f14196g, ')');
            default:
                return super.toString();
        }
    }

    public b(c0 c0Var) {
        j jVar = j.NONE;
        final int i10 = 0;
        this.f14198x = f.E(jVar, new ar.a(this) { // from class: k8.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f14193d;

            {
                this.f14193d = this;
            }

            @Override // ar.a
            public final Object c() {
                int i11 = i10;
                b bVar = this.f14193d;
                switch (i11) {
                    case 0:
                        h hVar = h.f19908n;
                        return ou.d.h((s) bVar.B);
                    default:
                        String strA = ((s) bVar.B).a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        Pattern pattern = v.f19976c;
                        try {
                            return ou.d.e(strA);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final int i11 = 1;
        this.f14199y = f.E(jVar, new ar.a(this) { // from class: k8.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f14193d;

            {
                this.f14193d = this;
            }

            @Override // ar.a
            public final Object c() {
                int i112 = i11;
                b bVar = this.f14193d;
                switch (i112) {
                    case 0:
                        h hVar = h.f19908n;
                        return ou.d.h((s) bVar.B);
                    default:
                        String strA = ((s) bVar.B).a("Content-Type");
                        if (strA == null) {
                            return null;
                        }
                        Pattern pattern = v.f19976c;
                        try {
                            return ou.d.e(strA);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f14195d = c0Var.G;
        this.f14196g = c0Var.H;
        this.f14197r = c0Var.f19888x != null;
        this.B = c0Var.f19889y;
    }

    public /* synthetic */ b(om.f fVar, Comparable comparable, w.l lVar, int i10) {
        this(fVar, comparable, (i10 & 4) != 0 ? null : lVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public b(om.f fVar, Object obj, w.l lVar, long j, long j7, boolean z10) {
        w.l lVarD;
        this.f14198x = fVar;
        this.f14199y = androidx.compose.runtime.c.f(obj);
        if (lVar != null) {
            lVarD = w.c.d(lVar);
        } else {
            lVarD = (w.l) ((k) fVar.f19554d).a(obj);
            lVarD.d();
        }
        this.B = lVarD;
        this.f14195d = j;
        this.f14196g = j7;
        this.f14197r = z10;
    }
}
