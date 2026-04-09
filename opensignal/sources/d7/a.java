package d7;

import android.net.Uri;
import android.view.InputEvent;
import ba.m;
import br.l;
import cq.h;
import e7.e;
import e7.f;
import e7.g;
import pq.c;
import re.b;
import wt.d0;
import wt.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f7146a;

    public a(e eVar) {
        this.f7146a = eVar;
    }

    public b a(e7.a aVar) {
        l.e(aVar, "deletionRequest");
        throw null;
    }

    public b b() {
        return m.c(w.d(w.b(d0.f24610a), new h(this, null, 1)));
    }

    public b c(Uri uri, InputEvent inputEvent) {
        l.e(uri, "attributionSource");
        return m.c(w.d(w.b(d0.f24610a), new au.e(this, uri, inputEvent, null, 5)));
    }

    public b d(f fVar) {
        l.e(fVar, "request");
        throw null;
    }

    public b e(Uri uri) {
        l.e(uri, "trigger");
        return m.c(w.d(w.b(d0.f24610a), new a8.h(this, uri, (c) null, 9)));
    }

    public b f(g gVar) {
        l.e(gVar, "request");
        throw null;
    }

    public b g(e7.h hVar) {
        l.e(hVar, "request");
        throw null;
    }
}
