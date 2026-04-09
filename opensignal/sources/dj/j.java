package dj;

import br.l;
import cj.n;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7406a;

    /* renamed from: d, reason: collision with root package name */
    public final String f7407d;

    public j(ch.d dVar, String str) {
        l.e(dVar, "serviceLocator");
        l.e(str, "configJson");
        this.f7406a = dVar;
        this.f7407d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f7406a, jVar.f7406a) && l.a(this.f7407d, jVar.f7407d);
    }

    public final int hashCode() {
        return this.f7407d.hashCode() + (this.f7406a.hashCode() * 31);
    }

    @Override // cj.n
    public final void run() throws Throwable {
        this.f7406a.f().p(this.f7407d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateSdkConfigJsonCommand(serviceLocator=");
        sb2.append(this.f7406a);
        sb2.append(", configJson=");
        return h0.b.r(sb2, this.f7407d, ')');
    }
}
