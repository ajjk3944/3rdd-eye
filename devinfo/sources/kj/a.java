package kj;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements aj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28340a;

    /* renamed from: b, reason: collision with root package name */
    public long f28341b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28342c;

    public a(int i4) {
        this.f28340a = i4;
        switch (i4) {
            case 1:
                this.f28341b = 0L;
                this.f28342c = new ArrayList();
                break;
            case 2:
                this.f28341b = 0L;
                this.f28342c = new ArrayList();
                break;
            default:
                this.f28342c = new ArrayList();
                this.f28341b = 0L;
                break;
        }
    }

    @Override // aj.a
    public final void a(long j, boolean z3, aj.b bVar) {
        switch (this.f28340a) {
            case 0:
                this.f28341b += j;
                if (z3) {
                    bVar.e(this);
                    ArrayList arrayList = this.f28342c;
                    int iIndexOf = arrayList.indexOf(bVar);
                    if (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
                        arrayList.remove(iIndexOf);
                        break;
                    }
                }
                break;
            case 1:
                this.f28341b += j;
                if (z3) {
                    bVar.e(this);
                    this.f28342c.remove(bVar);
                    break;
                }
                break;
            default:
                this.f28341b += j;
                if (z3) {
                    bVar.e(this);
                    this.f28342c.remove(bVar);
                    break;
                }
                break;
        }
    }
}
