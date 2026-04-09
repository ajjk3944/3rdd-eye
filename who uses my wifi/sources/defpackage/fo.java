package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fo implements hu0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final py c;

    public /* synthetic */ fo(int i, dy dyVar, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = dyVar;
    }

    @Override // defpackage.hu0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new eo(this);
            case 1:
                return new wy(this);
            default:
                return new r21(this);
        }
    }

    public fo(CharSequence charSequence, fa0 fa0Var) {
        this.a = 0;
        i30.m(charSequence, "input");
        this.b = charSequence;
        this.c = fa0Var;
    }
}
