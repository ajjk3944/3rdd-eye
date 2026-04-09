package com.liuzh.deviceinfo.diskpartition;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import bh.i;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity;
import e4.m0;
import e4.v0;
import hg.a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import km.y;
import nk.k;
import nk.v;
import p.z2;
import sg.c;
import sg.e;
import sg.f;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class DiskPartitionActivity extends a {
    public static final /* synthetic */ int D = 0;
    public f1 B;
    public final f1 C = new f1(v.a(f.class), new e(this, 1), new e(this, 0), new e(this, 2));

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_disk_partition, (ViewGroup) null, false);
        int i10 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.progress, viewInflate);
        if (progressBar != null) {
            i10 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) wb.e.s(R.id.recycler_view, viewInflate);
            if (recyclerView != null) {
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) wb.e.s(R.id.toolbar, viewInflate);
                if (toolbar != null) {
                    i10 = R.id.tv_failed;
                    TextView textView = (TextView) wb.e.s(R.id.tv_failed, viewInflate);
                    if (textView != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        this.B = new f1(frameLayout, progressBar, recyclerView, toolbar, textView, 20);
                        setContentView(frameLayout);
                        f1 f1Var = this.B;
                        if (f1Var == null) {
                            k.k("binding");
                            throw null;
                        }
                        z((Toolbar) f1Var.f1137e);
                        A();
                        final int i11 = 1;
                        int iMax = Math.max(1, (int) (a4.a.m(this) / a4.a.b(360.0f)));
                        f1 f1Var2 = this.B;
                        if (f1Var2 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((RecyclerView) f1Var2.f1136d).setLayoutManager(new GridLayoutManager(iMax));
                        f1 f1Var3 = this.B;
                        if (f1Var3 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((RecyclerView) f1Var3.f1136d).setAdapter(new c(this));
                        f1 f1Var4 = this.C;
                        int i12 = 12;
                        ((f) f1Var4.getValue()).f33611f.e(this, new i(new mk.c(this) { // from class: sg.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ DiskPartitionActivity f33601b;

                            {
                                this.f33601b = this;
                            }

                            @Override // mk.c
                            public final Object invoke(Object obj) {
                                String str;
                                switch (i4) {
                                    case 0:
                                        ng.a aVar = (ng.a) obj;
                                        DiskPartitionActivity diskPartitionActivity = this.f33601b;
                                        f1 f1Var5 = diskPartitionActivity.B;
                                        if (f1Var5 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        ((ProgressBar) f1Var5.f1135c).setVisibility(aVar.f29942a ? 0 : 8);
                                        f1 f1Var6 = diskPartitionActivity.B;
                                        if (f1Var6 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        ((RecyclerView) f1Var6.f1136d).setVisibility(aVar.f29942a ? 8 : 0);
                                        break;
                                    default:
                                        h hVar = (h) obj;
                                        DiskPartitionActivity diskPartitionActivity2 = this.f33601b;
                                        f1 f1Var7 = diskPartitionActivity2.B;
                                        if (f1Var7 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        TextView textView2 = (TextView) f1Var7.f1138f;
                                        List list = hVar.f33616a;
                                        ng.b bVar = hVar.f33617b;
                                        boolean z3 = bVar.f29944a;
                                        textView2.setVisibility((!list.isEmpty() || z3) ? 8 : 0);
                                        f1 f1Var8 = diskPartitionActivity2.B;
                                        if (f1Var8 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        ((RecyclerView) f1Var8.f1136d).setVisibility(list.isEmpty() ? 8 : 0);
                                        f1 f1Var9 = diskPartitionActivity2.B;
                                        if (f1Var9 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        t0 adapter = ((RecyclerView) f1Var9.f1136d).getAdapter();
                                        k.c(adapter, "null cannot be cast to non-null type com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity.Adapter");
                                        c cVar = (c) adapter;
                                        String str2 = "";
                                        if (z3 && (str = bVar.f29945b) != null) {
                                            str2 = str;
                                        }
                                        ArrayList arrayList = cVar.f33602i;
                                        arrayList.clear();
                                        arrayList.addAll(list);
                                        cVar.j = str2;
                                        cVar.notifyDataSetChanged();
                                        break;
                                        break;
                                }
                                return u.f37649a;
                            }
                        }, i12));
                        ((f) f1Var4.getValue()).f33609d.e(this, new i(new mk.c(this) { // from class: sg.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ DiskPartitionActivity f33601b;

                            {
                                this.f33601b = this;
                            }

                            @Override // mk.c
                            public final Object invoke(Object obj) {
                                String str;
                                switch (i11) {
                                    case 0:
                                        ng.a aVar = (ng.a) obj;
                                        DiskPartitionActivity diskPartitionActivity = this.f33601b;
                                        f1 f1Var5 = diskPartitionActivity.B;
                                        if (f1Var5 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        ((ProgressBar) f1Var5.f1135c).setVisibility(aVar.f29942a ? 0 : 8);
                                        f1 f1Var6 = diskPartitionActivity.B;
                                        if (f1Var6 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        ((RecyclerView) f1Var6.f1136d).setVisibility(aVar.f29942a ? 8 : 0);
                                        break;
                                    default:
                                        h hVar = (h) obj;
                                        DiskPartitionActivity diskPartitionActivity2 = this.f33601b;
                                        f1 f1Var7 = diskPartitionActivity2.B;
                                        if (f1Var7 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        TextView textView2 = (TextView) f1Var7.f1138f;
                                        List list = hVar.f33616a;
                                        ng.b bVar = hVar.f33617b;
                                        boolean z3 = bVar.f29944a;
                                        textView2.setVisibility((!list.isEmpty() || z3) ? 8 : 0);
                                        f1 f1Var8 = diskPartitionActivity2.B;
                                        if (f1Var8 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        ((RecyclerView) f1Var8.f1136d).setVisibility(list.isEmpty() ? 8 : 0);
                                        f1 f1Var9 = diskPartitionActivity2.B;
                                        if (f1Var9 == null) {
                                            k.k("binding");
                                            throw null;
                                        }
                                        t0 adapter = ((RecyclerView) f1Var9.f1136d).getAdapter();
                                        k.c(adapter, "null cannot be cast to non-null type com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity.Adapter");
                                        c cVar = (c) adapter;
                                        String str2 = "";
                                        if (z3 && (str = bVar.f29945b) != null) {
                                            str2 = str;
                                        }
                                        ArrayList arrayList = cVar.f33602i;
                                        arrayList.clear();
                                        arrayList.addAll(list);
                                        cVar.j = str2;
                                        cVar.notifyDataSetChanged();
                                        break;
                                        break;
                                }
                                return u.f37649a;
                            }
                        }, i12));
                        f1 f1Var5 = this.B;
                        if (f1Var5 == null) {
                            k.k("binding");
                            throw null;
                        }
                        zh.i.e((Toolbar) f1Var5.f1137e);
                        f1 f1Var6 = this.B;
                        if (f1Var6 == null) {
                            k.k("binding");
                            throw null;
                        }
                        FrameLayout frameLayout2 = (FrameLayout) f1Var6.f1134b;
                        sg.a aVar = new sg.a(this);
                        WeakHashMap weakHashMap = v0.f22405a;
                        m0.j(frameLayout2, aVar);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        k.e(menu, "menu");
        MenuItem menuItemAdd = menu.add(0, 2, 1, R.string.search);
        k.d(menuItemAdd, "add(...)");
        menuItemAdd.setIcon(R.drawable.ic_search);
        z2 z2Var = new z2(this);
        z2Var.setIconifiedByDefault(true);
        z2Var.setIconified(true);
        z2Var.setOnQueryTextListener(new y(18, this));
        z2Var.setOnCloseListener(new sg.a(this));
        menuItemAdd.setActionView(z2Var);
        menuItemAdd.setShowAsActionFlags(2);
        return super.onCreateOptionsMenu(menu);
    }
}
