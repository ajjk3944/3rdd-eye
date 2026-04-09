package e4;

import android.content.ClipData;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import com.google.android.gms.internal.measurement.d5;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22316a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22317b;

    public d() {
        this.f22316a = 2;
        this.f22317b = u0.q.r(Boolean.FALSE);
    }

    @Override // e4.e
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.f22317b).setLinkUri(uri);
    }

    @Override // e4.e
    public void b(int i4) {
        ((ContentInfo.Builder) this.f22317b).setFlags(i4);
    }

    @Override // e4.e
    public h build() {
        return new h(new d(((ContentInfo.Builder) this.f22317b).build()));
    }

    public void c(j2.r rVar, p2.r rVar2, ck.h hVar, Consumer consumer) {
        w0.e eVar = new w0.e(new o2.i[16]);
        d5.z(rVar2.a(), 0, new o2.h(1, 8, w0.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
        zj.m.d0(eVar.f36397a, new bk.a(0, new mk.c[]{o2.b.f30385c, o2.b.f30386d}), 0, eVar.f36399c);
        int i4 = eVar.f36399c;
        o2.i iVar = (o2.i) (i4 == 0 ? null : eVar.f36397a[i4 - 1]);
        if (iVar == null) {
            return;
        }
        d3.j jVar = iVar.f30404c;
        o2.c cVar = new o2.c(iVar.f30402a, jVar, xk.x.b(hVar), this, rVar);
        i2.d1 d1Var = iVar.f30405d;
        long j = (jVar.f21961a << 32) | (jVar.f21962b & 4294967295L);
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(rVar, p1.z.t(jm.a.x(g2.n0.f(d1Var).r(d1Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), cVar);
        scrollCaptureTarget.setScrollBounds(p1.z.t(jVar));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // e4.g
    public int e() {
        return ((ContentInfo) this.f22317b).getSource();
    }

    @Override // e4.g
    public ClipData f() {
        return ((ContentInfo) this.f22317b).getClip();
    }

    @Override // e4.g
    public int g() {
        return ((ContentInfo) this.f22317b).getFlags();
    }

    @Override // e4.g
    public ContentInfo h() {
        return (ContentInfo) this.f22317b;
    }

    @Override // e4.e
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f22317b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f22316a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f22317b) + "}";
            default:
                return super.toString();
        }
    }

    public d(ContentInfo contentInfo) {
        this.f22316a = 1;
        contentInfo.getClass();
        this.f22317b = contentInfo;
    }

    public d(ClipData clipData, int i4) {
        this.f22316a = 0;
        this.f22317b = c.b(clipData, i4);
    }
}
