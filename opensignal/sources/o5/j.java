package o5;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j extends a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18966a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Handler f18967b;

    /* renamed from: c, reason: collision with root package name */
    public b5.b0 f18968c;

    public abstract z a(Object obj, z zVar);

    public abstract void d(Object obj, a aVar, androidx.media3.common.a1 a1Var);

    @Override // o5.a
    public final void disableInternal() {
        for (i iVar : this.f18966a.values()) {
            iVar.f18961a.disable(iVar.f18962b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o5.a0, o5.h] */
    public final void e(final Object obj, b0 b0Var) {
        HashMap map = this.f18966a;
        a5.a.e(!map.containsKey(obj));
        ?? r12 = new a0() { // from class: o5.h
            @Override // o5.a0
            public final void a(a aVar, androidx.media3.common.a1 a1Var) {
                this.f18951a.d(obj, aVar, a1Var);
            }
        };
        js.e eVar = new js.e(this, obj);
        map.put(obj, new i(b0Var, r12, eVar));
        Handler handler = this.f18967b;
        handler.getClass();
        b0Var.addEventListener(handler, eVar);
        Handler handler2 = this.f18967b;
        handler2.getClass();
        b0Var.addDrmEventListener(handler2, eVar);
        b0Var.prepareSource(r12, this.f18968c, getPlayerId());
        if (isEnabled()) {
            return;
        }
        b0Var.disable(r12);
    }

    @Override // o5.a
    public final void enableInternal() {
        for (i iVar : this.f18966a.values()) {
            iVar.f18961a.enable(iVar.f18962b);
        }
    }

    @Override // o5.b0
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.f18966a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).f18961a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // o5.a
    public void releaseSourceInternal() {
        HashMap map = this.f18966a;
        for (i iVar : map.values()) {
            b0 b0Var = iVar.f18961a;
            js.e eVar = iVar.f18963c;
            b0Var.releaseSource(iVar.f18962b);
            b0Var.removeEventListener(eVar);
            b0Var.removeDrmEventListener(eVar);
        }
        map.clear();
    }

    public long b(Object obj, long j) {
        return j;
    }

    public int c(int i10, Object obj) {
        return i10;
    }
}
