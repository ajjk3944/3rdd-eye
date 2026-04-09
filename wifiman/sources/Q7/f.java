package Q7;

import Sj.a;
import kotlin.jvm.internal.AbstractC6492s;
import ve.g;

/* loaded from: classes3.dex */
public final class f extends a.c {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a f19236b;

    /* renamed from: c, reason: collision with root package name */
    private final S7.e f19237c;

    /* renamed from: d, reason: collision with root package name */
    private final g f19238d;

    public f(com.google.firebase.crashlytics.a crashlytics, S7.e sensitiveLogMasker, g fileLog) {
        AbstractC6492s.i(crashlytics, "crashlytics");
        AbstractC6492s.i(sensitiveLogMasker, "sensitiveLogMasker");
        AbstractC6492s.i(fileLog, "fileLog");
        this.f19236b = crashlytics;
        this.f19237c = sensitiveLogMasker;
        this.f19238d = fileLog;
    }

    private final String q(int i10) {
        switch (i10) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "WARN";
            case 6:
                return "ERROR";
            case 7:
                return "ASSERT";
            default:
                return "NO_PRIORITY";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @Override // Sj.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void l(int r6, java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
        /*
            r5 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.AbstractC6492s.i(r8, r0)
            com.google.firebase.crashlytics.a r0 = r5.f19236b
            java.lang.String r1 = r5.q(r6)
            if (r7 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r3 = " - "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L23
        L21:
            java.lang.String r2 = ""
        L23:
            S7.e r3 = r5.f19237c
            java.lang.String r3 = r3.a(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ": "
            r4.append(r1)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r0.e(r1)
            ve.g r0 = r5.f19238d
            r0.a(r6, r7, r8)
            r7 = 6
            if (r6 == r7) goto L4f
            r7 = 7
            if (r6 == r7) goto L4f
            goto L61
        L4f:
            if (r9 != 0) goto L5c
            com.google.firebase.crashlytics.a r6 = r5.f19236b
            java.lang.Exception r7 = new java.lang.Exception
            r7.<init>(r8)
            r6.f(r7)
            goto L61
        L5c:
            com.google.firebase.crashlytics.a r6 = r5.f19236b
            r6.f(r9)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.f.l(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }
}
