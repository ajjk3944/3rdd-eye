package N2;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: GlideException.java */
/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public static final StackTraceElement[] f4622g = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public final List<Throwable> f4623b;

    /* renamed from: c, reason: collision with root package name */
    public L2.f f4624c;

    /* renamed from: d, reason: collision with root package name */
    public L2.a f4625d;

    /* renamed from: e, reason: collision with root package name */
    public Class<?> f4626e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4627f;

    public q(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof q)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((q) th).f4623b.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    public static void b(List list, a aVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            aVar.append("Cause (");
            int i10 = i + 1;
            aVar.append(String.valueOf(i10));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof q) {
                ((q) th).e(aVar);
            } else {
                c(th, aVar);
            }
            i = i10;
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
            int i10 = i + 1;
            sb.append(i10);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i10;
        }
    }

    public final void e(Appendable appendable) throws IOException {
        c(this, appendable);
        try {
            b(this.f4623b, new a(appendable));
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f4627f);
        String str3 = "";
        if (this.f4626e != null) {
            str = ", " + this.f4626e;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f4625d != null) {
            str2 = ", " + this.f4625d;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f4624c != null) {
            str3 = ", " + this.f4624c;
        }
        sb.append(str3);
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
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
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

    public q(String str, List<Throwable> list) {
        this.f4627f = str;
        setStackTrace(f4622g);
        this.f4623b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        e(printWriter);
    }

    /* compiled from: GlideException.java */
    public static final class a implements Appendable {

        /* renamed from: b, reason: collision with root package name */
        public final Appendable f4628b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4629c = true;

        public a(Appendable appendable) {
            this.f4628b = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) throws IOException {
            boolean z10 = this.f4629c;
            Appendable appendable = this.f4628b;
            if (z10) {
                this.f4629c = false;
                appendable.append("  ");
            }
            this.f4629c = c10 == '\n';
            appendable.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i10) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = this.f4629c;
            Appendable appendable = this.f4628b;
            boolean z11 = false;
            if (z10) {
                this.f4629c = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
                z11 = true;
            }
            this.f4629c = z11;
            appendable.append(charSequence, i, i10);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
