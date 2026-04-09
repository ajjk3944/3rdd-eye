package dj;

import android.content.Context;
import br.l;
import cj.n;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7386a;

    /* renamed from: d, reason: collision with root package name */
    public final String f7387d;

    public b(ch.d dVar, String str) {
        l.e(dVar, "serviceLocator");
        l.e(str, "apiKey");
        this.f7386a = dVar;
        this.f7387d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f7386a, bVar.f7386a) && l.a(this.f7387d, bVar.f7387d);
    }

    public final int hashCode() {
        return this.f7387d.hashCode() + (this.f7386a.hashCode() * 31);
    }

    @Override // cj.n
    public final void run() {
        ch.n.b("InitialiseSdkCommand", "running InitialiseSdkCommand command");
        String str = this.f7387d;
        if (str.length() <= 0) {
            ch.n.c("InitialiseSdkCommand", "API key provided is Empty, returning.");
            return;
        }
        Context contextD = this.f7386a.d();
        ch.n.b("InitialiseSdkCommand", "DEVICE_ID_TIME: ".concat(ah.f.a(contextD)));
        mj.g.g0(contextD, str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InitialiseSdkCommand(serviceLocator=");
        sb2.append(this.f7386a);
        sb2.append(", apiKey=");
        return h0.b.r(sb2, this.f7387d, ')');
    }
}
