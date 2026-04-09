package l7;

/* compiled from: TypeHelpers.kt */
/* loaded from: classes.dex */
public final class i implements j<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f43894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p9.l<Object, Boolean> f43895b;

    public i(Object obj, p9.l<Object, Boolean> lVar) {
        this.f43895b = lVar;
        this.f43894a = obj;
    }

    @Override // l7.j
    public final Object a() {
        return this.f43894a;
    }

    @Override // l7.j
    public final boolean b(Object value) {
        kotlin.jvm.internal.l.f(value, "value");
        return this.f43895b.invoke(value).booleanValue();
    }
}
