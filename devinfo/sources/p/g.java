package p;

import android.content.Context;
import android.view.View;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends o.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f30694l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f30695m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, o.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f30695m = kVar;
        this.f30305f = 8388613;
        nm.d0 d0Var = kVar.f30745w;
        this.f30306h = d0Var;
        o.u uVar = this.f30307i;
        if (uVar != null) {
            uVar.i(d0Var);
        }
    }

    @Override // o.w
    public final void c() {
        switch (this.f30694l) {
            case 0:
                k kVar = this.f30695m;
                kVar.f30742t = null;
                kVar.getClass();
                super.c();
                break;
            default:
                k kVar2 = this.f30695m;
                o.m mVar = kVar2.f30727c;
                if (mVar != null) {
                    mVar.c(true);
                }
                kVar2.f30741s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, o.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f30695m = kVar;
        if ((e0Var.A.f30284x & 32) != 32) {
            View view2 = kVar.f30732i;
            this.f30304e = view2 == null ? (View) kVar.f30731h : view2;
        }
        nm.d0 d0Var = kVar.f30745w;
        this.f30306h = d0Var;
        o.u uVar = this.f30307i;
        if (uVar != null) {
            uVar.i(d0Var);
        }
    }
}
