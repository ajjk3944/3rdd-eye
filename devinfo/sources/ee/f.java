package ee;

import androidx.work.impl.WorkDatabase;
import b7.a0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23418d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i4) {
        this.f23415a = i4;
        this.f23416b = obj;
        this.f23417c = obj2;
        this.f23418d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23415a) {
            case 0:
                return ((g) this.f23416b).f23419a.submit(new aj.d(15, (Callable) this.f23417c, (o7.c) this.f23418d));
            default:
                u6.c cVar = (u6.c) this.f23416b;
                ArrayList arrayList = (ArrayList) this.f23417c;
                String str = (String) this.f23418d;
                WorkDatabase workDatabase = cVar.f35127e;
                a0 a0VarX = workDatabase.x();
                a0VarX.getClass();
                nk.k.e(str, FacebookMediationAdapter.KEY_ID);
                arrayList.addAll((List) com.bumptech.glide.f.r(a0VarX.f1970a, true, false, new b7.c(str, 14)));
                return workDatabase.w().d(str);
        }
    }
}
