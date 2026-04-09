package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import m.AbstractC5304a;
import m0.C5316i;
import n.MenuC5343e;
import n.MenuItemC5341c;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43941a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5304a f43942b;

    /* compiled from: SupportActionModeWrapper.java */
    public static class a implements AbstractC5304a.InterfaceC0495a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f43943a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f43944b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f43945c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final C5316i<Menu, Menu> f43946d = new C5316i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f43944b = context;
            this.f43943a = callback;
        }

        @Override // m.AbstractC5304a.InterfaceC0495a
        public final void a(AbstractC5304a abstractC5304a) {
            this.f43943a.onDestroyActionMode(e(abstractC5304a));
        }

        @Override // m.AbstractC5304a.InterfaceC0495a
        public final boolean b(AbstractC5304a abstractC5304a, androidx.appcompat.view.menu.f fVar) {
            e eVarE = e(abstractC5304a);
            C5316i<Menu, Menu> c5316i = this.f43946d;
            Menu menuC5343e = c5316i.get(fVar);
            if (menuC5343e == null) {
                menuC5343e = new MenuC5343e(this.f43944b, fVar);
                c5316i.put(fVar, menuC5343e);
            }
            return this.f43943a.onCreateActionMode(eVarE, menuC5343e);
        }

        @Override // m.AbstractC5304a.InterfaceC0495a
        public final boolean c(AbstractC5304a abstractC5304a, MenuItem menuItem) {
            return this.f43943a.onActionItemClicked(e(abstractC5304a), new MenuItemC5341c(this.f43944b, (E0.b) menuItem));
        }

        @Override // m.AbstractC5304a.InterfaceC0495a
        public final boolean d(AbstractC5304a abstractC5304a, androidx.appcompat.view.menu.f fVar) {
            e eVarE = e(abstractC5304a);
            C5316i<Menu, Menu> c5316i = this.f43946d;
            Menu menuC5343e = c5316i.get(fVar);
            if (menuC5343e == null) {
                menuC5343e = new MenuC5343e(this.f43944b, fVar);
                c5316i.put(fVar, menuC5343e);
            }
            return this.f43943a.onPrepareActionMode(eVarE, menuC5343e);
        }

        public final e e(AbstractC5304a abstractC5304a) {
            ArrayList<e> arrayList = this.f43945c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                e eVar = arrayList.get(i);
                if (eVar != null && eVar.f43942b == abstractC5304a) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f43944b, abstractC5304a);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, AbstractC5304a abstractC5304a) {
        this.f43941a = context;
        this.f43942b = abstractC5304a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f43942b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f43942b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC5343e(this.f43941a, this.f43942b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f43942b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f43942b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f43942b.f43928b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f43942b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f43942b.f43929c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f43942b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f43942b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f43942b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f43942b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f43942b.f43928b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f43942b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f43942b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f43942b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f43942b.n(i);
    }
}
