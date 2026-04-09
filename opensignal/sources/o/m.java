package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u3.j0;

/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f18612y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f18613a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f18614b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18615c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18616d;

    /* renamed from: e, reason: collision with root package name */
    public k f18617e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18618f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f18619g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18620h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f18621i;
    public final ArrayList j;
    public boolean k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f18623m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f18624n;

    /* renamed from: o, reason: collision with root package name */
    public View f18625o;

    /* renamed from: v, reason: collision with root package name */
    public o f18632v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18634x;

    /* renamed from: l, reason: collision with root package name */
    public int f18622l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18626p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18627q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18628r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18629s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f18630t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f18631u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f18633w = false;

    public m(Context context) {
        boolean zP;
        boolean z10 = false;
        this.f18613a = context;
        Resources resources = context.getResources();
        this.f18614b = resources;
        this.f18618f = new ArrayList();
        this.f18619g = new ArrayList();
        this.f18620h = true;
        this.f18621i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = j0.f23184a;
            if (Build.VERSION.SDK_INT >= 28) {
                zP = i3.a.p(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zP = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zP) {
                z10 = true;
            }
        }
        this.f18616d = z10;
    }

    public o a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f18612y[i14] << 16) | (65535 & i12);
        o oVar = new o(this, i10, i11, i12, i15, charSequence, this.f18622l);
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((o) arrayList.get(size)).f18641d <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f18613a.getPackageManager();
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
            o oVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            oVarA.setIcon(resolveInfo.loadIcon(packageManager));
            oVarA.f18644g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = oVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f18631u.add(new WeakReference(yVar));
        yVar.d(context, this);
        this.k = true;
    }

    public final void c(boolean z10) {
        if (this.f18629s) {
            return;
        }
        this.f18629s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18631u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.c(this, z10);
            }
        }
        this.f18629s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f18632v;
        if (oVar != null) {
            d(oVar);
        }
        this.f18618f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f18624n = null;
        this.f18623m = null;
        this.f18625o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18631u;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f18632v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zM = yVar.m(oVar);
                    if (zM) {
                        break;
                    }
                }
            }
            v();
            if (zM) {
                this.f18632v = null;
            }
        }
        return zM;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f18617e;
        return kVar != null && kVar.n(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18631u;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zI = yVar.i(oVar);
                if (zI) {
                    break;
                }
            }
        }
        v();
        if (zI) {
            this.f18632v = oVar;
        }
        return zI;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f18638a == i10) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (menuItemFindItem = oVar.f18650o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final o g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f18630t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            char c4 = zN ? oVar.j : oVar.f18645h;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (zN && c4 == '\b' && i10 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f18618f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f18618f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                o oVar = (o) arrayList.get(i11);
                if (oVar.hasSubMenu()) {
                    oVar.f18650o.h(list, i10, keyEvent);
                }
                char c4 = zN ? oVar.j : oVar.f18645h;
                if ((modifiers & 69647) == ((zN ? oVar.k : oVar.f18646i) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (zN && c4 == '\b' && i10 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f18634x) {
            return true;
        }
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18631u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zE = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= yVar.e();
                }
            }
            ArrayList arrayList = this.f18621i;
            ArrayList arrayList2 = this.j;
            if (zE) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    o oVar = (o) arrayListL.get(i10);
                    if ((oVar.f18659x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.f18620h;
        ArrayList arrayList = this.f18619g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f18618f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList2.get(i10);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f18620h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f18633w;
    }

    public boolean n() {
        return this.f18615c;
    }

    public boolean o() {
        return this.f18616d;
    }

    public void p(boolean z10) {
        if (this.f18626p) {
            this.f18627q = true;
            if (z10) {
                this.f18628r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f18620h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18631u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(z10);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        o oVarG = g(i10, keyEvent);
        boolean zQ = oVarG != null ? q(oVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, o.y r8, int r9) {
        /*
            r6 = this;
            o.o r7 = (o.o) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            o.m r1 = r7.f18649n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f18651p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.f18644g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f18613a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            io.sentry.android.core.e0.c(r2, r4, r1)
        L35:
            o.p r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f18663b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            o.p r2 = r7.A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f18663b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            o.e0 r9 = new o.e0
            android.content.Context r5 = r6.f18613a
            r9.<init>(r5, r6, r7)
            r7.f18650o = r9
            java.lang.CharSequence r5 = r7.f18642e
            r9.setHeaderTitle(r5)
        L90:
            o.e0 r7 = r7.f18650o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f18663b
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f18631u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.f(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            o.y r4 = (o.y) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.f(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.q(android.view.MenuItem, o.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18631u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((o) arrayList.get(i12)).f18639b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((o) arrayList.get(i12)).f18639b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((o) arrayList.get(i11)).f18638a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f18618f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f18639b == i10) {
                oVar.f18659x = (oVar.f18659x & (-5)) | (z11 ? 4 : 0);
                oVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f18633w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f18639b == i10) {
                oVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f18618f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f18639b == i10) {
                int i12 = oVar.f18659x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                oVar.f18659x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f18615c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f18618f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f18618f.size();
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
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f18625o = view;
            this.f18623m = null;
            this.f18624n = null;
        } else {
            if (i10 > 0) {
                this.f18623m = this.f18614b.getText(i10);
            } else if (charSequence != null) {
                this.f18623m = charSequence;
            }
            if (i11 > 0) {
                this.f18624n = this.f18613a.getDrawable(i11);
            } else if (drawable != null) {
                this.f18624n = drawable;
            }
            this.f18625o = null;
        }
        p(false);
    }

    public final void v() {
        this.f18626p = false;
        if (this.f18627q) {
            this.f18627q = false;
            p(this.f18628r);
        }
    }

    public final void w() {
        if (this.f18626p) {
            return;
        }
        this.f18626p = true;
        this.f18627q = false;
        this.f18628r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f18614b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f18614b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        o oVarA = a(i10, i11, i12, charSequence);
        e0 e0Var = new e0(this.f18613a, this, oVarA);
        oVarA.f18650o = e0Var;
        e0Var.setHeaderTitle(oVarA.f18642e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f18614b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f18614b.getString(i13));
    }

    public m k() {
        return this;
    }
}
