package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    Context f576b;

    /* renamed from: c, reason: collision with root package name */
    LayoutInflater f577c;

    /* renamed from: d, reason: collision with root package name */
    e f578d;

    /* renamed from: e, reason: collision with root package name */
    ExpandedMenuView f579e;

    /* renamed from: f, reason: collision with root package name */
    int f580f;

    /* renamed from: g, reason: collision with root package name */
    int f581g;

    /* renamed from: h, reason: collision with root package name */
    int f582h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f583i;

    /* renamed from: j, reason: collision with root package name */
    a f584j;

    private class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        private int f585b = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f578d.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f578d.z();
                int size = arrayListZ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListZ.get(i2) == gVarV) {
                        this.f585b = i2;
                        return;
                    }
                }
            }
            this.f585b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i2) {
            ArrayList<g> arrayListZ = c.this.f578d.z();
            int i3 = i2 + c.this.f580f;
            int i4 = this.f585b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListZ.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f578d.z().size() - c.this.f580f;
            return this.f585b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f577c.inflate(cVar.f582h, viewGroup, false);
            }
            ((k.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i2, int i3) {
        this.f582h = i2;
        this.f581g = i3;
    }

    public c(Context context, int i2) {
        this(i2, 0);
        this.f576b = context;
        this.f577c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f584j == null) {
            this.f584j = new a();
        }
        return this.f584j;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        j.a aVar = this.f583i;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f583i = aVar;
    }

    public k e(ViewGroup viewGroup) {
        if (this.f579e == null) {
            this.f579e = (ExpandedMenuView) this.f577c.inflate(a.g.f104g, viewGroup, false);
            if (this.f584j == null) {
                this.f584j = new a();
            }
            this.f579e.setAdapter((ListAdapter) this.f584j);
            this.f579e.setOnItemClickListener(this);
        }
        return this.f579e;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f583i;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z2) {
        a aVar = this.f584j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f581g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f581g
            r0.<init>(r3, r1)
            r2.f576b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f577c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f576b
            if (r0 == 0) goto L23
            r2.f576b = r3
            android.view.LayoutInflater r0 = r2.f577c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f578d = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f584j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.j(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f578d.M(this.f584j.getItem(i2), this, 0);
    }
}
