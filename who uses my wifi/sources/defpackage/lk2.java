package defpackage;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class lk2 implements rn2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ e51 h;
    public final /* synthetic */ a83 i;
    public final /* synthetic */ l83 j;

    public /* synthetic */ lk2(Context context, e51 e51Var, a83 a83Var, l83 l83Var, int i) {
        this.f = i;
        this.g = context;
        this.h = e51Var;
        this.i = a83Var;
        this.j = l83Var;
    }

    @Override // defpackage.rn2
    public final void e() {
        switch (this.f) {
            case 0:
                JSONObject jSONObject = this.i.C;
                hg4.C.o.d(this.g, this.h.f, jSONObject.toString(), this.j.g);
                break;
            default:
                JSONObject jSONObject2 = this.i.C;
                hg4.C.o.d(this.g, this.h.f, jSONObject2.toString(), this.j.g);
                break;
        }
    }
}
