package com.google.gson.internal.bind;

import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class h extends p {

    /* renamed from: c, reason: collision with root package name */
    private static final q f39013c = f(n.DOUBLE);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f39014a;

    /* renamed from: b, reason: collision with root package name */
    private final o f39015b;

    class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f39016a;

        a(o oVar) {
            this.f39016a = oVar;
        }

        @Override // com.google.gson.q
        public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            a aVar2 = null;
            if (aVar.c() == Object.class) {
                return new h(eVar, this.f39016a, aVar2);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39017a;

        static {
            int[] iArr = new int[EnumC8269b.values().length];
            f39017a = iArr;
            try {
                iArr[EnumC8269b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39017a[EnumC8269b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39017a[EnumC8269b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39017a[EnumC8269b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39017a[EnumC8269b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39017a[EnumC8269b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ h(com.google.gson.e eVar, o oVar, a aVar) {
        this(eVar, oVar);
    }

    public static q e(o oVar) {
        return oVar == n.DOUBLE ? f39013c : f(oVar);
    }

    private static q f(o oVar) {
        return new a(oVar);
    }

    private Object g(C8268a c8268a, EnumC8269b enumC8269b) throws IOException {
        int i10 = b.f39017a[enumC8269b.ordinal()];
        if (i10 == 3) {
            return c8268a.t0();
        }
        if (i10 == 4) {
            return this.f39015b.readNumber(c8268a);
        }
        if (i10 == 5) {
            return Boolean.valueOf(c8268a.f0());
        }
        if (i10 == 6) {
            c8268a.r0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + enumC8269b);
    }

    private Object h(C8268a c8268a, EnumC8269b enumC8269b) throws IOException {
        int i10 = b.f39017a[enumC8269b.ordinal()];
        if (i10 == 1) {
            c8268a.g();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        c8268a.h();
        return new t5.h();
    }

    @Override // com.google.gson.p
    public Object b(C8268a c8268a) throws IOException {
        EnumC8269b enumC8269bV0 = c8268a.v0();
        Object objH = h(c8268a, enumC8269bV0);
        if (objH == null) {
            return g(c8268a, enumC8269bV0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c8268a.T()) {
                String strP0 = objH instanceof Map ? c8268a.p0() : null;
                EnumC8269b enumC8269bV02 = c8268a.v0();
                Object objH2 = h(c8268a, enumC8269bV02);
                boolean z10 = objH2 != null;
                if (objH2 == null) {
                    objH2 = g(c8268a, enumC8269bV02);
                }
                if (objH instanceof List) {
                    ((List) objH).add(objH2);
                } else {
                    ((Map) objH).put(strP0, objH2);
                }
                if (z10) {
                    arrayDeque.addLast(objH);
                    objH = objH2;
                }
            } else {
                if (objH instanceof List) {
                    c8268a.v();
                } else {
                    c8268a.y();
                }
                if (arrayDeque.isEmpty()) {
                    return objH;
                }
                objH = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.p
    public void d(C8270c c8270c, Object obj) throws IOException {
        if (obj == null) {
            c8270c.b0();
            return;
        }
        p pVarM = this.f39014a.m(obj.getClass());
        if (!(pVarM instanceof h)) {
            pVarM.d(c8270c, obj);
        } else {
            c8270c.j();
            c8270c.v();
        }
    }

    private h(com.google.gson.e eVar, o oVar) {
        this.f39014a = eVar;
        this.f39015b = oVar;
    }
}
