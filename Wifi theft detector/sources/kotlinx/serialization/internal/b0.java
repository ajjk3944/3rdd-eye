package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class b0 extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f22825c = new b0();

    public b0() {
        super(x9.a.w(kotlin.jvm.internal.j.f22037a));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        kotlin.jvm.internal.p.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, a0 builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(decoder.F(getDescriptor(), i10));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public a0 k(double[] dArr) {
        kotlin.jvm.internal.p.e(dArr, "<this>");
        return new a0(dArr);
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(y9.d encoder, double[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.E(getDescriptor(), i11, content[i11]);
        }
    }
}
