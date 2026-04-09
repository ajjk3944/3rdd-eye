package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class Z implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    private final Vi.b f25608a;

    /* renamed from: b, reason: collision with root package name */
    private final Vi.b f25609b;

    public /* synthetic */ Z(Vi.b bVar, Vi.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    @Override // Vi.InterfaceC3627a
    public Object c(Yi.e decoder) {
        Object objK;
        AbstractC6492s.i(decoder, "decoder");
        Xi.f fVarA = a();
        Yi.c cVarC = decoder.c(fVarA);
        if (cVarC.B()) {
            objK = k(Yi.c.j(cVarC, a(), 0, h(), null, 8, null), Yi.c.j(cVarC, a(), 1, j(), null, 8, null));
        } else {
            Object objJ = c1.f25618a;
            Object objJ2 = c1.f25618a;
            while (true) {
                int iK = cVarC.k(a());
                if (iK != -1) {
                    if (iK == 0) {
                        objJ = Yi.c.j(cVarC, a(), 0, h(), null, 8, null);
                    } else {
                        if (iK != 1) {
                            throw new SerializationException("Invalid index: " + iK);
                        }
                        objJ2 = Yi.c.j(cVarC, a(), 1, j(), null, 8, null);
                    }
                } else {
                    if (objJ == c1.f25618a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objJ2 == c1.f25618a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    objK = k(objJ, objJ2);
                }
            }
        }
        cVarC.b(fVarA);
        return objK;
    }

    @Override // Vi.o
    public void e(Yi.f encoder, Object obj) {
        AbstractC6492s.i(encoder, "encoder");
        Yi.d dVarC = encoder.c(a());
        dVarC.q(a(), 0, this.f25608a, g(obj));
        dVarC.q(a(), 1, this.f25609b, i(obj));
        dVarC.b(a());
    }

    protected abstract Object g(Object obj);

    protected final Vi.b h() {
        return this.f25608a;
    }

    protected abstract Object i(Object obj);

    protected final Vi.b j() {
        return this.f25609b;
    }

    protected abstract Object k(Object obj, Object obj2);

    private Z(Vi.b bVar, Vi.b bVar2) {
        this.f25608a = bVar;
        this.f25609b = bVar2;
    }
}
