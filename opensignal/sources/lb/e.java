package lb;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f15095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15096b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15097c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15098d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15099e;

    /* renamed from: f, reason: collision with root package name */
    public final g f15100f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f15101g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15102h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15103i;
    public final e j;
    public final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f15104l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f15105m;

    public e(String str, String str2, long j, long j7, g gVar, String[] strArr, String str3, String str4, e eVar) {
        this.f15095a = str;
        this.f15096b = str2;
        this.f15103i = str4;
        this.f15100f = gVar;
        this.f15101g = strArr;
        this.f15097c = str2 != null;
        this.f15098d = j;
        this.f15099e = j7;
        str3.getClass();
        this.f15102h = str3;
        this.j = eVar;
        this.k = new HashMap();
        this.f15104l = new HashMap();
    }

    public static e a(String str) {
        return new e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            eb.a aVar = new eb.a();
            aVar.f8040a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((eb.a) treeMap.get(str)).f8040a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final e b(int i10) {
        ArrayList arrayList = this.f15105m;
        if (arrayList != null) {
            return (e) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f15105m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        String str = this.f15095a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.f15103i != null)) {
            long j = this.f15098d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j7 = this.f15099e;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
        }
        if (this.f15105m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f15105m.size(); i10++) {
            ((e) this.f15105m.get(i10)).d(treeSet, z10 || zEquals);
        }
    }

    public final boolean f(long j) {
        long j7 = this.f15098d;
        long j10 = this.f15099e;
        if (j7 == -9223372036854775807L && j10 == -9223372036854775807L) {
            return true;
        }
        if (j7 <= j && j10 == -9223372036854775807L) {
            return true;
        }
        if (j7 != -9223372036854775807L || j >= j10) {
            return j7 <= j && j < j10;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f15102h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f15095a) && (str2 = this.f15103i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r18, java.util.Map r20, java.util.HashMap r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j, boolean z10, String str, TreeMap treeMap) {
        boolean z11;
        TreeMap treeMap2;
        long j7;
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.f15104l;
        map2.clear();
        String str2 = this.f15095a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f15102h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f15097c && z10) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f15096b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((eb.a) entry.getValue()).f8040a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                e eVarB = b(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    treeMap2 = treeMap;
                    j7 = j;
                } else {
                    z11 = false;
                    j7 = j;
                    treeMap2 = treeMap;
                }
                eVarB.i(j7, z11, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((eb.a) entry2.getValue()).f8040a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
