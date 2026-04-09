package a5;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f123d;

    public /* synthetic */ h(int i10, Object obj) {
        this.f122a = i10;
        this.f123d = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f122a) {
            case 0:
                m mVar = (m) this.f123d;
                Iterator it = mVar.f135d.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    k kVar = mVar.f134c;
                    if (!lVar.f131d && lVar.f130c) {
                        androidx.media3.common.p pVarB = lVar.f129b.b();
                        lVar.f129b = new androidx.media3.common.o(0);
                        lVar.f130c = false;
                        kVar.h(lVar.f128a, pVarB);
                    }
                    if (mVar.f133b.f173a.hasMessages(0)) {
                        break;
                    }
                }
                break;
            default:
                qb.k kVar2 = (qb.k) this.f123d;
                Iterator it2 = kVar2.f20785d.iterator();
                while (it2.hasNext()) {
                    qb.j jVar = (qb.j) it2.next();
                    qb.i iVar = kVar2.f20784c;
                    if (!jVar.f20781d && jVar.f20780c) {
                        qb.f fVarC = jVar.f20779b.c();
                        jVar.f20779b = new androidx.media3.common.o(1);
                        jVar.f20780c = false;
                        iVar.d(jVar.f20778a, fVarC);
                    }
                    if (kVar2.f20783b.f20823a.hasMessages(0)) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
