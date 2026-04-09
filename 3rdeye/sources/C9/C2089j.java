package c9;

import T1.F;
import android.os.Bundle;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.support.ContactSupportActivity;
import com.zipoapps.premiumhelper.toto.TotoManager;
import i8.C4461a;
import p9.InterfaceC5480a;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: c9.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2089j implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18576c;

    public /* synthetic */ C2089j(Object obj, int i) {
        this.f18575b = i;
        this.f18576c = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        Object obj = this.f18576c;
        switch (this.f18575b) {
            case 0:
                return T1.B.q((Object[]) obj);
            case 1:
                return TotoManager.totoServiceRepository_delegate$lambda$1((TotoManager) obj);
            case 2:
                a.b bVar = va.a.f47104a;
                bVar.o("AdsLoadingPerformance");
                Bundle bundle = (Bundle) obj;
                bVar.a(bundle.toString(), new Object[0]);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                C4461a c4461a = e.a.a().f37021k;
                c4461a.getClass();
                c4461a.r(c4461a.c("Ad_load_error", false, bundle));
                return C1992A.f18074a;
            case 3:
                int i = ContactSupportActivity.f37060f;
                return ((ContactSupportActivity) obj).findViewById(R.id.button_send);
            case 4:
                ((F) obj).run();
                return C1992A.f18074a;
            default:
                return obj;
        }
    }
}
