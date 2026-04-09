package b1;

import b1.AbstractC4052i;
import f1.C5492a;
import f1.C5493b;
import f1.C5494c;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4050g implements InterfaceC4047d {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.constraintlayout.core.parser.d f32731a;

    public C4050g(androidx.constraintlayout.core.parser.d dVar) {
        this.f32731a = dVar;
    }

    @Override // b1.InterfaceC4047d
    public void b(AbstractC4052i.a aVar, float f10, float f11) {
        C5492a c5492a = new C5492a(new char[0]);
        c5492a.x(C5494c.x(aVar.a().toString()));
        c5492a.x(C5494c.x("baseline"));
        c5492a.x(new C5493b(f10));
        c5492a.x(new C5493b(f11));
        this.f32731a.a0("baseline", c5492a);
    }
}
