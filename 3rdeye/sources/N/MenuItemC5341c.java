package n;

import L0.AbstractC0771b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import java.lang.reflect.Method;
import m.InterfaceC5305b;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC5341c extends AbstractC5340b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    public final E0.b f44177d;

    /* renamed from: e, reason: collision with root package name */
    public Method f44178e;

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$a */
    public class a extends AbstractC0771b implements ActionProvider.VisibilityListener {

        /* renamed from: b, reason: collision with root package name */
        public h.a f44179b;

        /* renamed from: c, reason: collision with root package name */
        public final ActionProvider f44180c;

        public a(ActionProvider actionProvider) {
            this.f44180c = actionProvider;
        }

        @Override // L0.AbstractC0771b
        public final boolean a() {
            return this.f44180c.hasSubMenu();
        }

        @Override // L0.AbstractC0771b
        public final boolean b() {
            return this.f44180c.isVisible();
        }

        @Override // L0.AbstractC0771b
        public final View c() {
            return this.f44180c.onCreateActionView();
        }

        @Override // L0.AbstractC0771b
        public final View d(h hVar) {
            return this.f44180c.onCreateActionView(hVar);
        }

        @Override // L0.AbstractC0771b
        public final boolean e() {
            return this.f44180c.onPerformDefaultAction();
        }

        @Override // L0.AbstractC0771b
        public final void f(m mVar) {
            this.f44180c.onPrepareSubMenu(MenuItemC5341c.this.g(mVar));
        }

        @Override // L0.AbstractC0771b
        public final boolean g() {
            return this.f44180c.overridesItemVisibility();
        }

        @Override // L0.AbstractC0771b
        public final void h(h.a aVar) {
            this.f44179b = aVar;
            this.f44180c.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z10) {
            h.a aVar = this.f44179b;
            if (aVar != null) {
                androidx.appcompat.view.menu.f fVar = h.this.f14472n;
                fVar.f14438h = true;
                fVar.p(true);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$b */
    public static class b extends FrameLayout implements InterfaceC5305b {

        /* renamed from: b, reason: collision with root package name */
        public final CollapsibleActionView f44182b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f44182b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // m.InterfaceC5305b
        public final void b() {
            this.f44182b.onActionViewExpanded();
        }

        @Override // m.InterfaceC5305b
        public final void c() {
            this.f44182b.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$c, reason: collision with other inner class name */
    public class MenuItemOnActionExpandListenerC0498c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f44183a;

        public MenuItemOnActionExpandListenerC0498c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f44183a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f44183a.onMenuItemActionCollapse(MenuItemC5341c.this.f(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f44183a.onMenuItemActionExpand(MenuItemC5341c.this.f(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$d */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f44185b;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f44185b = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f44185b.onMenuItemClick(MenuItemC5341c.this.f(menuItem));
        }
    }

    public MenuItemC5341c(Context context, E0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f44177d = bVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f44177d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f44177d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC0771b abstractC0771bB = this.f44177d.b();
        if (abstractC0771bB instanceof a) {
            return ((a) abstractC0771bB).f44180c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f44177d.getActionView();
        return actionView instanceof b ? (View) ((b) actionView).f44182b : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f44177d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f44177d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f44177d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f44177d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f44177d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f44177d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f44177d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f44177d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f44177d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f44177d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f44177d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f44177d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f44177d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return g(this.f44177d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f44177d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f44177d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f44177d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f44177d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f44177d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f44177d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f44177d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f44177d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f44177d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(actionProvider);
        if (actionProvider == null) {
            aVar = null;
        }
        this.f44177d.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f44177d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f44177d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f44177d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f44177d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f44177d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f44177d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f44177d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f44177d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f44177d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f44177d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f44177d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f44177d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0498c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f44177d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f44177d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f44177d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f44177d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f44177d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f44177d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f44177d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        return this.f44177d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        this.f44177d.setAlphabeticShortcut(c10, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f44177d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        this.f44177d.setNumericShortcut(c10, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f44177d.setShortcut(c10, c11, i, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f44177d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        E0.b bVar = this.f44177d;
        bVar.setActionView(i);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView(new b(actionView));
        }
        return this;
    }
}
