package ja;

import a5.v;
import androidx.media3.common.k0;
import com.google.android.exoplayer2.y0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13434a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f13435b;

    /* renamed from: c, reason: collision with root package name */
    public int f13436c;

    /* renamed from: d, reason: collision with root package name */
    public int f13437d;

    /* renamed from: e, reason: collision with root package name */
    public long f13438e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13439f;

    /* renamed from: g, reason: collision with root package name */
    public int f13440g;

    /* renamed from: h, reason: collision with root package name */
    public int f13441h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f13442i;
    public final Object j;

    public c(fb.f fVar, fb.f fVar2, boolean z10) throws y0 {
        this.j = fVar;
        this.f13442i = fVar2;
        this.f13439f = z10;
        fVar2.y(12);
        this.f13435b = fVar2.r();
        fVar.y(12);
        this.f13441h = fVar.r();
        dr.a.f("first_chunk must be 1", fVar.d() == 1);
        this.f13436c = -1;
    }

    public final boolean a() {
        switch (this.f13434a) {
            case 0:
                fb.f fVar = (fb.f) this.f13442i;
                fb.f fVar2 = (fb.f) this.j;
                int i10 = this.f13436c + 1;
                this.f13436c = i10;
                if (i10 != this.f13435b) {
                    this.f13438e = this.f13439f ? fVar.s() : fVar.p();
                    if (this.f13436c == this.f13440g) {
                        this.f13437d = fVar2.r();
                        fVar2.z(4);
                        int i11 = this.f13441h - 1;
                        this.f13441h = i11;
                        this.f13440g = i11 > 0 ? fVar2.r() - 1 : -1;
                        break;
                    }
                }
                break;
            default:
                v vVar = (v) this.f13442i;
                v vVar2 = (v) this.j;
                int i12 = this.f13436c + 1;
                this.f13436c = i12;
                if (i12 != this.f13435b) {
                    this.f13438e = this.f13439f ? vVar.x() : vVar.u();
                    if (this.f13436c == this.f13440g) {
                        this.f13437d = vVar2.w();
                        vVar2.F(4);
                        int i13 = this.f13441h - 1;
                        this.f13441h = i13;
                        this.f13440g = i13 > 0 ? vVar2.w() - 1 : -1;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public c(v vVar, v vVar2, boolean z10) throws k0 {
        this.j = vVar;
        this.f13442i = vVar2;
        this.f13439f = z10;
        vVar2.E(12);
        this.f13435b = vVar2.w();
        vVar.E(12);
        this.f13441h = vVar.w();
        u5.b.c("first_chunk must be 1", vVar.g() == 1);
        this.f13436c = -1;
    }
}
