package va;

import android.os.Build;
import android.util.Log;
import b9.C1992A;
import c9.C2092m;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import y9.q;

/* compiled from: Timber.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f47104a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList<c> f47105b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public static volatile c[] f47106c = new c[0];

    /* compiled from: Timber.kt */
    /* renamed from: va.a$a, reason: collision with other inner class name */
    public static class C0540a extends c {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f47107c = Pattern.compile("(\\$\\d+)+$");

        /* renamed from: b, reason: collision with root package name */
        public final List<String> f47108b = C2092m.W(a.class.getName(), b.class.getName(), c.class.getName(), C0540a.class.getName());

        @Override // va.a.c
        public final String f() {
            String strF = super.f();
            if (strF != null) {
                return strF;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            l.e(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.f47108b.contains(stackTraceElement.getClassName())) {
                    String className = stackTraceElement.getClassName();
                    l.e(className, "element.className");
                    String strU0 = q.u0(className, className);
                    Matcher matcher = f47107c.matcher(strU0);
                    if (matcher.find()) {
                        strU0 = matcher.replaceAll("");
                        l.e(strU0, "m.replaceAll(\"\")");
                    }
                    if (strU0.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                        return strU0;
                    }
                    String strSubstring = strU0.substring(0, 23);
                    l.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return strSubstring;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // va.a.c
        public final void i(String str, int i, String message, Throwable th) {
            int iMin;
            l.f(message, "message");
            if (message.length() < 4000) {
                if (i == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i, str, message);
                    return;
                }
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int iF0 = q.f0(message, '\n', i10, 4);
                if (iF0 == -1) {
                    iF0 = length;
                }
                while (true) {
                    iMin = Math.min(iF0, i10 + 4000);
                    String strSubstring = message.substring(i10, iMin);
                    l.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i, str, strSubstring);
                    }
                    if (iMin >= iF0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    /* compiled from: Timber.kt */
    public static final class b extends c {
        @Override // va.a.c
        public final void a(String str, Object... args) {
            l.f(args, "args");
            for (c cVar : a.f47106c) {
                cVar.a(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // va.a.c
        public final void b(Throwable th) {
            for (c cVar : a.f47106c) {
                cVar.b(th);
            }
        }

        @Override // va.a.c
        public final void c(String str, Object... args) {
            l.f(args, "args");
            for (c cVar : a.f47106c) {
                cVar.c(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // va.a.c
        public final void d(Throwable th) {
            for (c cVar : a.f47106c) {
                cVar.d(th);
            }
        }

        @Override // va.a.c
        public final void e(Throwable th, String str, Object... args) {
            l.f(args, "args");
            for (c cVar : a.f47106c) {
                cVar.e(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // va.a.c
        public final void g(String str, Object... args) {
            l.f(args, "args");
            for (c cVar : a.f47106c) {
                cVar.g(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // va.a.c
        public final void h(int i, Throwable th, String str, Object... args) {
            l.f(args, "args");
            for (c cVar : a.f47106c) {
                cVar.h(i, th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // va.a.c
        public final void i(String str, int i, String message, Throwable th) {
            l.f(message, "message");
            throw new AssertionError();
        }

        @Override // va.a.c
        public final void k(String str, Object... args) {
            l.f(args, "args");
            for (c cVar : a.f47106c) {
                cVar.k(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // va.a.c
        public final void l(String str, Object... args) {
            l.f(args, "args");
            for (c cVar : a.f47106c) {
                cVar.l(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // va.a.c
        public final void m(NoSuchAlgorithmException noSuchAlgorithmException) {
            for (c cVar : a.f47106c) {
                cVar.m(noSuchAlgorithmException);
            }
        }

        public final void n(c cVar) {
            if (cVar == this) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            ArrayList<c> arrayList = a.f47105b;
            synchronized (arrayList) {
                arrayList.add(cVar);
                Object[] array = arrayList.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                a.f47106c = (c[]) array;
                C1992A c1992a = C1992A.f18074a;
            }
        }

        public final void o(String tag) {
            l.f(tag, "tag");
            c[] cVarArr = a.f47106c;
            int length = cVarArr.length;
            int i = 0;
            while (i < length) {
                c cVar = cVarArr[i];
                i++;
                cVar.f47109a.set(tag);
            }
        }
    }

    /* compiled from: Timber.kt */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadLocal<String> f47109a = new ThreadLocal<>();

        public void a(String str, Object... args) {
            l.f(args, "args");
            j(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void b(Throwable th) {
            j(3, th, null, new Object[0]);
        }

        public void c(String str, Object... args) {
            l.f(args, "args");
            j(6, null, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th) {
            j(6, th, null, new Object[0]);
        }

        public void e(Throwable th, String str, Object... args) {
            l.f(args, "args");
            j(6, th, str, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ String f() {
            ThreadLocal<String> threadLocal = this.f47109a;
            String str = threadLocal.get();
            if (str != null) {
                threadLocal.remove();
            }
            return str;
        }

        public void g(String str, Object... args) {
            l.f(args, "args");
            j(4, null, str, Arrays.copyOf(args, args.length));
        }

        public void h(int i, Throwable th, String str, Object... args) {
            l.f(args, "args");
            j(i, th, str, Arrays.copyOf(args, args.length));
        }

        public abstract void i(String str, int i, String str2, Throwable th);

        public final void j(int i, Throwable th, String str, Object... objArr) {
            String strF = f();
            if (str != null && str.length() != 0) {
                if (objArr.length != 0) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) str);
                    sb.append('\n');
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    String string = stringWriter.toString();
                    l.e(string, "sw.toString()");
                    sb.append(string);
                    str = sb.toString();
                }
            } else {
                if (th == null) {
                    return;
                }
                StringWriter stringWriter2 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th.printStackTrace(printWriter2);
                printWriter2.flush();
                str = stringWriter2.toString();
                l.e(str, "sw.toString()");
            }
            i(strF, i, str, th);
        }

        public void k(String str, Object... args) {
            l.f(args, "args");
            j(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void l(String str, Object... args) {
            l.f(args, "args");
            j(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void m(NoSuchAlgorithmException noSuchAlgorithmException) {
            j(5, noSuchAlgorithmException, null, new Object[0]);
        }
    }

    public a() {
        throw new AssertionError();
    }

    public static void a(Exception exc) {
        f47104a.d(exc);
    }
}
