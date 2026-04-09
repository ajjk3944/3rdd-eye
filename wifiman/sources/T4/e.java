package T4;

import java.util.Stack;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f21404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21405b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f21406c;

    /* renamed from: d, reason: collision with root package name */
    public final e f21407d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f21404a = str;
        this.f21405b = str2;
        this.f21406c = stackTraceElementArr;
        this.f21407d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
