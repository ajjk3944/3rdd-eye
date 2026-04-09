package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1510m3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15510a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15511b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15512c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15513d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15514e;

    /* renamed from: f, reason: collision with root package name */
    public final C1672p3 f15515f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f15516g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15517h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final C1510m3 f15518j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f15519k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f15520l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f15521m;

    public C1510m3(String str, String str2, long j6, long j7, C1672p3 c1672p3, String[] strArr, String str3, String str4, C1510m3 c1510m3) {
        this.f15510a = str;
        this.f15511b = str2;
        this.i = str4;
        this.f15515f = c1672p3;
        this.f15516g = strArr;
        this.f15512c = str2 != null;
        this.f15513d = j6;
        this.f15514e = j7;
        str3.getClass();
        this.f15517h = str3;
        this.f15518j = c1510m3;
        this.f15519k = new HashMap();
        this.f15520l = new HashMap();
    }

    public static C1510m3 a(String str) {
        return new C1510m3(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static C1510m3 b(String str, long j6, long j7, C1672p3 c1672p3, String[] strArr, String str2, String str3, C1510m3 c1510m3) {
        return new C1510m3(str, null, j6, j7, c1672p3, strArr, str2, str3, c1510m3);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C1597nj c1597nj = new C1597nj();
            c1597nj.f15799a = new SpannableStringBuilder();
            c1597nj.f15800b = null;
            treeMap.put(str, c1597nj);
        }
        CharSequence charSequence = ((C1597nj) treeMap.get(str)).f15799a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j6) {
        long j7 = this.f15513d;
        long j8 = this.f15514e;
        if (j7 == -9223372036854775807L) {
            if (j8 == -9223372036854775807L) {
                return true;
            }
            j7 = -9223372036854775807L;
        }
        if (j7 <= j6 && j8 == -9223372036854775807L) {
            return true;
        }
        if (j7 != -9223372036854775807L || j6 >= j8) {
            return j7 <= j6 && j6 < j8;
        }
        return true;
    }

    public final C1510m3 d(int i) {
        ArrayList arrayList = this.f15521m;
        if (arrayList != null) {
            return (C1510m3) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f15521m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z6) {
        String str = this.f15510a;
        boolean zEquals = "p".equals(str);
        if (z6 || zEquals || ("div".equals(str) && this.i != null)) {
            long j6 = this.f15513d;
            if (j6 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j6));
            }
            long j7 = this.f15514e;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
        }
        if (this.f15521m != null) {
            for (int i = 0; i < this.f15521m.size(); i++) {
                C1510m3 c1510m3 = (C1510m3) this.f15521m.get(i);
                boolean z7 = true;
                if (!z6 && !zEquals) {
                    z7 = false;
                }
                c1510m3.f(treeSet, z7);
            }
        }
    }

    public final void g(long j6, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f15517h;
        boolean zEquals = "".equals(str3);
        boolean zC = c(j6);
        if (true != zEquals) {
            str = str3;
        }
        if (zC && "div".equals(this.f15510a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j6, str, arrayList);
        }
    }

    public final void h(long j6, boolean z6, String str, TreeMap treeMap) {
        long j7;
        boolean z7;
        HashMap map = this.f15519k;
        map.clear();
        HashMap map2 = this.f15520l;
        map2.clear();
        String str2 = this.f15510a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f15517h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f15512c && z6) {
            SpannableStringBuilder spannableStringBuilderI = i(str4, treeMap);
            String str5 = this.f15511b;
            str5.getClass();
            spannableStringBuilderI.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z6) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j6)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C1597nj) entry.getValue()).f15799a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < e(); i++) {
                C1510m3 c1510m3D = d(i);
                if (z6 || zEquals) {
                    j7 = j6;
                    z7 = true;
                } else {
                    j7 = j6;
                    z7 = false;
                }
                c1510m3D.h(j7, z7, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderI2 = i(str4, treeMap);
                int length = spannableStringBuilderI2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderI2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderI2.charAt(length) != '\n') {
                    spannableStringBuilderI2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C1597nj) entry2.getValue()).f15799a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1510m3.j(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }
}
