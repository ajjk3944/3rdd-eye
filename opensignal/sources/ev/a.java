package ev;

/* loaded from: classes.dex */
public final class a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i10) {
        super(str);
        this.f8368a = i10;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f8368a) {
            case 1:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
