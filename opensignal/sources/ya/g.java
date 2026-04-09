package ya;

import android.os.Handler;
import com.google.android.exoplayer2.w1;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class g extends a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f26063a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Handler f26064b;

    /* renamed from: c, reason: collision with root package name */
    public pb.u0 f26065c;

    public abstract v a(Object obj, v vVar);

    public abstract void b(Object obj, a aVar, w1 w1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ya.e, ya.w] */
    public final void c(final Integer num, x xVar) {
        HashMap map = this.f26063a;
        qb.b.g(!map.containsKey(num));
        ?? r12 = new w() { // from class: ya.e
            @Override // ya.w
            public final void a(a aVar, w1 w1Var) {
                this.f26050a.b(num, aVar, w1Var);
            }
        };
        js.e eVar = new js.e(this, num);
        map.put(num, new f(xVar, r12, eVar));
        Handler handler = this.f26064b;
        handler.getClass();
        xVar.addEventListener(handler, eVar);
        Handler handler2 = this.f26064b;
        handler2.getClass();
        xVar.addDrmEventListener(handler2, eVar);
        xVar.prepareSource(r12, this.f26065c);
        if (isEnabled()) {
            return;
        }
        xVar.disable(r12);
    }

    @Override // ya.a
    public final void disableInternal() {
        for (f fVar : this.f26063a.values()) {
            fVar.f26054a.disable(fVar.f26055b);
        }
    }

    @Override // ya.a
    public final void enableInternal() {
        for (f fVar : this.f26063a.values()) {
            fVar.f26054a.enable(fVar.f26055b);
        }
    }

    @Override // ya.a
    public void releaseSourceInternal() {
        HashMap map = this.f26063a;
        for (f fVar : map.values()) {
            x xVar = fVar.f26054a;
            js.e eVar = fVar.f26056c;
            xVar.releaseSource(fVar.f26055b);
            xVar.removeEventListener(eVar);
            xVar.removeDrmEventListener(eVar);
        }
        map.clear();
    }
}
