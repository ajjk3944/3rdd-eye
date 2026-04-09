package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f34290g = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    private final List f34291a;

    /* renamed from: b, reason: collision with root package name */
    private C2.e f34292b;

    /* renamed from: c, reason: collision with root package name */
    private C2.a f34293c;

    /* renamed from: d, reason: collision with root package name */
    private Class f34294d;

    /* renamed from: e, reason: collision with root package name */
    private String f34295e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f34296f;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th2, List list) {
        if (!(th2 instanceof GlideException)) {
            list.add(th2);
            return;
        }
        Iterator it = ((GlideException) th2).h().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    private static void c(List list, Appendable appendable) {
        try {
            d(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void d(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).m(appendable);
            } else {
                g(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void g(Throwable th2, Appendable appendable) throws IOException {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void m(Appendable appendable) throws IOException {
        g(this, appendable);
        c(h(), new a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f34295e);
        sb2.append(this.f34294d != null ? ", " + this.f34294d : "");
        sb2.append(this.f34293c != null ? ", " + this.f34293c : "");
        sb2.append(this.f34292b != null ? ", " + this.f34292b : "");
        List<Throwable> listJ = j();
        if (listJ.isEmpty()) {
            return sb2.toString();
        }
        if (listJ.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listJ.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : listJ) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public List h() {
        return this.f34291a;
    }

    public List j() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void l(String str) {
        List listJ = j();
        int size = listJ.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) listJ.get(i10));
            i10 = i11;
        }
    }

    void n(C2.e eVar, C2.a aVar) {
        o(eVar, aVar, null);
    }

    void o(C2.e eVar, C2.a aVar, Class cls) {
        this.f34292b = eVar;
        this.f34293c = aVar;
        this.f34294d = cls;
    }

    public void p(Exception exc) {
        this.f34296f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        m(printStream);
    }

    public GlideException(String str, List list) {
        this.f34295e = str;
        setStackTrace(f34290g);
        this.f34291a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f34297a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34298b = true;

        a(Appendable appendable) {
            this.f34297a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f34298b) {
                this.f34298b = false;
                this.f34297a.append("  ");
            }
            this.f34298b = c10 == '\n';
            this.f34297a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f34298b) {
                this.f34298b = false;
                this.f34297a.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f34298b = z10;
            this.f34297a.append(charSequenceA, i10, i11);
            return this;
        }
    }
}
