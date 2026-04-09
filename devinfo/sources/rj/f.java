package rj;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.x1;
import b7.w;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.ui.CardRecyclerView;
import e4.c2;
import ec.z;
import ej.m;
import java.util.ArrayList;
import java.util.Collection;
import p.h2;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends nj.b {

    /* renamed from: b, reason: collision with root package name */
    public final ej.i f32996b;

    /* renamed from: c, reason: collision with root package name */
    public final m f32997c;

    /* renamed from: d, reason: collision with root package name */
    public final gj.a f32998d;

    /* renamed from: e, reason: collision with root package name */
    public final jj.f f32999e;

    /* renamed from: f, reason: collision with root package name */
    public final oj.b f33000f;
    public final i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ej.i iVar, m mVar) {
        super(context);
        nk.k.e(context, "context");
        nk.k.e(mVar, "viewModel");
        this.f32996b = iVar;
        this.f32997c = mVar;
        gj.a aVarA = gj.a.a(this);
        CardView cardView = aVarA.f24742a;
        this.f32998d = aVarA;
        jj.f fVar = mVar.f23519b;
        this.f32999e = fVar;
        oj.b bVar = new oj.b(2);
        this.f33000f = bVar;
        i iVar2 = new i(context, fVar);
        this.g = iVar2;
        int iN = cm.g.n(R.attr.analyzer_content_padding, context);
        CardRecyclerView cardRecyclerView = aVarA.f24748h;
        cardRecyclerView.setPadding(0, 0, 0, iN);
        cardRecyclerView.setClipToPadding(false);
        ((z) jm.a.f27720a.f1138f).getClass();
        z2.k kVarZ = jm.a.z();
        nk.k.d(kVarZ, "themeHandler(...)");
        dj.b.l(cardRecyclerView, kVarZ);
        cardRecyclerView.setAdapter(iVar2);
        cardRecyclerView.setLayoutManager(new LinearLayoutManager(1));
        ((p6.i) jm.a.f27720a.f1137e).A(cardRecyclerView);
        cardRecyclerView.k(bVar);
        aVarA.f24745d.setOnClickListener(new ah.g(this, context, 9));
        aVarA.f24749i.setOnClickListener(new com.applovin.mediation.nativeAds.a(20, this));
        g();
        setNextFocusDownId(R.id.analyze_item);
        setNextFocusUpId(R.id.buttons_container);
        if (i0.k()) {
            cardView.setForeground(cm.g.o(context));
            cardView.setFocusable(true);
        }
        mVar.g.e(iVar, new bh.i(new e(this, 5), 11));
        fVar.f27697h.e(iVar, new bh.i(new e(this, 6), 11));
        fVar.f27691b.e(iVar, new bh.i(new e(this, 7), 11));
        fVar.j.e(iVar, new bh.i(new e(this, 8), 11));
        fVar.f27702n.e(iVar, new bh.i(new e(this, 9), 11));
        fVar.f27693d.e(iVar, new bh.i(new w(18), 11));
        fVar.f27706r.e(iVar, new bh.i(new e(this, 0), 11));
        fVar.f27704p.e(iVar, new bh.i(new e(this, 4), 11));
        h(aVarA.f24753n, R.drawable.fa_ic_sort);
        h(aVarA.f24752m, R.drawable.fa_ic_delete);
    }

    @Override // nj.b
    public final void a(c2 c2Var) {
        nk.k.e(c2Var, "insets");
        v3.b bVarG = c2Var.f22315a.g(647);
        nk.k.d(bVarG, "getInsets(...)");
        int i4 = bVarG.f35796d;
        gj.a aVar = this.f32998d;
        LinearLayout linearLayout = aVar.f24743b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = a4.a.b(54.0f) + i4;
        linearLayout.setLayoutParams(layoutParams);
        Context context = getContext();
        nk.k.d(context, "getContext(...)");
        nj.b.f(cm.g.n(R.attr.analyzer_content_padding, context), aVar.f24742a, bVarG);
        nj.b.f(0, aVar.g, bVarG);
        nj.b.f(0, aVar.f24746e, bVarG);
        nj.b.f(0, aVar.f24748h, bVarG);
        LinearLayout linearLayout2 = aVar.f24743b;
        linearLayout2.setPadding(bVarG.f35793a, linearLayout2.getPaddingTop(), bVarG.f35795c, i4);
    }

    @Override // nj.b
    public final void b(Menu menu, MenuInflater menuInflater) {
        nk.k.e(menu, "menu");
        nk.k.e(menuInflater, "inflater");
        menuInflater.inflate(R.menu.fa_menu_repeate_file, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.smart_select);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            Context context = getContext();
            nk.k.d(context, "getContext(...)");
            menuItemFindItem.setIcon(wb.e.M(icon, cm.g.l(R.attr.colorControlNormal, context)));
        }
    }

    @Override // nj.b
    public final void c() {
        gj.a aVar = this.f32998d;
        CardRecyclerView cardRecyclerView = aVar.f24748h;
        cardRecyclerView.f1247p.remove(this.f33000f);
        CardRecyclerView cardRecyclerView2 = aVar.f24748h;
        int childCount = cardRecyclerView2.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            x1 x1VarO = cardRecyclerView2.O(cardRecyclerView2.getChildAt(i4));
            if (x1VarO instanceof h) {
                Object obj = ((h) x1VarO).f33005c.g;
                Object obj2 = jm.a.f27720a.f1136d;
            }
        }
    }

    @Override // nj.b
    public final boolean d(MenuItem menuItem) {
        nk.k.e(menuItem, "item");
        if (nk.k.a(this.f32999e.f27697h.d(), Boolean.TRUE)) {
            Toast.makeText(getContext(), R.string.fa_deleting_locked_tip, 0).show();
            return true;
        }
        if (menuItem.getItemId() != R.id.smart_select) {
            return false;
        }
        final Context context = getContext();
        nk.k.d(context, "getContext(...)");
        final e eVar = new e(this, 1);
        final a6.e eVar2 = new a6.e(22, this);
        final e eVar3 = new e(this, 2);
        final e eVar4 = new e(this, 3);
        View actionView = menuItem.getActionView();
        for (Context baseContext = context; (baseContext instanceof ContextWrapper) && (!(baseContext instanceof Activity) || (actionView = ((Activity) baseContext).findViewById(R.id.smart_select)) == null); baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
        }
        if (actionView != null) {
            final p6.i iVar = (p6.i) jm.a.f27720a.f1137e;
            f1 f1Var = new f1(context, actionView);
            o.m mVar = (o.m) f1Var.f1135c;
            new n.h(context).inflate(R.menu.fa_menu_repeat_file_select_options, mVar);
            f1Var.f1138f = new h2() { // from class: rj.j
                @Override // p.h2
                public final void onMenuItemClick(MenuItem menuItem2) {
                    int itemId = menuItem2.getItemId();
                    e eVar5 = eVar;
                    if (itemId == R.id.select_all) {
                        eVar5.invoke(Boolean.TRUE);
                        return;
                    }
                    if (itemId == R.id.select_all_off) {
                        eVar5.invoke(Boolean.FALSE);
                        return;
                    }
                    p6.i iVar2 = iVar;
                    Context context2 = context;
                    if (itemId == R.id.select_keep_smart) {
                        if (iVar2.E()) {
                            iVar2.H(context2);
                            return;
                        } else {
                            eVar2.invoke();
                            return;
                        }
                    }
                    e eVar6 = eVar3;
                    if (itemId == R.id.select_keep_newest) {
                        if (iVar2.E()) {
                            iVar2.H(context2);
                            return;
                        } else {
                            eVar6.invoke(Boolean.TRUE);
                            return;
                        }
                    }
                    if (itemId == R.id.select_keep_oldest) {
                        if (iVar2.E()) {
                            iVar2.H(context2);
                            return;
                        } else {
                            eVar6.invoke(Boolean.FALSE);
                            return;
                        }
                    }
                    e eVar7 = eVar4;
                    if (itemId == R.id.select_keep_path_longest) {
                        if (iVar2.E()) {
                            iVar2.H(context2);
                            return;
                        } else {
                            eVar7.invoke(Boolean.TRUE);
                            return;
                        }
                    }
                    if (itemId == R.id.select_keep_path_shortest) {
                        if (iVar2.E()) {
                            iVar2.H(context2);
                        } else {
                            eVar7.invoke(Boolean.FALSE);
                        }
                    }
                }
            };
            if (mVar != null || Build.VERSION.SDK_INT >= 28) {
                mVar.f30258w = true;
            }
            if (iVar.E()) {
                iVar.getClass();
                Drawable drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_pro);
                if (drawable != null) {
                    Drawable drawableMutate = drawable.mutate();
                    Resources resources = context.getResources();
                    nk.k.d(resources, "getResources(...)");
                    int iC = a4.a.c(resources, 20.0f);
                    drawableMutate.setBounds(0, 0, iC, iC);
                    MenuItem menuItemFindItem = mVar.findItem(R.id.select_keep_smart);
                    nk.k.d(menuItemFindItem, "findItem(...)");
                    ii.a.F(context, menuItemFindItem, R.string.fa_select_keep_smart, drawableMutate);
                    MenuItem menuItemFindItem2 = mVar.findItem(R.id.select_keep_newest);
                    nk.k.d(menuItemFindItem2, "findItem(...)");
                    ii.a.F(context, menuItemFindItem2, R.string.fa_select_keep_newest, drawableMutate);
                    MenuItem menuItemFindItem3 = mVar.findItem(R.id.select_keep_oldest);
                    nk.k.d(menuItemFindItem3, "findItem(...)");
                    ii.a.F(context, menuItemFindItem3, R.string.fa_select_keep_oldest, drawableMutate);
                    MenuItem menuItemFindItem4 = mVar.findItem(R.id.select_keep_path_longest);
                    nk.k.d(menuItemFindItem4, "findItem(...)");
                    ii.a.F(context, menuItemFindItem4, R.string.fa_select_keep_longest_path, drawableMutate);
                    MenuItem menuItemFindItem5 = mVar.findItem(R.id.select_keep_path_shortest);
                    nk.k.d(menuItemFindItem5, "findItem(...)");
                    ii.a.F(context, menuItemFindItem5, R.string.fa_select_keep_shortest_path, drawableMutate);
                }
            }
            o.w wVar = (o.w) f1Var.f1137e;
            if (!wVar.b()) {
                if (wVar.f30304e == null) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                wVar.d(0, 0, false, false);
                return true;
            }
        }
        return true;
    }

    public final void g() {
        Collection collection;
        jj.f fVar = this.f32999e;
        boolean zA = nk.k.a(fVar.f27697h.d(), Boolean.TRUE);
        Integer num = (Integer) fVar.f27702n.d();
        boolean z3 = false;
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (zA || (collection = (Collection) fVar.j.d()) == null || collection.isEmpty()) ? false : true;
        gj.a aVar = this.f32998d;
        if (aVar.f24749i.isEnabled() != z10) {
            aVar.f24753n.setEnabled(z10);
            aVar.f24749i.setEnabled(z10);
            TextView textView = aVar.f24753n;
            nk.k.d(textView, "txtSort");
            h(textView, R.drawable.fa_ic_sort);
        }
        if (!zA && iIntValue != 0) {
            z3 = true;
        }
        if (aVar.f24745d.isEnabled() != z3) {
            aVar.f24752m.setEnabled(z3);
            aVar.f24745d.setEnabled(z3);
            TextView textView2 = aVar.f24752m;
            nk.k.d(textView2, "txtDelete");
            h(textView2, R.drawable.fa_ic_delete);
        }
    }

    @Override // nj.b
    public int getLayoutId() {
        return R.layout.fa_floating_list_view;
    }

    public final void h(TextView textView, int i4) {
        Drawable drawable = getContext().getDrawable(i4);
        nk.k.b(drawable);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, wb.e.M(drawable, textView.getCurrentTextColor()), (Drawable) null, (Drawable) null);
    }

    public final void i() {
        ArrayList arrayList;
        Object obj;
        kj.f fVar = (kj.f) this.f32997c.g.d();
        if (fVar == null || (arrayList = fVar.f28363c) == null) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((kj.h) obj).f28371d == 2) {
                break;
            }
        }
        kj.h hVar = (kj.h) obj;
        if (hVar == null) {
            return;
        }
        gj.a aVar = this.f32998d;
        aVar.f24750k.setText(hVar.f28370c);
        aVar.f24751l.setText(hVar.f28368a);
        aVar.j.setText(hVar.f28369b.getSize());
        ((z) jm.a.f27720a.f1138f).getClass();
    }
}
