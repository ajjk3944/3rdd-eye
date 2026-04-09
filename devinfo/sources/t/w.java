package t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.m0;
import b5.u0;
import com.liuzh.deviceinfo.R;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b5.s f33877b;

    public /* synthetic */ w(b5.s sVar, int i4) {
        this.f33876a = i4;
        this.f33877b = sVar;
    }

    @Override // androidx.lifecycle.m0
    public final void b(Object obj) {
        switch (this.f33876a) {
            case 0:
                Integer num = (Integer) obj;
                z zVar = (z) this.f33877b;
                Handler handler = zVar.f33878p0;
                o1 o1Var = zVar.f33879q0;
                handler.removeCallbacks(o1Var);
                int iIntValue = num.intValue();
                if (zVar.f33883u0 != null) {
                    int i4 = zVar.f33880r0.f33873w;
                    Context contextP = zVar.p();
                    Drawable drawable = null;
                    if (contextP == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i10 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i4 == 0 && iIntValue == 1) {
                            drawable = contextP.getDrawable(i10);
                        } else {
                            if (i4 == 1 && iIntValue == 2) {
                                i10 = R.drawable.fingerprint_dialog_error;
                            } else if ((i4 == 2 && iIntValue == 1) || (i4 == 1 && iIntValue == 3)) {
                            }
                            drawable = contextP.getDrawable(i10);
                        }
                    }
                    if (drawable != null) {
                        zVar.f33883u0.setImageDrawable(drawable);
                        if ((i4 != 0 || iIntValue != 1) && ((i4 == 1 && iIntValue == 2) || (i4 == 2 && iIntValue == 1))) {
                            x.a(drawable);
                        }
                        zVar.f33880r0.f33873w = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = zVar.f33884v0;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? zVar.f33881s0 : zVar.f33882t0);
                }
                handler.postDelayed(o1Var, 2000L);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                z zVar2 = (z) this.f33877b;
                Handler handler2 = zVar2.f33878p0;
                o1 o1Var2 = zVar2.f33879q0;
                handler2.removeCallbacks(o1Var2);
                TextView textView2 = zVar2.f33884v0;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(o1Var2, 2000L);
                return;
            default:
                if (((androidx.lifecycle.a0) obj) != null) {
                    b5.s sVar = this.f33877b;
                    if (sVar.f1863g0) {
                        View viewX = sVar.X();
                        if (viewX.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        }
                        if (sVar.f1867k0 != null) {
                            if (u0.K(3)) {
                                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + sVar.f1867k0);
                            }
                            sVar.f1867k0.setContentView(viewX);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
