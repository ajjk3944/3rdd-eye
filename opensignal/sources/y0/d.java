package y0;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import mq.e0;

/* loaded from: classes.dex */
public final class d extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final List f25616a;

    public d(List list) {
        this.f25616a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        nq.c cVar = new nq.c(10);
        List list = this.f25616a;
        l.e(list, "<this>");
        e0 e0Var = new e0(list);
        if (e0Var.a() > 0) {
            ((a) e0Var.get(0)).getClass();
            throw null;
        }
        nq.c cVarL = e5.l(cVar);
        l.e(cVarL, "<this>");
        e0 e0Var2 = new e0(cVarL);
        int iA = e0Var2.a();
        for (int i10 = 0; i10 < iA; i10++) {
            sb2.append("\tat " + ((String) e0Var2.get(i10)));
            sb2.append('\n');
        }
        String string = sb2.toString();
        l.d(string, "toString(...)");
        return string;
    }
}
