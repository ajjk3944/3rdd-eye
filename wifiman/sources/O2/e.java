package O2;

/* loaded from: classes.dex */
public class e extends M2.j implements E2.b {
    public e(c cVar) {
        super(cVar);
    }

    @Override // E2.c
    public int a() {
        return ((c) this.f12466a).i();
    }

    @Override // M2.j, E2.b
    public void b() {
        ((c) this.f12466a).e().prepareToDraw();
    }

    @Override // E2.c
    public void c() {
        ((c) this.f12466a).stop();
        ((c) this.f12466a).k();
    }

    @Override // E2.c
    public Class d() {
        return c.class;
    }
}
