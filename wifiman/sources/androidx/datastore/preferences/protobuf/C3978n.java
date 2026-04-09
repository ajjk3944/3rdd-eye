package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3985v;
import f.AbstractC5487d;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3978n {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f30936b = true;

    /* renamed from: d, reason: collision with root package name */
    private static volatile C3978n f30938d;

    /* renamed from: a, reason: collision with root package name */
    private final Map f30940a = Collections.emptyMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Class f30937c = c();

    /* renamed from: e, reason: collision with root package name */
    static final C3978n f30939e = new C3978n(true);

    /* renamed from: androidx.datastore.preferences.protobuf.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f30941a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30942b;

        a(Object obj, int i10) {
            this.f30941a = obj;
            this.f30942b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30941a == aVar.f30941a && this.f30942b == aVar.f30942b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f30941a) * 65535) + this.f30942b;
        }
    }

    C3978n(boolean z10) {
    }

    public static C3978n b() {
        C3978n c3978nA = f30938d;
        if (c3978nA == null) {
            synchronized (C3978n.class) {
                try {
                    c3978nA = f30938d;
                    if (c3978nA == null) {
                        c3978nA = f30936b ? AbstractC3977m.a() : f30939e;
                        f30938d = c3978nA;
                    }
                } finally {
                }
            }
        }
        return c3978nA;
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public AbstractC3985v.c a(M m10, int i10) {
        AbstractC5487d.a(this.f30940a.get(new a(m10, i10)));
        return null;
    }
}
