package l;

import F1.AbstractC2738b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuItemC6522c extends AbstractC6521b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final y1.b f52318d;

    /* renamed from: e, reason: collision with root package name */
    private Method f52319e;

    /* renamed from: l.c$a */
    private class a extends AbstractC2738b implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private AbstractC2738b.InterfaceC0235b f52320d;

        /* renamed from: e, reason: collision with root package name */
        private final ActionProvider f52321e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f52321e = actionProvider;
        }

        @Override // F1.AbstractC2738b
        public boolean a() {
            return this.f52321e.hasSubMenu();
        }

        @Override // F1.AbstractC2738b
        public boolean b() {
            return this.f52321e.isVisible();
        }

        @Override // F1.AbstractC2738b
        public View c(MenuItem menuItem) {
            return this.f52321e.onCreateActionView(menuItem);
        }

        @Override // F1.AbstractC2738b
        public boolean d() {
            return this.f52321e.onPerformDefaultAction();
        }

        @Override // F1.AbstractC2738b
        public void e(SubMenu subMenu) {
            this.f52321e.onPrepareSubMenu(MenuItemC6522c.this.d(subMenu));
        }

        @Override // F1.AbstractC2738b
        public boolean f() {
            return this.f52321e.overridesItemVisibility();
        }

        @Override // F1.AbstractC2738b
        public void i(AbstractC2738b.InterfaceC0235b interfaceC0235b) {
            this.f52320d = interfaceC0235b;
            this.f52321e.setVisibilityListener(interfaceC0235b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC2738b.InterfaceC0235b interfaceC0235b = this.f52320d;
            if (interfaceC0235b != null) {
                interfaceC0235b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* renamed from: l.c$b */
    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f52323a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f52323a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f52323a;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f52323a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void f() {
            this.f52323a.onActionViewCollapsed();
        }
    }

    /* renamed from: l.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC1931c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f52324a;

        MenuItemOnActionExpandListenerC1931c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f52324a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f52324a.onMenuItemActionCollapse(MenuItemC6522c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f52324a.onMenuItemActionExpand(MenuItemC6522c.this.c(menuItem));
        }
    }

    /* renamed from: l.c$d */
    private class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f52326a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f52326a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f52326a.onMenuItemClick(MenuItemC6522c.this.c(menuItem));
        }
    }

    public MenuItemC6522c(Context context, y1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f52318d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f52318d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f52318d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC2738b abstractC2738bB = this.f52318d.b();
        if (abstractC2738bB instanceof a) {
            return ((a) abstractC2738bB).f52321e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f52318d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f52318d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f52318d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f52318d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f52318d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f52318d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f52318d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f52318d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f52318d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f52318d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f52318d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f52318d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f52318d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f52318d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f52318d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f52318d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f52318d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f52318d.getTooltipText();
    }

    public void h(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f52319e == null) {
                this.f52319e = this.f52318d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f52319e.invoke(this.f52318d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f52318d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f52318d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f52318d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f52318d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f52318d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f52318d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f52315a, actionProvider);
        y1.b bVar = this.f52318d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f52318d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f52318d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f52318d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f52318d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f52318d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f52318d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f52318d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f52318d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f52318d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f52318d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f52318d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f52318d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC1931c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f52318d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f52318d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f52318d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f52318d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f52318d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f52318d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f52318d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f52318d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f52318d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f52318d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f52318d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f52318d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f52318d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f52318d.setActionView(i10);
        View actionView = this.f52318d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f52318d.setActionView(new b(actionView));
        }
        return this;
    }
}
