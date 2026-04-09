package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oz0 implements Serializable {
    public rx f;
    public volatile Object g = fr.m;
    public final Object h = this;

    public oz0(rx rxVar) {
        this.f = rxVar;
    }

    public final Object a() {
        Object objA;
        Object obj = this.g;
        fr frVar = fr.m;
        if (obj != frVar) {
            return obj;
        }
        synchronized (this.h) {
            objA = this.g;
            if (objA == frVar) {
                rx rxVar = this.f;
                i30.j(rxVar);
                objA = rxVar.a();
                this.g = objA;
                this.f = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.g != fr.m ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
