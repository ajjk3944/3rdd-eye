package i2;

import i2.z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements z.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f38388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38390c;

    public /* synthetic */ s(z zVar, int i, int i10) {
        this.f38388a = zVar;
        this.f38389b = i;
        this.f38390c = i10;
    }

    @Override // i2.z.a
    public final void run() {
        z zVar = this.f38388a;
        C4448h c4448h = zVar.f38423b;
        int i = this.f38389b;
        int i10 = this.f38390c;
        if (c4448h == null) {
            zVar.f38429h.add(new s(zVar, i, i10));
        } else {
            zVar.f38424c.j(i, i10 + 0.99f);
        }
    }
}
