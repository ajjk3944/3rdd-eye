package gh;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.f1;
import b5.u0;
import b5.z;
import bh.i;
import com.liuzh.deviceinfo.R;
import ej.h;
import i0.f;
import nk.k;
import nk.v;
import t7.m;
import yj.g;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends hg.c {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f24731r0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    public f f24732p0;

    /* renamed from: q0, reason: collision with root package name */
    public final f1 f24733q0;

    public d() {
        yj.f fVarT = a.a.t(g.f37636b, new b2.b(8, new b2.b(7, this)));
        this.f24733q0 = new f1(v.a(e.class), new h(fVarT, 2), new c2.c(2, this, fVarT), new h(fVarT, 3));
    }

    @Override // i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        f0(false);
        f fVarG = f.G(q());
        this.f24732p0 = fVarG;
        final int i4 = 0;
        ((AppCompatEditText) fVarG.f25417c).post(new a(fVarG, i4));
        ((TextView) fVarG.f25418d).setVisibility(8);
        f1 f1Var = this.f24733q0;
        int i10 = 3;
        ((e) f1Var.getValue()).f24737e.e(this, new i(new mk.c(this) { // from class: gh.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f24727b;

            {
                this.f24727b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                int i11 = i4;
                u uVar = u.f37649a;
                d dVar = this.f24727b;
                switch (i11) {
                    case 0:
                        if (((ng.a) obj).f29942a) {
                            u0 u0VarO = dVar.o();
                            k.d(u0VarO, "getChildFragmentManager(...)");
                            rg.c cVar = new rg.c();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("key.msg", null);
                            cVar.Z(bundle2);
                            cVar.f0(false);
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                            cVar.i0(u0VarO, "CommonLoadingDialog");
                        } else {
                            u0 u0VarO2 = dVar.o();
                            k.d(u0VarO2, "getChildFragmentManager(...)");
                            z zVarD2 = u0VarO2.D("CommonLoadingDialog");
                            if (zVarD2 != null) {
                                b5.a aVar2 = new b5.a(u0VarO2);
                                aVar2.j(zVarD2);
                                aVar2.g();
                            }
                        }
                        return uVar;
                    case 1:
                        String str = (String) obj;
                        f fVar = dVar.f24732p0;
                        if (fVar != null) {
                            Toast.makeText(((LinearLayout) fVar.f25416b).getContext(), str, 0).show();
                            return uVar;
                        }
                        k.k("binding");
                        throw null;
                    default:
                        dVar.d0(false, false);
                        if (((Boolean) obj).booleanValue()) {
                            m mVar = new m(dVar.W());
                            mVar.y(R.string.redeem_code);
                            mVar.v(R.string.lifetime_user_no_needed_redeem_tip_use_code_future);
                            mVar.x(R.string.confirm, null);
                            mVar.A().setCanceledOnTouchOutside(false);
                        }
                        return uVar;
                }
            }
        }, i10));
        final int i11 = 1;
        ((e) f1Var.getValue()).f24735c.e(this, new i(new mk.c(this) { // from class: gh.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f24727b;

            {
                this.f24727b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                int i112 = i11;
                u uVar = u.f37649a;
                d dVar = this.f24727b;
                switch (i112) {
                    case 0:
                        if (((ng.a) obj).f29942a) {
                            u0 u0VarO = dVar.o();
                            k.d(u0VarO, "getChildFragmentManager(...)");
                            rg.c cVar = new rg.c();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("key.msg", null);
                            cVar.Z(bundle2);
                            cVar.f0(false);
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                            cVar.i0(u0VarO, "CommonLoadingDialog");
                        } else {
                            u0 u0VarO2 = dVar.o();
                            k.d(u0VarO2, "getChildFragmentManager(...)");
                            z zVarD2 = u0VarO2.D("CommonLoadingDialog");
                            if (zVarD2 != null) {
                                b5.a aVar2 = new b5.a(u0VarO2);
                                aVar2.j(zVarD2);
                                aVar2.g();
                            }
                        }
                        return uVar;
                    case 1:
                        String str = (String) obj;
                        f fVar = dVar.f24732p0;
                        if (fVar != null) {
                            Toast.makeText(((LinearLayout) fVar.f25416b).getContext(), str, 0).show();
                            return uVar;
                        }
                        k.k("binding");
                        throw null;
                    default:
                        dVar.d0(false, false);
                        if (((Boolean) obj).booleanValue()) {
                            m mVar = new m(dVar.W());
                            mVar.y(R.string.redeem_code);
                            mVar.v(R.string.lifetime_user_no_needed_redeem_tip_use_code_future);
                            mVar.x(R.string.confirm, null);
                            mVar.A().setCanceledOnTouchOutside(false);
                        }
                        return uVar;
                }
            }
        }, i10));
        final int i12 = 2;
        ((e) f1Var.getValue()).g.e(this, new i(new mk.c(this) { // from class: gh.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f24727b;

            {
                this.f24727b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                int i112 = i12;
                u uVar = u.f37649a;
                d dVar = this.f24727b;
                switch (i112) {
                    case 0:
                        if (((ng.a) obj).f29942a) {
                            u0 u0VarO = dVar.o();
                            k.d(u0VarO, "getChildFragmentManager(...)");
                            rg.c cVar = new rg.c();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("key.msg", null);
                            cVar.Z(bundle2);
                            cVar.f0(false);
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                            cVar.i0(u0VarO, "CommonLoadingDialog");
                        } else {
                            u0 u0VarO2 = dVar.o();
                            k.d(u0VarO2, "getChildFragmentManager(...)");
                            z zVarD2 = u0VarO2.D("CommonLoadingDialog");
                            if (zVarD2 != null) {
                                b5.a aVar2 = new b5.a(u0VarO2);
                                aVar2.j(zVarD2);
                                aVar2.g();
                            }
                        }
                        return uVar;
                    case 1:
                        String str = (String) obj;
                        f fVar = dVar.f24732p0;
                        if (fVar != null) {
                            Toast.makeText(((LinearLayout) fVar.f25416b).getContext(), str, 0).show();
                            return uVar;
                        }
                        k.k("binding");
                        throw null;
                    default:
                        dVar.d0(false, false);
                        if (((Boolean) obj).booleanValue()) {
                            m mVar = new m(dVar.W());
                            mVar.y(R.string.redeem_code);
                            mVar.v(R.string.lifetime_user_no_needed_redeem_tip_use_code_future);
                            mVar.x(R.string.confirm, null);
                            mVar.A().setCanceledOnTouchOutside(false);
                        }
                        return uVar;
                }
            }
        }, 3));
        m mVar = new m(W());
        mVar.y(R.string.redeem_code);
        f fVar = this.f24732p0;
        if (fVar == null) {
            k.k("binding");
            throw null;
        }
        mVar.z((LinearLayout) fVar.f25416b);
        mVar.x(R.string.confirm, null);
        mVar.w(R.string.cancel, null);
        i.e eVarF = mVar.f();
        eVarF.setOnShowListener(new c(eVarF, this, 0));
        return eVarF;
    }
}
