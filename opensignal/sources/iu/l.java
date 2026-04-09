package iu;

import java.util.List;
import lq.q;
import mq.w;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13015a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13016b;

    public l(e eVar) {
        this.f13016b = eVar;
    }

    public e a() {
        return (e) ((q) this.f13016b).getValue();
    }

    @Override // iu.e
    public final i3.g f() {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).f();
            default:
                return a().f();
        }
    }

    @Override // iu.e
    public final boolean g() {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).g();
            default:
                return false;
        }
    }

    @Override // iu.e
    public final List getAnnotations() {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).getAnnotations();
            default:
                return w.f16945a;
        }
    }

    @Override // iu.e
    public final String h() {
        switch (this.f13015a) {
            case 0:
                return "com.survicate.surveys.IntegrationPayload";
            default:
                return a().h();
        }
    }

    @Override // iu.e
    public final boolean i() {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).i();
            default:
                return false;
        }
    }

    @Override // iu.e
    public final int j(String str) {
        switch (this.f13015a) {
            case 0:
                br.l.e(str, "name");
                return ((e) this.f13016b).j(str);
            default:
                br.l.e(str, "name");
                return a().j(str);
        }
    }

    @Override // iu.e
    public final int k() {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).k();
            default:
                return a().k();
        }
    }

    @Override // iu.e
    public final String l(int i10) {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).l(i10);
            default:
                return a().l(i10);
        }
    }

    @Override // iu.e
    public final List m(int i10) {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).m(i10);
            default:
                return a().m(i10);
        }
    }

    @Override // iu.e
    public final e n(int i10) {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).n(i10);
            default:
                return a().n(i10);
        }
    }

    @Override // iu.e
    public final boolean o(int i10) {
        switch (this.f13015a) {
            case 0:
                return ((e) this.f13016b).o(i10);
            default:
                return a().o(i10);
        }
    }

    public l(ar.a aVar) {
        this.f13016b = kc.f.F(aVar);
    }
}
