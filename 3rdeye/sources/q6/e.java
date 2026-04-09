package Q6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements j6.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f11324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C9.r f11325c;

    public /* synthetic */ e(g gVar, C9.r rVar) {
        this.f11324b = gVar;
        this.f11325c = rVar;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        g this$0 = this.f11324b;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f11330d.remove(this.f11325c);
    }
}
