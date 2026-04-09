package a5;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f125d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f126g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f127r;

    public /* synthetic */ i(int i10, Object obj, Object obj2, int i11) {
        this.f124a = i11;
        this.f126g = obj;
        this.f125d = i10;
        this.f127r = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f124a) {
            case 0:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f126g;
                j jVar = (j) this.f127r;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    if (!lVar.f131d) {
                        int i10 = this.f125d;
                        if (i10 != -1) {
                            lVar.f129b.a(i10);
                        }
                        lVar.f130c = true;
                        jVar.a(lVar.f128a);
                    }
                }
                break;
            case 1:
                ((f7.d) ((f7.a) this.f126g).f8638c).f(this.f125d, this.f127r);
                break;
            default:
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.f126g;
                qb.h hVar = (qb.h) this.f127r;
                Iterator it2 = copyOnWriteArraySet2.iterator();
                while (it2.hasNext()) {
                    qb.j jVar2 = (qb.j) it2.next();
                    if (!jVar2.f20781d) {
                        int i11 = this.f125d;
                        if (i11 != -1) {
                            jVar2.f20779b.a(i11);
                        }
                        jVar2.f20780c = true;
                        hVar.a(jVar2.f20778a);
                    }
                }
                break;
        }
    }
}
