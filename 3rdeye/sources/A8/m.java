package A8;

import A8.k;
import T1.B;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import com.zipoapps.premiumhelper.e;
import p9.InterfaceC5480a;
import w1.AbstractC5715a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f147d;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.f145b = i;
        this.f147d = obj;
        this.f146c = obj2;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() throws Throwable {
        Object obj = this.f146c;
        Object obj2 = this.f147d;
        switch (this.f145b) {
            case 0:
                k.a aVar = k.f132j;
                k kVar = (k) obj2;
                kVar.getClass();
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                com.zipoapps.premiumhelper.e eVarA = e.a.a();
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj;
                eVarA.f37025o.g(appCompatActivity, B.j(appCompatActivity), new i(0, kVar, appCompatActivity));
                return C1992A.f18074a;
            case 1:
                ((w8.i) obj2).b((AppCompatActivity) obj, null);
                return C1992A.f18074a;
            default:
                return ((AbstractC5715a.C0543a) obj2).a((String) obj);
        }
    }
}
