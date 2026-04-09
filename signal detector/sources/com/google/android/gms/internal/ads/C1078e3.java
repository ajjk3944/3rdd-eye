package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078e3 implements S2 {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f13849g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13850a;

    /* renamed from: b, reason: collision with root package name */
    public final W2 f13851b;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f13853d;

    /* renamed from: e, reason: collision with root package name */
    public float f13854e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f13855f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f13852c = new C2036vr();

    public C1078e3(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f13850a = false;
            this.f13851b = null;
            return;
        }
        this.f13850a = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        AbstractC0582Jp.m(str.startsWith("Format:"));
        W2 w2A = W2.a(str);
        w2A.getClass();
        this.f13851b = w2A;
        a(new C2036vr((byte[]) list.get(1)), charset);
    }

    public static long b(String str) {
        Matcher matcher = f13849g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = Vt.f12096a;
        long j6 = Long.parseLong(strGroup) * 3600000000L;
        long j7 = Long.parseLong(matcher.group(2)) * 60000000;
        return j6 + j7 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    public static int c(long j6, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j6) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j6) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j6));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cb A[Catch: RuntimeException -> 0x0212, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0212, blocks: (B:109:0x01e2, B:111:0x01f0, B:112:0x01f6, B:119:0x0217, B:121:0x021b, B:123:0x022a, B:125:0x022e, B:127:0x023d, B:129:0x0241, B:130:0x0249, B:135:0x0273, B:137:0x0277, B:141:0x0288, B:143:0x028c, B:147:0x029d, B:149:0x02a1, B:153:0x02b2, B:155:0x02b6, B:159:0x02c7, B:161:0x02cb, B:162:0x02d3, B:169:0x02f0, B:167:0x02e3, B:133:0x0251, B:114:0x0201), top: B:189:0x01e2, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.C2036vr r39, java.nio.charset.Charset r40) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1078e3.a(com.google.android.gms.internal.ads.vr, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x01be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:199:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e1  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.S2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(byte[] r33, int r34, int r35, com.google.android.gms.internal.ads.T2 r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1078e3.h(byte[], int, int, com.google.android.gms.internal.ads.T2):void");
    }
}
