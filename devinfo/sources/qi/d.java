package qi;

import com.liuzh.deviceinfo.R;
import j6.i;
import km.y;
import pa.u;
import pi.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32434f;

    public /* synthetic */ d(int i4, Object obj, Object obj2) {
        this.f32432d = i4;
        this.f32433e = obj;
        this.f32434f = obj2;
    }

    @Override // pa.u
    public final void a() {
        switch (this.f32432d) {
            case 0:
                if (ci.b.j != null) {
                    i.o((pi.a) this.f32433e);
                    break;
                }
                break;
            default:
                ((g) this.f32433e).w();
                break;
        }
    }

    @Override // pa.u
    public final void b() {
        switch (this.f32432d) {
            case 0:
                yb.i iVar = (yb.i) this.f32434f;
                ag.c cVar = ag.c.f364f;
                cVar.f365a = null;
                cVar.f368d = false;
                cVar.c((i.g) iVar.f37516b);
                break;
        }
    }

    @Override // pa.u
    public final void d(pa.a aVar) {
        switch (this.f32432d) {
            case 0:
                yb.i iVar = (yb.i) this.f32434f;
                ag.c cVar = ag.c.f364f;
                cVar.f365a = null;
                cVar.f368d = false;
                ((la.e) iVar.f37517c).a(false);
                cVar.c((i.g) iVar.f37516b);
                break;
            default:
                ((qh.f) ((y) this.f32434f).f28522b).f32395e.j(hg.e.e(R.string.load_failed));
                break;
        }
    }

    @Override // pa.u
    public final void e() {
        int i4 = this.f32432d;
    }

    @Override // pa.u
    public final void g() {
        switch (this.f32432d) {
            case 0:
                if (ci.b.j != null) {
                    i.q((pi.a) this.f32433e);
                }
                yb.i iVar = (yb.i) this.f32434f;
                ag.c.f364f.f369e = System.currentTimeMillis();
                ((la.e) iVar.f37517c).a(true);
                break;
        }
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }
}
