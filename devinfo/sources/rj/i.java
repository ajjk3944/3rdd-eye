package rj;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.List;
import je.u;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final jj.f f33007i;
    public List j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f33008k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33009l;

    public i(Context context, jj.f fVar) {
        nk.k.e(context, "context");
        nk.k.e(fVar, "operator");
        this.f33007i = fVar;
        this.j = s.f38317a;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        nk.k.d(layoutInflaterFrom, "from(...)");
        this.f33008k = layoutInflaterFrom;
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        return this.j.size();
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemViewType(int i4) {
        if (i4 < this.j.size()) {
            return ((c) this.j.get(i4)) instanceof a ? 1 : 2;
        }
        throw new IllegalStateException(u.r(i4, "No data at position: "));
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) throws Resources.NotFoundException {
        nk.k.e(x1Var, "holder");
        c cVar = (c) this.j.get(i4);
        if (!(x1Var instanceof g)) {
            if (x1Var instanceof h) {
                h hVar = (h) x1Var;
                nk.k.c(cVar, "null cannot be cast to non-null type com.liuzho.lib.fileanalyzer.view.repeatfile.DisplayItem.ChildItem");
                a aVar = (a) cVar;
                aj.b bVar = aVar.f32986c;
                com.google.android.gms.internal.consent_sdk.d dVar = hVar.f33005c;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) dVar.f19296b;
                appCompatCheckBox.setOnCheckedChangeListener(null);
                appCompatCheckBox.setChecked(aVar.f32988e);
                appCompatCheckBox.setEnabled(!hVar.f33006d.f33009l);
                ((TextView) dVar.f19298d).setText(bVar.f410e);
                ((TextView) dVar.f19299e).setText(bVar.c());
                ((TextView) dVar.f19302i).setVisibility(aVar.b() ? 0 : 8);
                ((TextView) dVar.f19301h).setText(wi.c.h(bVar.f407b, false, true));
                ((TextView) dVar.f19300f).setText(wi.c.e(bVar.f406a));
                appCompatCheckBox.setOnCheckedChangeListener(hVar);
                cm.g.u(bVar, (ImageView) dVar.g, (ImageView) dVar.f19297c);
                return;
            }
            return;
        }
        g gVar = (g) x1Var;
        nk.k.c(cVar, "null cannot be cast to non-null type com.liuzho.lib.fileanalyzer.view.repeatfile.DisplayItem.GroupItem");
        b bVar2 = (b) cVar;
        ArrayList arrayList = bVar2.f32990b;
        f1 f1Var = gVar.f33001c;
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) f1Var.f1135c;
        appCompatCheckBox2.setOnCheckedChangeListener(null);
        if (bVar2.f32993e == arrayList.size()) {
            appCompatCheckBox2.setChecked(true);
            gVar.f33004f = gVar.f33002d;
        } else {
            int i10 = bVar2.f32993e;
            if (i10 <= 0 || i10 >= arrayList.size()) {
                appCompatCheckBox2.setChecked(false);
                gVar.f33004f = 0;
            } else {
                appCompatCheckBox2.setChecked(true);
                gVar.f33004f = gVar.f33003e;
            }
        }
        appCompatCheckBox2.setEnabled(!gVar.g.f33009l);
        gVar.a();
        ((TextView) f1Var.f1138f).setText(wi.c.e(bVar2.a()));
        ((TextView) f1Var.f1137e).setText(((ConstraintLayout) f1Var.f1134b).getContext().getString(R.string.fa_item_count_template, Integer.valueOf(arrayList.size())));
        ((ImageView) f1Var.f1136d).setRotation(bVar2.f32991c ? 180.0f : 0.0f);
        appCompatCheckBox2.setOnCheckedChangeListener(gVar);
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        nk.k.e(viewGroup, "parent");
        LayoutInflater layoutInflater = this.f33008k;
        if (i4 != 2) {
            return new h(this, com.google.android.gms.internal.consent_sdk.d.c(layoutInflater, viewGroup));
        }
        View viewInflate = layoutInflater.inflate(R.layout.fa_item_repeat_group, viewGroup, false);
        int i10 = R.id.checkbox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) wb.e.s(R.id.checkbox, viewInflate);
        if (appCompatCheckBox != null) {
            i10 = R.id.expand_arrow;
            ImageView imageView = (ImageView) wb.e.s(R.id.expand_arrow, viewInflate);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i10 = R.id.group_count;
                TextView textView = (TextView) wb.e.s(R.id.group_count, viewInflate);
                if (textView != null) {
                    i10 = R.id.size;
                    TextView textView2 = (TextView) wb.e.s(R.id.size, viewInflate);
                    if (textView2 != null) {
                        return new g(this, new f1(constraintLayout, appCompatCheckBox, imageView, textView, textView2, 11));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
