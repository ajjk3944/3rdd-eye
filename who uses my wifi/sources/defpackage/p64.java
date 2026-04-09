package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p64 {
    public static final p64 c = new p64();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final vg0 a = new vg0(1);

    public final v64 a(Class cls) {
        v64 v64VarZ;
        Charset charset = y54.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        v64 v64Var = (v64) concurrentHashMap.get(cls);
        if (v64Var != null) {
            return v64Var;
        }
        vg0 vg0Var = this.a;
        vg0Var.getClass();
        pz pzVar = w64.a;
        if (!p54.class.isAssignableFrom(cls)) {
            int i = u44.a;
        }
        r64 r64VarJ = ((rc3) vg0Var.g).j(cls);
        if ((r64VarJ.d & 2) == 2) {
            int i2 = u44.a;
            pz pzVar2 = w64.a;
            t24 t24Var = j54.a;
            v64VarZ = new l64(pzVar2, r64VarJ.a);
        } else {
            int i3 = u44.a;
            int i4 = m64.a;
            int i5 = d64.a;
            pz pzVar3 = w64.a;
            t24 t24Var2 = r64VarJ.a() + (-1) != 1 ? j54.a : null;
            int i6 = h64.a;
            v64VarZ = k64.z(r64VarJ, pzVar3, t24Var2);
        }
        v64 v64Var2 = (v64) concurrentHashMap.putIfAbsent(cls, v64VarZ);
        return v64Var2 != null ? v64Var2 : v64VarZ;
    }
}
