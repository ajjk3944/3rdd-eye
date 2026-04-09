package f4;

import android.content.Context;
import androidx.lifecycle.p;
import br.l;
import g4.k;
import java.util.Set;
import kc.f;
import lq.q;
import mq.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p f8434a;

    /* renamed from: b, reason: collision with root package name */
    public final k f8435b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8436c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8437d;

    /* renamed from: e, reason: collision with root package name */
    public final q f8438e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f8439f;

    public c(Context context, String str, Set set, p pVar, k kVar) {
        l.e(context, "context");
        l.e(str, "sharedPreferencesName");
        l.e(set, "keysToMigrate");
        ah.d dVar = new ah.d(context, 14, str);
        this.f8434a = pVar;
        this.f8435b = kVar;
        this.f8436c = context;
        this.f8437d = str;
        this.f8438e = f.F(dVar);
        this.f8439f = set == d.f8440a ? null : o.T0(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, rq.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f4.b
            if (r0 == 0) goto L13
            r0 = r6
            f4.b r0 = (f4.b) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            f4.b r0 = new f4.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8432x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            f4.c r5 = r0.f8431r
            lf.t1.G(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            lf.t1.G(r6)
            r0.f8431r = r4
            r0.B = r3
            androidx.lifecycle.p r6 = r4.f8434a
            java.lang.Object r6 = r6.w(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            java.util.Set r6 = r5.f8439f
            lq.q r5 = r5.f8438e
            r0 = 0
            if (r6 != 0) goto L6c
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            br.l.d(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6a
            goto L98
        L6a:
            r3 = r0
            goto L98
        L6c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6a
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.a(java.lang.Object, rq.c):java.lang.Object");
    }
}
