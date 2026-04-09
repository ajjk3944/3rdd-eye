package q5;

import I4.a;
import I4.i;
import android.content.Context;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String d(Context context);
    }

    public static I4.a<?> a(String str, String str2) {
        q5.a aVar = new q5.a(str, str2);
        a.C0043a c0043aB = I4.a.b(d.class);
        c0043aB.f2444e = 1;
        c0043aB.f2445f = new B.f(aVar, 6);
        return c0043aB.b();
    }

    public static I4.a<?> b(String str, a<Context> aVar) {
        a.C0043a c0043aB = I4.a.b(d.class);
        c0043aB.f2444e = 1;
        c0043aB.a(i.b(Context.class));
        c0043aB.f2445f = new B.i(9, str, aVar);
        return c0043aB.b();
    }
}
