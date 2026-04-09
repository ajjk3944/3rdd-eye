package c;

import c5.C0412i;

/* renamed from: c.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363C extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0371K f5787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0363C(C0371K c0371k, int i) {
        super(0);
        this.f5786b = i;
        this.f5787c = c0371k;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f5786b) {
            case 0:
                this.f5787c.c();
                break;
            case 1:
                this.f5787c.b();
                break;
            default:
                this.f5787c.c();
                break;
        }
        return C0412i.f5929a;
    }
}
