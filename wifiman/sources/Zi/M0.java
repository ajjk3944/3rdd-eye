package Zi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class M0 extends AbstractC3737w {

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f25576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(Vi.b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC6492s.i(primitiveSerializer, "primitiveSerializer");
        this.f25576b = new L0(primitiveSerializer.a());
    }

    protected abstract void A(Yi.d dVar, Object obj, int i10);

    @Override // Zi.AbstractC3737w, Vi.b, Vi.o, Vi.InterfaceC3627a
    public final Xi.f a() {
        return this.f25576b;
    }

    @Override // Zi.AbstractC3694a, Vi.InterfaceC3627a
    public final Object c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return l(decoder, null);
    }

    @Override // Zi.AbstractC3737w, Vi.o
    public final void e(Yi.f encoder, Object obj) {
        AbstractC6492s.i(encoder, "encoder");
        int iK = k(obj);
        Xi.f fVar = this.f25576b;
        Yi.d dVarX = encoder.x(fVar, iK);
        A(dVarX, obj, iK);
        dVarX.b(fVar);
    }

    @Override // Zi.AbstractC3694a
    protected final Iterator j(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final K0 g() {
        return (K0) q(x());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final int h(K0 k02) {
        AbstractC6492s.i(k02, "<this>");
        return k02.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void i(K0 k02, int i10) {
        AbstractC6492s.i(k02, "<this>");
        k02.b(i10);
    }

    protected abstract Object x();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void t(K0 k02, int i10, Object obj) {
        AbstractC6492s.i(k02, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Object r(K0 k02) {
        AbstractC6492s.i(k02, "<this>");
        return k02.a();
    }
}
