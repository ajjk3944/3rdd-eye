package androidx.appcompat.view.menu;

import A9.I;
import D0.a;
import L0.AbstractC0771b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class h implements E0.b {

    /* renamed from: A, reason: collision with root package name */
    public AbstractC0771b f14457A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f14458B;

    /* renamed from: a, reason: collision with root package name */
    public final int f14460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14463d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f14464e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f14465f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f14466g;

    /* renamed from: h, reason: collision with root package name */
    public char f14467h;

    /* renamed from: j, reason: collision with root package name */
    public char f14468j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f14470l;

    /* renamed from: n, reason: collision with root package name */
    public final f f14472n;

    /* renamed from: o, reason: collision with root package name */
    public m f14473o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f14474p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f14475q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f14476r;

    /* renamed from: y, reason: collision with root package name */
    public int f14483y;

    /* renamed from: z, reason: collision with root package name */
    public View f14484z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f14469k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f14471m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f14477s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f14478t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14479u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14480v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14481w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f14482x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f14459C = false;

    /* compiled from: MenuItemImpl.java */
    public class a {
        public a() {
        }
    }

    public h(f fVar, int i, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f14472n = fVar;
        this.f14460a = i10;
        this.f14461b = i;
        this.f14462c = i11;
        this.f14463d = i12;
        this.f14464e = charSequence;
        this.f14483y = i13;
    }

    public static void c(int i, int i10, String str, StringBuilder sb) {
        if ((i & i10) == i10) {
            sb.append(str);
        }
    }

    @Override // E0.b
    public final E0.b a(AbstractC0771b abstractC0771b) {
        AbstractC0771b abstractC0771b2 = this.f14457A;
        if (abstractC0771b2 != null) {
            abstractC0771b2.f3886a = null;
        }
        this.f14484z = null;
        this.f14457A = abstractC0771b;
        this.f14472n.p(true);
        AbstractC0771b abstractC0771b3 = this.f14457A;
        if (abstractC0771b3 != null) {
            abstractC0771b3.h(new a());
        }
        return this;
    }

    @Override // E0.b
    public final AbstractC0771b b() {
        return this.f14457A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f14483y & 8) == 0) {
            return false;
        }
        if (this.f14484z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14458B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f14472n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f14481w && (this.f14479u || this.f14480v)) {
            drawable = drawable.mutate();
            if (this.f14479u) {
                a.C0009a.h(drawable, this.f14477s);
            }
            if (this.f14480v) {
                a.C0009a.i(drawable, this.f14478t);
            }
            this.f14481w = false;
        }
        return drawable;
    }

    public final boolean e() {
        AbstractC0771b abstractC0771b;
        if ((this.f14483y & 8) == 0) {
            return false;
        }
        if (this.f14484z == null && (abstractC0771b = this.f14457A) != null) {
            this.f14484z = abstractC0771b.d(this);
        }
        return this.f14484z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14458B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f14472n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f14482x |= 32;
        } else {
            this.f14482x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f14484z;
        if (view != null) {
            return view;
        }
        AbstractC0771b abstractC0771b = this.f14457A;
        if (abstractC0771b == null) {
            return null;
        }
        View viewD = abstractC0771b.d(this);
        this.f14484z = viewD;
        return viewD;
    }

    @Override // E0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14469k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14468j;
    }

    @Override // E0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14475q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f14461b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f14470l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f14471m;
        if (i == 0) {
            return null;
        }
        Drawable drawableW = I.w(this.f14472n.f14431a, i);
        this.f14471m = 0;
        this.f14470l = drawableW;
        return d(drawableW);
    }

    @Override // E0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14477s;
    }

    @Override // E0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14478t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14466g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f14460a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // E0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14467h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f14462c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f14473o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f14464e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14465f;
        return charSequence != null ? charSequence : this.f14464e;
    }

    @Override // E0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14476r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f14473o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f14459C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14482x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14482x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14482x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0771b abstractC0771b = this.f14457A;
        return (abstractC0771b == null || !abstractC0771b.g()) ? (this.f14482x & 8) == 0 : (this.f14482x & 8) == 0 && this.f14457A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f14484z = view;
        this.f14457A = null;
        if (view != null && view.getId() == -1 && (i = this.f14460a) > 0) {
            view.setId(i);
        }
        f fVar = this.f14472n;
        fVar.f14440k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f14468j == c10) {
            return this;
        }
        this.f14468j = Character.toLowerCase(c10);
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i = this.f14482x;
        int i10 = (z10 ? 1 : 0) | (i & (-2));
        this.f14482x = i10;
        if (i != i10) {
            this.f14472n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i = this.f14482x;
        if ((i & 4) == 0) {
            int i10 = (i & (-3)) | (z10 ? 2 : 0);
            this.f14482x = i10;
            if (i != i10) {
                this.f14472n.p(false);
            }
            return this;
        }
        f fVar = this.f14472n;
        fVar.getClass();
        ArrayList<h> arrayList = fVar.f14436f;
        int size = arrayList.size();
        fVar.w();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f14461b == this.f14461b && (hVar.f14482x & 4) != 0 && hVar.isCheckable()) {
                boolean z11 = hVar == this;
                int i12 = hVar.f14482x;
                int i13 = (z11 ? 2 : 0) | (i12 & (-3));
                hVar.f14482x = i13;
                if (i12 != i13) {
                    hVar.f14472n.p(false);
                }
            }
        }
        fVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f14482x |= 16;
        } else {
            this.f14482x &= -17;
        }
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14471m = 0;
        this.f14470l = drawable;
        this.f14481w = true;
        this.f14472n.p(false);
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14477s = colorStateList;
        this.f14479u = true;
        this.f14481w = true;
        this.f14472n.p(false);
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14478t = mode;
        this.f14480v = true;
        this.f14481w = true;
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14466g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f14467h == c10) {
            return this;
        }
        this.f14467h = c10;
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14458B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14474p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f14467h = c10;
        this.f14468j = Character.toLowerCase(c11);
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i10 = i & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14483y = i;
        f fVar = this.f14472n;
        fVar.f14440k = true;
        fVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14464e = charSequence;
        this.f14472n.p(false);
        m mVar = this.f14473o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14465f = charSequence;
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i = this.f14482x;
        int i10 = (z10 ? 0 : 8) | (i & (-9));
        this.f14482x = i10;
        if (i != i10) {
            f fVar = this.f14472n;
            fVar.f14438h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f14464e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E0.b, android.view.MenuItem
    public final E0.b setContentDescription(CharSequence charSequence) {
        this.f14475q = charSequence;
        this.f14472n.p(false);
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final E0.b setTooltipText(CharSequence charSequence) {
        this.f14476r = charSequence;
        this.f14472n.p(false);
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        if (this.f14468j == c10 && this.f14469k == i) {
            return this;
        }
        this.f14468j = Character.toLowerCase(c10);
        this.f14469k = KeyEvent.normalizeMetaState(i);
        this.f14472n.p(false);
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        if (this.f14467h == c10 && this.i == i) {
            return this;
        }
        this.f14467h = c10;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f14472n.p(false);
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f14467h = c10;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f14468j = Character.toLowerCase(c11);
        this.f14469k = KeyEvent.normalizeMetaState(i10);
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f14470l = null;
        this.f14471m = i;
        this.f14481w = true;
        this.f14472n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f14472n.f14431a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i10;
        Context context = this.f14472n.f14431a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f14484z = viewInflate;
        this.f14457A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f14460a) > 0) {
            viewInflate.setId(i10);
        }
        f fVar = this.f14472n;
        fVar.f14440k = true;
        fVar.p(true);
        return this;
    }
}
