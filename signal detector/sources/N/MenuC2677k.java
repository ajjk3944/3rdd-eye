package n;

import R.P;
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

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC2677k implements Menu {
    public static final int[] M = {1, 4, 5, 3, 2, 0};

    /* renamed from: C, reason: collision with root package name */
    public View f22066C;

    /* renamed from: J, reason: collision with root package name */
    public m f22073J;

    /* renamed from: L, reason: collision with root package name */
    public boolean f22075L;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22076a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f22077b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22078c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22079d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2675i f22080e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22081f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f22082g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22083h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f22084j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22085k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f22087m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f22088n;

    /* renamed from: l, reason: collision with root package name */
    public int f22086l = 0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f22067D = false;

    /* renamed from: E, reason: collision with root package name */
    public boolean f22068E = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f22069F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f22070G = false;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f22071H = new ArrayList();

    /* renamed from: I, reason: collision with root package name */
    public final CopyOnWriteArrayList f22072I = new CopyOnWriteArrayList();

    /* renamed from: K, reason: collision with root package name */
    public boolean f22074K = false;

    public MenuC2677k(Context context) {
        boolean zO;
        boolean z6 = false;
        this.f22076a = context;
        Resources resources = context.getResources();
        this.f22077b = resources;
        this.f22081f = new ArrayList();
        this.f22082g = new ArrayList();
        this.f22083h = true;
        this.i = new ArrayList();
        this.f22084j = new ArrayList();
        this.f22085k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = P.f3276a;
            if (Build.VERSION.SDK_INT >= 28) {
                zO = K.a.o(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zO = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zO) {
                z6 = true;
            }
        }
        this.f22079d = z6;
    }

    public m a(int i, int i3, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (M[i8] << 16) | (65535 & i6);
        m mVar = new m(this, i, i3, i6, i9, charSequence, this.f22086l);
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((m) arrayList.get(size)).f22109d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, mVar);
        p(true);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i3, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f22076a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m mVarA = a(i, i3, i6, resolveInfo.loadLabel(packageManager));
            mVarA.setIcon(resolveInfo.loadIcon(packageManager));
            mVarA.f22112g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = mVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(w wVar, Context context) {
        this.f22072I.add(new WeakReference(wVar));
        wVar.d(context, this);
        this.f22085k = true;
    }

    public final void c(boolean z6) {
        if (this.f22070G) {
            return;
        }
        this.f22070G = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                wVar.c(this, z6);
            }
        }
        this.f22070G = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.f22073J;
        if (mVar != null) {
            d(mVar);
        }
        this.f22081f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f22088n = null;
        this.f22087m = null;
        this.f22066C = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f22073J == mVar) {
            y();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zM = wVar.m(mVar);
                    if (zM) {
                        break;
                    }
                }
            }
            x();
            if (zM) {
                this.f22073J = null;
            }
        }
        return zM;
    }

    public boolean e(MenuC2677k menuC2677k, MenuItem menuItem) {
        InterfaceC2675i interfaceC2675i = this.f22080e;
        return interfaceC2675i != null && interfaceC2675i.f(menuC2677k, menuItem);
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zJ = wVar.j(mVar);
                if (zJ) {
                    break;
                }
            }
        }
        x();
        if (zJ) {
            this.f22073J = mVar;
        }
        return zJ;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            if (mVar.f22106a == i) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (menuItemFindItem = mVar.f22092C.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final m g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f22071H;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean zN = n();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            char c6 = zN ? mVar.f22114j : mVar.f22113h;
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (zN && c6 == '\b' && i == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f22081f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f22081f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                m mVar = (m) arrayList.get(i3);
                if (mVar.hasSubMenu()) {
                    mVar.f22092C.h(list, i, keyEvent);
                }
                char c6 = zN ? mVar.f22114j : mVar.f22113h;
                if ((modifiers & 69647) == ((zN ? mVar.f22115k : mVar.i) & 69647) && c6 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c6 == cArr[0] || c6 == cArr[2] || (zN && c6 == '\b' && i == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f22075L) {
            return true;
        }
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((m) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f22085k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zF = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zF |= wVar.f();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f22084j;
            if (zF) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    m mVar = (m) arrayListL.get(i);
                    if ((mVar.f22101L & 32) == 32) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f22085k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z6 = this.f22083h;
        ArrayList arrayList = this.f22082g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f22081f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) arrayList2.get(i);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f22083h = false;
        this.f22085k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f22074K;
    }

    public boolean n() {
        return this.f22078c;
    }

    public boolean o() {
        return this.f22079d;
    }

    public void p(boolean z6) {
        if (this.f22067D) {
            this.f22068E = true;
            if (z6) {
                this.f22069F = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f22083h = true;
            this.f22085k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                wVar.b(z6);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i3) {
        return q(findItem(i), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i3) {
        m mVarG = g(i, keyEvent);
        boolean zQ = mVarG != null ? q(mVarG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, n.w r8, int r9) {
        /*
            r6 = this;
            n.m r7 = (n.m) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            n.k r1 = r7.f22118n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f22093D
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
            android.content.Intent r2 = r7.f22112g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f22076a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            n.n r1 = r7.f22103O
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f22121c
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            n.n r2 = r7.f22103O
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f22121c
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
            n.C r9 = new n.C
            android.content.Context r5 = r6.f22076a
            r9.<init>(r5, r6, r7)
            r7.f22092C = r9
            java.lang.CharSequence r5 = r7.f22110e
            r9.setHeaderTitle(r5)
        L90:
            n.C r7 = r7.f22092C
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f22121c
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f22072I
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.e(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            n.w r4 = (n.w) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.e(r7)
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
        throw new UnsupportedOperationException("Method not decompiled: n.MenuC2677k.q(android.view.MenuItem, n.w, int):boolean");
    }

    public final void r(w wVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            w wVar2 = (w) weakReference.get();
            if (wVar2 == null || wVar2 == wVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size();
        int i3 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((m) arrayList.get(i6)).f22107b == i) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i3 + 1;
                if (i3 >= size2 || ((m) arrayList.get(i6)).f22107b != i) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f22081f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i3 = i7;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((m) arrayList.get(i3)).f22106a == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f22081f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f22081f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2666C) item.getSubMenu()).s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z6, boolean z7) {
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            if (mVar.f22107b == i) {
                mVar.f(z7);
                mVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f22074K = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z6) {
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            if (mVar.f22107b == i) {
                mVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z6) {
        ArrayList arrayList = this.f22081f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            if (mVar.f22107b == i) {
                int i6 = mVar.f22101L;
                int i7 = (i6 & (-9)) | (z6 ? 0 : 8);
                mVar.f22101L = i7;
                if (i6 != i7) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f22078c = z6;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f22081f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = wVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        wVar.h(parcelable);
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = this.f22081f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
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
                ((SubMenuC2666C) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable parcelableK;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22072I;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = wVar.getId();
                if (id > 0 && (parcelableK = wVar.k()) != null) {
                    sparseArray.put(id, parcelableK);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void w(int i, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f22066C = view;
            this.f22087m = null;
            this.f22088n = null;
        } else {
            if (i > 0) {
                this.f22087m = this.f22077b.getText(i);
            } else if (charSequence != null) {
                this.f22087m = charSequence;
            }
            if (i3 > 0) {
                this.f22088n = this.f22076a.getDrawable(i3);
            } else if (drawable != null) {
                this.f22088n = drawable;
            }
            this.f22066C = null;
        }
        p(false);
    }

    public final void x() {
        this.f22067D = false;
        if (this.f22068E) {
            this.f22068E = false;
            p(this.f22069F);
        }
    }

    public final void y() {
        if (this.f22067D) {
            return;
        }
        this.f22067D = true;
        this.f22068E = false;
        this.f22069F = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f22077b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f22077b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i3, int i6, CharSequence charSequence) {
        return a(i, i3, i6, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i3, int i6, CharSequence charSequence) {
        m mVarA = a(i, i3, i6, charSequence);
        SubMenuC2666C subMenuC2666C = new SubMenuC2666C(this.f22076a, this, mVarA);
        mVarA.f22092C = subMenuC2666C;
        subMenuC2666C.setHeaderTitle(mVarA.f22110e);
        return subMenuC2666C;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i3, int i6, int i7) {
        return a(i, i3, i6, this.f22077b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i3, int i6, int i7) {
        return addSubMenu(i, i3, i6, this.f22077b.getString(i7));
    }

    public MenuC2677k k() {
        return this;
    }
}
