package R3;

import S3.p;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import p4.C2779f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k f3405a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3406b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3407c;

    public d(k kVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f3405a = kVar;
        this.f3406b = cVar;
        this.f3407c = context;
    }

    public final c3.j a() {
        String packageName = this.f3407c.getPackageName();
        k kVar = this.f3405a;
        p pVar = kVar.f3421a;
        if (pVar != null) {
            k.f3419e.f("requestUpdateInfo(%s)", packageName);
            c3.f fVar = new c3.f();
            pVar.a().post(new g(pVar, fVar, fVar, new g(kVar, fVar, packageName, fVar), 2));
            return fVar.f5902a;
        }
        B2.a aVar = k.f3419e;
        Object[] objArr = {-9};
        aVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", B2.a.g(aVar.f521b, "onError(%d)", objArr));
        }
        return com.bumptech.glide.d.r(new K2.j(-9));
    }

    public final synchronized void b(C2779f c2779f) {
        this.f3406b.a(c2779f);
    }
}
