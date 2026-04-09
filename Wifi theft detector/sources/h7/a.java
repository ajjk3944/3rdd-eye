package h7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f21415a;

    /* renamed from: b, reason: collision with root package name */
    public Context f21416b;

    /* renamed from: c, reason: collision with root package name */
    public d7.c f21417c;

    /* renamed from: d, reason: collision with root package name */
    public g7.a f21418d;

    /* renamed from: e, reason: collision with root package name */
    public b f21419e;

    /* renamed from: f, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.c f21420f;

    public a(Context context, d7.c cVar, g7.a aVar, com.unity3d.scar.adapter.common.c cVar2) {
        this.f21416b = context;
        this.f21417c = cVar;
        this.f21418d = aVar;
        this.f21420f = cVar2;
    }

    public void a(d7.b bVar) {
        AdRequest adRequestB = this.f21418d.b(this.f21417c.a());
        if (bVar != null) {
            this.f21419e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    public abstract void b(AdRequest adRequest, d7.b bVar);

    public void c(Object obj) {
        this.f21415a = obj;
    }
}
