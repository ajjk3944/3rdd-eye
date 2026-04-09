package b1;

import b1.AbstractC4052i;
import f1.C5492a;
import f1.C5493b;
import f1.C5494c;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4045b implements v {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.constraintlayout.core.parser.d f32684a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32685b;

    public AbstractC4045b(androidx.constraintlayout.core.parser.d dVar, int i10) {
        this.f32684a = dVar;
        this.f32685b = C4044a.f32683a.a(i10);
    }

    @Override // b1.v
    public final void b(AbstractC4052i.b bVar, float f10, float f11) {
        String strA = C4044a.f32683a.a(bVar.b());
        C5492a c5492a = new C5492a(new char[0]);
        c5492a.x(C5494c.x(bVar.a().toString()));
        c5492a.x(C5494c.x(strA));
        c5492a.x(new C5493b(f10));
        c5492a.x(new C5493b(f11));
        this.f32684a.a0(this.f32685b, c5492a);
    }
}
