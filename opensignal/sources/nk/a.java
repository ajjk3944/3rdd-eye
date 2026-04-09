package nk;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f18343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f18344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f18345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f18346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Type f18347e;

    public a(d dVar, r rVar, j0 j0Var, d dVar2, Set set, Type type) {
        this.f18343a = dVar;
        this.f18344b = rVar;
        this.f18345c = dVar2;
        this.f18346d = set;
        this.f18347e = type;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) throws IOException {
        d dVar = this.f18345c;
        if (dVar == null) {
            return this.f18344b.fromJson(wVar);
        }
        if (!dVar.f18365g && wVar.f0() == v.NULL) {
            wVar.Y();
            return null;
        }
        try {
            return dVar.b(wVar);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new bf.n(cause + " at " + wVar.q(), cause);
        }
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) throws IOException {
        d dVar = this.f18343a;
        if (dVar == null) {
            this.f18344b.toJson(c0Var, obj);
            return;
        }
        if (!dVar.f18365g && obj == null) {
            c0Var.G();
            return;
        }
        try {
            dVar.d(c0Var, obj);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new bf.n(cause + " at " + c0Var.w(), cause);
        }
    }

    public final String toString() {
        return "JsonAdapter" + this.f18346d + "(" + this.f18347e + ")";
    }
}
