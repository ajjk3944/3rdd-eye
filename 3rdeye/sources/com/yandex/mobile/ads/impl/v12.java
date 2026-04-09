package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class v12 {

    /* renamed from: a, reason: collision with root package name */
    public final String f34284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34285b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f34286c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f34287d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34288e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34289f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34290g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f34291h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f34292j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f34293a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34294b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34295c;

        /* renamed from: d, reason: collision with root package name */
        public final int f34296d;

        /* renamed from: e, reason: collision with root package name */
        public final int f34297e;

        /* renamed from: f, reason: collision with root package name */
        public final int f34298f;

        /* renamed from: g, reason: collision with root package name */
        public final int f34299g;

        /* renamed from: h, reason: collision with root package name */
        public final int f34300h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f34301j;

        /* renamed from: k, reason: collision with root package name */
        public final int f34302k;

        private a(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f34293a = i;
            this.f34294b = i10;
            this.f34295c = i11;
            this.f34296d = i12;
            this.f34297e = i13;
            this.f34298f = i14;
            this.f34299g = i15;
            this.f34300h = i16;
            this.i = i17;
            this.f34301j = i18;
            this.f34302k = i19;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.yandex.mobile.ads.impl.v12.a a(java.lang.String r18) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v12.a.a(java.lang.String):com.yandex.mobile.ads.impl.v12$a");
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f34303c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f34304d;

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f34305e;

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f34306f;

        /* renamed from: a, reason: collision with root package name */
        public final int f34307a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f34308b;

        static {
            int i = s82.f32899a;
            Locale locale = Locale.US;
            f34304d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f34305e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f34306f = Pattern.compile("\\\\an(\\d+)");
        }

        private b(int i, PointF pointF) {
            this.f34307a = i;
            this.f34308b = pointF;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0009 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.yandex.mobile.ads.impl.v12.b a(java.lang.String r7) throws java.lang.NumberFormatException {
            /*
                java.util.regex.Pattern r0 = com.yandex.mobile.ads.impl.v12.b.f34303c
                java.util.regex.Matcher r7 = r0.matcher(r7)
                r0 = -1
                r1 = 0
                r2 = r0
            L9:
                boolean r3 = r7.find()
                if (r3 == 0) goto L54
                r3 = 1
                java.lang.String r4 = r7.group(r3)
                r4.getClass()
                android.graphics.PointF r5 = b(r4)     // Catch: java.lang.RuntimeException -> L1e
                if (r5 == 0) goto L1e
                r1 = r5
            L1e:
                java.util.regex.Pattern r5 = com.yandex.mobile.ads.impl.v12.b.f34306f     // Catch: java.lang.RuntimeException -> L9
                java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch: java.lang.RuntimeException -> L9
                boolean r5 = r4.find()     // Catch: java.lang.RuntimeException -> L9
                if (r5 == 0) goto L4f
                java.lang.String r3 = r4.group(r3)     // Catch: java.lang.RuntimeException -> L9
                r3.getClass()     // Catch: java.lang.RuntimeException -> L9
                java.lang.String r4 = r3.trim()     // Catch: java.lang.RuntimeException -> L9 java.lang.NumberFormatException -> L3c
                int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.RuntimeException -> L9 java.lang.NumberFormatException -> L3c
                switch(r4) {
                    case 1: goto L50;
                    case 2: goto L50;
                    case 3: goto L50;
                    case 4: goto L50;
                    case 5: goto L50;
                    case 6: goto L50;
                    case 7: goto L50;
                    case 8: goto L50;
                    case 9: goto L50;
                    default: goto L3c;
                }
            L3c:
                java.lang.String r4 = "SsaStyle"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L9
                java.lang.String r6 = "Ignoring unknown alignment: "
                r5.<init>(r6)     // Catch: java.lang.RuntimeException -> L9
                r5.append(r3)     // Catch: java.lang.RuntimeException -> L9
                java.lang.String r3 = r5.toString()     // Catch: java.lang.RuntimeException -> L9
                com.yandex.mobile.ads.impl.rs0.d(r4, r3)     // Catch: java.lang.RuntimeException -> L9
            L4f:
                r4 = r0
            L50:
                if (r4 == r0) goto L9
                r2 = r4
                goto L9
            L54:
                com.yandex.mobile.ads.impl.v12$b r7 = new com.yandex.mobile.ads.impl.v12$b
                r7.<init>(r2, r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v12.b.a(java.lang.String):com.yandex.mobile.ads.impl.v12$b");
        }

        private static PointF b(String str) throws NumberFormatException {
            String strGroup;
            String strGroup2;
            Matcher matcher = f34304d.matcher(str);
            Matcher matcher2 = f34305e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    rs0.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            strGroup.getClass();
            float f10 = Float.parseFloat(strGroup.trim());
            strGroup2.getClass();
            return new PointF(f10, Float.parseFloat(strGroup2.trim()));
        }

        public static String c(String str) {
            return f34303c.matcher(str).replaceAll("");
        }
    }

    private v12(String str, int i, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.f34284a = str;
        this.f34285b = i;
        this.f34286c = num;
        this.f34287d = num2;
        this.f34288e = f10;
        this.f34289f = z10;
        this.f34290g = z11;
        this.f34291h = z12;
        this.i = z13;
        this.f34292j = i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x005b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: RuntimeException -> 0x005f, TryCatch #4 {RuntimeException -> 0x005f, blocks: (B:8:0x003e, B:10:0x004d, B:11:0x0053, B:18:0x0076, B:20:0x007a, B:22:0x0087, B:24:0x008b, B:26:0x0098, B:28:0x009c, B:29:0x00a2, B:34:0x00c1, B:36:0x00c7, B:39:0x00d4, B:41:0x00d8, B:32:0x00a9, B:16:0x0064), top: B:88:0x003e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: RuntimeException -> 0x005f, TryCatch #4 {RuntimeException -> 0x005f, blocks: (B:8:0x003e, B:10:0x004d, B:11:0x0053, B:18:0x0076, B:20:0x007a, B:22:0x0087, B:24:0x008b, B:26:0x0098, B:28:0x009c, B:29:0x00a2, B:34:0x00c1, B:36:0x00c7, B:39:0x00d4, B:41:0x00d8, B:32:0x00a9, B:16:0x0064), top: B:88:0x003e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[Catch: RuntimeException -> 0x005f, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x005f, blocks: (B:8:0x003e, B:10:0x004d, B:11:0x0053, B:18:0x0076, B:20:0x007a, B:22:0x0087, B:24:0x008b, B:26:0x0098, B:28:0x009c, B:29:0x00a2, B:34:0x00c1, B:36:0x00c7, B:39:0x00d4, B:41:0x00d8, B:32:0x00a9, B:16:0x0064), top: B:88:0x003e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[Catch: RuntimeException -> 0x005f, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x005f, blocks: (B:8:0x003e, B:10:0x004d, B:11:0x0053, B:18:0x0076, B:20:0x007a, B:22:0x0087, B:24:0x008b, B:26:0x0098, B:28:0x009c, B:29:0x00a2, B:34:0x00c1, B:36:0x00c7, B:39:0x00d4, B:41:0x00d8, B:32:0x00a9, B:16:0x0064), top: B:88:0x003e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.v12 a(java.lang.String r20, com.yandex.mobile.ads.impl.v12.a r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v12.a(java.lang.String, com.yandex.mobile.ads.impl.v12$a):com.yandex.mobile.ads.impl.v12");
    }

    public static Integer b(String str) {
        try {
            long j4 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (j4 > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(up0.a(((j4 >> 24) & 255) ^ 255), up0.a(j4 & 255), up0.a((j4 >> 8) & 255), up0.a((j4 >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            rs0.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }

    private static boolean a(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e4) {
            rs0.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }
}
