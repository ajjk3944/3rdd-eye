package g1;

import g1.AbstractC5849g;
import j1.j;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5847e extends C5843a implements h1.e {

    /* renamed from: m0, reason: collision with root package name */
    protected final AbstractC5849g f47481m0;

    /* renamed from: n0, reason: collision with root package name */
    final AbstractC5849g.d f47482n0;

    /* renamed from: o0, reason: collision with root package name */
    protected ArrayList f47483o0;

    /* renamed from: p0, reason: collision with root package name */
    private j f47484p0;

    public C5847e(AbstractC5849g abstractC5849g, AbstractC5849g.d dVar) {
        super(abstractC5849g);
        this.f47483o0 = new ArrayList();
        this.f47481m0 = abstractC5849g;
        this.f47482n0 = dVar;
    }

    @Override // g1.C5843a, g1.InterfaceC5848f
    public j1.e a() {
        return u0();
    }

    @Override // g1.C5843a, g1.InterfaceC5848f
    public void apply() {
    }

    public C5847e s0(Object... objArr) {
        Collections.addAll(this.f47483o0, objArr);
        return this;
    }

    public void t0() {
        super.apply();
    }

    public j u0() {
        return this.f47484p0;
    }

    public AbstractC5849g.d v0() {
        return this.f47482n0;
    }
}
