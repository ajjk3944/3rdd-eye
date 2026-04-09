package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e7 implements s6 {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10712a;

    /* renamed from: b, reason: collision with root package name */
    public final v6 f10713b;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f10715d;

    /* renamed from: e, reason: collision with root package name */
    public float f10716e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f10717f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f10714c = new sk0();

    public e7(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f10712a = false;
            this.f10713b = null;
            return;
        }
        this.f10712a = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        mq0.m(str.startsWith("Format:"));
        v6 v6VarA = v6.a(str);
        v6VarA.getClass();
        this.f10713b = v6VarA;
        a(new sk0((byte[]) list.get(1)), charset);
    }

    public static long b(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = bq0.f9768a;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j8 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j8 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    public static int c(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, Long.valueOf(j));
        arrayList2.add(i4, i4 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i4 - 1)));
        return i4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0293 A[Catch: RuntimeException -> 0x01da, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01da, blocks: (B:91:0x01aa, B:93:0x01b8, B:94:0x01be, B:101:0x01df, B:103:0x01e3, B:105:0x01f2, B:107:0x01f6, B:109:0x0205, B:111:0x0209, B:112:0x0211, B:117:0x023b, B:119:0x023f, B:123:0x0250, B:125:0x0254, B:129:0x0265, B:131:0x0269, B:135:0x027a, B:137:0x027e, B:141:0x028f, B:143:0x0293, B:144:0x029b, B:152:0x02b9, B:150:0x02ac, B:115:0x0219, B:96:0x01c9), top: B:174:0x01aa, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.sk0 r29, java.nio.charset.Charset r30) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e7.a(com.google.android.gms.internal.ads.sk0, java.nio.charset.Charset):void");
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
    @Override // com.google.android.gms.internal.ads.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(byte[] r33, int r34, int r35, ca.c r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e7.d(byte[], int, int, ca.c):void");
    }
}
