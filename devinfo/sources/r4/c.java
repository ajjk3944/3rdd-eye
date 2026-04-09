package r4;

import android.content.Context;
import androidx.lifecycle.u;
import java.util.Set;
import nk.k;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final u f32800a;

    /* renamed from: b, reason: collision with root package name */
    public final dh.e f32801b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f32802c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32803d;

    /* renamed from: e, reason: collision with root package name */
    public final n f32804e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f32805f;

    public c(Context context, String str, Set set, u uVar, dh.e eVar) {
        k.e(context, "context");
        k.e(str, "sharedPreferencesName");
        k.e(set, "keysToMigrate");
        c2.c cVar = new c2.c(17, context, str);
        this.f32800a = uVar;
        this.f32801b = eVar;
        this.f32802c = context;
        this.f32803d = str;
        this.f32804e = a.a.u(cVar);
        this.f32805f = set == d.f32806a ? null : zj.n.u0(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, ek.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof r4.b
            if (r0 == 0) goto L13
            r0 = r6
            r4.b r0 = (r4.b) r0
            int r1 = r0.f32799d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32799d = r1
            goto L18
        L13:
            r4.b r0 = new r4.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f32797b
            int r1 = r0.f32799d
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            r4.c r5 = r0.f32796a
            ci.b.D(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ci.b.D(r6)
            r0.f32796a = r4
            r0.f32799d = r2
            androidx.lifecycle.u r6 = r4.f32800a
            java.lang.Object r6 = r6.invoke(r5, r0)
            dk.a r5 = dk.a.f22275a
            if (r6 != r5) goto L41
            return r5
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            java.util.Set r6 = r5.f32805f
            yj.n r5 = r5.f32804e
            r0 = 0
            if (r6 != 0) goto L6c
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            nk.k.d(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6a
            goto L98
        L6a:
            r2 = r0
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
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.c.a(java.lang.Object, ek.c):java.lang.Object");
    }
}
