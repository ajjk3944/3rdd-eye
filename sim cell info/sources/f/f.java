package f;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import f.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f2565a;

    /* renamed from: b, reason: collision with root package name */
    final b f2566b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f2567a;

        /* renamed from: b, reason: collision with root package name */
        final Context f2568b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f2569c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final k.g<Menu, Menu> f2570d = new k.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f2568b = context;
            this.f2567a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f2570d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            g.d dVar = new g.d(this.f2568b, (v.a) menu);
            this.f2570d.put(menu, dVar);
            return dVar;
        }

        @Override // f.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f2567a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // f.b.a
        public void b(b bVar) {
            this.f2567a.onDestroyActionMode(e(bVar));
        }

        @Override // f.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f2567a.onActionItemClicked(e(bVar), new g.c(this.f2568b, (v.b) menuItem));
        }

        @Override // f.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f2567a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f2569c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f2569c.get(i2);
                if (fVar != null && fVar.f2566b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f2568b, bVar);
            this.f2569c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f2565a = context;
        this.f2566b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2566b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2566b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new g.d(this.f2565a, (v.a) this.f2566b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2566b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2566b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2566b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2566b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2566b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2566b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2566b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2566b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f2566b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2566b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2566b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f2566b.q(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2566b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z2) {
        this.f2566b.s(z2);
    }
}
