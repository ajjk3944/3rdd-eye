package h;

import R.InterfaceC0188o;
import android.view.Window;
import n.MenuC2677k;

/* loaded from: classes.dex */
public final class m implements InterfaceC0188o, n.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f20356a;

    public /* synthetic */ m(v vVar) {
        this.f20356a = vVar;
    }

    @Override // n.v
    public void c(MenuC2677k menuC2677k, boolean z6) {
        u uVar;
        MenuC2677k menuC2677kK = menuC2677k.k();
        int i = 0;
        boolean z7 = menuC2677kK != menuC2677k;
        if (z7) {
            menuC2677k = menuC2677kK;
        }
        v vVar = this.f20356a;
        u[] uVarArr = vVar.f20407Z;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i < length) {
                uVar = uVarArr[i];
                if (uVar != null && uVar.f20375h == menuC2677k) {
                    break;
                } else {
                    i++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (!z7) {
                vVar.x(uVar, z6);
            } else {
                vVar.v(uVar.f20368a, uVar, menuC2677kK);
                vVar.x(uVar, true);
            }
        }
    }

    @Override // n.v
    public boolean g(MenuC2677k menuC2677k) {
        Window.Callback callback;
        if (menuC2677k != menuC2677k.k()) {
            return true;
        }
        v vVar = this.f20356a;
        if (!vVar.f20401T || (callback = vVar.f20420l.getCallback()) == null || vVar.f20411e0) {
            return true;
        }
        callback.onMenuOpened(108, menuC2677k);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a3  */
    @Override // R.InterfaceC0188o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public R.r0 p(android.view.View r20, R.r0 r21) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.p(android.view.View, R.r0):R.r0");
    }
}
