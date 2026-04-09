package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public abstract class W1 extends AbstractC4603i1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4516a2 f35650a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC4516a2 f35651b;

    protected W1(AbstractC4516a2 abstractC4516a2) {
        this.f35650a = abstractC4516a2;
        if (abstractC4516a2.u()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f35651b = abstractC4516a2.f();
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final W1 clone() {
        W1 w12 = (W1) this.f35650a.v(5, null, null);
        w12.f35651b = s();
        return w12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4779y2
    /* renamed from: f */
    public AbstractC4516a2 s() {
        if (!this.f35651b.u()) {
            return this.f35651b;
        }
        this.f35651b.n();
        return this.f35651b;
    }
}
