package S8;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: CompositeException.java */
/* loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final List<Throwable> f12004b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12005c;

    /* renamed from: d, reason: collision with root package name */
    public C0169a f12006d;

    /* compiled from: CompositeException.java */
    /* renamed from: S8.a$a, reason: collision with other inner class name */
    public static final class C0169a extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* compiled from: CompositeException.java */
    public static abstract class b {
        public abstract void a(String str);
    }

    /* compiled from: CompositeException.java */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final PrintStream f12007a;

        public c(PrintStream printStream) {
            this.f12007a = printStream;
        }

        @Override // S8.a.b
        public final void a(String str) {
            this.f12007a.println((Object) str);
        }
    }

    /* compiled from: CompositeException.java */
    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final PrintWriter f12008a;

        public d(PrintWriter printWriter) {
            this.f12008a = printWriter;
        }

        @Override // S8.a.b
        public final void a(String str) {
            this.f12008a.println((Object) str);
        }
    }

    public a() {
        throw null;
    }

    public a(Throwable... thArr) {
        List<Throwable> listAsList = Arrays.asList(thArr);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (listAsList != null) {
            for (Throwable th : listAsList) {
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).f12004b);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f12004b = listUnmodifiableList;
        this.f12005c = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    public static void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    public final void b(b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f12004b) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        bVar.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f12006d == null) {
                C0169a c0169a = new C0169a();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.f12004b.iterator();
                C0169a c0169a2 = c0169a;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = next.getCause();
                        if (cause != null && cause != next) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Throwable th = (Throwable) it2.next();
                            if (hashSet.contains(th)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            c0169a2.initCause(next);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = c0169a2.getCause();
                        if (cause3 != null && c0169a2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            c0169a2 = cause3;
                        }
                    }
                }
                this.f12006d = c0169a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f12006d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f12005c;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }
}
