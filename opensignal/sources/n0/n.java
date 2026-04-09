package n0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17225b;

    public /* synthetic */ n(int i10, Object obj) {
        this.f17224a = i10;
        this.f17225b = obj;
    }

    public final void a() {
        switch (this.f17224a) {
            case 0:
                p pVar = (p) this.f17225b;
                pVar.A--;
                break;
            default:
                x0.q qVar = (x0.q) this.f17225b;
                qVar.j--;
                break;
        }
    }

    public final void b() {
        switch (this.f17224a) {
            case 0:
                ((p) this.f17225b).A++;
                break;
            default:
                ((x0.q) this.f17225b).j++;
                break;
        }
    }
}
