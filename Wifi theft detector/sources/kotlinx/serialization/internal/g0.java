package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class g0 extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f22856c = new g0();

    public g0() {
        super(x9.a.x(kotlin.jvm.internal.k.f22038a));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        kotlin.jvm.internal.p.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, f0 builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(decoder.u(getDescriptor(), i10));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public f0 k(float[] fArr) {
        kotlin.jvm.internal.p.e(fArr, "<this>");
        return new f0(fArr);
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(y9.d encoder, float[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.s(getDescriptor(), i11, content[i11]);
        }
    }
}
