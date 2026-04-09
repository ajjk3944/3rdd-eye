package w8;

import A2.l;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import p9.InterfaceC5480a;
import w1.AbstractC5715a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47566d;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f47564b = i;
        this.f47565c = obj;
        this.f47566d = obj2;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() throws Throwable {
        switch (this.f47564b) {
            case 0:
                ((i) this.f47565c).b((AppCompatActivity) this.f47566d, null);
                return C1992A.f18074a;
            default:
                E1.a aVarA = ((AbstractC5715a.C0543a) this.f47565c).a((String) this.f47566d);
                l.v(aVarA, "PRAGMA query_only = 1");
                return aVarA;
        }
    }
}
