package sj;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.x1;
import com.liuzho.lib.fileanalyzer.activity.PicPreviewActivity;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends x1 implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final f1 f33813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f33814d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(d dVar, f1 f1Var) {
        this.f33814d = dVar;
        CardView cardView = (CardView) f1Var.f1134b;
        super(cardView);
        this.f33813c = f1Var;
        ((ImageView) f1Var.f1136d).setOnClickListener(this);
        cardView.setOnClickListener(this);
        cardView.setOnLongClickListener(this);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) f1Var.f1135c;
        appCompatCheckBox.setOnCheckedChangeListener(this);
        jm.a.z().c(appCompatCheckBox);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        k.e(compoundButton, "buttonView");
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        d dVar = this.f33814d;
        dVar.f33815k.d((aj.b) dVar.f29954i.get(bindingAdapterPosition), z3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k.e(view, "v");
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        f1 f1Var = this.f33813c;
        if (view.equals((CardView) f1Var.f1134b)) {
            ((AppCompatCheckBox) f1Var.f1135c).toggle();
            return;
        }
        if (view.equals((ImageView) f1Var.f1136d)) {
            int i4 = PicPreviewActivity.C;
            d dVar = this.f33814d;
            Context context = dVar.j;
            String strC = ((aj.b) dVar.f29954i.get(bindingAdapterPosition)).c();
            k.d(strC, "getPath(...)");
            k.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) PicPreviewActivity.class);
            intent.putExtra("arg_img_path", strC);
            context.startActivity(intent);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        if (view != this.itemView) {
            return true;
        }
        int i4 = PicPreviewActivity.C;
        d dVar = this.f33814d;
        Context context = dVar.j;
        String strC = ((aj.b) dVar.f29954i.get(bindingAdapterPosition)).c();
        k.d(strC, "getPath(...)");
        k.e(context, "context");
        Intent intent = new Intent(context, (Class<?>) PicPreviewActivity.class);
        intent.putExtra("arg_img_path", strC);
        context.startActivity(intent);
        return true;
    }
}
