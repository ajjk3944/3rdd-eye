package zb;

/* loaded from: classes.dex */
public class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f26847c = new r(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26848a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f26849b;

    public r(boolean z10, String str, Exception exc) {
        this.f26848a = z10;
        this.f26849b = exc;
    }

    public static r b(String str) {
        return new r(false, str, null);
    }

    public static r c(Exception exc, String str) {
        return new r(false, str, exc);
    }

    public void a() {
    }
}
