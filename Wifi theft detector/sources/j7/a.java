package j7;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.e;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.j;
import com.unity3d.scar.adapter.common.k;
import l7.g;

/* loaded from: classes3.dex */
public class a extends j implements e {

    /* renamed from: e, reason: collision with root package name */
    public k7.a f21768e;

    /* renamed from: j7.a$a, reason: collision with other inner class name */
    public class RunnableC0421a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l7.e f21769a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d7.c f21770b;

        /* renamed from: j7.a$a$a, reason: collision with other inner class name */
        public class C0422a implements d7.b {
            public C0422a() {
            }

            @Override // d7.b
            public void onAdLoaded() {
                a.this.f20103b.put(RunnableC0421a.this.f21770b.c(), RunnableC0421a.this.f21769a);
            }
        }

        public RunnableC0421a(l7.e eVar, d7.c cVar) {
            this.f21769a = eVar;
            this.f21770b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21769a.a(new C0422a());
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f21773a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d7.c f21774b;

        /* renamed from: j7.a$b$a, reason: collision with other inner class name */
        public class C0423a implements d7.b {
            public C0423a() {
            }

            @Override // d7.b
            public void onAdLoaded() {
                a.this.f20103b.put(b.this.f21774b.c(), b.this.f21773a);
            }
        }

        public b(g gVar, d7.c cVar) {
            this.f21773a = gVar;
            this.f21774b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21773a.a(new C0423a());
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l7.c f21777a;

        public c(l7.c cVar) {
            this.f21777a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21777a.a(null);
        }
    }

    public a(com.unity3d.scar.adapter.common.c cVar, String str) {
        super(cVar);
        k7.a aVar = new k7.a(new c7.a(str));
        this.f21768e = aVar;
        this.f20102a = new m7.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void d(Context context, RelativeLayout relativeLayout, d7.c cVar, int i10, int i11, f fVar) {
        k.a(new c(new l7.c(context, relativeLayout, this.f21768e, cVar, i10, i11, this.f20105d, fVar)));
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void e(Context context, d7.c cVar, h hVar) {
        k.a(new b(new g(context, this.f21768e, cVar, this.f20105d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void f(Context context, d7.c cVar, com.unity3d.scar.adapter.common.g gVar) {
        k.a(new RunnableC0421a(new l7.e(context, this.f21768e, cVar, this.f20105d, gVar), cVar));
    }
}
