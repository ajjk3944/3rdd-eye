package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m1 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f) {
            case 0:
                ((c2) this.g).a();
                break;
            case 1:
                s3 s3Var = (s3) this.g;
                Message messageObtain = (view != s3Var.i || (message3 = s3Var.k) == null) ? (view != s3Var.l || (message2 = s3Var.n) == null) ? (view != s3Var.o || (message = s3Var.q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                s3Var.F.obtainMessage(1, s3Var.b).sendToTarget();
                break;
            case 2:
                vb vbVar = (vb) this.g;
                if (vbVar.p && vbVar.isShowing()) {
                    if (!vbVar.r) {
                        TypedArray typedArrayObtainStyledAttributes = vbVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        vbVar.q = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        vbVar.r = true;
                    }
                    if (vbVar.q) {
                        vbVar.cancel();
                        break;
                    }
                }
                break;
            case 3:
                cc0 cc0Var = (cc0) this.g;
                int i = cc0Var.d0;
                if (i != 2) {
                    if (i == 1) {
                        cc0Var.O(2);
                        cc0Var.f0.announceForAccessibility(cc0Var.l().getString(com.phuongpn.whousemywifi.networkscanner.R.string.mtrl_picker_toggled_to_year_selection));
                        break;
                    }
                } else {
                    cc0Var.O(1);
                    cc0Var.g0.announceForAccessibility(cc0Var.l().getString(com.phuongpn.whousemywifi.networkscanner.R.string.mtrl_picker_toggled_to_day_selection));
                    break;
                }
                break;
            case 4:
                ((Preference) this.g).s(view);
                break;
            case 5:
                b21 b21Var = ((Toolbar) this.g).R;
                sd0 sd0Var = b21Var == null ? null : b21Var.g;
                if (sd0Var != null) {
                    sd0Var.collapseActionView();
                    break;
                }
                break;
            case 6:
                ((o82) this.g).K(true);
                break;
            case 7:
                jh1 jh1Var = (jh1) this.g;
                jh1Var.B = 2;
                jh1Var.g.finish();
                break;
            default:
                ((ou2) this.g).j.b = true;
                break;
        }
    }

    public m1(o82 o82Var) {
        this.f = 6;
        Objects.requireNonNull(o82Var);
        this.g = o82Var;
    }
}
