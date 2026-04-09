package oa;

import N7.C1154e9;
import N7.H7;
import com.singular.sdk.internal.Constants;
import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import ma.p;
import ma.q;
import oa.h;
import oa.l;
import qa.c;

/* compiled from: DateTimeFormatterBuilder.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f44898f = new a();

    /* renamed from: a, reason: collision with root package name */
    public b f44899a;

    /* renamed from: b, reason: collision with root package name */
    public final b f44900b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f44901c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f44902d;

    /* renamed from: e, reason: collision with root package name */
    public int f44903e;

    /* compiled from: DateTimeFormatterBuilder.java */
    public class a implements qa.j<p> {
        @Override // qa.j
        public final p a(qa.e eVar) {
            p pVar = (p) eVar.query(qa.i.f45475a);
            if (pVar == null || (pVar instanceof q)) {
                return null;
            }
            return pVar;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: oa.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0510b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44904a;

        static {
            int[] iArr = new int[oa.k.values().length];
            f44904a = iArr;
            try {
                iArr[oa.k.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44904a[oa.k.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44904a[oa.k.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44904a[oa.k.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class c implements e {

        /* renamed from: b, reason: collision with root package name */
        public final char f44905b;

        public c(char c10) {
            this.f44905b = c10;
        }

        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            sb.append(this.f44905b);
            return true;
        }

        public final String toString() {
            char c10 = this.f44905b;
            if (c10 == '\'') {
                return "''";
            }
            return "'" + c10 + "'";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class d implements e {

        /* renamed from: b, reason: collision with root package name */
        public final e[] f44906b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44907c;

        public d(ArrayList arrayList, boolean z10) {
            this((e[]) arrayList.toArray(new e[arrayList.size()]), z10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r2 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        
            return true;
         */
        @Override // oa.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean print(oa.g r8, java.lang.StringBuilder r9) {
            /*
                r7 = this;
                int r0 = r9.length()
                r1 = 1
                boolean r2 = r7.f44907c
                if (r2 == 0) goto Le
                int r3 = r8.f44934d
                int r3 = r3 + r1
                r8.f44934d = r3
            Le:
                oa.b$e[] r3 = r7.f44906b     // Catch: java.lang.Throwable -> L27
                int r4 = r3.length     // Catch: java.lang.Throwable -> L27
                r5 = 0
            L12:
                if (r5 >= r4) goto L2c
                r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
                boolean r6 = r6.print(r8, r9)     // Catch: java.lang.Throwable -> L27
                if (r6 != 0) goto L29
                r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
                if (r2 == 0) goto L2f
            L21:
                int r9 = r8.f44934d
                int r9 = r9 - r1
                r8.f44934d = r9
                return r1
            L27:
                r9 = move-exception
                goto L30
            L29:
                int r5 = r5 + 1
                goto L12
            L2c:
                if (r2 == 0) goto L2f
                goto L21
            L2f:
                return r1
            L30:
                if (r2 == 0) goto L37
                int r0 = r8.f44934d
                int r0 = r0 - r1
                r8.f44934d = r0
            L37:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: oa.b.d.print(oa.g, java.lang.StringBuilder):boolean");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            e[] eVarArr = this.f44906b;
            if (eVarArr != null) {
                boolean z10 = this.f44907c;
                sb.append(z10 ? "[" : "(");
                for (e eVar : eVarArr) {
                    sb.append(eVar);
                }
                sb.append(z10 ? "]" : ")");
            }
            return sb.toString();
        }

        public d(e[] eVarArr, boolean z10) {
            this.f44906b = eVarArr;
            this.f44907c = z10;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public interface e {
        boolean print(oa.g gVar, StringBuilder sb);
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class f implements e {

        /* renamed from: b, reason: collision with root package name */
        public final qa.a f44908b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44909c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44910d;

        public f(qa.a aVar) {
            com.google.gson.internal.c.v(aVar, "field");
            qa.m mVarRange = aVar.range();
            if (mVarRange.f45482b != mVarRange.f45483c || mVarRange.f45484d != mVarRange.f45485e) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
            }
            this.f44908b = aVar;
            this.f44909c = 9;
            this.f44910d = true;
        }

        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            qa.a aVar = this.f44908b;
            Long lA = gVar.a(aVar);
            if (lA == null) {
                return false;
            }
            long jLongValue = lA.longValue();
            qa.m mVarRange = aVar.range();
            mVarRange.b(jLongValue, aVar);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(mVarRange.f45482b);
            BigDecimal bigDecimalAdd = BigDecimal.valueOf(mVarRange.f45485e).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
            BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
            RoundingMode roundingMode = RoundingMode.FLOOR;
            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
                bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
            }
            int iScale = bigDecimal.scale();
            oa.i iVar = gVar.f44933c;
            if (iScale == 0) {
                return true;
            }
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), 0), this.f44909c), roundingMode).toPlainString().substring(2);
            iVar.getClass();
            if (this.f44910d) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }

        public final String toString() {
            return "Fraction(" + this.f44908b + ",0," + this.f44909c + (this.f44910d ? ",DecimalPoint" : "") + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class g implements e {
        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            Long lA = gVar.a(qa.a.INSTANT_SECONDS);
            qa.a aVar = qa.a.NANO_OF_SECOND;
            qa.e eVar = gVar.f44931a;
            Long lValueOf = eVar.isSupported(aVar) ? Long.valueOf(eVar.getLong(aVar)) : 0L;
            if (lA == null) {
                return false;
            }
            long jLongValue = lA.longValue();
            int iCheckValidIntValue = aVar.checkValidIntValue(lValueOf.longValue());
            if (jLongValue >= -62167219200L) {
                long j4 = jLongValue - 253402300800L;
                long jO = com.google.gson.internal.c.o(j4, 315569520000L) + 1;
                ma.f fVarV0 = ma.f.v0((((j4 % 315569520000L) + 315569520000L) % 315569520000L) - 62167219200L, 0, q.f44148g);
                if (jO > 0) {
                    sb.append('+');
                    sb.append(jO);
                }
                sb.append(fVarV0);
                if (fVarV0.f44105d.f44112d == 0) {
                    sb.append(":00");
                }
            } else {
                long j10 = jLongValue + 62167219200L;
                long j11 = j10 / 315569520000L;
                long j12 = j10 % 315569520000L;
                ma.f fVarV02 = ma.f.v0(j12 - 62167219200L, 0, q.f44148g);
                int length = sb.length();
                sb.append(fVarV02);
                if (fVarV02.f44105d.f44112d == 0) {
                    sb.append(":00");
                }
                if (j11 < 0) {
                    if (fVarV02.f44104c.f44097c == -10000) {
                        sb.replace(length, length + 2, Long.toString(j11 - 1));
                    } else if (j12 == 0) {
                        sb.insert(length, j11);
                    } else {
                        sb.insert(length + 1, Math.abs(j11));
                    }
                }
            }
            if (iCheckValidIntValue != 0) {
                sb.append('.');
                if (iCheckValidIntValue % 1000000 == 0) {
                    sb.append(Integer.toString((iCheckValidIntValue / 1000000) + 1000).substring(1));
                } else if (iCheckValidIntValue % 1000 == 0) {
                    sb.append(Integer.toString((iCheckValidIntValue / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(iCheckValidIntValue + 1000000000).substring(1));
                }
            }
            sb.append('Z');
            return true;
        }

        public final String toString() {
            return "Instant()";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class i implements e {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f44917d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: e, reason: collision with root package name */
        public static final i f44918e = new i("Z", "+HH:MM:ss");

        /* renamed from: b, reason: collision with root package name */
        public final String f44919b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44920c;

        static {
            new i(CommonUrlParts.Values.FALSE_INTEGER, "+HH:MM:ss");
        }

        public i(String str, String str2) {
            this.f44919b = str;
            int i = 0;
            while (true) {
                String[] strArr = f44917d;
                if (i >= 9) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str2));
                }
                if (strArr[i].equals(str2)) {
                    this.f44920c = i;
                    return;
                }
                i++;
            }
        }

        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            Long lA = gVar.a(qa.a.OFFSET_SECONDS);
            if (lA == null) {
                return false;
            }
            int iG = com.google.gson.internal.c.G(lA.longValue());
            String str = this.f44919b;
            if (iG == 0) {
                sb.append(str);
                return true;
            }
            int iAbs = Math.abs((iG / 3600) % 100);
            int iAbs2 = Math.abs((iG / 60) % 60);
            int iAbs3 = Math.abs(iG % 60);
            int length = sb.length();
            sb.append(iG < 0 ? "-" : "+");
            sb.append((char) ((iAbs / 10) + 48));
            sb.append((char) ((iAbs % 10) + 48));
            int i = this.f44920c;
            if (i >= 3 || (i >= 1 && iAbs2 > 0)) {
                int i10 = i % 2;
                sb.append(i10 == 0 ? StringUtils.PROCESS_POSTFIX_DELIMITER : "");
                sb.append((char) ((iAbs2 / 10) + 48));
                sb.append((char) ((iAbs2 % 10) + 48));
                iAbs += iAbs2;
                if (i >= 7 || (i >= 5 && iAbs3 > 0)) {
                    sb.append(i10 == 0 ? StringUtils.PROCESS_POSTFIX_DELIMITER : "");
                    sb.append((char) ((iAbs3 / 10) + 48));
                    sb.append((char) ((iAbs3 % 10) + 48));
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb.setLength(length);
                sb.append(str);
            }
            return true;
        }

        public final String toString() {
            return C1154e9.j(new StringBuilder("Offset("), f44917d[this.f44920c], ",'", this.f44919b.replace("'", "''"), "')");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public enum j implements e {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public int parse(oa.d dVar, CharSequence charSequence, int i) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                throw null;
            }
            return i;
        }

        @Override // oa.b.e
        public boolean print(oa.g gVar, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class k implements e {

        /* renamed from: b, reason: collision with root package name */
        public final String f44921b;

        public k(String str) {
            this.f44921b = str;
        }

        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            sb.append(this.f44921b);
            return true;
        }

        public final String toString() {
            return C1154e9.i("'", this.f44921b.replace("'", "''"), "'");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class l implements e {

        /* renamed from: b, reason: collision with root package name */
        public final qa.a f44922b;

        /* renamed from: c, reason: collision with root package name */
        public final oa.m f44923c;

        /* renamed from: d, reason: collision with root package name */
        public final oa.h f44924d;

        /* renamed from: e, reason: collision with root package name */
        public volatile h f44925e;

        public l(qa.a aVar, oa.m mVar, oa.h hVar) {
            this.f44922b = aVar;
            this.f44923c = mVar;
            this.f44924d = hVar;
        }

        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            Long lA = gVar.a(this.f44922b);
            if (lA == null) {
                return false;
            }
            String strA = this.f44924d.a(this.f44922b, lA.longValue(), this.f44923c, gVar.f44932b);
            if (strA != null) {
                sb.append(strA);
                return true;
            }
            if (this.f44925e == null) {
                this.f44925e = new h(this.f44922b, 1, 19, oa.k.NORMAL);
            }
            return this.f44925e.print(gVar, sb);
        }

        public final String toString() {
            oa.m mVar = oa.m.FULL;
            qa.a aVar = this.f44922b;
            oa.m mVar2 = this.f44923c;
            if (mVar2 == mVar) {
                return "Text(" + aVar + ")";
            }
            return "Text(" + aVar + StringUtils.COMMA + mVar2 + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class m implements e {
        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            a aVar = b.f44898f;
            qa.e eVar = gVar.f44931a;
            Object objQuery = eVar.query(aVar);
            if (objQuery == null && gVar.f44934d == 0) {
                throw new ma.a("Unable to extract value: " + eVar.getClass());
            }
            p pVar = (p) objQuery;
            if (pVar == null) {
                return false;
            }
            sb.append(pVar.b());
            return true;
        }

        public final String toString() {
            return "ZoneRegionId()";
        }
    }

    static {
        HashMap map = new HashMap();
        map.put('G', qa.a.ERA);
        map.put('y', qa.a.YEAR_OF_ERA);
        map.put('u', qa.a.YEAR);
        c.b bVar = qa.c.f45467a;
        map.put('Q', bVar);
        map.put('q', bVar);
        qa.a aVar = qa.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', qa.a.DAY_OF_YEAR);
        map.put('d', qa.a.DAY_OF_MONTH);
        map.put('F', qa.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        qa.a aVar2 = qa.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', qa.a.AMPM_OF_DAY);
        map.put('H', qa.a.HOUR_OF_DAY);
        map.put('k', qa.a.CLOCK_HOUR_OF_DAY);
        map.put('K', qa.a.HOUR_OF_AMPM);
        map.put('h', qa.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', qa.a.MINUTE_OF_HOUR);
        map.put('s', qa.a.SECOND_OF_MINUTE);
        qa.a aVar3 = qa.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', qa.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', qa.a.NANO_OF_DAY);
    }

    public b() {
        this.f44899a = this;
        this.f44901c = new ArrayList();
        this.f44903e = -1;
        this.f44900b = null;
        this.f44902d = false;
    }

    public final void a(oa.a aVar) {
        d dVar = aVar.f44893a;
        if (dVar.f44907c) {
            dVar = new d(dVar.f44906b, false);
        }
        b(dVar);
    }

    public final int b(e eVar) {
        com.google.gson.internal.c.v(eVar, Constants.REVENUE_PRODUCT_PRICE_KEY);
        b bVar = this.f44899a;
        bVar.getClass();
        bVar.f44901c.add(eVar);
        this.f44899a.f44903e = -1;
        return r2.f44901c.size() - 1;
    }

    public final void c(char c10) {
        b(new c(c10));
    }

    public final void d(String str) {
        if (str.length() > 0) {
            if (str.length() == 1) {
                b(new c(str.charAt(0)));
            } else {
                b(new k(str));
            }
        }
    }

    public final void e(qa.a aVar, HashMap map) {
        com.google.gson.internal.c.v(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        oa.m mVar = oa.m.FULL;
        b(new l(aVar, mVar, new oa.c(new l.b(Collections.singletonMap(mVar, linkedHashMap)))));
    }

    public final void f(qa.a aVar, oa.m mVar) {
        com.google.gson.internal.c.v(aVar, "field");
        com.google.gson.internal.c.v(mVar, "textStyle");
        AtomicReference<oa.h> atomicReference = oa.h.f44935a;
        b(new l(aVar, mVar, h.a.f44936a));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, qa.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, qa.h] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, qa.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(oa.b.h r15) {
        /*
            r14 = this;
            oa.b r0 = r14.f44899a
            int r1 = r0.f44903e
            if (r1 < 0) goto L77
            java.util.ArrayList r0 = r0.f44901c
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof oa.b.h
            if (r0 == 0) goto L77
            oa.b r0 = r14.f44899a
            int r1 = r0.f44903e
            java.util.ArrayList r0 = r0.f44901c
            java.lang.Object r0 = r0.get(r1)
            oa.b$h r0 = (oa.b.h) r0
            r2 = -1
            int r5 = r15.f44913c
            int r6 = r15.f44914d
            if (r5 != r6) goto L52
            oa.k r3 = oa.k.NOT_NEGATIVE
            oa.k r7 = r15.f44915e
            if (r7 != r3) goto L52
            oa.b$h r8 = new oa.b$h
            int r3 = r0.f44916f
            int r13 = r3 + r6
            java.lang.Enum r9 = r0.f44912b
            int r10 = r0.f44913c
            int r11 = r0.f44914d
            oa.k r12 = r0.f44915e
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = r8
            int r3 = r15.f44916f
            if (r3 != r2) goto L40
            goto L49
        L40:
            oa.b$h r3 = new oa.b$h
            java.lang.Enum r4 = r15.f44912b
            r8 = -1
            r3.<init>(r4, r5, r6, r7, r8)
            r15 = r3
        L49:
            r14.b(r15)
            oa.b r15 = r14.f44899a
            r15.f44903e = r1
        L50:
            r8 = r0
            goto L6f
        L52:
            int r3 = r0.f44916f
            if (r3 != r2) goto L57
            goto L66
        L57:
            oa.b$h r4 = new oa.b$h
            java.lang.Enum r5 = r0.f44912b
            oa.k r8 = r0.f44915e
            r9 = -1
            int r6 = r0.f44913c
            int r7 = r0.f44914d
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = r4
        L66:
            oa.b r2 = r14.f44899a
            int r15 = r14.b(r15)
            r2.f44903e = r15
            goto L50
        L6f:
            oa.b r15 = r14.f44899a
            java.util.ArrayList r15 = r15.f44901c
            r15.set(r1, r8)
            return
        L77:
            oa.b r0 = r14.f44899a
            int r15 = r14.b(r15)
            r0.f44903e = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.b.g(oa.b$h):void");
    }

    public final void h(qa.h hVar, int i10) {
        com.google.gson.internal.c.v(hVar, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException(C4356c.h(i10, "The width must be from 1 to 19 inclusive but was "));
        }
        g(new h(hVar, i10, i10, oa.k.NOT_NEGATIVE));
    }

    public final void i(qa.h hVar, int i10, int i11, oa.k kVar) {
        if (i10 == i11 && kVar == oa.k.NOT_NEGATIVE) {
            h(hVar, i11);
            return;
        }
        com.google.gson.internal.c.v(hVar, "field");
        com.google.gson.internal.c.v(kVar, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException(C4356c.h(i10, "The minimum width must be from 1 to 19 inclusive but was "));
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException(C4356c.h(i11, "The maximum width must be from 1 to 19 inclusive but was "));
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(H7.n(i11, i10, "The maximum width must exceed or equal the minimum width but ", " < "));
        }
        g(new h(hVar, i10, i11, kVar));
    }

    public final void j() {
        b bVar = this.f44899a;
        if (bVar.f44900b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (bVar.f44901c.size() <= 0) {
            this.f44899a = this.f44899a.f44900b;
            return;
        }
        b bVar2 = this.f44899a;
        d dVar = new d(bVar2.f44901c, bVar2.f44902d);
        this.f44899a = this.f44899a.f44900b;
        b(dVar);
    }

    public final void k() {
        b bVar = this.f44899a;
        bVar.f44903e = -1;
        this.f44899a = new b(bVar);
    }

    public final oa.a l(Locale locale) {
        com.google.gson.internal.c.v(locale, CommonUrlParts.LOCALE);
        while (this.f44899a.f44900b != null) {
            j();
        }
        return new oa.a(new d(this.f44901c, false), locale, oa.i.f44937a, oa.j.SMART, null);
    }

    public final oa.a m(oa.j jVar) {
        oa.a aVarL = l(Locale.getDefault());
        com.google.gson.internal.c.v(jVar, "resolverStyle");
        oa.j jVar2 = aVarL.f44896d;
        if (jVar2 == null ? false : jVar2.equals(jVar)) {
            return aVarL;
        }
        return new oa.a(aVarL.f44893a, aVarL.f44894b, aVarL.f44895c, jVar, aVarL.f44897e);
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class h implements e {

        /* renamed from: g, reason: collision with root package name */
        public static final int[] f44911g = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: b, reason: collision with root package name */
        public final Enum f44912b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44913c;

        /* renamed from: d, reason: collision with root package name */
        public final int f44914d;

        /* renamed from: e, reason: collision with root package name */
        public final oa.k f44915e;

        /* renamed from: f, reason: collision with root package name */
        public final int f44916f;

        /* JADX WARN: Multi-variable type inference failed */
        public h(qa.h hVar, int i, int i10, oa.k kVar) {
            this.f44912b = (Enum) hVar;
            this.f44913c = i;
            this.f44914d = i10;
            this.f44915e = kVar;
            this.f44916f = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, qa.h] */
        @Override // oa.b.e
        public final boolean print(oa.g gVar, StringBuilder sb) {
            ?? r02 = this.f44912b;
            Long lA = gVar.a(r02);
            if (lA == null) {
                return false;
            }
            long jLongValue = lA.longValue();
            String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
            int length = string.length();
            int i = this.f44914d;
            if (length > i) {
                throw new ma.a("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
            }
            gVar.f44933c.getClass();
            int i10 = this.f44913c;
            oa.k kVar = this.f44915e;
            if (jLongValue >= 0) {
                int i11 = C0510b.f44904a[kVar.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        sb.append('+');
                    }
                } else if (i10 < 19 && jLongValue >= f44911g[i10]) {
                    sb.append('+');
                }
            } else {
                int i12 = C0510b.f44904a[kVar.ordinal()];
                if (i12 == 1 || i12 == 2 || i12 == 3) {
                    sb.append('-');
                } else if (i12 == 4) {
                    throw new ma.a("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
                }
            }
            for (int i13 = 0; i13 < i10 - string.length(); i13++) {
                sb.append('0');
            }
            sb.append(string);
            return true;
        }

        public final String toString() {
            Enum r02 = this.f44912b;
            oa.k kVar = this.f44915e;
            int i = this.f44914d;
            int i10 = this.f44913c;
            if (i10 == 1 && i == 19 && kVar == oa.k.NORMAL) {
                return "Value(" + r02 + ")";
            }
            if (i10 == i && kVar == oa.k.NOT_NEGATIVE) {
                return "Value(" + r02 + StringUtils.COMMA + i10 + ")";
            }
            return "Value(" + r02 + StringUtils.COMMA + i10 + StringUtils.COMMA + i + StringUtils.COMMA + kVar + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(qa.h hVar, int i, int i10, oa.k kVar, int i11) {
            this.f44912b = (Enum) hVar;
            this.f44913c = i;
            this.f44914d = i10;
            this.f44915e = kVar;
            this.f44916f = i11;
        }
    }

    public b(b bVar) {
        this.f44899a = this;
        this.f44901c = new ArrayList();
        this.f44903e = -1;
        this.f44900b = bVar;
        this.f44902d = true;
    }
}
