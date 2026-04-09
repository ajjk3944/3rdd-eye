package D4;

import D4.a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4371i1;
import com.google.firebase.f;
import d5.AbstractC5302a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class b implements D4.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile D4.a f2885c;

    /* renamed from: a, reason: collision with root package name */
    private final J3.a f2886a;

    /* renamed from: b, reason: collision with root package name */
    final Map f2887b;

    class a implements a.InterfaceC0141a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f2888a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ b f2889b;

        a(b bVar, String str) {
            this.f2888a = str;
            this.f2889b = bVar;
        }
    }

    private b(J3.a aVar) {
        AbstractC7901p.l(aVar);
        this.f2886a = aVar;
        this.f2887b = new ConcurrentHashMap();
    }

    public static D4.a c(f fVar, Context context, d5.d dVar) {
        AbstractC7901p.l(fVar);
        AbstractC7901p.l(context);
        AbstractC7901p.l(dVar);
        AbstractC7901p.l(context.getApplicationContext());
        if (f2885c == null) {
            synchronized (b.class) {
                try {
                    if (f2885c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.a(com.google.firebase.b.class, new Executor() { // from class: D4.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new d5.b() { // from class: D4.d
                                @Override // d5.b
                                public final void a(AbstractC5302a abstractC5302a) {
                                    b.d(abstractC5302a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f2885c = new b(C4371i1.f(context, null, null, null, bundle).x());
                    }
                } finally {
                }
            }
        }
        return f2885c;
    }

    static /* synthetic */ void d(AbstractC5302a abstractC5302a) {
        throw null;
    }

    private final boolean e(String str) {
        return (str.isEmpty() || !this.f2887b.containsKey(str) || this.f2887b.get(str) == null) ? false : true;
    }

    @Override // D4.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.f(str) && com.google.firebase.analytics.connector.internal.a.c(str2, bundle) && com.google.firebase.analytics.connector.internal.a.d(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.a.b(str, str2, bundle);
            this.f2886a.a(str, str2, bundle);
        }
    }

    @Override // D4.a
    public a.InterfaceC0141a b(String str, a.b bVar) {
        AbstractC7901p.l(bVar);
        if (!com.google.firebase.analytics.connector.internal.a.f(str) || e(str)) {
            return null;
        }
        J3.a aVar = this.f2886a;
        Object dVar = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.d(aVar, bVar) : "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(aVar, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f2887b.put(str, dVar);
        return new a(this, str);
    }
}
