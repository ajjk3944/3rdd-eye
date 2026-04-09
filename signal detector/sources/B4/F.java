package B4;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import z4.C3024a;

/* loaded from: classes.dex */
public final class F extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public Uri f697A0;

    /* renamed from: B0, reason: collision with root package name */
    public C3024a f698B0;

    /* renamed from: C0, reason: collision with root package name */
    public E f699C0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (this.f699C0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_suggest_image, viewGroup, false);
        int i = R.id.dialog_cancel;
        MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.dialog_cancel, viewInflate);
        if (materialButton != null) {
            i = R.id.dialog_delete;
            MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.dialog_delete, viewInflate);
            if (materialButton2 != null) {
                i = R.id.dialog_replace;
                MaterialButton materialButton3 = (MaterialButton) a4.p.e(R.id.dialog_replace, viewInflate);
                if (materialButton3 != null) {
                    i = R.id.dialog_title;
                    if (((TextView) a4.p.e(R.id.dialog_title, viewInflate)) != null) {
                        i = R.id.suggest_image;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) a4.p.e(R.id.suggest_image, viewInflate);
                        if (appCompatImageView != null) {
                            this.f698B0 = new C3024a((LinearLayoutCompat) viewInflate, materialButton, materialButton2, materialButton3, appCompatImageView);
                            Uri uri = this.f697A0;
                            if (uri != null) {
                                appCompatImageView.setImageURI(uri);
                            }
                            C3024a c3024a = this.f698B0;
                            q5.i.b(c3024a);
                            final int i3 = 0;
                            c3024a.f24479b.setOnClickListener(new View.OnClickListener(this) { // from class: B4.D

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ F f696b;

                                {
                                    this.f696b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i3) {
                                        case 0:
                                            this.f696b.X();
                                            break;
                                        case 1:
                                            F f2 = this.f696b;
                                            E e6 = f2.f699C0;
                                            if (e6 != null) {
                                                e6.n(0);
                                            }
                                            f2.X();
                                            break;
                                        default:
                                            F f5 = this.f696b;
                                            E e7 = f5.f699C0;
                                            if (e7 != null) {
                                                e7.n(1);
                                            }
                                            f5.X();
                                            break;
                                    }
                                }
                            });
                            C3024a c3024a2 = this.f698B0;
                            q5.i.b(c3024a2);
                            final int i6 = 1;
                            c3024a2.f24480c.setOnClickListener(new View.OnClickListener(this) { // from class: B4.D

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ F f696b;

                                {
                                    this.f696b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i6) {
                                        case 0:
                                            this.f696b.X();
                                            break;
                                        case 1:
                                            F f2 = this.f696b;
                                            E e6 = f2.f699C0;
                                            if (e6 != null) {
                                                e6.n(0);
                                            }
                                            f2.X();
                                            break;
                                        default:
                                            F f5 = this.f696b;
                                            E e7 = f5.f699C0;
                                            if (e7 != null) {
                                                e7.n(1);
                                            }
                                            f5.X();
                                            break;
                                    }
                                }
                            });
                            C3024a c3024a3 = this.f698B0;
                            q5.i.b(c3024a3);
                            final int i7 = 2;
                            c3024a3.f24481d.setOnClickListener(new View.OnClickListener(this) { // from class: B4.D

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ F f696b;

                                {
                                    this.f696b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i7) {
                                        case 0:
                                            this.f696b.X();
                                            break;
                                        case 1:
                                            F f2 = this.f696b;
                                            E e6 = f2.f699C0;
                                            if (e6 != null) {
                                                e6.n(0);
                                            }
                                            f2.X();
                                            break;
                                        default:
                                            F f5 = this.f696b;
                                            E e7 = f5.f699C0;
                                            if (e7 != null) {
                                                e7.n(1);
                                            }
                                            f5.X();
                                            break;
                                    }
                                }
                            });
                            C3024a c3024a4 = this.f698B0;
                            q5.i.b(c3024a4);
                            return (LinearLayoutCompat) c3024a4.f24482e;
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
        this.f698B0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        k3.e eVar = (k3.e) this.v0;
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
