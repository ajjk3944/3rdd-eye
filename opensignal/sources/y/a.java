package y;

import lq.b0;
import n0.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25565a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f25566d;

    public /* synthetic */ a(h hVar, int i10) {
        this.f25565a = i10;
        this.f25566d = hVar;
    }

    @Override // ar.a
    public final Object c() {
        x1.i iVar;
        switch (this.f25565a) {
            case 0:
                a0 a0Var = androidx.compose.foundation.b.f1071a;
                h hVar = this.f25566d;
                q qVar = (q) x1.k.h(hVar, a0Var);
                if (qVar == null) {
                    b0.a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + qVar);
                }
                q qVar2 = hVar.f25588x;
                hVar.f25588x = qVar;
                if (qVar2 != null && !br.l.a(qVar, qVar2) && ((iVar = hVar.f25589y) != null || !hVar.E)) {
                    if (iVar != null) {
                        hVar.d0(iVar);
                    }
                    hVar.f25589y = null;
                    hVar.h0();
                }
                return b0.f15562a;
            default:
                this.f25566d.f25586v.c();
                return Boolean.TRUE;
        }
    }
}
