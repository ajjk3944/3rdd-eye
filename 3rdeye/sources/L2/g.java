package L2;

import android.text.TextUtils;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4028e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final T f4029a;

    /* renamed from: b, reason: collision with root package name */
    public final b<T> f4030b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4031c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f4032d;

    /* compiled from: Option.java */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public g(String str, T t10, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f4031c = str;
        this.f4029a = t10;
        this.f4030b = bVar;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f4028e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f4031c.equals(((g) obj).f4031c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4031c.hashCode();
    }

    public final String toString() {
        return B4.f.c(new StringBuilder("Option{key='"), this.f4031c, "'}");
    }

    /* compiled from: Option.java */
    public class a implements b<Object> {
        @Override // L2.g.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
