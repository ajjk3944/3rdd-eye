package N4;

import A2.C0115c;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.ui.wifi.SquatterDetailActivity;
import h0.C2351a;
import java.util.ArrayList;
import k0.DialogInterfaceOnCancelListenerC2610n;

/* loaded from: classes.dex */
public final class f extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: B0, reason: collision with root package name */
    public int f2998B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0115c f2999C0;

    /* renamed from: E0, reason: collision with root package name */
    public C2351a f3001E0;

    /* renamed from: A0, reason: collision with root package name */
    public final D4.a f2997A0 = new D4.a(R.layout.item_device_type, 2);

    /* renamed from: D0, reason: collision with root package name */
    public final ArrayList f3000D0 = new ArrayList();

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (this.f3001E0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_device_type, viewGroup, false);
        int i = R.id.b;
        if (((LinearLayout) a4.p.e(R.id.b, viewInflate)) != null) {
            i = R.id.device_cancel;
            MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.device_cancel, viewInflate);
            if (materialButton != null) {
                i = R.id.device_recycler;
                RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.device_recycler, viewInflate);
                if (recyclerView != null) {
                    i = R.id.device_save;
                    MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.device_save, viewInflate);
                    if (materialButton2 != null) {
                        i = R.id.l1;
                        View viewE = a4.p.e(R.id.l1, viewInflate);
                        if (viewE != null) {
                            i = R.id.l2;
                            View viewE2 = a4.p.e(R.id.l2, viewInflate);
                            if (viewE2 != null) {
                                i = R.id.t;
                                if (((TextView) a4.p.e(R.id.t, viewInflate)) != null) {
                                    this.f2999C0 = new C0115c((RelativeLayout) viewInflate, materialButton, recyclerView, materialButton2, viewE, viewE2);
                                    final int i3 = 0;
                                    materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: N4.d

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ f f2993b;

                                        {
                                            this.f2993b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i6;
                                            switch (i3) {
                                                case 0:
                                                    this.f2993b.Z(false, false);
                                                    break;
                                                default:
                                                    f fVar = this.f2993b;
                                                    C2351a c2351a = fVar.f3001E0;
                                                    if (c2351a != null) {
                                                        int i7 = fVar.f2998B0;
                                                        SquatterDetailActivity squatterDetailActivity = (SquatterDetailActivity) c2351a.f20441b;
                                                        SquatterBean squatterBean = squatterDetailActivity.f19377Q;
                                                        q5.i.b(squatterBean);
                                                        squatterBean.setType(i7);
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) c2351a.f20442c;
                                                        switch (i7) {
                                                            case 1:
                                                                i6 = R.drawable.ic_phone_device;
                                                                break;
                                                            case 2:
                                                                i6 = R.drawable.ic_tablet;
                                                                break;
                                                            case 3:
                                                                i6 = R.drawable.ic_watch;
                                                                break;
                                                            case 4:
                                                                i6 = R.drawable.ic_computer;
                                                                break;
                                                            case 5:
                                                                i6 = R.drawable.ic_camera;
                                                                break;
                                                            case 6:
                                                                i6 = R.drawable.ic_tv_device;
                                                                break;
                                                            case 7:
                                                                i6 = R.drawable.ic_router_device;
                                                                break;
                                                            case 8:
                                                                i6 = R.drawable.ic_sound_device;
                                                                break;
                                                            case 9:
                                                                i6 = R.drawable.ic_device_printer;
                                                                break;
                                                            case 10:
                                                                i6 = R.drawable.ic_device_game;
                                                                break;
                                                            case 11:
                                                                i6 = R.drawable.ic_car;
                                                                break;
                                                            default:
                                                                i6 = R.drawable.ic_unknown_device;
                                                                break;
                                                        }
                                                        appCompatImageView.setImageResource(i6);
                                                        SquatterBean squatterBean2 = squatterDetailActivity.f19377Q;
                                                        q5.i.b(squatterBean2);
                                                        if (squatterBean2.isMy()) {
                                                            SharedPreferences sharedPreferences = squatterDetailActivity.getSharedPreferences("sp", 0);
                                                            q5.i.b(sharedPreferences);
                                                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                            editorEdit.putInt("my_device_type", i7);
                                                            editorEdit.apply();
                                                        } else {
                                                            L4.h hVar = (L4.h) squatterDetailActivity.f19376P.getValue();
                                                            SquatterBean squatterBean3 = squatterDetailActivity.f19377Q;
                                                            q5.i.b(squatterBean3);
                                                            hVar.a(squatterBean3);
                                                        }
                                                    }
                                                    fVar.Z(false, false);
                                                    break;
                                            }
                                        }
                                    });
                                    C0115c c0115c = this.f2999C0;
                                    q5.i.b(c0115c);
                                    RecyclerView recyclerView2 = (RecyclerView) c0115c.f236c;
                                    D4.a aVar = this.f2997A0;
                                    recyclerView2.setAdapter(aVar);
                                    ArrayList arrayList = this.f3000D0;
                                    aVar.p(arrayList);
                                    String strR = r(R.string.generic_device);
                                    q5.i.d(strR, "getString(...)");
                                    arrayList.add(new e(strR, R.drawable.ic_unknown_device, this.f2998B0 == 0));
                                    String strR2 = r(R.string.device_phone);
                                    q5.i.d(strR2, "getString(...)");
                                    arrayList.add(new e(strR2, R.drawable.ic_phone_device, this.f2998B0 == 1));
                                    String strR3 = r(R.string.device_table);
                                    q5.i.d(strR3, "getString(...)");
                                    arrayList.add(new e(strR3, R.drawable.ic_tablet, this.f2998B0 == 2));
                                    String strR4 = r(R.string.device_watch);
                                    q5.i.d(strR4, "getString(...)");
                                    arrayList.add(new e(strR4, R.drawable.ic_watch, this.f2998B0 == 3));
                                    String strR5 = r(R.string.device_computer);
                                    q5.i.d(strR5, "getString(...)");
                                    arrayList.add(new e(strR5, R.drawable.ic_computer, this.f2998B0 == 4));
                                    String strR6 = r(R.string.device_camera);
                                    q5.i.d(strR6, "getString(...)");
                                    arrayList.add(new e(strR6, R.drawable.ic_camera, this.f2998B0 == 5));
                                    String strR7 = r(R.string.device_tv);
                                    q5.i.d(strR7, "getString(...)");
                                    arrayList.add(new e(strR7, R.drawable.ic_tv_device, this.f2998B0 == 6));
                                    String strR8 = r(R.string.router);
                                    q5.i.d(strR8, "getString(...)");
                                    arrayList.add(new e(strR8, R.drawable.ic_router_device, this.f2998B0 == 7));
                                    String strR9 = r(R.string.device_sound);
                                    q5.i.d(strR9, "getString(...)");
                                    arrayList.add(new e(strR9, R.drawable.ic_sound_device, this.f2998B0 == 8));
                                    String strR10 = r(R.string.device_printer);
                                    q5.i.d(strR10, "getString(...)");
                                    arrayList.add(new e(strR10, R.drawable.ic_device_printer, this.f2998B0 == 9));
                                    String strR11 = r(R.string.device_game);
                                    q5.i.d(strR11, "getString(...)");
                                    arrayList.add(new e(strR11, R.drawable.ic_device_game, this.f2998B0 == 10));
                                    String strR12 = r(R.string.device_car);
                                    q5.i.d(strR12, "getString(...)");
                                    arrayList.add(new e(strR12, R.drawable.ic_car, this.f2998B0 == 11));
                                    recyclerView2.c0(this.f2998B0);
                                    aVar.f4672f = new F4.c(2, this);
                                    C0115c c0115c2 = this.f2999C0;
                                    q5.i.b(c0115c2);
                                    final int i6 = 1;
                                    ((MaterialButton) c0115c2.f237d).setOnClickListener(new View.OnClickListener(this) { // from class: N4.d

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ f f2993b;

                                        {
                                            this.f2993b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i62;
                                            switch (i6) {
                                                case 0:
                                                    this.f2993b.Z(false, false);
                                                    break;
                                                default:
                                                    f fVar = this.f2993b;
                                                    C2351a c2351a = fVar.f3001E0;
                                                    if (c2351a != null) {
                                                        int i7 = fVar.f2998B0;
                                                        SquatterDetailActivity squatterDetailActivity = (SquatterDetailActivity) c2351a.f20441b;
                                                        SquatterBean squatterBean = squatterDetailActivity.f19377Q;
                                                        q5.i.b(squatterBean);
                                                        squatterBean.setType(i7);
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) c2351a.f20442c;
                                                        switch (i7) {
                                                            case 1:
                                                                i62 = R.drawable.ic_phone_device;
                                                                break;
                                                            case 2:
                                                                i62 = R.drawable.ic_tablet;
                                                                break;
                                                            case 3:
                                                                i62 = R.drawable.ic_watch;
                                                                break;
                                                            case 4:
                                                                i62 = R.drawable.ic_computer;
                                                                break;
                                                            case 5:
                                                                i62 = R.drawable.ic_camera;
                                                                break;
                                                            case 6:
                                                                i62 = R.drawable.ic_tv_device;
                                                                break;
                                                            case 7:
                                                                i62 = R.drawable.ic_router_device;
                                                                break;
                                                            case 8:
                                                                i62 = R.drawable.ic_sound_device;
                                                                break;
                                                            case 9:
                                                                i62 = R.drawable.ic_device_printer;
                                                                break;
                                                            case 10:
                                                                i62 = R.drawable.ic_device_game;
                                                                break;
                                                            case 11:
                                                                i62 = R.drawable.ic_car;
                                                                break;
                                                            default:
                                                                i62 = R.drawable.ic_unknown_device;
                                                                break;
                                                        }
                                                        appCompatImageView.setImageResource(i62);
                                                        SquatterBean squatterBean2 = squatterDetailActivity.f19377Q;
                                                        q5.i.b(squatterBean2);
                                                        if (squatterBean2.isMy()) {
                                                            SharedPreferences sharedPreferences = squatterDetailActivity.getSharedPreferences("sp", 0);
                                                            q5.i.b(sharedPreferences);
                                                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                            editorEdit.putInt("my_device_type", i7);
                                                            editorEdit.apply();
                                                        } else {
                                                            L4.h hVar = (L4.h) squatterDetailActivity.f19376P.getValue();
                                                            SquatterBean squatterBean3 = squatterDetailActivity.f19377Q;
                                                            q5.i.b(squatterBean3);
                                                            hVar.a(squatterBean3);
                                                        }
                                                    }
                                                    fVar.Z(false, false);
                                                    break;
                                            }
                                        }
                                    });
                                    C0115c c0115c3 = this.f2999C0;
                                    q5.i.b(c0115c3);
                                    return (RelativeLayout) c0115c3.f235b;
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
        this.f2999C0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        Window window;
        super.K();
        DisplayMetrics displayMetrics = q().getDisplayMetrics();
        Dialog dialog = this.v0;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout((int) (displayMetrics.widthPixels * 0.9d), (int) (displayMetrics.heightPixels * 0.7d));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.customDialog;
    }
}
