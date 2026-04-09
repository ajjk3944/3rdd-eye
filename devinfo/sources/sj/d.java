package sj;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.x1;
import cm.g;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.ui.SquareImageView;
import nj.e;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends e {
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final jj.d f33815k;

    /* renamed from: l, reason: collision with root package name */
    public final LayoutInflater f33816l;

    public d(Context context, jj.d dVar) {
        k.e(context, "context");
        k.e(dVar, "operator");
        this.j = context;
        this.f33815k = dVar;
        this.f33816l = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) throws Resources.NotFoundException {
        c cVar = (c) x1Var;
        k.e(cVar, "holder");
        aj.b bVar = (aj.b) this.f29954i.get(i4);
        f1 f1Var = cVar.f33813c;
        g.u(bVar, (SquareImageView) f1Var.f1137e, null);
        ((TextView) f1Var.f1138f).setText(wi.c.e(bVar.f406a));
        ((AppCompatCheckBox) f1Var.f1135c).setChecked(this.f33815k.f27713f.contains(bVar));
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        k.e(viewGroup, "parent");
        View viewInflate = this.f33816l.inflate(R.layout.fa_item_media_preview, viewGroup, false);
        int i10 = R.id.item_checkbox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) wb.e.s(R.id.item_checkbox, viewInflate);
        if (appCompatCheckBox != null) {
            i10 = R.id.iv_expand;
            ImageView imageView = (ImageView) wb.e.s(R.id.iv_expand, viewInflate);
            if (imageView != null) {
                i10 = R.id.iv_preview;
                SquareImageView squareImageView = (SquareImageView) wb.e.s(R.id.iv_preview, viewInflate);
                if (squareImageView != null) {
                    i10 = R.id.tv_size;
                    TextView textView = (TextView) wb.e.s(R.id.tv_size, viewInflate);
                    if (textView != null) {
                        return new c(this, new f1((CardView) viewInflate, appCompatCheckBox, imageView, squareImageView, textView, 10));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
