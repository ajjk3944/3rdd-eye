package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class g extends p {

    /* renamed from: b, reason: collision with root package name */
    private static final q f39009b = f(n.LAZILY_PARSED_NUMBER);

    /* renamed from: a, reason: collision with root package name */
    private final o f39010a;

    class a implements q {
        a() {
        }

        @Override // com.google.gson.q
        public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.c() == Number.class) {
                return g.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39012a;

        static {
            int[] iArr = new int[EnumC8269b.values().length];
            f39012a = iArr;
            try {
                iArr[EnumC8269b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39012a[EnumC8269b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39012a[EnumC8269b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private g(o oVar) {
        this.f39010a = oVar;
    }

    public static q e(o oVar) {
        return oVar == n.LAZILY_PARSED_NUMBER ? f39009b : f(oVar);
    }

    private static q f(o oVar) {
        return new g(oVar).new a();
    }

    @Override // com.google.gson.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(C8268a c8268a) throws IOException {
        EnumC8269b enumC8269bV0 = c8268a.v0();
        int i10 = b.f39012a[enumC8269bV0.ordinal()];
        if (i10 == 1) {
            c8268a.r0();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f39010a.readNumber(c8268a);
        }
        throw new JsonSyntaxException("Expecting number, got: " + enumC8269bV0 + "; at path " + c8268a.getPath());
    }

    @Override // com.google.gson.p
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(C8270c c8270c, Number number) throws IOException {
        c8270c.w0(number);
    }
}
