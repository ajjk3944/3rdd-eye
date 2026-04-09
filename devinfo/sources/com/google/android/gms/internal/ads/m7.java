package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13784b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13785c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13786d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13787e;

    /* renamed from: f, reason: collision with root package name */
    public final q7 f13788f;
    public final String[] g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13789h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13790i;
    public final m7 j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f13791k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f13792l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f13793m;

    public m7(String str, String str2, long j, long j8, q7 q7Var, String[] strArr, String str3, String str4, m7 m7Var) {
        this.f13783a = str;
        this.f13784b = str2;
        this.f13790i = str4;
        this.f13788f = q7Var;
        this.g = strArr;
        this.f13785c = str2 != null;
        this.f13786d = j;
        this.f13787e = j8;
        str3.getClass();
        this.f13789h = str3;
        this.j = m7Var;
        this.f13791k = new HashMap();
        this.f13792l = new HashMap();
    }

    public static m7 a(String str) {
        return new m7(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static m7 b(String str, long j, long j8, q7 q7Var, String[] strArr, String str2, String str3, m7 m7Var) {
        return new m7(str, null, j, j8, q7Var, strArr, str2, str3, m7Var);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            k40 k40Var = new k40();
            k40Var.f13013a = new SpannableStringBuilder();
            k40Var.f13014b = null;
            treeMap.put(str, k40Var);
        }
        CharSequence charSequence = ((k40) treeMap.get(str)).f13013a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j) {
        long j8 = this.f13786d;
        long j9 = this.f13787e;
        if (j8 == -9223372036854775807L) {
            if (j9 == -9223372036854775807L) {
                return true;
            }
            j8 = -9223372036854775807L;
        }
        if (j8 <= j && j9 == -9223372036854775807L) {
            return true;
        }
        if (j8 != -9223372036854775807L || j >= j9) {
            return j8 <= j && j < j9;
        }
        return true;
    }

    public final m7 d(int i4) {
        ArrayList arrayList = this.f13793m;
        if (arrayList != null) {
            return (m7) arrayList.get(i4);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f13793m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z3) {
        String str = this.f13783a;
        boolean zEquals = "p".equals(str);
        if (z3 || zEquals || ("div".equals(str) && this.f13790i != null)) {
            long j = this.f13786d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j8 = this.f13787e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f13793m != null) {
            for (int i4 = 0; i4 < this.f13793m.size(); i4++) {
                m7 m7Var = (m7) this.f13793m.get(i4);
                boolean z10 = true;
                if (!z3 && !zEquals) {
                    z10 = false;
                }
                m7Var.f(treeSet, z10);
            }
        }
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f13789h;
        boolean zEquals = "".equals(str3);
        boolean zC = c(j);
        if (true != zEquals) {
            str = str3;
        }
        if (zC && "div".equals(this.f13783a) && (str2 = this.f13790i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i4 = 0; i4 < e(); i4++) {
            d(i4).g(j, str, arrayList);
        }
    }

    public final void h(long j, boolean z3, String str, TreeMap treeMap) {
        long j8;
        boolean z10;
        HashMap map = this.f13791k;
        map.clear();
        HashMap map2 = this.f13792l;
        map2.clear();
        String str2 = this.f13783a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f13789h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f13785c && z3) {
            SpannableStringBuilder spannableStringBuilderI = i(str4, treeMap);
            String str5 = this.f13784b;
            str5.getClass();
            spannableStringBuilderI.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z3) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((k40) entry.getValue()).f13013a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i4 = 0; i4 < e(); i4++) {
                m7 m7VarD = d(i4);
                if (z3 || zEquals) {
                    j8 = j;
                    z10 = true;
                } else {
                    j8 = j;
                    z10 = false;
                }
                m7VarD.h(j8, z10, str4, treeMap);
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
                CharSequence charSequence2 = ((k40) entry2.getValue()).f13013a;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m7.j(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }
}
