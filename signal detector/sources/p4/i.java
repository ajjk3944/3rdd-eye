package P4;

import java.util.Locale;
import y5.l;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3164a = new i();

    public static String c() {
        try {
            String property = System.getProperty("os.name");
            if (property == null) {
                return null;
            }
            Locale locale = Locale.ENGLISH;
            q5.i.d(locale, "ENGLISH");
            String lowerCase = property.toLowerCase(locale);
            q5.i.d(lowerCase, "toLowerCase(...)");
            if (l.V(lowerCase, "win", false)) {
                return "windows";
            }
            if (!l.V(lowerCase, "nix", false) && !l.V(lowerCase, "nux", false) && !l.V(lowerCase, "aix", false)) {
                if (l.V(lowerCase, "mac", false)) {
                    return "macos";
                }
                return null;
            }
            return "linux";
        } catch (Throwable th) {
            R2.a.d(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, j5.b r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof P4.c
            if (r0 == 0) goto L13
            r0 = r6
            P4.c r0 = (P4.c) r0
            int r1 = r0.f3149f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3149f = r1
            goto L18
        L13:
            P4.c r0 = new P4.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3147d
            int r1 = r0.f3149f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            R2.a.H(r6)
            goto L43
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            R2.a.H(r6)
            G5.d r6 = z5.D.f24486b
            P4.d r1 = new P4.d
            r3 = 0
            r1.<init>(r5, r3)
            r0.f3149f = r2
            java.lang.Object r6 = z5.AbstractC3046w.r(r6, r0, r1)
            i5.a r5 = i5.EnumC2380a.f20635a
            if (r6 != r5) goto L43
            return r5
        L43:
            java.lang.String r5 = "withContext(...)"
            q5.i.d(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.i.a(java.lang.String, j5.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        r14 = "arp -a";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r14 != r8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a7, code lost:
    
        if (y5.l.V(r1, ":", false) != false) goto L106;
     */
    /* JADX WARN: Path cross not found for [B:27:0x0077, B:38:0x0098], limit reached: 104 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[PHI: r1 r14
  0x00ae: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v15 java.lang.String) binds: [B:43:0x00aa, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r14v15 java.lang.Object) = (r14v9 java.lang.Object), (r14v1 java.lang.Object) binds: [B:43:0x00aa, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01c5 -> B:91:0x01c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(j5.b r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.i.b(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(j5.b r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof P4.g
            if (r0 == 0) goto L13
            r0 = r7
            P4.g r0 = (P4.g) r0
            int r1 = r0.f3162f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3162f = r1
            goto L18
        L13:
            P4.g r0 = new P4.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3160d
            int r1 = r0.f3162f
            c5.i r2 = c5.C0412i.f5929a
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L27
            R2.a.H(r7)
            goto L82
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            R2.a.H(r7)
            java.lang.String r7 = c()
            if (r7 == 0) goto L8a
            int r1 = r7.hashCode()
            r4 = 102977780(0x62350f4, float:3.0716368E-35)
            if (r1 == r4) goto L64
            r4 = 103652211(0x62d9b73, float:3.265189E-35)
            if (r1 == r4) goto L58
            r4 = 1349493379(0x506fa283, float:1.608162E10)
            if (r1 == r4) goto L4c
            goto L8a
        L4c:
            java.lang.String r1 = "windows"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L55
            goto L8a
        L55:
            java.lang.String r7 = "arp -d"
            goto L6f
        L58:
            java.lang.String r1 = "macos"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L61
            goto L8a
        L61:
            java.lang.String r7 = "arp -d -a"
            goto L6f
        L64:
            java.lang.String r1 = "linux"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L6d
            goto L8a
        L6d:
            java.lang.String r7 = "ip neigh flush all"
        L6f:
            G5.d r1 = z5.D.f24486b
            P4.h r4 = new P4.h
            r5 = 0
            r4.<init>(r7, r5)
            r0.f3162f = r3
            java.lang.Object r7 = z5.AbstractC3046w.r(r1, r0, r4)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r7 != r0) goto L82
            return r0
        L82:
            java.lang.String r7 = "ARP 缓存已更新"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r7)
            return r2
        L8a:
            java.lang.String r7 = "不支持的操作系统"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.i.d(j5.b):java.lang.Object");
    }
}
