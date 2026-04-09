package f7;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.e;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.j;
import com.unity3d.scar.adapter.common.k;
import h7.g;

/* loaded from: classes3.dex */
public class a extends j implements e {

    /* renamed from: e, reason: collision with root package name */
    public g7.a f21152e;

    /* renamed from: f7.a$a, reason: collision with other inner class name */
    public class RunnableC0395a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h7.e f21153a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d7.c f21154b;

        /* renamed from: f7.a$a$a, reason: collision with other inner class name */
        public class C0396a implements d7.b {
            public C0396a() {
            }

            @Override // d7.b
            public void onAdLoaded() {
                a.this.f20103b.put(RunnableC0395a.this.f21154b.c(), RunnableC0395a.this.f21153a);
            }
        }

        public RunnableC0395a(h7.e eVar, d7.c cVar) {
            this.f21153a = eVar;
            this.f21154b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21153a.a(new C0396a());
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f21157a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d7.c f21158b;

        /* renamed from: f7.a$b$a, reason: collision with other inner class name */
        public class C0397a implements d7.b {
            public C0397a() {
            }

            @Override // d7.b
            public void onAdLoaded() {
                a.this.f20103b.put(b.this.f21158b.c(), b.this.f21157a);
            }
        }

        public b(g gVar, d7.c cVar) {
            this.f21157a = gVar;
            this.f21158b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21157a.a(new C0397a());
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h7.c f21161a;

        public c(h7.c cVar) {
            this.f21161a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21161a.a(null);
        }
    }

    public a(com.unity3d.scar.adapter.common.c cVar, String str) {
        super(cVar);
        g7.a aVar = new g7.a(new c7.a(str));
        this.f21152e = aVar;
        this.f20102a = new i7.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void d(Context context, RelativeLayout relativeLayout, d7.c cVar, int i10, int i11, f fVar) {
        k.a(new c(new h7.c(context, relativeLayout, this.f21152e, cVar, i10, i11, this.f20105d, fVar)));
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void e(Context context, d7.c cVar, h hVar) {
        k.a(new b(new g(context, this.f21152e, cVar, this.f20105d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void f(Context context, d7.c cVar, com.unity3d.scar.adapter.common.g gVar) {
        k.a(new RunnableC0395a(new h7.e(context, this.f21152e, cVar, this.f20105d, gVar), cVar));
    }
}
