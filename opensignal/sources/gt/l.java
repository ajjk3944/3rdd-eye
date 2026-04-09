package gt;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class l implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final String f9656d = tt.l.W0(l.class.getCanonicalName(), "");

    /* renamed from: e, reason: collision with root package name */
    public static final b f9657e = new b("NO_LOCKS", a.f9642a);

    /* renamed from: a, reason: collision with root package name */
    public final n f9658a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9660c;

    public l(String str) {
        this(str, new b9.c(26, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!stackTrace[i10].getClassName().startsWith(f9656d)) {
                break;
            } else {
                i10++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    public final i a(ar.a aVar) {
        return new i(this, aVar);
    }

    public final e b(ar.k kVar) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 1);
    }

    public final j c(ar.k kVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 0);
    }

    public ab.g d(Object obj, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return w.g.j(sb2, this.f9660c, ")");
    }

    public l(String str, n nVar) {
        a aVar = a.f9643d;
        this.f9658a = nVar;
        this.f9659b = aVar;
        this.f9660c = str;
    }
}
