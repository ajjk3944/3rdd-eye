package q5;

import Ai.a;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import o5.C7076A;
import o5.C7081b;
import o5.v;
import o5.w;
import org.snmp4j.mp.PduHandle;
import th.l;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final b f58428c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final ph.c f58429d = Q1.a.b(w.f55442a.b(), new P1.b(a.f58432a), null, null, 12, null);

    /* renamed from: a, reason: collision with root package name */
    private final h f58430a;

    /* renamed from: b, reason: collision with root package name */
    private final h f58431b;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f58432a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R1.d invoke(CorruptionException ex) {
            AbstractC6492s.i(ex, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + v.f55441a.e() + '.', ex);
            return R1.e.a();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ l[] f58433a = {O.i(new H(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final O1.e b(Context context) {
            return (O1.e) f.f58429d.a(context, f58433a[0]);
        }

        public final f c() {
            Object objJ = com.google.firebase.l.a(com.google.firebase.c.f38628a).j(f.class);
            AbstractC6492s.h(objJ, "Firebase.app[SessionsSettings::class.java]");
            return (f) objJ;
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f58434a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58435b;

        /* renamed from: d, reason: collision with root package name */
        int f58437d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58435b = obj;
            this.f58437d |= PduHandle.NONE;
            return f.this.g(this);
        }
    }

    public f(h localOverrideSettings, h remoteSettings) {
        AbstractC6492s.i(localOverrideSettings, "localOverrideSettings");
        AbstractC6492s.i(remoteSettings, "remoteSettings");
        this.f58430a = localOverrideSettings;
        this.f58431b = remoteSettings;
    }

    private final boolean e(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private final boolean f(long j10) {
        return Ai.a.T(j10) && Ai.a.J(j10);
    }

    public final double b() {
        Double dC = this.f58430a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f58431b.c();
        if (dC2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dC2.doubleValue();
        if (e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        Ai.a aVarB = this.f58430a.b();
        if (aVarB != null) {
            long jG0 = aVarB.g0();
            if (f(jG0)) {
                return jG0;
            }
        }
        Ai.a aVarB2 = this.f58431b.b();
        if (aVarB2 != null) {
            long jG02 = aVarB2.g0();
            if (f(jG02)) {
                return jG02;
            }
        }
        a.C0031a c0031a = Ai.a.f849b;
        return Ai.c.s(30, Ai.d.MINUTES);
    }

    public final boolean d() {
        Boolean boolA = this.f58430a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f58431b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(dh.InterfaceC5380e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q5.f.c
            if (r0 == 0) goto L13
            r0 = r6
            q5.f$c r0 = (q5.f.c) r0
            int r1 = r0.f58437d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58437d = r1
            goto L18
        L13:
            q5.f$c r0 = new q5.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58435b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f58437d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2c
            Yg.v.b(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            java.lang.Object r2 = r0.f58434a
            q5.f r2 = (q5.f) r2
            Yg.v.b(r6)
            goto L4e
        L3d:
            Yg.v.b(r6)
            q5.h r6 = r5.f58430a
            r0.f58434a = r5
            r0.f58437d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r2 = r5
        L4e:
            q5.h r6 = r2.f58431b
            r2 = 0
            r0.f58434a = r2
            r0.f58437d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.f.g(dh.e):java.lang.Object");
    }

    private f(Context context, InterfaceC5384i interfaceC5384i, InterfaceC5384i interfaceC5384i2, g5.e eVar, C7081b c7081b) {
        this(new q5.b(context), new q5.c(interfaceC5384i2, eVar, c7081b, new d(c7081b, interfaceC5384i, null, 4, null), f58428c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(com.google.firebase.f firebaseApp, InterfaceC5384i blockingDispatcher, InterfaceC5384i backgroundDispatcher, g5.e firebaseInstallationsApi) {
        AbstractC6492s.i(firebaseApp, "firebaseApp");
        AbstractC6492s.i(blockingDispatcher, "blockingDispatcher");
        AbstractC6492s.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC6492s.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context contextK = firebaseApp.k();
        AbstractC6492s.h(contextK, "firebaseApp.applicationContext");
        this(contextK, blockingDispatcher, backgroundDispatcher, firebaseInstallationsApi, C7076A.f55320a.b(firebaseApp));
    }
}
