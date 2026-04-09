package g;

import a0.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
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

/* loaded from: classes.dex */
public class c extends g.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final v.b f2641d;

    /* renamed from: e, reason: collision with root package name */
    private Method f2642e;

    private class a extends a0.b {

        /* renamed from: d, reason: collision with root package name */
        final ActionProvider f2643d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2643d = actionProvider;
        }

        @Override // a0.b
        public boolean a() {
            return this.f2643d.hasSubMenu();
        }

        @Override // a0.b
        public View c() {
            return this.f2643d.onCreateActionView();
        }

        @Override // a0.b
        public boolean e() {
            return this.f2643d.onPerformDefaultAction();
        }

        @Override // a0.b
        public void f(SubMenu subMenu) {
            this.f2643d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f, reason: collision with root package name */
        private b.InterfaceC0001b f2645f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // a0.b
        public boolean b() {
            return this.f2643d.isVisible();
        }

        @Override // a0.b
        public View d(MenuItem menuItem) {
            return this.f2643d.onCreateActionView(menuItem);
        }

        @Override // a0.b
        public boolean g() {
            return this.f2643d.overridesItemVisibility();
        }

        @Override // a0.b
        public void j(b.InterfaceC0001b interfaceC0001b) {
            this.f2645f = interfaceC0001b;
            this.f2643d.setVisibilityListener(interfaceC0001b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z2) {
            b.InterfaceC0001b interfaceC0001b = this.f2645f;
            if (interfaceC0001b != null) {
                interfaceC0001b.onActionProviderVisibilityChanged(z2);
            }
        }
    }

    /* renamed from: g.c$c, reason: collision with other inner class name */
    static class C0029c extends FrameLayout implements f.c {

        /* renamed from: b, reason: collision with root package name */
        final CollapsibleActionView f2647b;

        /* JADX WARN: Multi-variable type inference failed */
        C0029c(View view) {
            super(view.getContext());
            this.f2647b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // f.c
        public void a() {
            this.f2647b.onActionViewExpanded();
        }

        View b() {
            return (View) this.f2647b;
        }

        @Override // f.c
        public void d() {
            this.f2647b.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f2648a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f2648a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f2648a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f2648a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f2650a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f2650a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f2650a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, v.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2641d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f2641d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f2641d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        a0.b bVarA = this.f2641d.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f2643d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f2641d.getActionView();
        return actionView instanceof C0029c ? ((C0029c) actionView).b() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2641d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2641d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2641d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2641d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2641d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2641d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2641d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2641d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2641d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2641d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2641d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2641d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2641d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f2641d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2641d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f2641d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2641d.getTooltipText();
    }

    public void h(boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f2642e == null) {
                this.f2642e = this.f2641d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f2642e.invoke(this.f2641d, Boolean.valueOf(z2));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2641d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2641d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f2641d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f2641d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f2641d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f2641d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a0.b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this.f2638a, actionProvider) : new a(this.f2638a, actionProvider);
        v.b bVar2 = this.f2641d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f2641d.setActionView(i2);
        View actionView = this.f2641d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f2641d.setActionView(new C0029c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0029c(view);
        }
        this.f2641d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f2641d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f2641d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f2641d.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f2641d.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2641d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f2641d.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f2641d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2641d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2641d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2641d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2641d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f2641d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f2641d.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2641d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2641d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f2641d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2641d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.f2641d.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.f2641d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f2641d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2641d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2641d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2641d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        return this.f2641d.setVisible(z2);
    }
}
