package wl;

import android.content.Context;
import ar.n;
import bn.c;
import bn.e;
import br.l;
import br.x;
import br.y;
import ch.f;
import g4.j;
import pq.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24542a;

    public /* synthetic */ a(int i10) {
        this.f24542a = i10;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f24542a) {
            case 0:
                uv.b bVar = (uv.b) obj;
                l.e(bVar, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar = x.f2918a;
                return new ul.a((com.staircase3.opensignal.utils.a) bVar.a(null, yVar.b(com.staircase3.opensignal.utils.a.class), null), (f) bVar.a(null, yVar.b(f.class), null));
            case 1:
                uv.b bVar2 = (uv.b) obj;
                l.e(bVar2, "$this$viewModel");
                l.e((rv.a) obj2, "it");
                y yVar2 = x.f2918a;
                return new zl.a((qm.f) bVar2.a(null, yVar2.b(qm.f.class), null), (hl.a) bVar2.a(null, yVar2.b(hl.a.class), null), (ul.a) bVar2.a(null, yVar2.b(ul.a.class), null), (nl.a) bVar2.a(null, yVar2.b(nl.a.class), null), (cm.a) bVar2.a(null, yVar2.b(cm.a.class), null), (gl.a) bVar2.a(null, yVar2.b(gl.a.class), null));
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                return ((h) obj).i0((pq.f) obj2);
            case 4:
                return ((h) obj).i0((pq.f) obj2);
            case j.STRING_FIELD_NUMBER /* 5 */:
                uv.b bVar3 = (uv.b) obj;
                l.e(bVar3, "$this$single");
                l.e((rv.a) obj2, "it");
                return new wm.a((Context) bVar3.a(null, x.f2918a.b(Context.class), null));
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                l.e((uv.b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                e eVar = new e();
                eVar.f2839a = new c("", -1L);
                eVar.f2840b = true;
                eVar.f2842d = -1L;
                return eVar;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                uv.b bVar4 = (uv.b) obj;
                l.e(bVar4, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar3 = x.f2918a;
                return new an.a((com.staircase3.opensignal.utils.a) bVar4.a(null, yVar3.b(com.staircase3.opensignal.utils.a.class), null), (ll.a) bVar4.a(null, yVar3.b(ll.a.class), null));
            default:
                uv.b bVar5 = (uv.b) obj;
                l.e(bVar5, "$this$factory");
                l.e((rv.a) obj2, "it");
                y yVar4 = x.f2918a;
                return new xm.a((Context) bVar5.a(null, yVar4.b(Context.class), null), (el.b) bVar5.a(null, yVar4.b(el.b.class), null));
        }
    }
}
