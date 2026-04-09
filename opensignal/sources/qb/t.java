package qb;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f20822b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20823a;

    public t(Handler handler) {
        this.f20823a = handler;
    }

    public static s b() {
        s sVar;
        ArrayList arrayList = f20822b;
        synchronized (arrayList) {
            try {
                sVar = arrayList.isEmpty() ? new s() : (s) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public final s a(int i10, Object obj) {
        s sVarB = b();
        sVarB.f20821a = this.f20823a.obtainMessage(i10, obj);
        return sVarB;
    }

    public final boolean c(int i10) {
        return this.f20823a.sendEmptyMessage(i10);
    }
}
