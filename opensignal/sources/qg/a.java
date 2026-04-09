package qg;

import ef.b;
import sg.d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20902a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f20903d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f20904g;

    public /* synthetic */ a(b bVar, d dVar, int i10) {
        this.f20902a = i10;
        this.f20903d = bVar;
        this.f20904g = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20902a) {
            case 0:
                this.f20903d.a(this.f20904g);
                break;
            default:
                this.f20903d.a(this.f20904g);
                break;
        }
    }
}
