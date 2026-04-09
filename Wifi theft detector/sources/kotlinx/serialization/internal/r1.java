package kotlinx.serialization.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class r1 extends w {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(kotlinx.serialization.b primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.p.e(primitiveSerializer, "primitiveSerializer");
        this.f22910b = new q1(primitiveSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.a
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.a, kotlinx.serialization.a
    public final Object deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22910b;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final p1 a() {
        return (p1) k(r());
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(p1 p1Var) {
        kotlin.jvm.internal.p.e(p1Var, "<this>");
        return p1Var.d();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(p1 p1Var, int i10) {
        kotlin.jvm.internal.p.e(p1Var, "<this>");
        p1Var.b(i10);
    }

    public abstract Object r();

    @Override // kotlinx.serialization.internal.w
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(p1 p1Var, int i10, Object obj) {
        kotlin.jvm.internal.p.e(p1Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.e
    public final void serialize(y9.f encoder, Object obj) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        int iE = e(obj);
        kotlinx.serialization.descriptors.f fVar = this.f22910b;
        y9.d dVarJ = encoder.j(fVar, iE);
        u(dVarJ, obj, iE);
        dVarJ.c(fVar);
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(p1 p1Var) {
        kotlin.jvm.internal.p.e(p1Var, "<this>");
        return p1Var.a();
    }

    public abstract void u(y9.d dVar, Object obj, int i10);
}
