package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class z1 extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final z1 f22939c = new z1();

    public z1() {
        super(x9.a.A(kotlin.jvm.internal.v.f22045a));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        kotlin.jvm.internal.p.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, y1 builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(decoder.E(getDescriptor(), i10));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public y1 k(short[] sArr) {
        kotlin.jvm.internal.p.e(sArr, "<this>");
        return new y1(sArr);
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(y9.d encoder, short[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.D(getDescriptor(), i11, content[i11]);
        }
    }
}
