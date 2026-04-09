package B4;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import o.m1;

/* loaded from: classes.dex */
public final class o extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public m1 f739A0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.bottom_mode_dialog, viewGroup, false);
        int i = R.id.l1;
        View viewE = a4.p.e(R.id.l1, viewInflate);
        if (viewE != null) {
            i = R.id.l2;
            View viewE2 = a4.p.e(R.id.l2, viewInflate);
            if (viewE2 != null) {
                i = R.id.mode_auto;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a4.p.e(R.id.mode_auto, viewInflate);
                if (appCompatImageView != null) {
                    i = R.id.mode_cancel;
                    MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.mode_cancel, viewInflate);
                    if (materialButton != null) {
                        i = R.id.mode_dark;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a4.p.e(R.id.mode_dark, viewInflate);
                        if (appCompatImageView2 != null) {
                            i = R.id.mode_light;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) a4.p.e(R.id.mode_light, viewInflate);
                            if (appCompatImageView3 != null) {
                                i = R.id.t;
                                if (((TextView) a4.p.e(R.id.t, viewInflate)) != null) {
                                    i = R.id.t1;
                                    if (((TextView) a4.p.e(R.id.t1, viewInflate)) != null) {
                                        i = R.id.t2;
                                        if (((TextView) a4.p.e(R.id.t2, viewInflate)) != null) {
                                            i = R.id.t3;
                                            if (((TextView) a4.p.e(R.id.t3, viewInflate)) != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                this.f739A0 = new m1(constraintLayout, viewE, viewE2, appCompatImageView, materialButton, appCompatImageView2, appCompatImageView3, 6);
                                                q5.i.d(constraintLayout, "getRoot(...)");
                                                m1 m1Var = this.f739A0;
                                                q5.i.b(m1Var);
                                                final AppCompatImageView appCompatImageView4 = (AppCompatImageView) m1Var.f22587g;
                                                m1 m1Var2 = this.f739A0;
                                                q5.i.b(m1Var2);
                                                final AppCompatImageView appCompatImageView5 = (AppCompatImageView) m1Var2.f22588h;
                                                m1 m1Var3 = this.f739A0;
                                                q5.i.b(m1Var3);
                                                final AppCompatImageView appCompatImageView6 = (AppCompatImageView) m1Var3.f22585e;
                                                int i3 = h.k.f20347b;
                                                if (i3 == -1) {
                                                    appCompatImageView6.setSelected(true);
                                                } else if (i3 == 1) {
                                                    appCompatImageView5.setSelected(true);
                                                } else if (i3 != 2) {
                                                    appCompatImageView6.setSelected(true);
                                                } else {
                                                    appCompatImageView4.setSelected(true);
                                                }
                                                final int i6 = 0;
                                                appCompatImageView4.setOnClickListener(new View.OnClickListener() { // from class: B4.n
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i6) {
                                                            case 0:
                                                                AppCompatImageView appCompatImageView7 = appCompatImageView4;
                                                                if (!appCompatImageView7.isSelected()) {
                                                                    appCompatImageView7.setSelected(true);
                                                                    appCompatImageView6.setSelected(false);
                                                                    appCompatImageView5.setSelected(false);
                                                                    o oVar = this;
                                                                    Context contextM = oVar.m();
                                                                    if (contextM != null) {
                                                                        SharedPreferences sharedPreferences = contextM.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences);
                                                                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                                        editorEdit.putInt("my_mode", 2);
                                                                        editorEdit.apply();
                                                                    }
                                                                    h.k.p(2);
                                                                    oVar.X();
                                                                    break;
                                                                }
                                                                break;
                                                            case 1:
                                                                AppCompatImageView appCompatImageView8 = appCompatImageView4;
                                                                if (!appCompatImageView8.isSelected()) {
                                                                    appCompatImageView8.setSelected(true);
                                                                    appCompatImageView6.setSelected(false);
                                                                    appCompatImageView5.setSelected(false);
                                                                    o oVar2 = this;
                                                                    Context contextM2 = oVar2.m();
                                                                    if (contextM2 != null) {
                                                                        SharedPreferences sharedPreferences2 = contextM2.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences2);
                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                                                        editorEdit2.putInt("my_mode", 1);
                                                                        editorEdit2.apply();
                                                                    }
                                                                    h.k.p(1);
                                                                    oVar2.X();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                AppCompatImageView appCompatImageView9 = appCompatImageView4;
                                                                if (!appCompatImageView9.isSelected()) {
                                                                    appCompatImageView6.setSelected(false);
                                                                    appCompatImageView9.setSelected(true);
                                                                    appCompatImageView5.setSelected(false);
                                                                    o oVar3 = this;
                                                                    Context contextM3 = oVar3.m();
                                                                    if (contextM3 != null) {
                                                                        SharedPreferences sharedPreferences3 = contextM3.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences3);
                                                                        SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                                                                        editorEdit3.putInt("my_mode", -1);
                                                                        editorEdit3.apply();
                                                                    }
                                                                    h.k.p(-1);
                                                                    oVar3.X();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i7 = 1;
                                                appCompatImageView5.setOnClickListener(new View.OnClickListener() { // from class: B4.n
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i7) {
                                                            case 0:
                                                                AppCompatImageView appCompatImageView7 = appCompatImageView5;
                                                                if (!appCompatImageView7.isSelected()) {
                                                                    appCompatImageView7.setSelected(true);
                                                                    appCompatImageView6.setSelected(false);
                                                                    appCompatImageView4.setSelected(false);
                                                                    o oVar = this;
                                                                    Context contextM = oVar.m();
                                                                    if (contextM != null) {
                                                                        SharedPreferences sharedPreferences = contextM.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences);
                                                                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                                        editorEdit.putInt("my_mode", 2);
                                                                        editorEdit.apply();
                                                                    }
                                                                    h.k.p(2);
                                                                    oVar.X();
                                                                    break;
                                                                }
                                                                break;
                                                            case 1:
                                                                AppCompatImageView appCompatImageView8 = appCompatImageView5;
                                                                if (!appCompatImageView8.isSelected()) {
                                                                    appCompatImageView8.setSelected(true);
                                                                    appCompatImageView6.setSelected(false);
                                                                    appCompatImageView4.setSelected(false);
                                                                    o oVar2 = this;
                                                                    Context contextM2 = oVar2.m();
                                                                    if (contextM2 != null) {
                                                                        SharedPreferences sharedPreferences2 = contextM2.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences2);
                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                                                        editorEdit2.putInt("my_mode", 1);
                                                                        editorEdit2.apply();
                                                                    }
                                                                    h.k.p(1);
                                                                    oVar2.X();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                AppCompatImageView appCompatImageView9 = appCompatImageView5;
                                                                if (!appCompatImageView9.isSelected()) {
                                                                    appCompatImageView6.setSelected(false);
                                                                    appCompatImageView9.setSelected(true);
                                                                    appCompatImageView4.setSelected(false);
                                                                    o oVar3 = this;
                                                                    Context contextM3 = oVar3.m();
                                                                    if (contextM3 != null) {
                                                                        SharedPreferences sharedPreferences3 = contextM3.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences3);
                                                                        SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                                                                        editorEdit3.putInt("my_mode", -1);
                                                                        editorEdit3.apply();
                                                                    }
                                                                    h.k.p(-1);
                                                                    oVar3.X();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i8 = 2;
                                                appCompatImageView6.setOnClickListener(new View.OnClickListener() { // from class: B4.n
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i8) {
                                                            case 0:
                                                                AppCompatImageView appCompatImageView7 = appCompatImageView6;
                                                                if (!appCompatImageView7.isSelected()) {
                                                                    appCompatImageView7.setSelected(true);
                                                                    appCompatImageView5.setSelected(false);
                                                                    appCompatImageView4.setSelected(false);
                                                                    o oVar = this;
                                                                    Context contextM = oVar.m();
                                                                    if (contextM != null) {
                                                                        SharedPreferences sharedPreferences = contextM.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences);
                                                                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                                        editorEdit.putInt("my_mode", 2);
                                                                        editorEdit.apply();
                                                                    }
                                                                    h.k.p(2);
                                                                    oVar.X();
                                                                    break;
                                                                }
                                                                break;
                                                            case 1:
                                                                AppCompatImageView appCompatImageView8 = appCompatImageView6;
                                                                if (!appCompatImageView8.isSelected()) {
                                                                    appCompatImageView8.setSelected(true);
                                                                    appCompatImageView5.setSelected(false);
                                                                    appCompatImageView4.setSelected(false);
                                                                    o oVar2 = this;
                                                                    Context contextM2 = oVar2.m();
                                                                    if (contextM2 != null) {
                                                                        SharedPreferences sharedPreferences2 = contextM2.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences2);
                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                                                        editorEdit2.putInt("my_mode", 1);
                                                                        editorEdit2.apply();
                                                                    }
                                                                    h.k.p(1);
                                                                    oVar2.X();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                AppCompatImageView appCompatImageView9 = appCompatImageView6;
                                                                if (!appCompatImageView9.isSelected()) {
                                                                    appCompatImageView5.setSelected(false);
                                                                    appCompatImageView9.setSelected(true);
                                                                    appCompatImageView4.setSelected(false);
                                                                    o oVar3 = this;
                                                                    Context contextM3 = oVar3.m();
                                                                    if (contextM3 != null) {
                                                                        SharedPreferences sharedPreferences3 = contextM3.getSharedPreferences("sp", 0);
                                                                        q5.i.b(sharedPreferences3);
                                                                        SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                                                                        editorEdit3.putInt("my_mode", -1);
                                                                        editorEdit3.apply();
                                                                    }
                                                                    h.k.p(-1);
                                                                    oVar3.X();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                m1 m1Var4 = this.f739A0;
                                                q5.i.b(m1Var4);
                                                ((MaterialButton) m1Var4.f22586f).setOnClickListener(new g(1, this));
                                                return constraintLayout;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f739A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }
}
