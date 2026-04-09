package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h42 implements id1 {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fd1 c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ Map e;

    public h42(i42 i42Var, boolean z, fd1 fd1Var, HashMap map, Map map2) {
        this.b = z;
        this.c = fd1Var;
        this.d = map;
        this.e = map2;
        Objects.requireNonNull(i42Var);
        this.a = false;
    }

    @Override // defpackage.id1
    public final void T(boolean z) {
        if (this.a) {
            return;
        }
        fd1 fd1Var = this.c;
        if (z && this.b) {
            ((xp2) fd1Var).s0();
        }
        this.a = true;
        String str = (String) this.e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.d;
        map.put(str, boolValueOf);
        ((l52) fd1Var).a("openIntentAsync", map);
    }

    @Override // defpackage.id1
    public final void c(int i) {
    }
}
