package y5;

import X0.C1638a;
import a1.C1643a;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.util.ProcessUtils;
import f9.InterfaceC4350h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.x;
import p9.l;
import w5.C5727b;
import w5.s;

/* compiled from: SessionsSettings.kt */
/* renamed from: y5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5810e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f48160c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Z0.b f48161d = B7.d.x(s.f47442b, new Y0.b(a.f48164g));

    /* renamed from: a, reason: collision with root package name */
    public final F3.f f48162a;

    /* renamed from: b, reason: collision with root package name */
    public final C5806a f48163b;

    /* compiled from: SessionsSettings.kt */
    /* renamed from: y5.e$a */
    public static final class a extends m implements l<C1638a, a1.d> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f48164g = new a(1);

        @Override // p9.l
        public final a1.d invoke(C1638a c1638a) {
            String myProcessName;
            C1638a ex = c1638a;
            kotlin.jvm.internal.l.f(ex, "ex");
            StringBuilder sb = new StringBuilder("CorruptionException in settings DataStore in ");
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                myProcessName = Process.myProcessName();
                kotlin.jvm.internal.l.e(myProcessName, "myProcessName()");
            } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
                myProcessName = "";
            }
            sb.append(myProcessName);
            sb.append('.');
            Log.w("SessionsSettings", sb.toString(), ex);
            return new C1643a(true, (int) (true ? 1 : 0));
        }
    }

    /* compiled from: SessionsSettings.kt */
    /* renamed from: y5.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w9.i<Object>[] f48165a;

        static {
            r rVar = new r(b.class);
            x.f43661a.getClass();
            f48165a = new w9.i[]{rVar};
        }
    }

    public C5810e(B4.e eVar, InterfaceC4350h interfaceC4350h, InterfaceC4350h interfaceC4350h2, h5.c cVar) {
        eVar.a();
        Context context = eVar.f487a;
        kotlin.jvm.internal.l.e(context, "firebaseApp.applicationContext");
        w5.x.f47477a.getClass();
        C5727b c5727bA = w5.x.a(eVar);
        kotlin.jvm.internal.l.f(context, "context");
        F3.f fVar = new F3.f();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        fVar.f1607b = bundle == null ? Bundle.EMPTY : bundle;
        C5808c c5808c = new C5808c(c5727bA, interfaceC4350h);
        f48160c.getClass();
        C5806a c5806a = new C5806a(interfaceC4350h2, cVar, c5727bA, c5808c, (X0.h) f48161d.a(context, b.f48165a[0]));
        this.f48162a = fVar;
        this.f48163b = c5806a;
    }

    public final double a() {
        Bundle bundle = (Bundle) this.f48162a.f1607b;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        C5809d c5809d = this.f48163b.b().f48176b;
        if (c5809d == null) {
            kotlin.jvm.internal.l.l("sessionConfigs");
            throw null;
        }
        Double d10 = c5809d.f48156b;
        if (d10 != null) {
            double dDoubleValue2 = d10.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r6.d(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(h9.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof y5.C5811f
            if (r0 == 0) goto L13
            r0 = r6
            y5.f r0 = (y5.C5811f) r0
            int r1 = r0.f48169o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48169o = r1
            goto L18
        L13:
            y5.f r0 = new y5.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f48167m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f48169o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            b9.n.b(r6)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            y5.e r2 = r0.f48166l
            b9.n.b(r6)
            goto L4a
        L38:
            b9.n.b(r6)
            r0.f48166l = r5
            r0.f48169o = r4
            F3.f r6 = r5.f48162a
            r6.getClass()
            b9.A r6 = b9.C1992A.f18074a
            if (r6 != r1) goto L49
            goto L57
        L49:
            r2 = r5
        L4a:
            y5.a r6 = r2.f48163b
            r2 = 0
            r0.f48166l = r2
            r0.f48169o = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.C5810e.b(h9.c):java.lang.Object");
    }
}
