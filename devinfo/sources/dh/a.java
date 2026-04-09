package dh;

import android.widget.CompoundButton;
import androidx.lifecycle.f1;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.liuzh.deviceinfo.pro.account.delete.DeleteAccountActivity;
import hh.v;
import hh.y;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22252b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f22251a = i4;
        this.f22252b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        int i4 = this.f22251a;
        Object obj = this.f22252b;
        switch (i4) {
            case 0:
                int i10 = DeleteAccountActivity.D;
                k.e(compoundButton, "<unused var>");
                f1 f1Var = ((DeleteAccountActivity) obj).C;
                if (f1Var != null) {
                    ((MaterialButton) f1Var.f1135c).setEnabled(z3);
                    return;
                } else {
                    k.k("binding");
                    throw null;
                }
            case 1:
                k.e(compoundButton, "<unused var>");
                y yVarI0 = ((v) obj).i0();
                if (z3) {
                    yVarI0.j.h(Boolean.FALSE);
                    return;
                } else {
                    yVarI0.getClass();
                    return;
                }
            default:
                Chip chip = (Chip) obj;
                zc.f fVar = chip.j;
                if (fVar != null) {
                    ur0 ur0Var = (ur0) ((z2.f) fVar).f37861a;
                    if (!z3 ? ur0Var.e(chip, ur0Var.f17303c) : ur0Var.a(chip)) {
                        ur0Var.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f20418i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                    return;
                }
                return;
        }
    }
}
