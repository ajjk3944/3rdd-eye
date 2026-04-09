package com.google.gson.internal.bind;

import com.google.gson.internal.g;
import com.google.gson.internal.i;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.q;
import com.google.gson.w;
import com.google.gson.x;
import d.h;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {
    public static final x A;
    public static final x B;

    /* renamed from: a, reason: collision with root package name */
    public static final x f20810a = new TypeAdapters$29(Class.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.w
        public final Object b(yf.b bVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.w
        public final void c(yf.c cVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.a());

    /* renamed from: b, reason: collision with root package name */
    public static final x f20811b = new TypeAdapters$29(BitSet.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.w
        public final Object b(yf.b bVar) throws IOException, NumberFormatException {
            boolean zG;
            BitSet bitSet = new BitSet();
            bVar.c();
            int iZ = bVar.Z();
            int i4 = 0;
            while (iZ != 2) {
                int iC = i3.e.c(iZ);
                if (iC == 5 || iC == 6) {
                    int iN = bVar.N();
                    if (iN == 0) {
                        zG = false;
                    } else {
                        if (iN != 1) {
                            StringBuilder sbW = u.w(iN, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbW.append(bVar.y(true));
                            throw new q(sbW.toString());
                        }
                        zG = true;
                    }
                } else {
                    if (iC != 7) {
                        throw new q("Invalid bitset value type: " + r5.c.v(iZ) + "; at path " + bVar.y(false));
                    }
                    zG = bVar.G();
                }
                if (zG) {
                    bitSet.set(i4);
                }
                i4++;
                iZ = bVar.Z();
            }
            bVar.p();
            return bitSet;
        }

        @Override // com.google.gson.w
        public final void c(yf.c cVar, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            cVar.e();
            int length = bitSet.length();
            for (int i4 = 0; i4 < length; i4++) {
                cVar.O(bitSet.get(i4) ? 1L : 0L);
            }
            cVar.p();
        }
    }.a());

    /* renamed from: c, reason: collision with root package name */
    public static final w f20812c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f20813d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f20814e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f20815f;
    public static final x g;

    /* renamed from: h, reason: collision with root package name */
    public static final x f20816h;

    /* renamed from: i, reason: collision with root package name */
    public static final x f20817i;
    public static final x j;

    /* renamed from: k, reason: collision with root package name */
    public static final w f20818k;

    /* renamed from: l, reason: collision with root package name */
    public static final x f20819l;

    /* renamed from: m, reason: collision with root package name */
    public static final w f20820m;

    /* renamed from: n, reason: collision with root package name */
    public static final w f20821n;

    /* renamed from: o, reason: collision with root package name */
    public static final w f20822o;

    /* renamed from: p, reason: collision with root package name */
    public static final x f20823p;

    /* renamed from: q, reason: collision with root package name */
    public static final x f20824q;

    /* renamed from: r, reason: collision with root package name */
    public static final x f20825r;

    /* renamed from: s, reason: collision with root package name */
    public static final x f20826s;

    /* renamed from: t, reason: collision with root package name */
    public static final x f20827t;

    /* renamed from: u, reason: collision with root package name */
    public static final x f20828u;

    /* renamed from: v, reason: collision with root package name */
    public static final x f20829v;

    /* renamed from: w, reason: collision with root package name */
    public static final x f20830w;

    /* renamed from: x, reason: collision with root package name */
    public static final x f20831x;

    /* renamed from: y, reason: collision with root package name */
    public static final x f20832y;

    /* renamed from: z, reason: collision with root package name */
    public static final w f20833z;

    static {
        w wVar = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                int iZ = bVar.Z();
                if (iZ != 9) {
                    return iZ == 6 ? Boolean.valueOf(Boolean.parseBoolean(bVar.X())) : Boolean.valueOf(bVar.G());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    cVar.A();
                    return;
                }
                cVar.W();
                cVar.c();
                cVar.f37604a.write(bool.booleanValue() ? "true" : "false");
            }
        };
        f20812c = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return Boolean.valueOf(bVar.X());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                cVar.U(bool == null ? "null" : bool.toString());
            }
        };
        f20813d = new TypeAdapters$30(Boolean.TYPE, Boolean.class, wVar);
        f20814e = new TypeAdapters$30(Byte.TYPE, Byte.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                try {
                    int iN = bVar.N();
                    if (iN <= 255 && iN >= -128) {
                        return Byte.valueOf((byte) iN);
                    }
                    StringBuilder sbW = u.w(iN, "Lossy conversion from ", " to byte; at path ");
                    sbW.append(bVar.y(true));
                    throw new q(sbW.toString());
                } catch (NumberFormatException e2) {
                    throw new q(e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    cVar.A();
                } else {
                    cVar.O(r4.byteValue());
                }
            }
        });
        f20815f = new TypeAdapters$30(Short.TYPE, Short.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                try {
                    int iN = bVar.N();
                    if (iN <= 65535 && iN >= -32768) {
                        return Short.valueOf((short) iN);
                    }
                    StringBuilder sbW = u.w(iN, "Lossy conversion from ", " to short; at path ");
                    sbW.append(bVar.y(true));
                    throw new q(sbW.toString());
                } catch (NumberFormatException e2) {
                    throw new q(e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    cVar.A();
                } else {
                    cVar.O(r4.shortValue());
                }
            }
        });
        g = new TypeAdapters$30(Integer.TYPE, Integer.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                try {
                    return Integer.valueOf(bVar.N());
                } catch (NumberFormatException e2) {
                    throw new q(e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    cVar.A();
                } else {
                    cVar.O(r4.intValue());
                }
            }
        });
        f20816h = new TypeAdapters$29(AtomicInteger.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) {
                try {
                    return new AtomicInteger(bVar.N());
                } catch (NumberFormatException e2) {
                    throw new q(e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.O(((AtomicInteger) obj).get());
            }
        }.a());
        f20817i = new TypeAdapters$29(AtomicBoolean.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) {
                return new AtomicBoolean(bVar.G());
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.V(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new TypeAdapters$29(AtomicIntegerArray.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                bVar.c();
                while (bVar.A()) {
                    try {
                        arrayList.add(Integer.valueOf(bVar.N()));
                    } catch (NumberFormatException e2) {
                        throw new q(e2);
                    }
                }
                bVar.p();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i4 = 0; i4 < size; i4++) {
                    atomicIntegerArray.set(i4, ((Integer) arrayList.get(i4)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.e();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i4 = 0; i4 < length; i4++) {
                    cVar.O(r6.get(i4));
                }
                cVar.p();
            }
        }.a());
        f20818k = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                try {
                    return Long.valueOf(bVar.O());
                } catch (NumberFormatException e2) {
                    throw new q(e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    cVar.A();
                } else {
                    cVar.O(number.longValue());
                }
            }
        };
        new w() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return Float.valueOf((float) bVar.L());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    cVar.A();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                cVar.T(numberValueOf);
            }
        };
        new w() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return Double.valueOf(bVar.L());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    cVar.A();
                } else {
                    cVar.N(number.doubleValue());
                }
            }
        };
        f20819l = new TypeAdapters$30(Character.TYPE, Character.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                String strX = bVar.X();
                if (strX.length() == 1) {
                    return Character.valueOf(strX.charAt(0));
                }
                StringBuilder sbA = h.A("Expecting character, got: ", strX, "; at ");
                sbA.append(bVar.y(true));
                throw new q(sbA.toString());
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                Character ch2 = (Character) obj;
                cVar.U(ch2 == null ? null : String.valueOf(ch2));
            }
        });
        w wVar2 = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                int iZ = bVar.Z();
                if (iZ != 9) {
                    return iZ == 8 ? Boolean.toString(bVar.G()) : bVar.X();
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.U((String) obj);
            }
        };
        f20820m = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                String strX = bVar.X();
                try {
                    return g.i(strX);
                } catch (NumberFormatException e2) {
                    StringBuilder sbA = h.A("Failed parsing '", strX, "' as BigDecimal; at path ");
                    sbA.append(bVar.y(true));
                    throw new q(sbA.toString(), e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.T((BigDecimal) obj);
            }
        };
        f20821n = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                String strX = bVar.X();
                try {
                    g.c(strX);
                    return new BigInteger(strX);
                } catch (NumberFormatException e2) {
                    StringBuilder sbA = h.A("Failed parsing '", strX, "' as BigInteger; at path ");
                    sbA.append(bVar.y(true));
                    throw new q(sbA.toString(), e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.T((BigInteger) obj);
            }
        };
        f20822o = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return new i(bVar.X());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.T((i) obj);
            }
        };
        f20823p = new TypeAdapters$29(String.class, wVar2);
        f20824q = new TypeAdapters$29(StringBuilder.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return new StringBuilder(bVar.X());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                StringBuilder sb2 = (StringBuilder) obj;
                cVar.U(sb2 == null ? null : sb2.toString());
            }
        });
        f20825r = new TypeAdapters$29(StringBuffer.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return new StringBuffer(bVar.X());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                cVar.U(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f20826s = new TypeAdapters$29(URL.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                String strX = bVar.X();
                if (strX.equals("null")) {
                    return null;
                }
                return new URL(strX);
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                URL url = (URL) obj;
                cVar.U(url == null ? null : url.toExternalForm());
            }
        });
        f20827t = new TypeAdapters$29(URI.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                try {
                    String strX = bVar.X();
                    if (strX.equals("null")) {
                        return null;
                    }
                    return new URI(strX);
                } catch (URISyntaxException e2) {
                    throw new m(e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                URI uri = (URI) obj;
                cVar.U(uri == null ? null : uri.toASCIIString());
            }
        });
        final w wVar3 = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return InetAddress.getByName(bVar.X());
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                cVar.U(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f20828u = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.x
            public final w a(j jVar, xf.a aVar) {
                final Class<?> cls2 = aVar.f37087a;
                if (cls.isAssignableFrom(cls2)) {
                    return new w() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.w
                        public final Object b(yf.b bVar) {
                            Object objB = wVar3.b(bVar);
                            if (objB != null) {
                                Class cls3 = cls2;
                                if (!cls3.isInstance(objB)) {
                                    throw new q("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + bVar.y(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.w
                        public final void c(yf.c cVar, Object obj) {
                            wVar3.c(cVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + wVar3 + "]";
            }
        };
        f20829v = new TypeAdapters$29(UUID.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                String strX = bVar.X();
                try {
                    return UUID.fromString(strX);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbA = h.A("Failed parsing '", strX, "' as UUID; at path ");
                    sbA.append(bVar.y(true));
                    throw new q(sbA.toString(), e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                cVar.U(uuid == null ? null : uuid.toString());
            }
        });
        f20830w = new TypeAdapters$29(Currency.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                String strX = bVar.X();
                try {
                    return Currency.getInstance(strX);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbA = h.A("Failed parsing '", strX, "' as Currency; at path ");
                    sbA.append(bVar.y(true));
                    throw new q(sbA.toString(), e2);
                }
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                cVar.U(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final w wVar4 = new w() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
            @Override // com.google.gson.w
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(yf.b r13) throws java.io.IOException, java.lang.NumberFormatException {
                /*
                    r12 = this;
                    int r0 = r13.Z()
                    r1 = 9
                    if (r0 != r1) goto Ld
                    r13.V()
                    r13 = 0
                    return r13
                Ld:
                    r13.e()
                    r0 = 0
                    r2 = r0
                    r3 = r2
                    r4 = r3
                    r5 = r4
                    r6 = r5
                    r7 = r6
                L17:
                    int r1 = r13.Z()
                    r8 = 4
                    if (r1 == r8) goto L82
                    java.lang.String r1 = r13.T()
                    int r9 = r13.N()
                    r1.getClass()
                    int r10 = r1.hashCode()
                    r11 = -1
                    switch(r10) {
                        case -1181204563: goto L68;
                        case -1074026988: goto L5d;
                        case -906279820: goto L52;
                        case 3704893: goto L47;
                        case 104080000: goto L3e;
                        case 985252545: goto L33;
                        default: goto L31;
                    }
                L31:
                    r8 = r11
                    goto L72
                L33:
                    java.lang.String r8 = "hourOfDay"
                    boolean r1 = r1.equals(r8)
                    if (r1 != 0) goto L3c
                    goto L31
                L3c:
                    r8 = 5
                    goto L72
                L3e:
                    java.lang.String r10 = "month"
                    boolean r1 = r1.equals(r10)
                    if (r1 != 0) goto L72
                    goto L31
                L47:
                    java.lang.String r8 = "year"
                    boolean r1 = r1.equals(r8)
                    if (r1 != 0) goto L50
                    goto L31
                L50:
                    r8 = 3
                    goto L72
                L52:
                    java.lang.String r8 = "second"
                    boolean r1 = r1.equals(r8)
                    if (r1 != 0) goto L5b
                    goto L31
                L5b:
                    r8 = 2
                    goto L72
                L5d:
                    java.lang.String r8 = "minute"
                    boolean r1 = r1.equals(r8)
                    if (r1 != 0) goto L66
                    goto L31
                L66:
                    r8 = 1
                    goto L72
                L68:
                    java.lang.String r8 = "dayOfMonth"
                    boolean r1 = r1.equals(r8)
                    if (r1 != 0) goto L71
                    goto L31
                L71:
                    r8 = r0
                L72:
                    switch(r8) {
                        case 0: goto L80;
                        case 1: goto L7e;
                        case 2: goto L7c;
                        case 3: goto L7a;
                        case 4: goto L78;
                        case 5: goto L76;
                        default: goto L75;
                    }
                L75:
                    goto L17
                L76:
                    r5 = r9
                    goto L17
                L78:
                    r3 = r9
                    goto L17
                L7a:
                    r2 = r9
                    goto L17
                L7c:
                    r7 = r9
                    goto L17
                L7e:
                    r6 = r9
                    goto L17
                L80:
                    r4 = r9
                    goto L17
                L82:
                    r13.v()
                    java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters$26.b(yf.b):java.lang.Object");
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                if (((Calendar) obj) == null) {
                    cVar.A();
                    return;
                }
                cVar.g();
                cVar.w("year");
                cVar.O(r4.get(1));
                cVar.w("month");
                cVar.O(r4.get(2));
                cVar.w("dayOfMonth");
                cVar.O(r4.get(5));
                cVar.w("hourOfDay");
                cVar.O(r4.get(11));
                cVar.w("minute");
                cVar.O(r4.get(12));
                cVar.w("second");
                cVar.O(r4.get(13));
                cVar.v();
            }
        };
        f20831x = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // com.google.gson.x
            public final w a(j jVar, xf.a aVar) {
                Class cls2 = aVar.f37087a;
                if (cls2 == Calendar.class || cls2 == GregorianCalendar.class) {
                    return wVar4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + wVar4 + "]";
            }
        };
        f20832y = new TypeAdapters$29(Locale.class, new w() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() == 9) {
                    bVar.V();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(bVar.X(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                cVar.U(locale == null ? null : locale.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f20764a;
        f20833z = jsonElementTypeAdapter;
        final Class<l> cls2 = l.class;
        A = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.x
            public final w a(j jVar, xf.a aVar) {
                final Class cls22 = aVar.f37087a;
                if (cls2.isAssignableFrom(cls22)) {
                    return new w() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.w
                        public final Object b(yf.b bVar) {
                            Object objB = jsonElementTypeAdapter.b(bVar);
                            if (objB != null) {
                                Class cls3 = cls22;
                                if (!cls3.isInstance(objB)) {
                                    throw new q("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + bVar.y(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.w
                        public final void c(yf.c cVar, Object obj) {
                            jsonElementTypeAdapter.c(cVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        B = EnumTypeAdapter.f20757d;
    }

    public static x a(Class cls, w wVar) {
        return new TypeAdapters$29(cls, wVar);
    }

    public static x b(Class cls, Class cls2, w wVar) {
        return new TypeAdapters$30(cls, cls2, wVar);
    }
}
