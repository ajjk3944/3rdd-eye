package ak;

import java.util.Iterator;
import java.util.NoSuchElementException;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends f implements Iterator, ok.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439e;

    public d(g gVar, int i4) {
        this.f439e = i4;
        k.e(gVar, "map");
        this.f446d = gVar;
        this.f444b = -1;
        this.f445c = gVar.f454h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f439e) {
            case 0:
                b();
                int i4 = this.f443a;
                g gVar = (g) this.f446d;
                if (i4 >= gVar.f453f) {
                    throw new NoSuchElementException();
                }
                this.f443a = i4 + 1;
                this.f444b = i4;
                e eVar = new e(gVar, i4);
                e();
                return eVar;
            case 1:
                b();
                int i10 = this.f443a;
                g gVar2 = (g) this.f446d;
                if (i10 >= gVar2.f453f) {
                    throw new NoSuchElementException();
                }
                this.f443a = i10 + 1;
                this.f444b = i10;
                Object obj = gVar2.f448a[i10];
                e();
                return obj;
            default:
                b();
                int i11 = this.f443a;
                g gVar3 = (g) this.f446d;
                if (i11 >= gVar3.f453f) {
                    throw new NoSuchElementException();
                }
                this.f443a = i11 + 1;
                this.f444b = i11;
                Object[] objArr = gVar3.f449b;
                k.b(objArr);
                Object obj2 = objArr[this.f444b];
                e();
                return obj2;
        }
    }
}
