package i;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11116c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f11117d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, bm.d dVar) {
        super(a0Var);
        this.f11117d = a0Var;
        this.f11118e = dVar;
    }

    @Override // i.x
    public final IntentFilter d() {
        switch (this.f11116c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // i.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.f():int");
    }

    @Override // i.x
    public final void j() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f11116c) {
            case 0:
                this.f11117d.k(true, true);
                break;
            default:
                this.f11117d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, Context context) {
        super(a0Var);
        this.f11117d = a0Var;
        this.f11118e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
