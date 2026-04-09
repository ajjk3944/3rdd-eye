package Zi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Zi.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3737w extends AbstractC3694a {

    /* renamed from: a, reason: collision with root package name */
    private final Vi.b f25702a;

    public /* synthetic */ AbstractC3737w(Vi.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public abstract Xi.f a();

    @Override // Vi.o
    public void e(Yi.f encoder, Object obj) {
        AbstractC6492s.i(encoder, "encoder");
        int iK = k(obj);
        Xi.f fVarA = a();
        Yi.d dVarX = encoder.x(fVarA, iK);
        Iterator itJ = j(obj);
        for (int i10 = 0; i10 < iK; i10++) {
            dVarX.q(a(), i10, this.f25702a, itJ.next());
        }
        dVarX.b(fVarA);
    }

    @Override // Zi.AbstractC3694a
    protected final void m(Yi.c decoder, Object obj, int i10, int i11) {
        AbstractC6492s.i(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            n(decoder, i10 + i12, obj, false);
        }
    }

    @Override // Zi.AbstractC3694a
    protected void n(Yi.c decoder, int i10, Object obj, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        t(obj, i10, Yi.c.j(decoder, a(), i10, this.f25702a, null, 8, null));
    }

    protected abstract void t(Object obj, int i10, Object obj2);

    private AbstractC3737w(Vi.b bVar) {
        super(null);
        this.f25702a = bVar;
    }
}
