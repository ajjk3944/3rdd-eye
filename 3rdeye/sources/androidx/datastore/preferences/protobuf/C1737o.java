package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1744w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737o {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1737o f15673b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1737o f15674c;

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, AbstractC1744w.e<?, ?>> f15675a;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final P f15676a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15677b;

        public a(int i, P p10) {
            this.f15676a = p10;
            this.f15677b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15676a == aVar.f15676a && this.f15677b == aVar.f15677b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f15676a) * 65535) + this.f15677b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f15674c = new C1737o(0);
    }

    public C1737o() {
        this.f15675a = new HashMap();
    }

    public static C1737o a() {
        C1737o c1737o;
        C1737o c1737o2 = f15673b;
        if (c1737o2 != null) {
            return c1737o2;
        }
        synchronized (C1737o.class) {
            try {
                c1737o = f15673b;
                if (c1737o == null) {
                    Class<?> cls = C1736n.f15669a;
                    if (cls != null) {
                        try {
                            c1737o = (C1737o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f15673b = c1737o;
                    } else {
                        c1737o = f15674c;
                        f15673b = c1737o;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1737o;
    }

    public C1737o(int i) {
        this.f15675a = Collections.EMPTY_MAP;
    }
}
