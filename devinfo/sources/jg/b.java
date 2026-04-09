package jg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import b5.u0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends x1 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f27646c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckBox f27647d;

    /* renamed from: e, reason: collision with root package name */
    public f f27648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f27649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i4, View view) {
        super(view);
        Context context = cVar.f27650i;
        this.f27649f = cVar;
        this.f27646c = new SparseArray();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        int iA = com.liuzh.deviceinfo.utilities.f.a();
        if (i4 == 0) {
            View viewB = b(R.id.icon);
            nk.k.b(viewB);
            ImageView imageView = (ImageView) viewB;
            Drawable background = imageView.getBackground();
            nk.k.d(background, "getBackground(...)");
            imageView.setBackground(wb.e.M(background, zh.i.c(context)));
            imageView.setColorFilter(iD);
        }
        View viewB2 = b(R.id.checkbox);
        nk.k.b(viewB2);
        CheckBox checkBox = (CheckBox) viewB2;
        this.f27647d = checkBox;
        checkBox.setButtonTintList(dj.b.b(iA, context));
        checkBox.setOnCheckedChangeListener(this);
        view.setOnClickListener(this);
    }

    public final void a(int i4, List list) {
        ImageView imageView;
        f fVar = (f) this.f27649f.f27652l.get(i4);
        this.f27648e = fVar;
        CheckBox checkBox = this.f27647d;
        checkBox.setOnCheckedChangeListener(null);
        if (list == null || list.isEmpty()) {
            View viewB = b(R.id.icon);
            nk.k.b(viewB);
            ImageView imageView2 = (ImageView) viewB;
            com.bumptech.glide.b.d(imageView2).i(Drawable.class).C(fVar).z(imageView2);
            View viewB2 = b(R.id.title);
            nk.k.b(viewB2);
            ((TextView) viewB2).setText(fVar.name());
            TextView textView = (TextView) b(R.id.desc);
            if (textView != null) {
                textView.setText(fVar.a());
            }
            View viewB3 = b(R.id.tv_size);
            nk.k.b(viewB3);
            ((TextView) viewB3).setText(wi.c.e(fVar.size()));
            checkBox.setChecked(fVar.f27660a);
            if ((fVar instanceof d) && (imageView = (ImageView) b(R.id.expand_arrow)) != null) {
                imageView.setRotation(((d) fVar).f27656d ? -90.0f : 90.0f);
            }
            TextView textView2 = (TextView) b(R.id.extra_info);
            if (textView2 != null) {
                if (fVar.c()) {
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
            }
        } else {
            Object obj = list.get(0);
            boolean z3 = obj instanceof Integer;
            if (z3 && obj.equals(0)) {
                checkBox.setChecked(fVar.f27660a);
            } else if (z3 && obj.equals(1) && (fVar instanceof d)) {
                View viewB4 = b(R.id.expand_arrow);
                nk.k.b(viewB4);
                ((ImageView) viewB4).setRotation(((d) fVar).f27656d ? -90.0f : 90.0f);
            }
        }
        if (fVar instanceof d) {
            View viewB5 = b(R.id.content_container);
            nk.k.b(viewB5);
            viewB5.setBackgroundResource(((d) fVar).f27656d ? R.drawable.bg_common_card_ripple_topradiusbg_radiusripple : R.drawable.bg_common_card_ripple_radius);
        } else if (fVar instanceof e) {
            e eVar = (e) fVar;
            int i10 = eVar.f27659d;
            d dVar = eVar.f27658c;
            nk.k.b(dVar);
            this.itemView.setBackgroundResource(i10 == dVar.f27654b.size() - 1 ? R.drawable.bg_common_card_ripple_bottomradius : R.drawable.bg_common_card_ripple);
        }
        checkBox.setOnCheckedChangeListener(this);
    }

    public final View b(int i4) {
        SparseArray sparseArray = this.f27646c;
        View viewFindViewById = (View) sparseArray.get(i4);
        if (viewFindViewById == null && (viewFindViewById = this.itemView.findViewById(i4)) != null) {
            sparseArray.put(i4, viewFindViewById);
        }
        return viewFindViewById;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        boolean z10;
        c cVar = this.f27649f;
        ArrayList arrayList = cVar.f27652l;
        nk.k.e(compoundButton, "buttonView");
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        f fVar = (f) arrayList.get(bindingAdapterPosition);
        fVar.f27660a = z3;
        if (fVar instanceof d) {
            cVar.b((d) fVar, bindingAdapterPosition);
            return;
        }
        if (fVar instanceof e) {
            while (-1 < bindingAdapterPosition) {
                if (arrayList.get(bindingAdapterPosition) instanceof d) {
                    Object obj = arrayList.get(bindingAdapterPosition);
                    nk.k.c(obj, "null cannot be cast to non-null type com.liuzh.deviceinfo.clean.ScanResultItem.ScanResultHeaderItem");
                    d dVar = (d) obj;
                    if (dVar.f27656d) {
                        Iterator it = dVar.f27654b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = true;
                                break;
                            } else if (!((e) it.next()).f27660a) {
                                z10 = false;
                                break;
                            }
                        }
                        dVar.f27660a = z10;
                        cVar.j.post(new a(cVar, bindingAdapterPosition, 0));
                        return;
                    }
                    return;
                }
                bindingAdapterPosition--;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strPath;
        nk.k.e(view, "v");
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        c cVar = this.f27649f;
        f fVar = (f) cVar.f27652l.get(bindingAdapterPosition);
        if (fVar instanceof d) {
            if (view == this.itemView) {
                d dVar = (d) fVar;
                dVar.f27656d = !dVar.f27656d;
                cVar.c(dVar, bindingAdapterPosition);
                return;
            }
            return;
        }
        if (view != this.itemView || (strPath = fVar.path()) == null || strPath.length() == 0) {
            return;
        }
        o7.c cVar2 = cVar.f27651k;
        File file = new File(strPath);
        cVar2.getClass();
        u0 u0VarS = ((StorageCleanActivity) cVar2.f30419b).s();
        nk.k.d(u0VarS, "getSupportFragmentManager(...)");
        if (u0VarS.P()) {
            return;
        }
        eg.i iVar = new eg.i();
        Bundle bundle = new Bundle();
        bundle.putString("file_path", file.getAbsolutePath());
        iVar.Z(bundle);
        iVar.h0(u0VarS, "DetailFragment");
    }
}
