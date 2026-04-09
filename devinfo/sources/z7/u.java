package z7;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f38098f = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    public final List f38099a;

    /* renamed from: b, reason: collision with root package name */
    public x7.e f38100b;

    /* renamed from: c, reason: collision with root package name */
    public int f38101c;

    /* renamed from: d, reason: collision with root package name */
    public Class f38102d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38103e;

    public u(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (th2 instanceof u) {
            Iterator it = ((u) th2).f38099a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
        } else if (th2 != null) {
            arrayList.add(th2);
        }
    }

    public static void b(List list, t tVar) throws IOException {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            tVar.append("Cause (");
            int i10 = i4 + 1;
            tVar.append(String.valueOf(i10));
            tVar.append(" of ");
            tVar.append(String.valueOf(size));
            tVar.append("): ");
            Throwable th2 = (Throwable) list.get(i4);
            if (th2 instanceof u) {
                ((u) th2).e(tVar);
            } else {
                c(th2, tVar);
            }
            i4 = i10;
        }
    }

    public static void c(Throwable th2, Appendable appendable) throws IOException {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i10 = i4 + 1;
            sb2.append(i10);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i4));
            i4 = i10;
        }
    }

    public final void e(Appendable appendable) throws IOException {
        c(this, appendable);
        try {
            b(this.f38099a, new t(appendable));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f38103e);
        String str2 = "";
        if (this.f38102d != null) {
            str = ", " + this.f38102d;
        } else {
            str = "";
        }
        sb2.append(str);
        int i4 = this.f38101c;
        sb2.append(i4 != 0 ? ", ".concat(r5.c.u(i4)) : "");
        if (this.f38100b != null) {
            str2 = ", " + this.f38100b;
        }
        sb2.append(str2);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Throwable th2 = (Throwable) obj;
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        e(System.err);
    }

    public u(String str, List list) {
        this.f38103e = str;
        setStackTrace(f38098f);
        this.f38099a = list;
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
