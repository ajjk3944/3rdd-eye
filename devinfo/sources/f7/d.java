package f7;

import android.content.Context;
import com.google.android.gms.internal.ads.ur0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements e6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23718a;

    public /* synthetic */ d(Context context) {
        this.f23718a = context;
    }

    @Override // e6.b
    public e6.c c(ur0 ur0Var) {
        String str = (String) ur0Var.f17305e;
        t7.m mVar = (t7.m) ur0Var.f17306f;
        nk.k.e(mVar, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new f6.h(this.f23718a, str, mVar, true, true);
    }
}
