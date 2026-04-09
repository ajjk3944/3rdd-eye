package Q9;

/* compiled from: CollectionDescriptors.kt */
/* loaded from: classes3.dex */
public final class K extends V {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(O9.e eVar, int i) {
        super(eVar);
        this.f11430b = i;
    }

    @Override // O9.e
    public final String a() {
        switch (this.f11430b) {
            case 0:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
