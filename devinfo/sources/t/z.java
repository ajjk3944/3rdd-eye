package t;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i1;
import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class z extends b5.s {

    /* renamed from: p0, reason: collision with root package name */
    public final Handler f33878p0 = new Handler(Looper.getMainLooper());

    /* renamed from: q0, reason: collision with root package name */
    public final o1 f33879q0 = new o1(7, this);

    /* renamed from: r0, reason: collision with root package name */
    public s f33880r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f33881s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f33882t0;

    /* renamed from: u0, reason: collision with root package name */
    public ImageView f33883u0;

    /* renamed from: v0, reason: collision with root package name */
    public TextView f33884v0;

    @Override // b5.s, b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        i.g gVarN = n();
        if (gVarN != null) {
            s sVar = (s) new i1(gVarN.e(), gVarN.b(), gVarN.c()).a(nk.v.a(s.class));
            this.f33880r0 = sVar;
            if (sVar.f33874x == null) {
                sVar.f33874x = new l0();
            }
            sVar.f33874x.e(this, new w(this, 0));
            s sVar2 = this.f33880r0;
            if (sVar2.f33875y == null) {
                sVar2.f33875y = new l0();
            }
            sVar2.f33875y.e(this, new w(this, 1));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33881s0 = j0(y.a());
        } else {
            Context contextP = p();
            this.f33881s0 = contextP != null ? contextP.getColor(R.color.biometric_error_color) : 0;
        }
        this.f33882t0 = j0(android.R.attr.textColorSecondary);
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        this.f33878p0.removeCallbacksAndMessages(null);
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        s sVar = this.f33880r0;
        sVar.f33873w = 0;
        sVar.h(1);
        this.f33880r0.g(u(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // b5.s
    public final Dialog e0(Bundle bundle) {
        t7.m mVar = new t7.m(W());
        i.b bVar = (i.b) mVar.f34474c;
        se.b bVar2 = this.f33880r0.f33856d;
        CharSequence charSequenceU = null;
        bVar.f25233d = bVar2 != null ? (CharSequence) bVar2.f33556a : null;
        View viewInflate = LayoutInflater.from(bVar.f25230a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            se.b bVar3 = this.f33880r0.f33856d;
            CharSequence charSequence = bVar3 != null ? (CharSequence) bVar3.f33557b : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            se.b bVar4 = this.f33880r0.f33856d;
            CharSequence charSequence2 = bVar4 != null ? (CharSequence) bVar4.f33558c : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence2);
            }
        }
        this.f33883u0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.f33884v0 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (com.bumptech.glide.e.F(this.f33880r0.e())) {
            charSequenceU = u(R.string.confirm_device_credential_password);
        } else {
            s sVar = this.f33880r0;
            String str = sVar.f33860i;
            if (str != null) {
                charSequenceU = str;
            } else {
                se.b bVar5 = sVar.f33856d;
                if (bVar5 != null && (charSequenceU = (CharSequence) bVar5.f33559d) == null) {
                    charSequenceU = "";
                }
            }
        }
        r rVar = new r(1, this);
        bVar.f25237i = charSequenceU;
        bVar.j = rVar;
        mVar.z(viewInflate);
        i.e eVarF = mVar.f();
        eVarF.setCanceledOnTouchOutside(false);
        return eVarF;
    }

    public final int j0(int i4) throws Resources.NotFoundException {
        Context contextP = p();
        i.g gVarN = n();
        if (contextP == null || gVarN == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextP.getTheme().resolveAttribute(i4, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = gVarN.obtainStyledAttributes(typedValue.data, new int[]{i4});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // b5.s, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        s sVar = this.f33880r0;
        if (sVar.f33872v == null) {
            sVar.f33872v = new l0();
        }
        s.j(sVar.f33872v, Boolean.TRUE);
    }
}
