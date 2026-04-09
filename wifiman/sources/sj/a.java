package Sj;

import Yg.J;
import Zg.AbstractC3689v;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20830a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f20831b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static volatile c[] f20832c = new c[0];

    /* renamed from: Sj.a$a, reason: collision with other inner class name */
    public static class C0767a extends c {

        /* renamed from: c, reason: collision with root package name */
        public static final C0768a f20833c = new C0768a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f20834d = Pattern.compile("(\\$\\d+)+$");

        /* renamed from: b, reason: collision with root package name */
        private final List f20835b = AbstractC3689v.o(a.class.getName(), b.class.getName(), c.class.getName(), C0767a.class.getName());

        /* renamed from: Sj.a$a$a, reason: collision with other inner class name */
        public static final class C0768a {
            public /* synthetic */ C0768a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0768a() {
            }
        }

        @Override // Sj.a.c
        public String i() {
            String strI = super.i();
            if (strI != null) {
                return strI;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            AbstractC6492s.h(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.f20835b.contains(stackTraceElement.getClassName())) {
                    return q(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // Sj.a.c
        protected void l(int i10, String str, String message, Throwable th2) {
            int iMin;
            AbstractC6492s.i(message, "message");
            if (message.length() < 4000) {
                if (i10 == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i10, str, message);
                    return;
                }
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iJ0 = t.j0(message, '\n', i11, false, 4, null);
                if (iJ0 == -1) {
                    iJ0 = length;
                }
                while (true) {
                    iMin = Math.min(iJ0, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    AbstractC6492s.h(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i10 == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i10, str, strSubstring);
                    }
                    if (iMin >= iJ0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }

        protected String q(StackTraceElement element) {
            AbstractC6492s.i(element, "element");
            String className = element.getClassName();
            AbstractC6492s.h(className, "element.className");
            String strG1 = t.g1(className, '.', null, 2, null);
            Matcher matcher = f20834d.matcher(strG1);
            if (matcher.find()) {
                strG1 = matcher.replaceAll("");
                AbstractC6492s.h(strG1, "m.replaceAll(\"\")");
            }
            strG1.length();
            return strG1;
        }
    }

    public static final class b extends c {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Sj.a.c
        public void a(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            for (c cVar : a.f20832c) {
                cVar.a(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Sj.a.c
        public void b(Throwable th2, String str, Object... args) {
            AbstractC6492s.i(args, "args");
            for (c cVar : a.f20832c) {
                cVar.b(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Sj.a.c
        public void c(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            for (c cVar : a.f20832c) {
                cVar.c(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Sj.a.c
        public void d(Throwable th2) {
            for (c cVar : a.f20832c) {
                cVar.d(th2);
            }
        }

        @Override // Sj.a.c
        public void e(Throwable th2, String str, Object... args) {
            AbstractC6492s.i(args, "args");
            for (c cVar : a.f20832c) {
                cVar.e(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Sj.a.c
        protected void l(int i10, String str, String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            throw new AssertionError();
        }

        @Override // Sj.a.c
        public void n(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            for (c cVar : a.f20832c) {
                cVar.n(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Sj.a.c
        public void o(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            for (c cVar : a.f20832c) {
                cVar.o(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Sj.a.c
        public void p(Throwable th2, String str, Object... args) {
            AbstractC6492s.i(args, "args");
            for (c cVar : a.f20832c) {
                cVar.p(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        public final void q(c tree) {
            AbstractC6492s.i(tree, "tree");
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (a.f20831b) {
                a.f20831b.add(tree);
                Object[] array = a.f20831b.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                a.f20832c = (c[]) array;
                J j10 = J.f24997a;
            }
        }

        public final c r(String tag) {
            AbstractC6492s.i(tag, "tag");
            c[] cVarArr = a.f20832c;
            int length = cVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                c cVar = cVarArr[i10];
                i10++;
                cVar.g().set(tag);
            }
            return this;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadLocal f20836a = new ThreadLocal();

        private final String h(Throwable th2) {
            StringWriter stringWriter = new StringWriter(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            AbstractC6492s.h(string, "sw.toString()");
            return string;
        }

        private final void m(int i10, Throwable th2, String str, Object... objArr) {
            String strI = i();
            if (k(strI, i10)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = f(str, objArr);
                    }
                    if (th2 != null) {
                        str = ((Object) str) + '\n' + h(th2);
                    }
                } else if (th2 == null) {
                    return;
                } else {
                    str = h(th2);
                }
                l(i10, strI, str, th2);
            }
        }

        public void a(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            m(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void b(Throwable th2, String str, Object... args) {
            AbstractC6492s.i(args, "args");
            m(3, th2, str, Arrays.copyOf(args, args.length));
        }

        public void c(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            m(6, null, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th2) {
            m(6, th2, null, new Object[0]);
        }

        public void e(Throwable th2, String str, Object... args) {
            AbstractC6492s.i(args, "args");
            m(6, th2, str, Arrays.copyOf(args, args.length));
        }

        protected String f(String message, Object[] args) {
            AbstractC6492s.i(message, "message");
            AbstractC6492s.i(args, "args");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            AbstractC6492s.h(str, "java.lang.String.format(this, *args)");
            return str;
        }

        public final /* synthetic */ ThreadLocal g() {
            return this.f20836a;
        }

        public /* synthetic */ String i() {
            String str = (String) this.f20836a.get();
            if (str != null) {
                this.f20836a.remove();
            }
            return str;
        }

        protected boolean j(int i10) {
            return true;
        }

        protected boolean k(String str, int i10) {
            return j(i10);
        }

        protected abstract void l(int i10, String str, String str2, Throwable th2);

        public void n(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            m(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void o(String str, Object... args) {
            AbstractC6492s.i(args, "args");
            m(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void p(Throwable th2, String str, Object... args) {
            AbstractC6492s.i(args, "args");
            m(5, th2, str, Arrays.copyOf(args, args.length));
        }
    }
}
