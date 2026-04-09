package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List f49805a;

    /* renamed from: b, reason: collision with root package name */
    private final String f49806b;

    /* renamed from: c, reason: collision with root package name */
    private Throwable f49807c;

    static final class a extends RuntimeException {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    static abstract class b {
        b() {
        }

        abstract b a(Object obj);
    }

    static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintStream f49808a;

        c(PrintStream printStream) {
            this.f49808a = printStream;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(Object obj) {
            this.f49808a.print(obj);
            return this;
        }
    }

    static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintWriter f49809a;

        d(PrintWriter printWriter) {
            this.f49809a = printWriter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Object obj) {
            this.f49809a.print(obj);
            return this;
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void a(b bVar, Throwable th2, String str) {
        bVar.a(str).a(th2).a('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            bVar.a("\t\tat ").a(stackTraceElement).a('\n');
        }
        if (th2.getCause() != null) {
            bVar.a("\tCaused by: ");
            a(bVar, th2.getCause(), "");
        }
    }

    private void d(b bVar) {
        bVar.a(this).a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            bVar.a("\tat ").a(stackTraceElement).a("\n");
        }
        int i10 = 1;
        for (Throwable th2 : this.f49805a) {
            bVar.a("  ComposedException ").a(Integer.valueOf(i10)).a(" :\n");
            a(bVar, th2, "\t");
            i10++;
        }
        bVar.a("\n");
    }

    public List c() {
        return this.f49805a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        int i10;
        try {
            if (this.f49807c == null) {
                String property = System.getProperty("line.separator");
                if (this.f49805a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f49805a.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable cause : this.f49805a) {
                        int i11 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i12 = 0; i12 < i11; i12++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append(cause.getClass().getCanonicalName());
                                sb2.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb2.append(message);
                                    sb2.append(property);
                                } else {
                                    sb2.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i13 = 0; i13 < i11 + 2; i13++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append(str);
                                        sb2.append(property);
                                    }
                                }
                                int i14 = 0;
                                while (true) {
                                    i10 = i11 + 2;
                                    if (i14 >= i10) {
                                        break;
                                    }
                                    sb2.append("  ");
                                    i14++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb2.append("at ");
                                    sb2.append(stackTrace[0]);
                                    sb2.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i15 = 0; i15 < i10; i15++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append("|-- ");
                                        sb2.append("(cause not expanded again) ");
                                        sb2.append(cause2.getClass().getCanonicalName());
                                        sb2.append(": ");
                                        sb2.append(cause2.getMessage());
                                        sb2.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i11++;
                                }
                            }
                        }
                    }
                    this.f49807c = new a(sb2.toString().trim());
                } else {
                    this.f49807c = (Throwable) this.f49805a.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f49807c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f49806b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        d(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        d(new d(printWriter));
    }

    public CompositeException(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).c());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f49805a = listUnmodifiableList;
            this.f49806b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
