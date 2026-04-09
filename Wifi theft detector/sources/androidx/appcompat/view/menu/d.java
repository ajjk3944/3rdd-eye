package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d implements l0.a {
    public static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f712a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f713b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f714c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f715d;

    /* renamed from: e, reason: collision with root package name */
    public a f716e;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f724m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f725n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f726o;

    /* renamed from: p, reason: collision with root package name */
    public View f727p;

    /* renamed from: x, reason: collision with root package name */
    public f f735x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f737z;

    /* renamed from: l, reason: collision with root package name */
    public int f723l = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f728q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f729r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f730s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f731t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f732u = false;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f733v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f734w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f736y = false;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f717f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f718g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f719h = true;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f720i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f721j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f722k = true;

    public interface a {
        boolean a(d dVar, MenuItem menuItem);

        void b(d dVar);
    }

    public interface b {
        boolean b(f fVar);
    }

    public d(Context context) {
        this.f712a = context;
        this.f713b = context.getResources();
        g0(true);
    }

    public static int D(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int p(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((f) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f727p;
    }

    public ArrayList B() {
        t();
        return this.f721j;
    }

    public boolean C() {
        return this.f731t;
    }

    public Resources E() {
        return this.f713b;
    }

    public d F() {
        return this;
    }

    public ArrayList G() {
        if (!this.f719h) {
            return this.f718g;
        }
        this.f718g.clear();
        int size = this.f717f.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) this.f717f.get(i10);
            if (fVar.isVisible()) {
                this.f718g.add(fVar);
            }
        }
        this.f719h = false;
        this.f722k = true;
        return this.f718g;
    }

    public boolean H() {
        return !this.f728q;
    }

    public boolean I() {
        return this.f736y;
    }

    public boolean J() {
        return this.f714c;
    }

    public boolean K() {
        return this.f715d;
    }

    public void L(f fVar) {
        this.f722k = true;
        N(true);
    }

    public void M(f fVar) {
        this.f719h = true;
        N(true);
    }

    public void N(boolean z10) {
        if (this.f728q) {
            this.f729r = true;
            if (z10) {
                this.f730s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f719h = true;
            this.f722k = true;
        }
        i(z10);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    public boolean P(MenuItem menuItem, h hVar, int i10) {
        f fVar = (f) menuItem;
        if (fVar == null || !fVar.isEnabled()) {
            return false;
        }
        boolean zK = fVar.k();
        androidx.core.view.b bVarA = fVar.a();
        boolean z10 = bVarA != null && bVarA.a();
        if (fVar.j()) {
            boolean zExpandActionView = fVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!fVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!fVar.hasSubMenu()) {
            fVar.x(new k(w(), this, fVar));
        }
        k kVar = (k) fVar.getSubMenu();
        if (z10) {
            bVarA.f(kVar);
        }
        boolean zL = l(kVar, hVar) | zK;
        if (!zL) {
            e(true);
        }
        return zL;
    }

    public final void Q(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f717f.size()) {
            return;
        }
        this.f717f.remove(i10);
        if (z10) {
            N(true);
        }
    }

    public void R(h hVar) {
        Iterator it = this.f734w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            h hVar2 = (h) weakReference.get();
            if (hVar2 == null || hVar2 == hVar) {
                this.f734w.remove(weakReference);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((k) item.getSubMenu()).S(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((k) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f716e = aVar;
    }

    public d X(int i10) {
        this.f723l = i10;
        return this;
    }

    public void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f717f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) this.f717f.get(i10);
            if (fVar.getGroupId() == groupId && fVar.m() && fVar.isCheckable()) {
                fVar.s(fVar == menuItem);
            }
        }
        h0();
    }

    public d Z(int i10) {
        b0(0, null, i10, null, null);
        return this;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iD = D(i12);
        f fVarG = g(i10, i11, i12, iD, charSequence, this.f723l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f724m;
        if (contextMenuInfo != null) {
            fVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f717f;
        arrayList.add(p(arrayList, iD), fVarG);
        N(true);
        return fVarG;
    }

    public d a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f712a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(h hVar) {
        c(hVar, this.f712a);
    }

    public final void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f727p = view;
            this.f725n = null;
            this.f726o = null;
        } else {
            if (i10 > 0) {
                this.f725n = resourcesE.getText(i10);
            } else if (charSequence != null) {
                this.f725n = charSequence;
            }
            if (i11 > 0) {
                this.f726o = ContextCompat.getDrawable(w(), i11);
            } else if (drawable != null) {
                this.f726o = drawable;
            }
            this.f727p = null;
        }
        N(false);
    }

    public void c(h hVar, Context context) {
        this.f734w.add(new WeakReference(hVar));
        hVar.k(context, this);
        this.f722k = true;
    }

    public d c0(int i10) {
        b0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        f fVar = this.f735x;
        if (fVar != null) {
            f(fVar);
        }
        this.f717f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f726o = null;
        this.f725n = null;
        this.f727p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f716e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public d d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    public final void e(boolean z10) {
        if (this.f732u) {
            return;
        }
        this.f732u = true;
        Iterator it = this.f734w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            h hVar = (h) weakReference.get();
            if (hVar == null) {
                this.f734w.remove(weakReference);
            } else {
                hVar.b(this, z10);
            }
        }
        this.f732u = false;
    }

    public d e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public boolean f(f fVar) {
        boolean zJ = false;
        if (!this.f734w.isEmpty() && this.f735x == fVar) {
            i0();
            Iterator it = this.f734w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                h hVar = (h) weakReference.get();
                if (hVar == null) {
                    this.f734w.remove(weakReference);
                } else {
                    zJ = hVar.j(this, fVar);
                    if (zJ) {
                        break;
                    }
                }
            }
            h0();
            if (zJ) {
                this.f735x = null;
            }
        }
        return zJ;
    }

    public void f0(boolean z10) {
        this.f737z = z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) this.f717f.get(i11);
            if (fVar.getItemId() == i10) {
                return fVar;
            }
            if (fVar.hasSubMenu() && (menuItemFindItem = fVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final f g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new f(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f713b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f712a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f712a
            boolean r3 = androidx.core.view.c1.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f715d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.g0(boolean):void");
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f717f.get(i10);
    }

    public boolean h(d dVar, MenuItem menuItem) {
        a aVar = this.f716e;
        return aVar != null && aVar.a(dVar, menuItem);
    }

    public void h0() {
        this.f728q = false;
        if (this.f729r) {
            this.f729r = false;
            N(this.f730s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f737z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((f) this.f717f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z10) {
        if (this.f734w.isEmpty()) {
            return;
        }
        i0();
        Iterator it = this.f734w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            h hVar = (h) weakReference.get();
            if (hVar == null) {
                this.f734w.remove(weakReference);
            } else {
                hVar.h(z10);
            }
        }
        h0();
    }

    public void i0() {
        if (this.f728q) {
            return;
        }
        this.f728q = true;
        this.f729r = false;
        this.f730s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public final void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f734w.isEmpty()) {
            return;
        }
        Iterator it = this.f734w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            h hVar = (h) weakReference.get();
            if (hVar == null) {
                this.f734w.remove(weakReference);
            } else {
                int id = hVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    hVar.e(parcelable);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        Parcelable parcelableG;
        if (this.f734w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = this.f734w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            h hVar = (h) weakReference.get();
            if (hVar == null) {
                this.f734w.remove(weakReference);
            } else {
                int id = hVar.getId();
                if (id > 0 && (parcelableG = hVar.g()) != null) {
                    sparseArray.put(id, parcelableG);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final boolean l(k kVar, h hVar) {
        if (this.f734w.isEmpty()) {
            return false;
        }
        boolean zF = hVar != null ? hVar.f(kVar) : false;
        Iterator it = this.f734w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            h hVar2 = (h) weakReference.get();
            if (hVar2 == null) {
                this.f734w.remove(weakReference);
            } else if (!zF) {
                zF = hVar2.f(kVar);
            }
        }
        return zF;
    }

    public boolean m(f fVar) {
        boolean zC = false;
        if (this.f734w.isEmpty()) {
            return false;
        }
        i0();
        Iterator it = this.f734w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            h hVar = (h) weakReference.get();
            if (hVar == null) {
                this.f734w.remove(weakReference);
            } else {
                zC = hVar.c(this, fVar);
                if (zC) {
                    break;
                }
            }
        }
        h0();
        if (zC) {
            this.f735x = fVar;
        }
        return zC;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((f) this.f717f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        f fVarR = r(i10, keyEvent);
        boolean zO = fVarR != null ? O(fVarR, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zO;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((f) this.f717f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public f r(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f733v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (f) arrayList.get(0);
        }
        boolean zJ = J();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            char alphabeticShortcut = zJ ? fVar.getAlphabeticShortcut() : fVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i10 == 67))) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iN = n(i10);
        if (iN >= 0) {
            int size = this.f717f.size() - iN;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((f) this.f717f.get(iN)).getGroupId() != i10) {
                    break;
                }
                Q(iN, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    public void s(List list, int i10, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f717f.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) this.f717f.get(i11);
                if (fVar.hasSubMenu()) {
                    ((d) fVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = zJ ? fVar.getAlphabeticShortcut() : fVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zJ ? fVar.getAlphabeticModifiers() : fVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i10 == 67)) && fVar.isEnabled()) {
                        list.add(fVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f717f.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) this.f717f.get(i11);
            if (fVar.getGroupId() == i10) {
                fVar.t(z11);
                fVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f736y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f717f.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) this.f717f.get(i11);
            if (fVar.getGroupId() == i10) {
                fVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f717f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) this.f717f.get(i11);
            if (fVar.getGroupId() == i10 && fVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f714c = z10;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f717f.size();
    }

    public void t() {
        ArrayList arrayListG = G();
        if (this.f722k) {
            Iterator it = this.f734w.iterator();
            boolean zI = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                h hVar = (h) weakReference.get();
                if (hVar == null) {
                    this.f734w.remove(weakReference);
                } else {
                    zI |= hVar.i();
                }
            }
            if (zI) {
                this.f720i.clear();
                this.f721j.clear();
                int size = arrayListG.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f fVar = (f) arrayListG.get(i10);
                    if (fVar.l()) {
                        this.f720i.add(fVar);
                    } else {
                        this.f721j.add(fVar);
                    }
                }
            } else {
                this.f720i.clear();
                this.f721j.clear();
                this.f721j.addAll(G());
            }
            this.f722k = false;
        }
    }

    public ArrayList u() {
        t();
        return this.f720i;
    }

    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f712a;
    }

    public f x() {
        return this.f735x;
    }

    public Drawable y() {
        return this.f726o;
    }

    public CharSequence z() {
        return this.f725n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f713b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f713b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        f fVar = (f) a(i10, i11, i12, charSequence);
        k kVar = new k(this.f712a, this, fVar);
        fVar.x(kVar);
        return kVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f713b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f713b.getString(i13));
    }
}
