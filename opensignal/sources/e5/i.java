package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7828a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7829d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o5.q f7830g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o5.v f7831r;

    public /* synthetic */ i(a aVar, o5.q qVar, o5.v vVar, int i10) {
        this.f7828a = i10;
        this.f7829d = aVar;
        this.f7830g = qVar;
        this.f7831r = vVar;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7828a) {
            case 0:
                ((c) obj).onLoadStarted(this.f7829d, this.f7830g, this.f7831r);
                break;
            case 1:
                ((c) obj).onLoadCanceled(this.f7829d, this.f7830g, this.f7831r);
                break;
            default:
                ((c) obj).onLoadCompleted(this.f7829d, this.f7830g, this.f7831r);
                break;
        }
    }
}
