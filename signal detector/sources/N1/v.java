package n1;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class v extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f22296f = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    public final List f22297a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2639e f22298b;

    /* renamed from: c, reason: collision with root package name */
    public int f22299c;

    /* renamed from: d, reason: collision with root package name */
    public Class f22300d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22301e;

    public v(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof v) {
            Iterator it = ((v) th).f22297a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    public static void b(List list, u uVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            uVar.append("Cause (");
            int i3 = i + 1;
            uVar.append(String.valueOf(i3));
            uVar.append(" of ");
            uVar.append(String.valueOf(size));
            uVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof v) {
                ((v) th).e(uVar);
            } else {
                c(th, uVar);
            }
            i = i3;
        }
    }

    public static void c(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i3 = i + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i3;
        }
    }

    public final void e(Appendable appendable) throws IOException {
        c(this, appendable);
        try {
            b(this.f22297a, new u(appendable));
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f22301e);
        String str2 = "";
        if (this.f22300d != null) {
            str = ", " + this.f22300d;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.f22299c;
        sb.append(i != 0 ? ", ".concat(AbstractC1135f5.v(i)) : "");
        if (this.f22298b != null) {
            str2 = ", " + this.f22298b;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Throwable th = (Throwable) obj;
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        e(System.err);
    }

    public v(String str, List list) {
        this.f22301e = str;
        setStackTrace(f22296f);
        this.f22297a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
