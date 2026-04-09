package Q9;

/* compiled from: InlineClassDescriptor.kt */
/* loaded from: classes3.dex */
public final class N implements H<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M9.b<Object> f11439a;

    public N(M9.b<Object> bVar) {
        this.f11439a = bVar;
    }

    @Override // Q9.H
    public final M9.b<?>[] childSerializers() {
        return new M9.b[]{this.f11439a};
    }

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        throw new IllegalStateException("unsupported");
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // Q9.H
    public final M9.b<?>[] typeParametersSerializers() {
        return C1549p0.f11523a;
    }
}
