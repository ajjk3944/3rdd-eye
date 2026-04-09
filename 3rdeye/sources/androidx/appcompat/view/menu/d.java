package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f14416b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f14417c;

    /* renamed from: d, reason: collision with root package name */
    public f f14418d;

    /* renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f14419e;

    /* renamed from: f, reason: collision with root package name */
    public j.a f14420f;

    /* renamed from: g, reason: collision with root package name */
    public a f14421g;

    /* compiled from: ListMenuPresenter.java */
    public class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public int f14422b = -1;

        public a() {
            a();
        }

        public final void a() {
            f fVar = d.this.f14418d;
            h hVar = fVar.f14451v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f14439j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.f14422b = i;
                        return;
                    }
                }
            }
            this.f14422b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i) {
            d dVar = d.this;
            f fVar = dVar.f14418d;
            fVar.i();
            ArrayList<h> arrayList = fVar.f14439j;
            dVar.getClass();
            int i10 = this.f14422b;
            if (i10 >= 0 && i >= i10) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f14418d;
            fVar.i();
            int size = fVar.f14439j.size();
            dVar.getClass();
            return this.f14422b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f14417c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).i(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public d(ContextWrapper contextWrapper) {
        this.f14416b = contextWrapper;
        this.f14417c = LayoutInflater.from(contextWrapper);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        j.a aVar = this.f14420f;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Context context, f fVar) {
        if (this.f14416b != null) {
            this.f14416b = context;
            if (this.f14417c == null) {
                this.f14417c = LayoutInflater.from(context);
            }
        }
        this.f14418d = fVar;
        a aVar = this.f14421g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        a aVar = this.f14421g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g();
        gVar.f14454b = mVar;
        Context context = mVar.f14431a;
        d.a aVar = new d.a(context);
        AlertController.b bVar = aVar.f14344a;
        d dVar = new d(bVar.f14314a);
        gVar.f14456d = dVar;
        dVar.f14420f = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f14456d;
        if (dVar2.f14421g == null) {
            dVar2.f14421g = dVar2.new a();
        }
        bVar.f14325m = dVar2.f14421g;
        bVar.f14326n = gVar;
        View view = mVar.f14444o;
        if (view != null) {
            bVar.f14318e = view;
        } else {
            bVar.f14316c = mVar.f14443n;
            bVar.f14317d = mVar.f14442m;
        }
        bVar.f14323k = gVar;
        androidx.appcompat.app.d dVarA = aVar.a();
        gVar.f14455c = dVarA;
        dVarA.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f14455c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f14455c.show();
        j.a aVar2 = this.f14420f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j4) {
        this.f14418d.q(this.f14421g.getItem(i), this, 0);
    }
}
