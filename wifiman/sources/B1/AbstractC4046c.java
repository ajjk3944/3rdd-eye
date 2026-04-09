package b1;

import b1.AbstractC4052i;
import f1.C5492a;
import f1.C5493b;
import f1.C5494c;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4046c implements InterfaceC4042D {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.constraintlayout.core.parser.d f32686a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32687b;

    public AbstractC4046c(androidx.constraintlayout.core.parser.d dVar, int i10) {
        this.f32686a = dVar;
        this.f32687b = C4044a.f32683a.b(i10);
    }

    @Override // b1.InterfaceC4042D
    public final void a(AbstractC4052i.c cVar, float f10, float f11) {
        String strB = C4044a.f32683a.b(cVar.b());
        C5492a c5492a = new C5492a(new char[0]);
        c5492a.x(C5494c.x(cVar.a().toString()));
        c5492a.x(C5494c.x(strB));
        c5492a.x(new C5493b(f10));
        c5492a.x(new C5493b(f11));
        this.f32686a.a0(this.f32687b, c5492a);
    }
}
