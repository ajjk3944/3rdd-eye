package c3;

import a3.EnumC3757e;
import android.util.Base64;
import c3.C4203d;

/* renamed from: c3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4215p {

    /* renamed from: c3.p$a */
    public static abstract class a {
        public abstract AbstractC4215p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC3757e enumC3757e);
    }

    public static a a() {
        return new C4203d.b().d(EnumC3757e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC3757e d();

    public boolean e() {
        return c() != null;
    }

    public AbstractC4215p f(EnumC3757e enumC3757e) {
        return a().b(b()).d(enumC3757e).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
