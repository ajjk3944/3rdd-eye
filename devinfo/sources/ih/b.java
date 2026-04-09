package ih;

import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.f1;
import b5.u0;
import b5.z;
import bh.i;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.User;
import ej.h;
import i.e;
import i0.f;
import nk.k;
import nk.v;
import t7.m;
import yj.g;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends hg.c {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f25993s0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    public f f25994p0;

    /* renamed from: q0, reason: collision with root package name */
    public User f25995q0;

    /* renamed from: r0, reason: collision with root package name */
    public final f1 f25996r0;

    public b() {
        yj.f fVarT = a.a.t(g.f37636b, new b2.b(15, new b2.b(14, this)));
        this.f25996r0 = new f1(v.a(c.class), new h(fVarT, 8), new c2.c(7, this, fVarT), new h(fVarT, 9));
    }

    @Override // i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        final int i4 = 0;
        f0(false);
        this.f25994p0 = f.G(q());
        User userB = bh.c.b();
        k.b(userB);
        this.f25995q0 = userB;
        f fVar = this.f25994p0;
        if (fVar == null) {
            k.k("binding");
            throw null;
        }
        AppCompatEditText appCompatEditText = (AppCompatEditText) fVar.f25417c;
        appCompatEditText.setHint(userB.getNickname());
        final int i10 = 1;
        appCompatEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        appCompatEditText.post(new gh.a(fVar, i10));
        ((TextView) fVar.f25418d).setText(R.string.nickname_len_hint);
        f1 f1Var = this.f25996r0;
        int i11 = 7;
        ((c) f1Var.getValue()).f26000e.e(this, new i(new mk.c(this) { // from class: ih.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f25992b;

            {
                this.f25992b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                int i12 = i4;
                u uVar = u.f37649a;
                b bVar = this.f25992b;
                switch (i12) {
                    case 0:
                        if (((ng.a) obj).f29942a) {
                            u0 u0VarO = bVar.o();
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
                            u0 u0VarO2 = bVar.o();
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
                        f fVar2 = bVar.f25994p0;
                        if (fVar2 != null) {
                            Toast.makeText(((LinearLayout) fVar2.f25416b).getContext(), str, 0).show();
                            return uVar;
                        }
                        k.k("binding");
                        throw null;
                    default:
                        bVar.d0(false, false);
                        return uVar;
                }
            }
        }, i11));
        ((c) f1Var.getValue()).f25998c.e(this, new i(new mk.c(this) { // from class: ih.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f25992b;

            {
                this.f25992b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                int i12 = i10;
                u uVar = u.f37649a;
                b bVar = this.f25992b;
                switch (i12) {
                    case 0:
                        if (((ng.a) obj).f29942a) {
                            u0 u0VarO = bVar.o();
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
                            u0 u0VarO2 = bVar.o();
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
                        f fVar2 = bVar.f25994p0;
                        if (fVar2 != null) {
                            Toast.makeText(((LinearLayout) fVar2.f25416b).getContext(), str, 0).show();
                            return uVar;
                        }
                        k.k("binding");
                        throw null;
                    default:
                        bVar.d0(false, false);
                        return uVar;
                }
            }
        }, i11));
        final int i12 = 2;
        ((c) f1Var.getValue()).g.e(this, new i(new mk.c(this) { // from class: ih.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f25992b;

            {
                this.f25992b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                int i122 = i12;
                u uVar = u.f37649a;
                b bVar = this.f25992b;
                switch (i122) {
                    case 0:
                        if (((ng.a) obj).f29942a) {
                            u0 u0VarO = bVar.o();
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
                            u0 u0VarO2 = bVar.o();
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
                        f fVar2 = bVar.f25994p0;
                        if (fVar2 != null) {
                            Toast.makeText(((LinearLayout) fVar2.f25416b).getContext(), str, 0).show();
                            return uVar;
                        }
                        k.k("binding");
                        throw null;
                    default:
                        bVar.d0(false, false);
                        return uVar;
                }
            }
        }, i11));
        m mVar = new m(W());
        mVar.y(R.string.edit_nickname);
        f fVar2 = this.f25994p0;
        if (fVar2 == null) {
            k.k("binding");
            throw null;
        }
        mVar.z((LinearLayout) fVar2.f25416b);
        mVar.x(R.string.confirm, null);
        mVar.w(R.string.cancel, null);
        e eVarF = mVar.f();
        eVarF.setOnShowListener(new gh.c(eVarF, this, 2));
        return eVarF;
    }
}
