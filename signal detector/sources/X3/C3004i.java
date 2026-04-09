package x3;

import R.O;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.g0;
import com.apm.insight.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import n.SubMenuC2666C;

/* renamed from: x3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3004i extends G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24121a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public n.m f24122b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f24124d;

    public C3004i(q qVar) {
        this.f24124d = qVar;
        a();
    }

    public final void a() {
        if (this.f24123c) {
            return;
        }
        this.f24123c = true;
        ArrayList arrayList = this.f24121a;
        arrayList.clear();
        arrayList.add(new j());
        q qVar = this.f24124d;
        int size = qVar.f24146c.l().size();
        boolean z6 = false;
        int i = -1;
        int i3 = 0;
        boolean z7 = false;
        int size2 = 0;
        while (i3 < size) {
            n.m mVar = (n.m) qVar.f24146c.l().get(i3);
            if (mVar.isChecked()) {
                b(mVar);
            }
            if (mVar.isCheckable()) {
                mVar.f(z6);
            }
            if (mVar.hasSubMenu()) {
                SubMenuC2666C subMenuC2666C = mVar.f22092C;
                if (subMenuC2666C.hasVisibleItems()) {
                    if (i3 != 0) {
                        arrayList.add(new l(qVar.f24141O, z6 ? 1 : 0));
                    }
                    arrayList.add(new m(mVar));
                    int size3 = subMenuC2666C.f22081f.size();
                    int i6 = z6 ? 1 : 0;
                    int i7 = i6;
                    while (i6 < size3) {
                        n.m mVar2 = (n.m) subMenuC2666C.getItem(i6);
                        if (mVar2.isVisible()) {
                            if (i7 == 0 && mVar2.getIcon() != null) {
                                i7 = 1;
                            }
                            if (mVar2.isCheckable()) {
                                mVar2.f(z6);
                            }
                            if (mVar2.isChecked()) {
                                b(mVar2);
                            }
                            arrayList.add(new m(mVar2));
                        }
                        i6++;
                        z6 = false;
                    }
                    if (i7 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((m) arrayList.get(size5)).f24128b = true;
                        }
                    }
                }
            } else {
                int i8 = mVar.f22107b;
                if (i8 != i) {
                    size2 = arrayList.size();
                    z7 = mVar.getIcon() != null;
                    if (i3 != 0) {
                        size2++;
                        int i9 = qVar.f24141O;
                        arrayList.add(new l(i9, i9));
                    }
                } else if (!z7 && mVar.getIcon() != null) {
                    int size6 = arrayList.size();
                    for (int i10 = size2; i10 < size6; i10++) {
                        ((m) arrayList.get(i10)).f24128b = true;
                    }
                    z7 = true;
                }
                m mVar3 = new m(mVar);
                mVar3.f24128b = z7;
                arrayList.add(mVar3);
                i = i8;
            }
            i3++;
            z6 = false;
        }
        this.f24123c = z6;
    }

    public final void b(n.m mVar) {
        if (this.f24122b == mVar || !mVar.isCheckable()) {
            return;
        }
        n.m mVar2 = this.f24122b;
        if (mVar2 != null) {
            mVar2.setChecked(false);
        }
        this.f24122b = mVar;
        mVar.setChecked(true);
    }

    @Override // androidx.recyclerview.widget.G
    public final int getItemCount() {
        return this.f24121a.size();
    }

    @Override // androidx.recyclerview.widget.G
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.G
    public final int getItemViewType(int i) {
        k kVar = (k) this.f24121a.get(i);
        if (kVar instanceof l) {
            return 2;
        }
        if (kVar instanceof j) {
            return 3;
        }
        if (kVar instanceof m) {
            return ((m) kVar).f24127a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // androidx.recyclerview.widget.G
    public final void onBindViewHolder(g0 g0Var, int i) {
        p pVar = (p) g0Var;
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.f24121a;
        q qVar = this.f24124d;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                l lVar = (l) arrayList.get(i);
                pVar.itemView.setPaddingRelative(qVar.f24134G, lVar.f24125a, qVar.f24135H, lVar.f24126b);
                return;
            }
            TextView textView = (TextView) pVar.itemView;
            textView.setText(((m) arrayList.get(i)).f24127a.f22110e);
            textView.setTextAppearance(qVar.f24150g);
            textView.setPaddingRelative(qVar.f24136I, textView.getPaddingTop(), qVar.f24137J, textView.getPaddingBottom());
            ColorStateList colorStateList = qVar.f24151h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            O.m(textView, new C3003h(this, i, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) pVar.itemView;
        navigationMenuItemView.setIconTintList(qVar.f24154l);
        navigationMenuItemView.setTextAppearance(qVar.i);
        ColorStateList colorStateList2 = qVar.f24153k;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = qVar.f24155m;
        navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
        RippleDrawable rippleDrawable = qVar.f24156n;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        m mVar = (m) arrayList.get(i);
        navigationMenuItemView.setNeedsEmptyIcon(mVar.f24128b);
        int i3 = qVar.f24130C;
        int i6 = qVar.f24131D;
        navigationMenuItemView.setPadding(i3, i6, i3, i6);
        navigationMenuItemView.setIconPadding(qVar.f24132E);
        if (qVar.f24138K) {
            navigationMenuItemView.setIconSize(qVar.f24133F);
        }
        navigationMenuItemView.setMaxLines(qVar.M);
        n.m mVar2 = mVar.f24127a;
        navigationMenuItemView.M = qVar.f24152j;
        navigationMenuItemView.a(mVar2);
        O.m(navigationMenuItemView, new C3003h(this, i, false));
    }

    @Override // androidx.recyclerview.widget.G
    public final g0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        q qVar = this.f24124d;
        if (i == 0) {
            LayoutInflater layoutInflater = qVar.f24149f;
            A3.o oVar = qVar.f24143Q;
            o oVar2 = new o(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            oVar2.itemView.setOnClickListener(oVar);
            return oVar2;
        }
        if (i == 1) {
            return new C3002g(qVar.f24149f.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new C3002g(qVar.f24149f.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new C3002g(qVar.f24145b);
    }

    @Override // androidx.recyclerview.widget.G
    public final void onViewRecycled(g0 g0Var) {
        p pVar = (p) g0Var;
        if (pVar instanceof o) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) pVar.itemView;
            FrameLayout frameLayout = navigationMenuItemView.f18393O;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f18392N.setCompoundDrawables(null, null, null, null);
        }
    }
}
