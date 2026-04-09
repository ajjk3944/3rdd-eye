package ea;

import a0.x0;
import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f22512e;

    /* renamed from: a, reason: collision with root package name */
    public final na.a f22513a;

    /* renamed from: b, reason: collision with root package name */
    public final na.a f22514b;

    /* renamed from: c, reason: collision with root package name */
    public final ja.b f22515c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f22516d;

    public q(na.a aVar, na.a aVar2, ja.b bVar, com.google.android.gms.internal.consent_sdk.d dVar, x0 x0Var) {
        this.f22513a = aVar;
        this.f22514b = aVar2;
        this.f22515c = bVar;
        this.f22516d = dVar;
        ((Executor) x0Var.f148e).execute(new ig.l(5, x0Var));
    }

    public static q a() {
        j jVar = f22512e;
        if (jVar != null) {
            return (q) jVar.f22502f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f22512e == null) {
            synchronized (q.class) {
                try {
                    if (f22512e == null) {
                        b8.e eVar = new b8.e();
                        context.getClass();
                        eVar.f2078a = context;
                        f22512e = eVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final p c(k kVar) {
        byte[] bytes;
        Set setUnmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(ca.a.f2821d) : Collections.singleton(new ba.b("proto"));
        yb.e eVarA = i.a();
        kVar.getClass();
        eVarA.f37509b = "cct";
        ca.a aVar = (ca.a) kVar;
        String str = aVar.f2824a;
        String str2 = aVar.f2825b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = u.u("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        eVarA.f37510c = bytes;
        return new p(setUnmodifiableSet, eVarA.i(), this);
    }
}
