package Y9;

import U9.C1604a;
import U9.H;
import U9.o;
import U9.t;
import Y9.l;
import ba.u;
import java.io.IOException;

/* compiled from: ExchangeFinder.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final j f13827a;

    /* renamed from: b, reason: collision with root package name */
    public final C1604a f13828b;

    /* renamed from: c, reason: collision with root package name */
    public final e f13829c;

    /* renamed from: d, reason: collision with root package name */
    public final o.a f13830d;

    /* renamed from: e, reason: collision with root package name */
    public l.a f13831e;

    /* renamed from: f, reason: collision with root package name */
    public l f13832f;

    /* renamed from: g, reason: collision with root package name */
    public int f13833g;

    /* renamed from: h, reason: collision with root package name */
    public int f13834h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public H f13835j;

    public d(j connectionPool, C1604a c1604a, e call, o.a eventListener) {
        kotlin.jvm.internal.l.f(connectionPool, "connectionPool");
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        this.f13827a = connectionPool;
        this.f13828b = c1604a;
        this.f13829c = call;
        this.f13830d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Y9.g a(int r13, int r14, int r15, boolean r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y9.d.a(int, int, int, boolean, boolean):Y9.g");
    }

    public final boolean b(t url) {
        kotlin.jvm.internal.l.f(url, "url");
        t tVar = this.f13828b.f12604h;
        return url.f12716e == tVar.f12716e && kotlin.jvm.internal.l.b(url.f12715d, tVar.f12715d);
    }

    public final void c(IOException e4) {
        kotlin.jvm.internal.l.f(e4, "e");
        this.f13835j = null;
        if ((e4 instanceof u) && ((u) e4).f18262b == ba.b.REFUSED_STREAM) {
            this.f13833g++;
        } else if (e4 instanceof ba.a) {
            this.f13834h++;
        } else {
            this.i++;
        }
    }
}
