package T4;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f21399a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f21400b;

    /* renamed from: c, reason: collision with root package name */
    private final b f21401c;

    public a(int i10, d... dVarArr) {
        this.f21399a = i10;
        this.f21400b = dVarArr;
        this.f21401c = new b(i10);
    }

    @Override // T4.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f21399a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f21400b) {
            if (stackTraceElementArrA.length <= this.f21399a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f21399a ? this.f21401c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
