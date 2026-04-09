package g2;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f24415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk.c f24416d;

    public t(int i4, int i10, Map map, mk.c cVar) {
        this.f24413a = i4;
        this.f24414b = i10;
        this.f24415c = map;
        this.f24416d = cVar;
    }

    @Override // g2.k0
    public final Map b() {
        return this.f24415c;
    }

    @Override // g2.k0
    public final mk.c d() {
        return this.f24416d;
    }

    @Override // g2.k0
    public final int getHeight() {
        return this.f24414b;
    }

    @Override // g2.k0
    public final int getWidth() {
        return this.f24413a;
    }

    @Override // g2.k0
    public final void c() {
    }
}
