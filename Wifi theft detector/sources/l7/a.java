package l7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f23181a;

    /* renamed from: b, reason: collision with root package name */
    public Context f23182b;

    /* renamed from: c, reason: collision with root package name */
    public d7.c f23183c;

    /* renamed from: d, reason: collision with root package name */
    public k7.a f23184d;

    /* renamed from: e, reason: collision with root package name */
    public b f23185e;

    /* renamed from: f, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.c f23186f;

    public a(Context context, d7.c cVar, k7.a aVar, com.unity3d.scar.adapter.common.c cVar2) {
        this.f23182b = context;
        this.f23183c = cVar;
        this.f23184d = aVar;
        this.f23186f = cVar2;
    }

    public void a(d7.b bVar) {
        AdRequest adRequestB = this.f23184d.b(this.f23183c.a());
        if (bVar != null) {
            this.f23185e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    public abstract void b(AdRequest adRequest, d7.b bVar);

    public void c(Object obj) {
        this.f23181a = obj;
    }
}
