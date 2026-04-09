package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import w5.C8268a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class n implements o {
    private static final /* synthetic */ n[] $VALUES;
    public static final n BIG_DECIMAL;
    public static final n DOUBLE;
    public static final n LAZILY_PARSED_NUMBER;
    public static final n LONG_OR_DOUBLE;

    enum a extends n {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.n, com.google.gson.o
        public Double readNumber(C8268a c8268a) throws IOException {
            return Double.valueOf(c8268a.m0());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        n nVar = new n("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.n.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.n, com.google.gson.o
            public Number readNumber(C8268a c8268a) throws IOException {
                return new t5.g(c8268a.t0());
            }
        };
        LAZILY_PARSED_NUMBER = nVar;
        n nVar2 = new n("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.n.c
            {
                a aVar2 = null;
            }

            private Number parseAsDouble(String str, C8268a c8268a) throws NumberFormatException, IOException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!c8268a.Y()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c8268a.P());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    throw new JsonParseException("Cannot parse " + str + "; at path " + c8268a.P(), e10);
                }
            }

            @Override // com.google.gson.n, com.google.gson.o
            public Number readNumber(C8268a c8268a) throws JsonParseException, IOException {
                String strT0 = c8268a.t0();
                if (strT0.indexOf(46) >= 0) {
                    return parseAsDouble(strT0, c8268a);
                }
                try {
                    return Long.valueOf(Long.parseLong(strT0));
                } catch (NumberFormatException unused) {
                    return parseAsDouble(strT0, c8268a);
                }
            }
        };
        LONG_OR_DOUBLE = nVar2;
        n nVar3 = new n("BIG_DECIMAL", 3) { // from class: com.google.gson.n.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.n, com.google.gson.o
            public BigDecimal readNumber(C8268a c8268a) throws IOException {
                String strT0 = c8268a.t0();
                try {
                    return t5.i.b(strT0);
                } catch (NumberFormatException e10) {
                    throw new JsonParseException("Cannot parse " + strT0 + "; at path " + c8268a.P(), e10);
                }
            }
        };
        BIG_DECIMAL = nVar3;
        $VALUES = new n[]{aVar, nVar, nVar2, nVar3};
    }

    private n(String str, int i10) {
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @Override // com.google.gson.o
    public abstract /* synthetic */ Number readNumber(C8268a c8268a) throws IOException;

    /* synthetic */ n(String str, int i10, a aVar) {
        this(str, i10);
    }
}
