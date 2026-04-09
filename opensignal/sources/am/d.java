package am;

import j4.o;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f858a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f859b;

    /* renamed from: c, reason: collision with root package name */
    public br.k f860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f862e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj) {
        this(true);
        this.f861d = i10;
        this.f862e = obj;
    }

    public void a() {
        switch (this.f861d) {
            case 1:
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.f862e;
                if (androidx.fragment.app.d.K(3)) {
                    Objects.toString(dVar);
                }
                if (androidx.fragment.app.d.K(3)) {
                    Objects.toString(dVar.f1443h);
                }
                o4.a aVar = dVar.f1443h;
                if (aVar != null) {
                    aVar.f18773r = false;
                    aVar.d();
                    o4.a aVar2 = dVar.f1443h;
                    o oVar = new o(11, dVar);
                    if (aVar2.f18771p == null) {
                        aVar2.f18771p = new ArrayList();
                    }
                    aVar2.f18771p.add(oVar);
                    dVar.f1443h.e();
                    dVar.f1444i = true;
                    dVar.A(true);
                    dVar.F();
                    dVar.f1444i = false;
                    dVar.f1443h = null;
                    break;
                }
                break;
        }
    }

    public d(boolean z10) {
        this.f858a = z10;
        this.f859b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(androidx.fragment.app.d dVar) {
        this(false);
        this.f861d = 1;
        this.f862e = dVar;
    }

    public final void b() {
    }
}
