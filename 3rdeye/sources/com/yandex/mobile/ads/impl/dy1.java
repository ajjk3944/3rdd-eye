package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class dy1 extends zm {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f26553h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f26554j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f26555k = 0;

    private dy1(String str, long j4, long j10, long j11, File file) {
        super(str, j4, j10, j11, file);
    }

    public final dy1 a(File file, long j4) {
        if (this.f36549e) {
            return new dy1(this.f36546b, this.f36547c, this.f36548d, j4, file);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.dy1 a(java.io.File r14, long r15, long r17, com.yandex.mobile.ads.impl.en r19) throws java.lang.NumberFormatException {
        /*
            r0 = r19
            java.lang.String r1 = r14.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r3 = r1.endsWith(r2)
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L9a
            java.lang.String r1 = r14.getName()
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.dy1.i
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r8 = r3.matches()
            if (r8 == 0) goto L2e
            java.lang.String r1 = r3.group(r6)
            r1.getClass()
            java.lang.String r1 = com.yandex.mobile.ads.impl.s82.f(r1)
            goto L43
        L2e:
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.dy1.f26553h
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r1 = r3.matches()
            if (r1 == 0) goto L42
            java.lang.String r1 = r3.group(r6)
            r1.getClass()
            goto L43
        L42:
            r1 = r7
        L43:
            if (r1 != 0) goto L46
            goto L8a
        L46:
            java.io.File r8 = r14.getParentFile()
            if (r8 == 0) goto L94
            com.yandex.mobile.ads.impl.dn r1 = r0.c(r1)
            int r1 = r1.f26270a
            java.lang.String r9 = r3.group(r5)
            r9.getClass()
            long r9 = java.lang.Long.parseLong(r9)
            java.lang.String r3 = r3.group(r4)
            r3.getClass()
            long r11 = java.lang.Long.parseLong(r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            java.lang.String r1 = "."
            r13.append(r1)
            r13.append(r9)
            r13.append(r1)
            java.lang.String r1 = N7.C1094a9.f(r13, r11, r2)
            r3.<init>(r8, r1)
            boolean r1 = r14.renameTo(r3)
            if (r1 != 0) goto L8b
        L8a:
            r3 = r7
        L8b:
            if (r3 != 0) goto L8e
            return r7
        L8e:
            java.lang.String r1 = r3.getName()
            r9 = r3
            goto L9b
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L9a:
            r9 = r14
        L9b:
            java.util.regex.Pattern r2 = com.yandex.mobile.ads.impl.dy1.f26554j
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto La8
            return r7
        La8:
            java.lang.String r2 = r1.group(r6)
            r2.getClass()
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r2 = r0.a(r2)
            if (r2 != 0) goto Lba
            return r7
        Lba:
            r10 = -1
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 != 0) goto Lc5
            long r10 = r9.length()
            goto Lc6
        Lc5:
            r10 = r15
        Lc6:
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto Lcd
            return r7
        Lcd:
            java.lang.String r0 = r1.group(r5)
            r0.getClass()
            long r5 = java.lang.Long.parseLong(r0)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r0 != 0) goto Lee
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
            long r0 = java.lang.Long.parseLong(r0)
            r7 = r0
            goto Lf0
        Lee:
            r7 = r17
        Lf0:
            com.yandex.mobile.ads.impl.dy1 r1 = new com.yandex.mobile.ads.impl.dy1
            r3 = r5
            r5 = r10
            r1.<init>(r2, r3, r5, r7, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dy1.a(java.io.File, long, long, com.yandex.mobile.ads.impl.en):com.yandex.mobile.ads.impl.dy1");
    }

    public static dy1 a(String str, long j4) {
        return new dy1(str, j4, -1L, -9223372036854775807L, null);
    }

    public static dy1 a(String str, long j4, long j10) {
        return new dy1(str, j4, j10, -9223372036854775807L, null);
    }
}
