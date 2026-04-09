package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: A, reason: collision with root package name */
    public static final com.google.gson.p f39046A;

    /* renamed from: B, reason: collision with root package name */
    public static final com.google.gson.p f39047B;

    /* renamed from: C, reason: collision with root package name */
    public static final com.google.gson.q f39048C;

    /* renamed from: D, reason: collision with root package name */
    public static final com.google.gson.p f39049D;

    /* renamed from: E, reason: collision with root package name */
    public static final com.google.gson.q f39050E;

    /* renamed from: F, reason: collision with root package name */
    public static final com.google.gson.p f39051F;

    /* renamed from: G, reason: collision with root package name */
    public static final com.google.gson.q f39052G;

    /* renamed from: H, reason: collision with root package name */
    public static final com.google.gson.p f39053H;

    /* renamed from: I, reason: collision with root package name */
    public static final com.google.gson.q f39054I;

    /* renamed from: J, reason: collision with root package name */
    public static final com.google.gson.p f39055J;

    /* renamed from: K, reason: collision with root package name */
    public static final com.google.gson.q f39056K;

    /* renamed from: L, reason: collision with root package name */
    public static final com.google.gson.p f39057L;

    /* renamed from: M, reason: collision with root package name */
    public static final com.google.gson.q f39058M;

    /* renamed from: N, reason: collision with root package name */
    public static final com.google.gson.p f39059N;

    /* renamed from: O, reason: collision with root package name */
    public static final com.google.gson.q f39060O;

    /* renamed from: P, reason: collision with root package name */
    public static final com.google.gson.p f39061P;

    /* renamed from: Q, reason: collision with root package name */
    public static final com.google.gson.q f39062Q;

    /* renamed from: R, reason: collision with root package name */
    public static final com.google.gson.p f39063R;

    /* renamed from: S, reason: collision with root package name */
    public static final com.google.gson.q f39064S;

    /* renamed from: T, reason: collision with root package name */
    public static final com.google.gson.p f39065T;

    /* renamed from: U, reason: collision with root package name */
    public static final com.google.gson.q f39066U;

    /* renamed from: V, reason: collision with root package name */
    public static final com.google.gson.p f39067V;

    /* renamed from: W, reason: collision with root package name */
    public static final com.google.gson.q f39068W;

    /* renamed from: X, reason: collision with root package name */
    public static final com.google.gson.q f39069X;

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.p f39070a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.q f39071b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.p f39072c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.q f39073d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.p f39074e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.gson.p f39075f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.q f39076g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.gson.p f39077h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.q f39078i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.gson.p f39079j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.gson.q f39080k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.google.gson.p f39081l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.gson.q f39082m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.gson.p f39083n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.gson.q f39084o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.gson.p f39085p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.gson.q f39086q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.gson.p f39087r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.gson.q f39088s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.gson.p f39089t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.gson.p f39090u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.gson.p f39091v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.google.gson.p f39092w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.google.gson.q f39093x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.google.gson.p f39094y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.google.gson.p f39095z;

    class A extends com.google.gson.p {
        A() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(C8268a c8268a) throws IOException {
            EnumC8269b enumC8269bV0 = c8268a.v0();
            if (enumC8269bV0 != EnumC8269b.NULL) {
                return enumC8269bV0 == EnumC8269b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c8268a.t0())) : Boolean.valueOf(c8268a.f0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Boolean bool) throws IOException {
            c8270c.v0(bool);
        }
    }

    static /* synthetic */ class B {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39096a;

        static {
            int[] iArr = new int[EnumC8269b.values().length];
            f39096a = iArr;
            try {
                iArr[EnumC8269b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39096a[EnumC8269b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39096a[EnumC8269b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39096a[EnumC8269b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39096a[EnumC8269b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39096a[EnumC8269b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class C extends com.google.gson.p {
        C() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return Boolean.valueOf(c8268a.t0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Boolean bool) throws IOException {
            c8270c.x0(bool == null ? "null" : bool.toString());
        }
    }

    class D extends com.google.gson.p {
        D() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            try {
                int iN0 = c8268a.n0();
                if (iN0 <= 255 && iN0 >= -128) {
                    return Byte.valueOf((byte) iN0);
                }
                throw new JsonSyntaxException("Lossy conversion from " + iN0 + " to byte; at path " + c8268a.P());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
            } else {
                c8270c.u0(number.byteValue());
            }
        }
    }

    class E extends com.google.gson.p {
        E() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            try {
                int iN0 = c8268a.n0();
                if (iN0 <= 65535 && iN0 >= -32768) {
                    return Short.valueOf((short) iN0);
                }
                throw new JsonSyntaxException("Lossy conversion from " + iN0 + " to short; at path " + c8268a.P());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
            } else {
                c8270c.u0(number.shortValue());
            }
        }
    }

    class F extends com.google.gson.p {
        F() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            try {
                return Integer.valueOf(c8268a.n0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
            } else {
                c8270c.u0(number.intValue());
            }
        }
    }

    class G extends com.google.gson.p {
        G() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(C8268a c8268a) {
            try {
                return new AtomicInteger(c8268a.n0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, AtomicInteger atomicInteger) throws IOException {
            c8270c.u0(atomicInteger.get());
        }
    }

    class H extends com.google.gson.p {
        H() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(C8268a c8268a) {
            return new AtomicBoolean(c8268a.f0());
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, AtomicBoolean atomicBoolean) throws IOException {
            c8270c.y0(atomicBoolean.get());
        }
    }

    private static final class I extends com.google.gson.p {

        /* renamed from: a, reason: collision with root package name */
        private final Map f39097a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f39098b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map f39099c = new HashMap();

        class a implements PrivilegedAction {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f39100a;

            a(Class cls) {
                this.f39100a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() throws SecurityException {
                Field[] declaredFields = this.f39100a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public I(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    String string = r42.toString();
                    s5.c cVar = (s5.c) field.getAnnotation(s5.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f39097a.put(str, r42);
                        }
                    }
                    this.f39097a.put(strName, r42);
                    this.f39098b.put(string, r42);
                    this.f39099c.put(r42, strName);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Enum b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            String strT0 = c8268a.t0();
            Enum r02 = (Enum) this.f39097a.get(strT0);
            return r02 == null ? (Enum) this.f39098b.get(strT0) : r02;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Enum r32) throws IOException {
            c8270c.x0(r32 == null ? null : (String) this.f39099c.get(r32));
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$a, reason: case insensitive filesystem */
    class C5124a extends com.google.gson.p {
        C5124a() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(C8268a c8268a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c8268a.g();
            while (c8268a.T()) {
                try {
                    arrayList.add(Integer.valueOf(c8268a.n0()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            c8268a.v();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c8270c.h();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                c8270c.u0(atomicIntegerArray.get(i10));
            }
            c8270c.s();
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$b, reason: case insensitive filesystem */
    class C5125b extends com.google.gson.p {
        C5125b() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            try {
                return Long.valueOf(c8268a.o0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
            } else {
                c8270c.u0(number.longValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$c, reason: case insensitive filesystem */
    class C5126c extends com.google.gson.p {
        C5126c() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return Float.valueOf((float) c8268a.m0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            c8270c.w0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$d, reason: case insensitive filesystem */
    class C5127d extends com.google.gson.p {
        C5127d() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return Double.valueOf(c8268a.m0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
            } else {
                c8270c.t0(number.doubleValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$e, reason: case insensitive filesystem */
    class C5128e extends com.google.gson.p {
        C5128e() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            String strT0 = c8268a.t0();
            if (strT0.length() == 1) {
                return Character.valueOf(strT0.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + strT0 + "; at " + c8268a.P());
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Character ch2) throws IOException {
            c8270c.x0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$f, reason: case insensitive filesystem */
    class C5129f extends com.google.gson.p {
        C5129f() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(C8268a c8268a) throws IOException {
            EnumC8269b enumC8269bV0 = c8268a.v0();
            if (enumC8269bV0 != EnumC8269b.NULL) {
                return enumC8269bV0 == EnumC8269b.BOOLEAN ? Boolean.toString(c8268a.f0()) : c8268a.t0();
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, String str) throws IOException {
            c8270c.x0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$g, reason: case insensitive filesystem */
    class C5130g extends com.google.gson.p {
        C5130g() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            String strT0 = c8268a.t0();
            try {
                return t5.i.b(strT0);
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException("Failed parsing '" + strT0 + "' as BigDecimal; at path " + c8268a.P(), e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, BigDecimal bigDecimal) throws IOException {
            c8270c.w0(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$h, reason: case insensitive filesystem */
    class C5131h extends com.google.gson.p {
        C5131h() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            String strT0 = c8268a.t0();
            try {
                return t5.i.c(strT0);
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException("Failed parsing '" + strT0 + "' as BigInteger; at path " + c8268a.P(), e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, BigInteger bigInteger) throws IOException {
            c8270c.w0(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$i, reason: case insensitive filesystem */
    class C5132i extends com.google.gson.p {
        C5132i() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public t5.g b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return new t5.g(c8268a.t0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, t5.g gVar) throws IOException {
            c8270c.w0(gVar);
        }
    }

    class j extends com.google.gson.p {
        j() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return new StringBuilder(c8268a.t0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, StringBuilder sb2) throws IOException {
            c8270c.x0(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends com.google.gson.p {
        k() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(C8268a c8268a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + t5.o.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + t5.o.a("java-lang-class-unsupported"));
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$l, reason: collision with other inner class name */
    class C1225l extends com.google.gson.p {
        C1225l() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return new StringBuffer(c8268a.t0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, StringBuffer stringBuffer) throws IOException {
            c8270c.x0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.p {
        m() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            String strT0 = c8268a.t0();
            if (strT0.equals("null")) {
                return null;
            }
            return new URL(strT0);
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, URL url) throws IOException {
            c8270c.x0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends com.google.gson.p {
        n() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            try {
                String strT0 = c8268a.t0();
                if (strT0.equals("null")) {
                    return null;
                }
                return new URI(strT0);
            } catch (URISyntaxException e10) {
                throw new JsonIOException(e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, URI uri) throws IOException {
            c8270c.x0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends com.google.gson.p {
        o() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return InetAddress.getByName(c8268a.t0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, InetAddress inetAddress) throws IOException {
            c8270c.x0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends com.google.gson.p {
        p() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            String strT0 = c8268a.t0();
            try {
                return UUID.fromString(strT0);
            } catch (IllegalArgumentException e10) {
                throw new JsonSyntaxException("Failed parsing '" + strT0 + "' as UUID; at path " + c8268a.P(), e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, UUID uuid) throws IOException {
            c8270c.x0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.p {
        q() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(C8268a c8268a) throws IOException {
            String strT0 = c8268a.t0();
            try {
                return Currency.getInstance(strT0);
            } catch (IllegalArgumentException e10) {
                throw new JsonSyntaxException("Failed parsing '" + strT0 + "' as Currency; at path " + c8268a.P(), e10);
            }
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Currency currency) throws IOException {
            c8270c.x0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.p {
        r() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(C8268a c8268a) throws IOException, NumberFormatException {
            int iN0;
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            c8268a.h();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (c8268a.v0() != EnumC8269b.END_OBJECT) {
                String strP0 = c8268a.p0();
                iN0 = c8268a.n0();
                strP0.hashCode();
                switch (strP0) {
                    case "dayOfMonth":
                        i12 = iN0;
                        break;
                    case "minute":
                        i14 = iN0;
                        break;
                    case "second":
                        i15 = iN0;
                        break;
                    case "year":
                        i10 = iN0;
                        break;
                    case "month":
                        i11 = iN0;
                        break;
                    case "hourOfDay":
                        i13 = iN0;
                        break;
                }
            }
            c8268a.y();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Calendar calendar) throws IOException {
            if (calendar == null) {
                c8270c.b0();
                return;
            }
            c8270c.j();
            c8270c.T("year");
            c8270c.u0(calendar.get(1));
            c8270c.T("month");
            c8270c.u0(calendar.get(2));
            c8270c.T("dayOfMonth");
            c8270c.u0(calendar.get(5));
            c8270c.T("hourOfDay");
            c8270c.u0(calendar.get(11));
            c8270c.T("minute");
            c8270c.u0(calendar.get(12));
            c8270c.T("second");
            c8270c.u0(calendar.get(13));
            c8270c.v();
        }
    }

    class s extends com.google.gson.p {
        s() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c8268a.t0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Locale locale) throws IOException {
            c8270c.x0(locale == null ? null : locale.toString());
        }
    }

    class t extends com.google.gson.p {
        t() {
        }

        private com.google.gson.g f(C8268a c8268a, EnumC8269b enumC8269b) throws IOException {
            int i10 = B.f39096a[enumC8269b.ordinal()];
            if (i10 == 1) {
                return new com.google.gson.j(new t5.g(c8268a.t0()));
            }
            if (i10 == 2) {
                return new com.google.gson.j(c8268a.t0());
            }
            if (i10 == 3) {
                return new com.google.gson.j(Boolean.valueOf(c8268a.f0()));
            }
            if (i10 == 6) {
                c8268a.r0();
                return com.google.gson.h.f38981a;
            }
            throw new IllegalStateException("Unexpected token: " + enumC8269b);
        }

        private com.google.gson.g g(C8268a c8268a, EnumC8269b enumC8269b) throws IOException {
            int i10 = B.f39096a[enumC8269b.ordinal()];
            if (i10 == 4) {
                c8268a.g();
                return new com.google.gson.f();
            }
            if (i10 != 5) {
                return null;
            }
            c8268a.h();
            return new com.google.gson.i();
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.google.gson.g b(C8268a c8268a) throws IOException {
            EnumC8269b enumC8269bV0 = c8268a.v0();
            com.google.gson.g gVarG = g(c8268a, enumC8269bV0);
            if (gVarG == null) {
                return f(c8268a, enumC8269bV0);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (c8268a.T()) {
                    String strP0 = gVarG instanceof com.google.gson.i ? c8268a.p0() : null;
                    EnumC8269b enumC8269bV02 = c8268a.v0();
                    com.google.gson.g gVarG2 = g(c8268a, enumC8269bV02);
                    boolean z10 = gVarG2 != null;
                    if (gVarG2 == null) {
                        gVarG2 = f(c8268a, enumC8269bV02);
                    }
                    if (gVarG instanceof com.google.gson.f) {
                        ((com.google.gson.f) gVarG).m(gVarG2);
                    } else {
                        ((com.google.gson.i) gVarG).m(strP0, gVarG2);
                    }
                    if (z10) {
                        arrayDeque.addLast(gVarG);
                        gVarG = gVarG2;
                    }
                } else {
                    if (gVarG instanceof com.google.gson.f) {
                        c8268a.v();
                    } else {
                        c8268a.y();
                    }
                    if (arrayDeque.isEmpty()) {
                        return gVarG;
                    }
                    gVarG = (com.google.gson.g) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, com.google.gson.g gVar) throws IOException {
            if (gVar == null || gVar.i()) {
                c8270c.b0();
                return;
            }
            if (gVar.k()) {
                com.google.gson.j jVarF = gVar.f();
                if (jVarF.y()) {
                    c8270c.w0(jVarF.u());
                    return;
                } else if (jVarF.w()) {
                    c8270c.y0(jVarF.q());
                    return;
                } else {
                    c8270c.x0(jVarF.v());
                    return;
                }
            }
            if (gVar.g()) {
                c8270c.h();
                Iterator it = gVar.b().iterator();
                while (it.hasNext()) {
                    d(c8270c, (com.google.gson.g) it.next());
                }
                c8270c.s();
                return;
            }
            if (!gVar.j()) {
                throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
            }
            c8270c.j();
            for (Map.Entry entry : gVar.e().o()) {
                c8270c.T((String) entry.getKey());
                d(c8270c, (com.google.gson.g) entry.getValue());
            }
            c8270c.v();
        }
    }

    class u implements com.google.gson.q {
        u() {
        }

        @Override // com.google.gson.q
        public com.google.gson.p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            Class clsC = aVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new I(clsC);
        }
    }

    class v extends com.google.gson.p {
        v() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(C8268a c8268a) throws IOException, NumberFormatException {
            BitSet bitSet = new BitSet();
            c8268a.g();
            EnumC8269b enumC8269bV0 = c8268a.v0();
            int i10 = 0;
            while (enumC8269bV0 != EnumC8269b.END_ARRAY) {
                int i11 = B.f39096a[enumC8269bV0.ordinal()];
                boolean zF0 = true;
                if (i11 == 1 || i11 == 2) {
                    int iN0 = c8268a.n0();
                    if (iN0 == 0) {
                        zF0 = false;
                    } else if (iN0 != 1) {
                        throw new JsonSyntaxException("Invalid bitset value " + iN0 + ", expected 0 or 1; at path " + c8268a.P());
                    }
                } else {
                    if (i11 != 3) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + enumC8269bV0 + "; at path " + c8268a.getPath());
                    }
                    zF0 = c8268a.f0();
                }
                if (zF0) {
                    bitSet.set(i10);
                }
                i10++;
                enumC8269bV0 = c8268a.v0();
            }
            c8268a.v();
            return bitSet;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, BitSet bitSet) throws IOException {
            c8270c.h();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                c8270c.u0(bitSet.get(i10) ? 1L : 0L);
            }
            c8270c.s();
        }
    }

    class w implements com.google.gson.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f39102a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.p f39103b;

        w(Class cls, com.google.gson.p pVar) {
            this.f39102a = cls;
            this.f39103b = pVar;
        }

        @Override // com.google.gson.q
        public com.google.gson.p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.c() == this.f39102a) {
                return this.f39103b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f39102a.getName() + ",adapter=" + this.f39103b + "]";
        }
    }

    class x implements com.google.gson.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f39104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f39105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.p f39106c;

        x(Class cls, Class cls2, com.google.gson.p pVar) {
            this.f39104a = cls;
            this.f39105b = cls2;
            this.f39106c = pVar;
        }

        @Override // com.google.gson.q
        public com.google.gson.p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            Class clsC = aVar.c();
            if (clsC == this.f39104a || clsC == this.f39105b) {
                return this.f39106c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f39105b.getName() + MqttTopic.SINGLE_LEVEL_WILDCARD + this.f39104a.getName() + ",adapter=" + this.f39106c + "]";
        }
    }

    class y implements com.google.gson.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f39107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f39108b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.p f39109c;

        y(Class cls, Class cls2, com.google.gson.p pVar) {
            this.f39107a = cls;
            this.f39108b = cls2;
            this.f39109c = pVar;
        }

        @Override // com.google.gson.q
        public com.google.gson.p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            Class clsC = aVar.c();
            if (clsC == this.f39107a || clsC == this.f39108b) {
                return this.f39109c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f39107a.getName() + MqttTopic.SINGLE_LEVEL_WILDCARD + this.f39108b.getName() + ",adapter=" + this.f39109c + "]";
        }
    }

    class z implements com.google.gson.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f39110a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.p f39111b;

        class a extends com.google.gson.p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f39112a;

            a(Class cls) {
                this.f39112a = cls;
            }

            @Override // com.google.gson.p
            public Object b(C8268a c8268a) {
                Object objB = z.this.f39111b.b(c8268a);
                if (objB == null || this.f39112a.isInstance(objB)) {
                    return objB;
                }
                throw new JsonSyntaxException("Expected a " + this.f39112a.getName() + " but was " + objB.getClass().getName() + "; at path " + c8268a.P());
            }

            @Override // com.google.gson.p
            public void d(C8270c c8270c, Object obj) {
                z.this.f39111b.d(c8270c, obj);
            }
        }

        z(Class cls, com.google.gson.p pVar) {
            this.f39110a = cls;
            this.f39111b = pVar;
        }

        @Override // com.google.gson.q
        public com.google.gson.p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            Class<?> clsC = aVar.c();
            if (this.f39110a.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f39110a.getName() + ",adapter=" + this.f39111b + "]";
        }
    }

    static {
        com.google.gson.p pVarA = new k().a();
        f39070a = pVarA;
        f39071b = a(Class.class, pVarA);
        com.google.gson.p pVarA2 = new v().a();
        f39072c = pVarA2;
        f39073d = a(BitSet.class, pVarA2);
        A a10 = new A();
        f39074e = a10;
        f39075f = new C();
        f39076g = b(Boolean.TYPE, Boolean.class, a10);
        D d10 = new D();
        f39077h = d10;
        f39078i = b(Byte.TYPE, Byte.class, d10);
        E e10 = new E();
        f39079j = e10;
        f39080k = b(Short.TYPE, Short.class, e10);
        F f10 = new F();
        f39081l = f10;
        f39082m = b(Integer.TYPE, Integer.class, f10);
        com.google.gson.p pVarA3 = new G().a();
        f39083n = pVarA3;
        f39084o = a(AtomicInteger.class, pVarA3);
        com.google.gson.p pVarA4 = new H().a();
        f39085p = pVarA4;
        f39086q = a(AtomicBoolean.class, pVarA4);
        com.google.gson.p pVarA5 = new C5124a().a();
        f39087r = pVarA5;
        f39088s = a(AtomicIntegerArray.class, pVarA5);
        f39089t = new C5125b();
        f39090u = new C5126c();
        f39091v = new C5127d();
        C5128e c5128e = new C5128e();
        f39092w = c5128e;
        f39093x = b(Character.TYPE, Character.class, c5128e);
        C5129f c5129f = new C5129f();
        f39094y = c5129f;
        f39095z = new C5130g();
        f39046A = new C5131h();
        f39047B = new C5132i();
        f39048C = a(String.class, c5129f);
        j jVar = new j();
        f39049D = jVar;
        f39050E = a(StringBuilder.class, jVar);
        C1225l c1225l = new C1225l();
        f39051F = c1225l;
        f39052G = a(StringBuffer.class, c1225l);
        m mVar = new m();
        f39053H = mVar;
        f39054I = a(URL.class, mVar);
        n nVar = new n();
        f39055J = nVar;
        f39056K = a(URI.class, nVar);
        o oVar = new o();
        f39057L = oVar;
        f39058M = d(InetAddress.class, oVar);
        p pVar = new p();
        f39059N = pVar;
        f39060O = a(UUID.class, pVar);
        com.google.gson.p pVarA6 = new q().a();
        f39061P = pVarA6;
        f39062Q = a(Currency.class, pVarA6);
        r rVar = new r();
        f39063R = rVar;
        f39064S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f39065T = sVar;
        f39066U = a(Locale.class, sVar);
        t tVar = new t();
        f39067V = tVar;
        f39068W = d(com.google.gson.g.class, tVar);
        f39069X = new u();
    }

    public static com.google.gson.q a(Class cls, com.google.gson.p pVar) {
        return new w(cls, pVar);
    }

    public static com.google.gson.q b(Class cls, Class cls2, com.google.gson.p pVar) {
        return new x(cls, cls2, pVar);
    }

    public static com.google.gson.q c(Class cls, Class cls2, com.google.gson.p pVar) {
        return new y(cls, cls2, pVar);
    }

    public static com.google.gson.q d(Class cls, com.google.gson.p pVar) {
        return new z(cls, pVar);
    }
}
