package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.av;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class pj2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f31776a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f31777b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f31778c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f31779d;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f31780c = new F3(0);

        /* renamed from: a, reason: collision with root package name */
        private final b f31781a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31782b;

        public /* synthetic */ a(b bVar, int i, int i10) {
            this(bVar, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar.f31781a.f31784b, aVar2.f31781a.f31784b);
        }

        private a(b bVar, int i) {
            this.f31781a = bVar;
            this.f31782b = i;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f31783a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31784b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31785c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f31786d;

        public /* synthetic */ b(String str, int i, String str2, Set set, int i10) {
            this(str, i, str2, set);
        }

        private b(String str, int i, String str2, Set<String> set) {
            this.f31784b = i;
            this.f31783a = str;
            this.f31785c = str2;
            this.f31786d = set;
        }
    }

    public static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name */
        public final int f31787b;

        /* renamed from: c, reason: collision with root package name */
        public final nj2 f31788c;

        public c(int i, nj2 nj2Var) {
            this.f31787b = i;
            this.f31788c = nj2Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f31787b, cVar.f31787b);
        }
    }

    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f31791c;

        /* renamed from: a, reason: collision with root package name */
        public long f31789a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f31790b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f31792d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f31793e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f31794f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f31795g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f31796h = -3.4028235E38f;
        public int i = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: j, reason: collision with root package name */
        public float f31797j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f31798k = RecyclerView.UNDEFINED_DURATION;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.av.a a() {
            /*
                r13 = this;
                float r0 = r13.f31796h
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 0
                r4 = 1056964608(0x3f000000, float:0.5)
                r5 = 5
                r6 = 4
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L11
                goto L1c
            L11:
                int r0 = r13.f31792d
                if (r0 == r6) goto L1b
                if (r0 == r5) goto L19
                r0 = r4
                goto L1c
            L19:
                r0 = r7
                goto L1c
            L1b:
                r0 = r3
            L1c:
                int r2 = r13.i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L26
                goto L35
            L26:
                int r2 = r13.f31792d
                if (r2 == r11) goto L34
                if (r2 == r9) goto L32
                if (r2 == r6) goto L34
                if (r2 == r5) goto L32
                r2 = r11
                goto L35
            L32:
                r2 = r10
                goto L35
            L34:
                r2 = 0
            L35:
                com.yandex.mobile.ads.impl.av$a r8 = new com.yandex.mobile.ads.impl.av$a
                r8.<init>()
                int r12 = r13.f31792d
                if (r12 == r11) goto L55
                if (r12 == r10) goto L52
                if (r12 == r9) goto L4f
                if (r12 == r6) goto L55
                if (r12 == r5) goto L4f
                java.lang.String r5 = "Unknown textAlignment: "
                java.lang.String r6 = "WebvttCueParser"
                com.yandex.mobile.ads.impl.kr0.a(r5, r12, r6)
                r5 = 0
                goto L57
            L4f:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L57
            L52:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L57
            L55:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            L57:
                com.yandex.mobile.ads.impl.av$a r5 = r8.b(r5)
                float r6 = r13.f31793e
                int r8 = r13.f31794f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L6e
                if (r8 != 0) goto L6e
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 < 0) goto L74
                int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r3 <= 0) goto L6e
                goto L74
            L6e:
                if (r9 == 0) goto L72
                r1 = r6
                goto L75
            L72:
                if (r8 != 0) goto L75
            L74:
                r1 = r7
            L75:
                com.yandex.mobile.ads.impl.av$a r1 = r5.a(r8, r1)
                int r3 = r13.f31795g
                com.yandex.mobile.ads.impl.av$a r1 = r1.a(r3)
                com.yandex.mobile.ads.impl.av$a r1 = r1.b(r0)
                com.yandex.mobile.ads.impl.av$a r1 = r1.b(r2)
                float r3 = r13.f31797j
                if (r2 == 0) goto La6
                if (r2 == r11) goto L9a
                if (r2 != r10) goto L90
                goto La8
            L90:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r2)
                r0.<init>(r1)
                throw r0
            L9a:
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                r4 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto La2
                float r0 = r0 * r4
                goto La8
            La2:
                float r7 = r7 - r0
                float r0 = r7 * r4
                goto La8
            La6:
                float r0 = r7 - r0
            La8:
                float r0 = java.lang.Math.min(r3, r0)
                com.yandex.mobile.ads.impl.av$a r0 = r1.d(r0)
                int r1 = r13.f31798k
                com.yandex.mobile.ads.impl.av$a r0 = r0.c(r1)
                java.lang.CharSequence r1 = r13.f31791c
                if (r1 == 0) goto Lbd
                r0.a(r1)
            Lbd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pj2.d.a():com.yandex.mobile.ads.impl.av$a");
        }
    }

    static {
        HashMap map = new HashMap();
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "white");
        androidx.work.s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "lime");
        androidx.work.s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "cyan");
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map, "red");
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "yellow");
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "magenta");
        androidx.work.s.l(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "blue");
        androidx.work.s.l(0, 0, 0, map, "black");
        f31778c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_white");
        androidx.work.s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_lime");
        androidx.work.s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_cyan");
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map2, "bg_red");
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_yellow");
        androidx.work.s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_magenta");
        androidx.work.s.l(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_blue");
        androidx.work.s.l(0, 0, 0, map2, "bg_black");
        f31779d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.text.SpannableStringBuilder r18, com.yandex.mobile.ads.impl.pj2.b r19, java.lang.String r20, java.util.List r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pj2.a(android.text.SpannableStringBuilder, com.yandex.mobile.ads.impl.pj2$b, java.lang.String, java.util.List, java.util.List):void");
    }

    private static void b(String str, d dVar) {
        String strSubstring;
        int i = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    rs0.d("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = RecyclerView.UNDEFINED_DURATION;
                    break;
            }
            dVar.f31795g = i;
            str = str.substring(0, iIndexOf);
        }
        if (!str.endsWith("%")) {
            dVar.f31793e = Integer.parseInt(str);
            dVar.f31794f = 1;
            return;
        }
        int i10 = rj2.f32673a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        dVar.f31793e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        dVar.f31794f = 0;
    }

    public static oj2 a(uf1 uf1Var, ArrayList arrayList) {
        String strJ = uf1Var.j();
        if (strJ == null) {
            return null;
        }
        Pattern pattern = f31776a;
        Matcher matcher = pattern.matcher(strJ);
        if (matcher.matches()) {
            return a(null, matcher, uf1Var, arrayList);
        }
        String strJ2 = uf1Var.j();
        if (strJ2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strJ2);
        if (matcher2.matches()) {
            return a(strJ.trim(), matcher2, uf1Var, arrayList);
        }
        return null;
    }

    private static oj2 a(String str, Matcher matcher, uf1 uf1Var, ArrayList arrayList) {
        d dVar = new d();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            dVar.f31789a = rj2.a(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            dVar.f31790b = rj2.a(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            a(strGroup3, dVar);
            StringBuilder sb = new StringBuilder();
            String strJ = uf1Var.j();
            while (!TextUtils.isEmpty(strJ)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strJ.trim());
                strJ = uf1Var.j();
            }
            dVar.f31791c = a(str, sb.toString(), arrayList);
            return new oj2(dVar.a().a(), dVar.f31789a, dVar.f31790b);
        } catch (NumberFormatException unused) {
            rs0.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static av.a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString a(java.lang.String r23, java.lang.String r24, java.util.List<com.yandex.mobile.ads.impl.nj2> r25) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pj2.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r19, com.yandex.mobile.ads.impl.pj2.d r20) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pj2.a(java.lang.String, com.yandex.mobile.ads.impl.pj2$d):void");
    }
}
