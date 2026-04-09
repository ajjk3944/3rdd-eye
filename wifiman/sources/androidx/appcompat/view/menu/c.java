package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import h.AbstractC5933g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f26824a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f26825b;

    /* renamed from: c, reason: collision with root package name */
    e f26826c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f26827d;

    /* renamed from: e, reason: collision with root package name */
    int f26828e;

    /* renamed from: f, reason: collision with root package name */
    int f26829f;

    /* renamed from: g, reason: collision with root package name */
    int f26830g;

    /* renamed from: h, reason: collision with root package name */
    private j.a f26831h;

    /* renamed from: i, reason: collision with root package name */
    a f26832i;

    private class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private int f26833a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f26826c.v();
            if (gVarV != null) {
                ArrayList arrayListZ = c.this.f26826c.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListZ.get(i10)) == gVarV) {
                        this.f26833a = i10;
                        return;
                    }
                }
            }
            this.f26833a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList arrayListZ = c.this.f26826c.z();
            int i11 = i10 + c.this.f26828e;
            int i12 = this.f26833a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f26826c.z().size() - c.this.f26828e;
            return this.f26833a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f26825b.inflate(cVar.f26830g, viewGroup, false);
            }
            ((k.a) view).e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f26824a = context;
        this.f26825b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f26832i == null) {
            this.f26832i = new a();
        }
        return this.f26832i;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f26827d == null) {
            this.f26827d = (ExpandedMenuView) this.f26825b.inflate(AbstractC5933g.f48060g, viewGroup, false);
            if (this.f26832i == null) {
                this.f26832i = new a();
            }
            this.f26827d.setAdapter((ListAdapter) this.f26832i);
            this.f26827d.setOnItemClickListener(this);
        }
        return this.f26827d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        j.a aVar = this.f26831h;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        a aVar = this.f26832i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f26831h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f26829f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f26829f);
            this.f26824a = contextThemeWrapper;
            this.f26825b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f26824a != null) {
            this.f26824a = context;
            if (this.f26825b == null) {
                this.f26825b = LayoutInflater.from(context);
            }
        }
        this.f26826c = eVar;
        a aVar = this.f26832i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f26831h;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f26826c.N(this.f26832i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f26830g = i10;
        this.f26829f = i11;
    }
}
