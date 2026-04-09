package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class k extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k f22876c = new k();

    public k() {
        super(x9.a.u(kotlin.jvm.internal.d.f22027a));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(byte[] bArr) {
        kotlin.jvm.internal.p.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] r() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, j builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(decoder.B(getDescriptor(), i10));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j k(byte[] bArr) {
        kotlin.jvm.internal.p.e(bArr, "<this>");
        return new j(bArr);
    }

    @Override // kotlinx.serialization.internal.r1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(y9.d encoder, byte[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.p(getDescriptor(), i11, content[i11]);
        }
    }
}
