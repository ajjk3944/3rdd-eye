package A2;

import A8.k;
import A8.n;
import T1.B;
import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import com.zipoapps.premiumhelper.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13d;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f11b = i;
        this.f12c = obj;
        this.f13d = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) throws Exception {
        int i = 1;
        Object obj2 = this.f13d;
        Object obj3 = this.f12c;
        switch (this.f11b) {
            case 0:
                return Integer.valueOf(((o) obj3).f31d.V((E1.a) obj, (Model) obj2));
            case 1:
                ((o) obj3).f30c.V((E1.a) obj, (Model) obj2);
                return null;
            default:
                AppCompatActivity it = (AppCompatActivity) obj;
                kotlin.jvm.internal.l.f(it, "it");
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                int i10 = n.a.f149a[e.a.a().f37025o.c().ordinal()];
                Activity activity = (Activity) obj3;
                A8.k kVar = (A8.k) obj2;
                if (i10 == 1) {
                    com.zipoapps.premiumhelper.e eVarA = e.a.a();
                    eVarA.f37025o.g(it, B.j(activity), new j(i, kVar, activity));
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new b9.j();
                    }
                    A8.m mVar = new A8.m(0, kVar, it);
                    k.a aVar = A8.k.f132j;
                    kVar.g(activity, mVar);
                }
                return C1992A.f18074a;
        }
    }
}
