package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import l.MenuC6523d;
import l.MenuItemC6522c;
import o.V;
import y1.InterfaceMenuC8606a;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f26688a;

    /* renamed from: b, reason: collision with root package name */
    final b f26689b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f26690a;

        /* renamed from: b, reason: collision with root package name */
        final Context f26691b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f26692c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final V f26693d = new V();

        public a(Context context, ActionMode.Callback callback) {
            this.f26691b = context;
            this.f26690a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f26693d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC6523d menuC6523d = new MenuC6523d(this.f26691b, (InterfaceMenuC8606a) menu);
            this.f26693d.put(menu, menuC6523d);
            return menuC6523d;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f26690a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f26690a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f26690a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f26690a.onActionItemClicked(e(bVar), new MenuItemC6522c(this.f26691b, (y1.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f26692c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f26692c.get(i10);
                if (fVar != null && fVar.f26689b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f26691b, bVar);
            this.f26692c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f26688a = context;
        this.f26689b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f26689b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f26689b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC6523d(this.f26688a, (InterfaceMenuC8606a) this.f26689b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f26689b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f26689b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f26689b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f26689b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f26689b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f26689b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f26689b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f26689b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f26689b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f26689b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f26689b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f26689b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f26689b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f26689b.q(i10);
    }
}
