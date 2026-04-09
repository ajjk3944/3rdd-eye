package y6;

import android.os.Build;
import b7.r;
import nk.k;
import t6.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z6.f fVar, int i4) {
        super(fVar);
        this.f37348b = i4;
        switch (i4) {
            case 2:
                k.e(fVar, "tracker");
                super(fVar);
                this.f37349c = 7;
                break;
            case 3:
                k.e(fVar, "tracker");
                super(fVar);
                this.f37349c = 7;
                break;
            case 4:
                k.e(fVar, "tracker");
                super(fVar);
                this.f37349c = 9;
                break;
            default:
                k.e(fVar, "tracker");
                this.f37349c = 6;
                break;
        }
    }

    @Override // y6.d
    public final boolean a(r rVar) {
        switch (this.f37348b) {
            case 0:
                k.e(rVar, "workSpec");
                return rVar.j.f34336c;
            case 1:
                k.e(rVar, "workSpec");
                return rVar.j.f34338e;
            case 2:
                k.e(rVar, "workSpec");
                return rVar.j.f34334a == w.f34402b;
            case 3:
                k.e(rVar, "workSpec");
                w wVar = rVar.j.f34334a;
                return wVar == w.f34403c || (Build.VERSION.SDK_INT >= 30 && wVar == w.f34406f);
            default:
                k.e(rVar, "workSpec");
                return rVar.j.f34339f;
        }
    }

    @Override // y6.b
    public final int d() {
        switch (this.f37348b) {
        }
        return this.f37349c;
    }

    @Override // y6.b
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.f37348b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                x6.e eVar = (x6.e) obj;
                k.e(eVar, "value");
                boolean z3 = eVar.f36980a;
                return Build.VERSION.SDK_INT < 26 ? !z3 : !(z3 && eVar.f36981b);
            case 3:
                x6.e eVar2 = (x6.e) obj;
                k.e(eVar2, "value");
                return !eVar2.f36980a || eVar2.f36982c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z6.a aVar) {
        super(aVar);
        this.f37348b = 1;
        k.e(aVar, "tracker");
        this.f37349c = 5;
    }
}
