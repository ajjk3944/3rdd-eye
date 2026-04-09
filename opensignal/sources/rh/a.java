package rh;

import android.net.Uri;
import br.l;
import o5.q;
import oh.j;

/* loaded from: classes.dex */
public final class a implements oh.c {

    /* renamed from: a, reason: collision with root package name */
    public final q f21532a;

    public a(q qVar) {
        l.e(qVar, "loadEventInfoDelegate");
        this.f21532a = qVar;
    }

    @Override // oh.c
    public final long A() {
        return this.f21532a.f19028c;
    }

    @Override // oh.c
    public final long N() {
        return this.f21532a.f19027b;
    }

    @Override // oh.c
    public final j b() {
        Uri uri = this.f21532a.f19026a.f2443a;
        l.d(uri, "uri");
        return new j(uri);
    }

    @Override // oh.c
    public final long w() {
        return this.f21532a.f19029d;
    }
}
