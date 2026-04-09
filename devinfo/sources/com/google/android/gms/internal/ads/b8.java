package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f9612a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f9613b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f9614c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f9615d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f9614c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f9615d = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString a(java.lang.String r19, java.lang.String r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b8.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static w7 b(String str, Matcher matcher, sk0 sk0Var, ArrayList arrayList) {
        a8 a8Var = new a8();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            a8Var.f9242a = jz.b(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            a8Var.f9243b = jz.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            c(strGroup3, a8Var);
            StringBuilder sb2 = new StringBuilder();
            String strN = sk0Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strN.trim());
                strN = sk0Var.n(StandardCharsets.UTF_8);
            }
            a8Var.f9244c = a(str, sb2.toString(), arrayList);
            return new w7(a8Var.a().a(), a8Var.f9242a, a8Var.f9243b);
        } catch (IllegalArgumentException unused) {
            ls.t("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r16, com.google.android.gms.internal.ads.a8 r17) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b8.c(java.lang.String, com.google.android.gms.internal.ads.a8):void");
    }

    public static void d(String str, y7 y7Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i4;
        int i10;
        int i11;
        int i12 = y7Var.f18663b;
        int length = spannableStringBuilder.length();
        String str2 = y7Var.f18662a;
        int iHashCode = str2.hashCode();
        int i13 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iE = e(list2, str, y7Var);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, v.f17396d);
                        int i14 = i12;
                        int i15 = 0;
                        int length2 = 0;
                        while (i15 < arrayList.size()) {
                            if ("rt".equals(((x7) arrayList.get(i15)).f18315a.f18662a)) {
                                x7 x7Var = (x7) arrayList.get(i15);
                                int iE2 = e(list2, str, x7Var.f18315a);
                                if (iE2 == i13) {
                                    iE2 = iE != i13 ? iE : 1;
                                }
                                int i16 = x7Var.f18315a.f18663b - length2;
                                int i17 = x7Var.f18316b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i16, i17);
                                spannableStringBuilder.delete(i16, i17);
                                spannableStringBuilder.setSpan(new q60(charSequenceSubSequence.toString(), iE2), i14, i16, 33);
                                length2 += charSequenceSubSequence.length();
                                i14 = i16;
                            }
                            i15++;
                            i13 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : y7Var.f18665d) {
                                Map map = f9614c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i12, length, 33);
                                } else {
                                    Map map2 = f9615d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i12, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new o70(y7Var.f18664c), i12, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i12, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        ArrayList arrayListF = f(list2, str, y7Var);
        for (int i18 = 0; i18 < arrayListF.size(); i18++) {
            v7 v7Var = ((z7) arrayListF.get(i18)).f19032b;
            int i19 = v7Var.f17547k;
            if (i19 == -1 && v7Var.f17548l == -1) {
                i4 = -1;
            } else {
                i4 = (v7Var.f17548l == 1 ? (char) 2 : (char) 0) | (i19 == 1 ? (char) 1 : (char) 0);
            }
            if (i4 != -1) {
                int i20 = v7Var.f17547k;
                if (i20 == -1 && v7Var.f17548l == -1) {
                    i11 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    i11 = (i20 == 1 ? 1 : 0) | (v7Var.f17548l == 1 ? 2 : 0);
                }
                jz.h(spannableStringBuilder, new StyleSpan(i11), i12, length);
            } else {
                i10 = 1;
            }
            if (v7Var.j == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
            }
            if (v7Var.g) {
                if (!v7Var.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                jz.h(spannableStringBuilder, new ForegroundColorSpan(v7Var.f17544f), i12, length);
            }
            if (v7Var.f17546i) {
                if (!v7Var.f17546i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                jz.h(spannableStringBuilder, new BackgroundColorSpan(v7Var.f17545h), i12, length);
            }
            if (v7Var.f17543e != null) {
                jz.h(spannableStringBuilder, new TypefaceSpan(v7Var.f17543e), i12, length);
            }
            int i21 = v7Var.f17549m;
            if (i21 == 1) {
                jz.h(spannableStringBuilder, new AbsoluteSizeSpan((int) v7Var.f17550n, true), i12, length);
            } else if (i21 == 2) {
                jz.h(spannableStringBuilder, new RelativeSizeSpan(v7Var.f17550n), i12, length);
            } else if (i21 == 3) {
                jz.h(spannableStringBuilder, new RelativeSizeSpan(v7Var.f17550n / 100.0f), i12, length);
            }
            if (v7Var.f17552p) {
                spannableStringBuilder.setSpan(new d60(), i12, length, 33);
            }
        }
    }

    public static int e(List list, String str, y7 y7Var) {
        ArrayList arrayListF = f(list, str, y7Var);
        for (int i4 = 0; i4 < arrayListF.size(); i4++) {
            int i10 = ((z7) arrayListF.get(i4)).f19032b.f17551o;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(java.util.List r10, java.lang.String r11, com.google.android.gms.internal.ads.y7 r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r10.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r10.get(r2)
            com.google.android.gms.internal.ads.v7 r3 = (com.google.android.gms.internal.ads.v7) r3
            java.lang.String r4 = r12.f18662a
            java.util.Set r5 = r12.f18665d
            java.lang.String r6 = r12.f18664c
            java.lang.String r7 = r3.f17539a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            java.lang.String r7 = r3.f17540b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            java.util.Set r7 = r3.f17541c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            java.lang.String r7 = r3.f17542d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L43
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L41
            r4 = 1
            goto L6d
        L41:
            r4 = r1
            goto L6d
        L43:
            java.lang.String r7 = r3.f17539a
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = com.google.android.gms.internal.ads.v7.a(r1, r8, r7, r11)
            java.lang.String r8 = r3.f17540b
            r9 = 2
            int r4 = com.google.android.gms.internal.ads.v7.a(r7, r9, r8, r4)
            java.lang.String r7 = r3.f17542d
            r8 = 4
            int r4 = com.google.android.gms.internal.ads.v7.a(r4, r8, r7, r6)
            r6 = -1
            if (r4 == r6) goto L41
            java.util.Set r6 = r3.f17541c
            boolean r5 = r5.containsAll(r6)
            if (r5 != 0) goto L65
            goto L41
        L65:
            java.util.Set r5 = r3.f17541c
            int r5 = r5.size()
            int r5 = r5 * r8
            int r4 = r4 + r5
        L6d:
            if (r4 <= 0) goto L77
            com.google.android.gms.internal.ads.z7 r5 = new com.google.android.gms.internal.ads.z7
            r5.<init>(r4, r3)
            r0.add(r5)
        L77:
            int r2 = r2 + 1
            goto L7
        L7a:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b8.f(java.util.List, java.lang.String, com.google.android.gms.internal.ads.y7):java.util.ArrayList");
    }
}
