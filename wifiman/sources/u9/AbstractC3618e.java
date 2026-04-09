package U9;

import Eb.w;

/* renamed from: U9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3618e {

    /* renamed from: U9.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22188a;

        static {
            int[] iArr = new int[w.f.values().length];
            try {
                iArr[w.f.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.f.Backup.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.f.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22188a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final U9.C3615b c(Eb.TwoFaRequiredResponse r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC6492s.i(r8, r0)
            java.util.List r0 = r8.getAuthenticators()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L16:
            boolean r4 = r0.hasNext()
            r5 = 2
            if (r4 == 0) goto L84
            java.lang.Object r4 = r0.next()
            Eb.w r4 = (Eb.w) r4
            Eb.w$f r6 = r4.getStatus()
            int[] r7 = U9.AbstractC3618e.a.f22188a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            r7 = 1
            if (r6 == r7) goto L47
            if (r6 == r5) goto L47
            r7 = 3
            if (r6 != r7) goto L41
            U9.c r6 = new U9.c
            r6.<init>()
            S9.a.f(r6, r2, r5, r2)
        L3f:
            r5 = r2
            goto L7e
        L41:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L47:
            boolean r5 = r4 instanceof Eb.w.Email
            if (r5 != 0) goto L68
            boolean r5 = r4 instanceof Eb.w.Sms
            if (r5 != 0) goto L68
            boolean r5 = r4 instanceof Eb.w.Push
            if (r5 != 0) goto L68
            boolean r5 = r4 instanceof Eb.w.Totp
            if (r5 != 0) goto L68
            boolean r5 = r4 instanceof Eb.w.Backup
            if (r5 == 0) goto L5c
            goto L68
        L5c:
            boolean r5 = r4 instanceof Eb.w.Unknown
            if (r5 == 0) goto L62
            r5 = r2
            goto L69
        L62:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L68:
            r5 = r4
        L69:
            if (r5 == 0) goto L3f
            Eb.C r6 = r8.getUser()
            java.lang.String r6 = r6.getDefaultMfa()
            java.lang.String r4 = r4.getId()
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r6, r4)
            if (r4 == 0) goto L7e
            r3 = r5
        L7e:
            if (r5 == 0) goto L16
            r1.add(r5)
            goto L16
        L84:
            java.util.Set r8 = Zg.AbstractC3689v.n1(r1)
            if (r3 != 0) goto L99
            U9.d r0 = new U9.d
            r0.<init>()
            S9.a.f(r0, r2, r5, r2)
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r3 = Zg.AbstractC3689v.r0(r0)
        L99:
            boolean r0 = r8.isEmpty()
            java.lang.String r1 = "no primary MFA method available"
            if (r0 != 0) goto Lb2
            Eb.w r3 = (Eb.w) r3
            if (r3 == 0) goto Lac
            U9.b r0 = new U9.b
            r0.<init>(r3, r8, r2)
            return r0
        Lac:
            com.ui.core.ui.sso.UiSSO$Error$InvalidMFAParams r8 = new com.ui.core.ui.sso.UiSSO$Error$InvalidMFAParams
            r8.<init>(r1)
            throw r8
        Lb2:
            com.ui.core.ui.sso.UiSSO$Error$InvalidMFAParams r8 = new com.ui.core.ui.sso.UiSSO$Error$InvalidMFAParams
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U9.AbstractC3618e.c(Eb.z):U9.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Eb.w wVar) {
        return "MFA Auth has unknown state - " + wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        return "MFA no primary method received, choosing the first one in the list";
    }
}
