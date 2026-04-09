package b9;

import j9.C5203b;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Lazy.kt */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f18108a = new x();

    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.l.f(th, "<this>");
        kotlin.jvm.internal.l.f(exception, "exception");
        if (th != exception) {
            C5203b.f43142a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        kotlin.jvm.internal.l.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }
}
