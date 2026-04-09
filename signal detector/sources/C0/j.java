package C0;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: b, reason: collision with root package name */
    public final l f1050b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f1051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, v vVar) {
        super(vVar.f1045a);
        q5.i.e(lVar, "tracker");
        q5.i.e(vVar, "delegate");
        this.f1050b = lVar;
        this.f1051c = new WeakReference(vVar);
    }

    @Override // C0.h
    public final void a(Set set) {
        i iVar;
        p pVar;
        H0.c cVar;
        q5.i.e(set, "tables");
        h hVar = (h) this.f1051c.get();
        if (hVar != null) {
            hVar.a(set);
            return;
        }
        l lVar = this.f1050b;
        synchronized (lVar.f1064k) {
            iVar = (i) lVar.f1064k.b(this);
        }
        if (iVar != null) {
            A1.s sVar = lVar.i;
            int[] iArr = iVar.f1047b;
            if (sVar.h(Arrays.copyOf(iArr, iArr.length)) && (cVar = (pVar = lVar.f1055a).f1087a) != null && cVar.isOpen()) {
                lVar.e(pVar.g().i());
            }
        }
    }
}
