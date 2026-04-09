package v0;

import n0.f1;
import n0.j2;

/* loaded from: classes.dex */
public final class h extends s0.c implements f1 {

    /* renamed from: r, reason: collision with root package name */
    public static final h f23748r = new h(s0.k.f21840e, 0);

    public final h b(androidx.compose.runtime.d dVar, j2 j2Var) {
        ag.b bVarU = this.f21826a.u(dVar.hashCode(), dVar, j2Var, 0);
        return bVarU == null ? this : new h((s0.k) bVarU.f346g, this.f21827d + bVarU.f345d);
    }

    @Override // s0.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return super.containsKey((androidx.compose.runtime.d) obj);
        }
        return false;
    }

    @Override // mq.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof j2) {
            return super.containsValue((j2) obj);
        }
        return false;
    }

    @Override // s0.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return (j2) super.get((androidx.compose.runtime.d) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof androidx.compose.runtime.d) ? obj2 : (j2) super.getOrDefault((androidx.compose.runtime.d) obj, (j2) obj2);
    }
}
