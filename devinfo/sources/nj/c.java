package nj;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.x1;
import java.io.File;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends x1 implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f29950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f29951d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(d dVar, com.google.android.gms.internal.consent_sdk.d dVar2) {
        this.f29951d = dVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) dVar2.f19295a;
        super(constraintLayout);
        this.f29950c = dVar2;
        ImageView imageView = (ImageView) dVar2.f19297c;
        Drawable background = imageView.getBackground();
        k.d(background, "getBackground(...)");
        imageView.setBackground(wb.e.M(background, jm.a.z().b(constraintLayout.getContext())));
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) dVar2.f19296b;
        appCompatCheckBox.setOnCheckedChangeListener(this);
        jm.a.z().c(appCompatCheckBox);
        constraintLayout.setOnClickListener(this);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        k.e(compoundButton, "buttonView");
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        d dVar = this.f29951d;
        dVar.f29952k.d((aj.b) dVar.f29954i.get(bindingAdapterPosition), z3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k.e(view, "v");
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        pd.b.t(view.getContext(), new File(((aj.b) this.f29951d.f29954i.get(bindingAdapterPosition)).c()));
    }
}
