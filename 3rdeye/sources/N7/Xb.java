package N7;

import A7.b;
import N7.Vb;
import N7.Wb;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTriggerTemplate.kt */
/* loaded from: classes.dex */
public final class Xb implements InterfaceC5868a, z7.b<Vb> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<List<C1132d2>> f7754a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Boolean>> f7755b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Vb.a>> f7756c;

    static {
        Vb.a value = Vb.a.ON_CONDITION;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    public Xb(AbstractC5371a<List<C1132d2>> abstractC5371a, AbstractC5371a<A7.b<Boolean>> abstractC5371a2, AbstractC5371a<A7.b<Vb.a>> abstractC5371a3) {
        this.f7754a = abstractC5371a;
        this.f7755b = abstractC5371a2;
        this.f7756c = abstractC5371a3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Wb.c) D7.a.f1071b.f6647W8.getValue()).b(D7.a.f1070a, this);
    }
}
