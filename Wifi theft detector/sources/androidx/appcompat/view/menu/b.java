package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements h, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f694a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f695b;

    /* renamed from: c, reason: collision with root package name */
    public d f696c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f697d;

    /* renamed from: e, reason: collision with root package name */
    public int f698e;

    /* renamed from: f, reason: collision with root package name */
    public int f699f;

    /* renamed from: g, reason: collision with root package name */
    public int f700g;

    /* renamed from: h, reason: collision with root package name */
    public h.a f701h;

    /* renamed from: i, reason: collision with root package name */
    public a f702i;

    /* renamed from: j, reason: collision with root package name */
    public int f703j;

    public class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public int f704a = -1;

        public a() {
            a();
        }

        public void a() {
            f fVarX = b.this.f696c.x();
            if (fVarX != null) {
                ArrayList arrayListB = b.this.f696c.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((f) arrayListB.get(i10)) == fVarX) {
                        this.f704a = i10;
                        return;
                    }
                }
            }
            this.f704a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f getItem(int i10) {
            ArrayList arrayListB = b.this.f696c.B();
            int i11 = i10 + b.this.f698e;
            int i12 = this.f704a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (f) arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = b.this.f696c.B().size() - b.this.f698e;
            return this.f704a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                b bVar = b.this;
                view = bVar.f695b.inflate(bVar.f700g, viewGroup, false);
            }
            ((i.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public b(Context context, int i10) {
        this(i10, 0);
        this.f694a = context;
        this.f695b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f702i == null) {
            this.f702i = new a();
        }
        return this.f702i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void b(d dVar, boolean z10) {
        h.a aVar = this.f701h;
        if (aVar != null) {
            aVar.b(dVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean c(d dVar, f fVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void d(h.a aVar) {
        this.f701h = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void e(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean f(k kVar) {
        if (!kVar.hasVisibleItems()) {
            return false;
        }
        new e(kVar).d(null);
        h.a aVar = this.f701h;
        if (aVar == null) {
            return true;
        }
        aVar.c(kVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public Parcelable g() {
        if (this.f697d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.h
    public int getId() {
        return this.f703j;
    }

    @Override // androidx.appcompat.view.menu.h
    public void h(boolean z10) {
        a aVar = this.f702i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean j(d dVar, f fVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void k(Context context, d dVar) {
        if (this.f699f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f699f);
            this.f694a = contextThemeWrapper;
            this.f695b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f694a != null) {
            this.f694a = context;
            if (this.f695b == null) {
                this.f695b = LayoutInflater.from(context);
            }
        }
        this.f696c = dVar;
        a aVar = this.f702i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public i l(ViewGroup viewGroup) {
        if (this.f697d == null) {
            this.f697d = (ExpandedMenuView) this.f695b.inflate(c.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f702i == null) {
                this.f702i = new a();
            }
            this.f697d.setAdapter((ListAdapter) this.f702i);
            this.f697d.setOnItemClickListener(this);
        }
        return this.f697d;
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f697d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f697d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f696c.P(this.f702i.getItem(i10), this, 0);
    }

    public b(int i10, int i11) {
        this.f700g = i10;
        this.f699f = i11;
    }
}
