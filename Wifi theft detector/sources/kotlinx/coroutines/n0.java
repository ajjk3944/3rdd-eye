package kotlinx.coroutines;

/* loaded from: classes4.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f22578a = kotlinx.coroutines.internal.d0.f("kotlinx.coroutines.main.delay", false);

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f22579b = b();

    public static final q0 a() {
        return f22579b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q0 b() {
        if (!f22578a) {
            return m0.f22576h;
        }
        c2 c2VarC = w0.c();
        return (kotlinx.coroutines.internal.t.c(c2VarC) || !(c2VarC instanceof q0)) ? m0.f22576h : (q0) c2VarC;
    }
}
