package d9;

/* loaded from: classes4.dex */
public final class b implements c9.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20809a = new b();

    @Override // c9.c
    public kotlin.coroutines.d getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // c9.c
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
