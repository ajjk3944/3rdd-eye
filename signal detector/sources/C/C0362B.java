package c;

import c5.C0412i;
import d5.C2280h;
import java.util.ListIterator;

/* renamed from: c.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362B extends q5.j implements p5.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0371K f5785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0362B(C0371K c0371k, int i) {
        super(1);
        this.f5784b = i;
        this.f5785c = c0371k;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f5784b) {
            case 0:
                q5.i.e((C0377b) obj, "backEvent");
                C0371K c0371k = this.f5785c;
                C2280h c2280h = c0371k.f5803b;
                ListIterator listIterator = c2280h.listIterator(c2280h.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0372L) objPrevious).f5809a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                C0372L c0372l = (C0372L) objPrevious;
                if (c0371k.f5804c != null) {
                    c0371k.b();
                }
                c0371k.f5804c = c0372l;
                break;
            default:
                q5.i.e((C0377b) obj, "backEvent");
                C0371K c0371k2 = this.f5785c;
                if (c0371k2.f5804c == null) {
                    C2280h c2280h2 = c0371k2.f5803b;
                    ListIterator listIterator2 = c2280h2.listIterator(c2280h2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((C0372L) objPrevious2).f5809a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
        }
        return C0412i.f5929a;
    }
}
