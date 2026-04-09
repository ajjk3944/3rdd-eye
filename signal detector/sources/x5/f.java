package x5;

import c5.InterfaceC0404a;
import java.util.Iterator;
import p5.l;

/* loaded from: classes3.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24198a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24199b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0404a f24200c;

    public /* synthetic */ f(int i, Object obj, l lVar) {
        this.f24198a = i;
        this.f24199b = obj;
        this.f24200c = lVar;
    }

    @Override // x5.g
    public final Iterator iterator() {
        switch (this.f24198a) {
            case 0:
                return new e(this);
            case 1:
                return new c(this);
            case 2:
                return new k(this);
            default:
                return new y5.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(g gVar, l lVar) {
        this.f24198a = 1;
        this.f24199b = gVar;
        this.f24200c = (q5.j) lVar;
    }

    public f(CharSequence charSequence, y5.k kVar) {
        this.f24198a = 3;
        q5.i.e(charSequence, "input");
        this.f24199b = charSequence;
        this.f24200c = kVar;
    }
}
