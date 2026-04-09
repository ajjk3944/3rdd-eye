package hh;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.f1;
import b5.u0;
import b5.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends hg.d {
    public f1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f25098a0 = 1;

    /* renamed from: b0, reason: collision with root package name */
    public String f25099b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f25100c0;

    /* renamed from: d0, reason: collision with root package name */
    public final f1 f25101d0;

    public k() {
        yj.f fVarT = a.a.t(yj.g.f37636b, new b2.b(10, new b2.b(9, this)));
        this.f25101d0 = new f1(nk.v.a(q.class), new ej.h(fVarT, 4), new c2.c(3, this, fVarT), new ej.h(fVarT, 5));
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        Bundle bundleV = V();
        String string = bundleV.getString("email");
        nk.k.b(string);
        this.f25099b0 = string;
        String string2 = bundleV.getString("vcode");
        nk.k.b(string2);
        this.f25100c0 = string2;
        this.f25098a0 = bundleV.getInt("vtype", this.f25098a0);
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        nk.k.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_confirm_pwd, viewGroup, false);
        int i4 = R.id.btn_next_step;
        MaterialButton materialButton = (MaterialButton) wb.e.s(R.id.btn_next_step, viewInflate);
        if (materialButton != null) {
            i4 = R.id.input_password;
            TextInputEditText textInputEditText = (TextInputEditText) wb.e.s(R.id.input_password, viewInflate);
            if (textInputEditText != null) {
                i4 = R.id.input_retype_password;
                TextInputEditText textInputEditText2 = (TextInputEditText) wb.e.s(R.id.input_retype_password, viewInflate);
                if (textInputEditText2 != null) {
                    i4 = R.id.tv_summary;
                    TextView textView = (TextView) wb.e.s(R.id.tv_summary, viewInflate);
                    if (textView != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        this.Z = new f1(frameLayout, materialButton, textInputEditText, textInputEditText2, textView, 21);
                        nk.k.d(frameLayout, "getRoot(...)");
                        return frameLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) throws Resources.NotFoundException {
        nk.k.e(view, "view");
        f1 f1Var = this.Z;
        if (f1Var == null) {
            nk.k.k("binding");
            throw null;
        }
        TextView textView = (TextView) f1Var.f1138f;
        String str = this.f25099b0;
        if (str == null) {
            nk.k.k("email");
            throw null;
        }
        final int i4 = 1;
        final int i10 = 0;
        String string = t().getString(R.string.create_password_summary, str);
        nk.k.d(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        String str2 = this.f25099b0;
        if (str2 == null) {
            nk.k.k("email");
            throw null;
        }
        int iF0 = vk.i.F0(string, str2, 0, false, 6);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(cm.g.l(android.R.attr.textColorPrimary, W()));
        String str3 = this.f25099b0;
        if (str3 == null) {
            nk.k.k("email");
            throw null;
        }
        spannableString.setSpan(foregroundColorSpan, iF0, str3.length() + iF0, 33);
        textView.setText(spannableString);
        ((MaterialButton) f1Var.f1135c).setOnClickListener(new com.applovin.mediation.nativeAds.a(6, this));
        f1 f1Var2 = this.f25101d0;
        ((q) f1Var2.getValue()).f25118c.e(v(), new bh.i(new mk.c(this) { // from class: hh.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f25097b;

            {
                this.f25097b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        String str4 = (String) obj;
                        Context contextP = this.f25097b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str4, 0).show();
                        }
                        break;
                    case 1:
                        boolean z3 = ((ng.a) obj).f29942a;
                        k kVar = this.f25097b;
                        if (z3) {
                            ja.c.C(kVar);
                        } else {
                            u0 u0VarO = kVar.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        break;
                    case 2:
                        Bundle bundle2 = Bundle.EMPTY;
                        nk.k.d(bundle2, "EMPTY");
                        com.bumptech.glide.f.B(this.f25097b, "ConfirmPwdResult", bundle2);
                        break;
                    default:
                        k kVar2 = this.f25097b;
                        String strU = kVar2.u(R.string.change_password_successful);
                        Context contextP2 = kVar2.p();
                        if (contextP2 != null) {
                            Toast.makeText(contextP2, strU, 0).show();
                        }
                        i.g gVarN = kVar2.n();
                        if (gVarN != null) {
                            gVarN.finish();
                        }
                        break;
                }
                return yj.u.f37649a;
            }
        }, 5));
        ((q) f1Var2.getValue()).f25120e.e(v(), new bh.i(new mk.c(this) { // from class: hh.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f25097b;

            {
                this.f25097b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        String str4 = (String) obj;
                        Context contextP = this.f25097b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str4, 0).show();
                        }
                        break;
                    case 1:
                        boolean z3 = ((ng.a) obj).f29942a;
                        k kVar = this.f25097b;
                        if (z3) {
                            ja.c.C(kVar);
                        } else {
                            u0 u0VarO = kVar.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        break;
                    case 2:
                        Bundle bundle2 = Bundle.EMPTY;
                        nk.k.d(bundle2, "EMPTY");
                        com.bumptech.glide.f.B(this.f25097b, "ConfirmPwdResult", bundle2);
                        break;
                    default:
                        k kVar2 = this.f25097b;
                        String strU = kVar2.u(R.string.change_password_successful);
                        Context contextP2 = kVar2.p();
                        if (contextP2 != null) {
                            Toast.makeText(contextP2, strU, 0).show();
                        }
                        i.g gVarN = kVar2.n();
                        if (gVarN != null) {
                            gVarN.finish();
                        }
                        break;
                }
                return yj.u.f37649a;
            }
        }, 5));
        final int i11 = 2;
        ((q) f1Var2.getValue()).g.e(v(), new bh.i(new mk.c(this) { // from class: hh.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f25097b;

            {
                this.f25097b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        String str4 = (String) obj;
                        Context contextP = this.f25097b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str4, 0).show();
                        }
                        break;
                    case 1:
                        boolean z3 = ((ng.a) obj).f29942a;
                        k kVar = this.f25097b;
                        if (z3) {
                            ja.c.C(kVar);
                        } else {
                            u0 u0VarO = kVar.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        break;
                    case 2:
                        Bundle bundle2 = Bundle.EMPTY;
                        nk.k.d(bundle2, "EMPTY");
                        com.bumptech.glide.f.B(this.f25097b, "ConfirmPwdResult", bundle2);
                        break;
                    default:
                        k kVar2 = this.f25097b;
                        String strU = kVar2.u(R.string.change_password_successful);
                        Context contextP2 = kVar2.p();
                        if (contextP2 != null) {
                            Toast.makeText(contextP2, strU, 0).show();
                        }
                        i.g gVarN = kVar2.n();
                        if (gVarN != null) {
                            gVarN.finish();
                        }
                        break;
                }
                return yj.u.f37649a;
            }
        }, 5));
        final int i12 = 3;
        ((q) f1Var2.getValue()).f25123i.e(v(), new bh.i(new mk.c(this) { // from class: hh.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f25097b;

            {
                this.f25097b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        String str4 = (String) obj;
                        Context contextP = this.f25097b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str4, 0).show();
                        }
                        break;
                    case 1:
                        boolean z3 = ((ng.a) obj).f29942a;
                        k kVar = this.f25097b;
                        if (z3) {
                            ja.c.C(kVar);
                        } else {
                            u0 u0VarO = kVar.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        break;
                    case 2:
                        Bundle bundle2 = Bundle.EMPTY;
                        nk.k.d(bundle2, "EMPTY");
                        com.bumptech.glide.f.B(this.f25097b, "ConfirmPwdResult", bundle2);
                        break;
                    default:
                        k kVar2 = this.f25097b;
                        String strU = kVar2.u(R.string.change_password_successful);
                        Context contextP2 = kVar2.p();
                        if (contextP2 != null) {
                            Toast.makeText(contextP2, strU, 0).show();
                        }
                        i.g gVarN = kVar2.n();
                        if (gVarN != null) {
                            gVarN.finish();
                        }
                        break;
                }
                return yj.u.f37649a;
            }
        }, 5));
    }
}
