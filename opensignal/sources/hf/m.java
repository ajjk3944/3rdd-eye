package hf;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10682a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f10683d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ al.b f10684g;

    public /* synthetic */ m(q qVar, al.b bVar, int i10) {
        this.f10682a = i10;
        this.f10683d = qVar;
        this.f10684g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f10682a) {
            case 0:
                this.f10683d.a(this.f10684g);
                break;
            default:
                this.f10683d.a(this.f10684g);
                break;
        }
    }
}
