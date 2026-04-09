package rj;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends x1 implements CompoundButton.OnCheckedChangeListener, tj.a {

    /* renamed from: c, reason: collision with root package name */
    public final f1 f33001c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33002d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33003e;

    /* renamed from: f, reason: collision with root package name */
    public int f33004f;
    public final /* synthetic */ i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, f1 f1Var) {
        super((ConstraintLayout) f1Var.f1134b);
        this.g = iVar;
        this.f33001c = f1Var;
        this.f33002d = 1;
        this.f33003e = 2;
        this.f33004f = 0;
        jm.a.z().c((AppCompatCheckBox) f1Var.f1135c);
        this.itemView.setOnClickListener(new ah.g(10, iVar, this));
    }

    public final void a() {
        int i4 = this.f33004f;
        int i10 = this.f33002d;
        f1 f1Var = this.f33001c;
        if (i4 == i10) {
            ((AppCompatCheckBox) f1Var.f1135c).setButtonDrawable(R.drawable.fa_ic_check_box_all);
        } else if (i4 == this.f33003e) {
            ((AppCompatCheckBox) f1Var.f1135c).setButtonDrawable(R.drawable.fa_ic_check_box_part);
        } else {
            ((AppCompatCheckBox) f1Var.f1135c).setButtonDrawable(R.drawable.fa_ic_check_box_none);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        nk.k.e(compoundButton, "buttonView");
        i iVar = this.g;
        jj.f fVar = iVar.f33007i;
        if (iVar.f33009l) {
            return;
        }
        int i4 = this.f33004f;
        int i10 = this.f33002d;
        if (i4 == i10 || i4 == this.f33003e) {
            this.f33004f = 0;
            fVar.c(iVar, getBindingAdapterPosition(), false);
        } else {
            this.f33004f = i10;
            fVar.c(iVar, getBindingAdapterPosition(), true);
        }
        a();
    }
}
