package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1744w;
import androidx.datastore.preferences.protobuf.C1737o;
import java.io.IOException;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1739q extends AbstractC1738p<AbstractC1744w.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15688a;

        static {
            int[] iArr = new int[r0.values().length];
            f15688a = iArr;
            try {
                iArr[r0.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15688a[r0.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15688a[r0.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15688a[r0.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15688a[r0.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15688a[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15688a[r0.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15688a[r0.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15688a[r0.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15688a[r0.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15688a[r0.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15688a[r0.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15688a[r0.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15688a[r0.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15688a[r0.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15688a[r0.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15688a[r0.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15688a[r0.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final void a(Map.Entry entry) {
        ((AbstractC1744w.d) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final AbstractC1744w.e b(C1737o c1737o, P p10, int i) {
        c1737o.getClass();
        return c1737o.f15675a.get(new C1737o.a(i, p10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final C1740s<AbstractC1744w.d> c(Object obj) {
        return ((AbstractC1744w.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final C1740s<AbstractC1744w.d> d(Object obj) {
        AbstractC1744w.c cVar = (AbstractC1744w.c) obj;
        C1740s<AbstractC1744w.d> c1740s = cVar.extensions;
        if (c1740s.f15693b) {
            cVar.extensions = c1740s.clone();
        }
        return cVar.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final boolean e(P p10) {
        return p10 instanceof AbstractC1744w.c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final void f(Object obj) {
        C1740s<AbstractC1744w.d> c1740s = ((AbstractC1744w.c) obj).extensions;
        if (c1740s.f15693b) {
            return;
        }
        c1740s.f15692a.g();
        c1740s.f15693b = true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final Object g(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final void h(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final void i(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1738p
    public final void j(Map.Entry entry) throws IOException {
        ((AbstractC1744w.d) entry.getKey()).getClass();
        int[] iArr = a.f15688a;
        throw null;
    }
}
