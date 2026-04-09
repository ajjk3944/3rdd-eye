package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.singular.sdk.internal.SingularParamsBase;
import com.yandex.mobile.ads.impl.av;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class f72 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27227a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27229c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27230d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27231e;

    /* renamed from: f, reason: collision with root package name */
    public final i72 f27232f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f27233g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27234h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final f72 f27235j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f27236k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f27237l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f27238m;

    private f72(String str, String str2, long j4, long j10, i72 i72Var, String[] strArr, String str3, String str4, f72 f72Var) {
        this.f27227a = str;
        this.f27228b = str2;
        this.i = str4;
        this.f27232f = i72Var;
        this.f27233g = strArr;
        this.f27229c = str2 != null;
        this.f27230d = j4;
        this.f27231e = j10;
        this.f27234h = (String) zf.a(str3);
        this.f27235j = f72Var;
        this.f27236k = new HashMap<>();
        this.f27237l = new HashMap<>();
    }

    public final void a(f72 f72Var) {
        if (this.f27238m == null) {
            this.f27238m = new ArrayList();
        }
        this.f27238m.add(f72Var);
    }

    public final long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public final String[] c() {
        return this.f27233g;
    }

    public final f72 a(int i) {
        ArrayList arrayList = this.f27238m;
        if (arrayList != null) {
            return (f72) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int a() {
        ArrayList arrayList = this.f27238m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    private void a(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = SingularParamsBase.Constants.PLATFORM_KEY.equals(this.f27227a);
        boolean zEquals2 = "div".equals(this.f27227a);
        if (z10 || zEquals || (zEquals2 && this.i != null)) {
            long j4 = this.f27230d;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
            long j10 = this.f27231e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f27238m == null) {
            return;
        }
        for (int i = 0; i < this.f27238m.size(); i++) {
            ((f72) this.f27238m.get(i)).a(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            av.a aVar = new av.a();
            aVar.a(new SpannableStringBuilder());
            treeMap.put(str, aVar);
        }
        CharSequence charSequenceD = ((av.a) treeMap.get(str)).d();
        charSequenceD.getClass();
        return (SpannableStringBuilder) charSequenceD;
    }

    public final boolean a(long j4) {
        long j10 = this.f27230d;
        if (j10 == -9223372036854775807L && this.f27231e == -9223372036854775807L) {
            return true;
        }
        if (j10 <= j4 && this.f27231e == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j4 >= this.f27231e) {
            return j10 <= j4 && j4 < this.f27231e;
        }
        return true;
    }

    private void a(long j4, String str, ArrayList arrayList) {
        if (!"".equals(this.f27234h)) {
            str = this.f27234h;
        }
        if (a(j4) && "div".equals(this.f27227a) && this.i != null) {
            arrayList.add(new Pair(str, this.i));
            return;
        }
        for (int i = 0; i < a(); i++) {
            a(i).a(j4, str, arrayList);
        }
    }

    private void a(long j4, Map map, Map map2, String str, TreeMap treeMap) {
        if (a(j4)) {
            String str2 = "".equals(this.f27234h) ? str : this.f27234h;
            Iterator<Map.Entry<String, Integer>> it = this.f27237l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f27236k.containsKey(key) ? this.f27236k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    av.a aVar = (av.a) treeMap.get(key);
                    aVar.getClass();
                    g72 g72Var = (g72) map2.get(str2);
                    g72Var.getClass();
                    int i = g72Var.f27575j;
                    i72 i72VarA = h72.a(this.f27232f, this.f27233g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.d();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (i72VarA != null) {
                        h72.a(spannableStringBuilder2, iIntValue, iIntValue2, i72VarA, this.f27235j, map, i);
                        if (SingularParamsBase.Constants.PLATFORM_KEY.equals(this.f27227a)) {
                            if (i72VarA.j() != Float.MAX_VALUE) {
                                aVar.c((i72VarA.j() * (-90.0f)) / 100.0f);
                            }
                            if (i72VarA.l() != null) {
                                aVar.b(i72VarA.l());
                            }
                            if (i72VarA.g() != null) {
                                aVar.a(i72VarA.g());
                            }
                        }
                    }
                }
            }
            for (int i10 = 0; i10 < a(); i10++) {
                a(i10).a(j4, map, map2, str2, treeMap);
            }
        }
    }

    private void a(long j4, boolean z10, String str, TreeMap treeMap) {
        boolean z11;
        TreeMap treeMap2;
        long j10;
        this.f27236k.clear();
        this.f27237l.clear();
        if ("metadata".equals(this.f27227a)) {
            return;
        }
        if (!"".equals(this.f27234h)) {
            str = this.f27234h;
        }
        String str2 = str;
        if (this.f27229c && z10) {
            SpannableStringBuilder spannableStringBuilderA = a(str2, treeMap);
            String str3 = this.f27228b;
            str3.getClass();
            spannableStringBuilderA.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f27227a) && z10) {
            a(str2, treeMap).append('\n');
            return;
        }
        if (a(j4)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap<String, Integer> map = this.f27236k;
                String str4 = (String) entry.getKey();
                CharSequence charSequenceD = ((av.a) entry.getValue()).d();
                charSequenceD.getClass();
                map.put(str4, Integer.valueOf(charSequenceD.length()));
            }
            boolean zEquals = SingularParamsBase.Constants.PLATFORM_KEY.equals(this.f27227a);
            int i = 0;
            while (i < a()) {
                f72 f72VarA = a(i);
                if (z10 || zEquals) {
                    z11 = true;
                    treeMap2 = treeMap;
                    j10 = j4;
                } else {
                    z11 = false;
                    j10 = j4;
                    treeMap2 = treeMap;
                }
                f72VarA.a(j10, z11, str2, treeMap2);
                j4 = j10;
                i++;
                treeMap = treeMap2;
            }
            TreeMap treeMap3 = treeMap;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderA2 = a(str2, treeMap3);
                int length = spannableStringBuilderA2.length() - 1;
                while (length >= 0 && spannableStringBuilderA2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderA2.charAt(length) != '\n') {
                    spannableStringBuilderA2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap3.entrySet()) {
                HashMap<String, Integer> map2 = this.f27237l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequenceD2 = ((av.a) entry2.getValue()).d();
                charSequenceD2.getClass();
                map2.put(str5, Integer.valueOf(charSequenceD2.length()));
            }
        }
    }

    public static f72 a(String str) {
        return new f72(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static f72 a(String str, long j4, long j10, i72 i72Var, String[] strArr, String str2, String str3, f72 f72Var) {
        return new f72(str, null, j4, j10, i72Var, strArr, str2, str3, f72Var);
    }

    public final ArrayList a(long j4, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j4, this.f27234h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j4, false, this.f27234h, treeMap);
        a(j4, map, map2, this.f27234h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                g72 g72Var = (g72) map2.get(pair.first);
                g72Var.getClass();
                arrayList2.add(new av.a().a(bitmapDecodeByteArray).b(g72Var.f27568b).b(0).a(0, g72Var.f27569c).a(g72Var.f27571e).d(g72Var.f27572f).a(g72Var.f27573g).c(g72Var.f27575j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            g72 g72Var2 = (g72) map2.get(entry.getKey());
            g72Var2.getClass();
            av.a aVar = (av.a) entry.getValue();
            CharSequence charSequenceD = aVar.d();
            charSequenceD.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceD;
            for (u00 u00Var : (u00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u00.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(u00Var), spannableStringBuilder.getSpanEnd(u00Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i10 = i + 1;
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i, i12 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == ' ') {
                        spannableStringBuilder.delete(i14, i13 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == '\n') {
                        spannableStringBuilder.delete(i15, i16);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.a(g72Var2.f27570d, g72Var2.f27569c);
            aVar.a(g72Var2.f27571e);
            aVar.b(g72Var2.f27568b);
            aVar.d(g72Var2.f27572f);
            aVar.b(g72Var2.f27574h, g72Var2.i);
            aVar.c(g72Var2.f27575j);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }
}
