package rj;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends x1 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, tj.b {

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f33005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f33006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, com.google.android.gms.internal.consent_sdk.d dVar) {
        super((ConstraintLayout) dVar.f19295a);
        this.f33006d = iVar;
        this.f33005c = dVar;
        ImageView imageView = (ImageView) dVar.f19297c;
        Drawable background = imageView.getBackground();
        nk.k.d(background, "getBackground(...)");
        imageView.setBackground(wb.e.M(background, jm.a.z().b(this.itemView.getContext())));
        jm.a.z().c((AppCompatCheckBox) dVar.f19296b);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        int bindingAdapterPosition;
        nk.k.e(compoundButton, "buttonView");
        i iVar = this.f33006d;
        if (iVar.f33009l || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        iVar.f33007i.c(iVar, bindingAdapterPosition, z3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nk.k.e(view, "v");
        i iVar = this.f33006d;
        if (iVar.f33009l) {
            Toast.makeText(view.getContext(), R.string.fa_deleting_locked_tip, 0).show();
            return;
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        c cVar = (c) iVar.j.get(bindingAdapterPosition);
        if (cVar instanceof a) {
            pd.b.t(view.getContext(), new File(((a) cVar).f32986c.c()));
        }
    }
}
