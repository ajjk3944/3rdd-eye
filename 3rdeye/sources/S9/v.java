package S9;

/* compiled from: JsonElementMarker.kt */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Q9.B f12108a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12109b;

    /* compiled from: JsonElementMarker.kt */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements p9.p<O9.e, Integer, Boolean> {
        @Override // p9.p
        public final Boolean invoke(O9.e eVar, Integer num) {
            O9.e p02 = eVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.l.f(p02, "p0");
            v vVar = (v) this.receiver;
            vVar.getClass();
            boolean z10 = !p02.j(iIntValue) && p02.i(iIntValue).c();
            vVar.f12109b = z10;
            return Boolean.valueOf(z10);
        }
    }

    public v(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        this.f12108a = new Q9.B(descriptor, new a(2, this, v.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
