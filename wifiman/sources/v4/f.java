package v4;

import A4.z;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import o4.v;
import y4.b;
import y4.c;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f63434a = new b(null);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63435a;

        static {
            int[] iArr = new int[z.values().length];
            f63435a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63435a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63435a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class b implements b.a {
        private b() {
        }

        @Override // y4.b.a
        public void a() {
        }

        @Override // y4.b.a
        public void b(int i10, long j10) {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static y4.c a(v vVar) {
        c.b bVarA = y4.c.a();
        bVarA.d(vVar.d());
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                bVarA.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            bVarA.e(vVar.e().d());
        }
        try {
            return bVarA.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    private static o4.k c(z zVar) {
        int i10 = a.f63435a[zVar.ordinal()];
        if (i10 == 1) {
            return o4.k.f55276b;
        }
        if (i10 == 2) {
            return o4.k.f55277c;
        }
        if (i10 == 3) {
            return o4.k.f55278d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
