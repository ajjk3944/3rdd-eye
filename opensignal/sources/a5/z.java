package a5;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f172b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f173a;

    public z(Handler handler) {
        this.f173a = handler;
    }

    public static y c() {
        y yVar;
        ArrayList arrayList = f172b;
        synchronized (arrayList) {
            try {
                yVar = arrayList.isEmpty() ? new y() : (y) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public final y a(int i10, int i11, int i12) {
        y yVarC = c();
        yVarC.f171a = this.f173a.obtainMessage(i10, i11, i12);
        return yVarC;
    }

    public final y b(int i10, Object obj) {
        y yVarC = c();
        yVarC.f171a = this.f173a.obtainMessage(i10, obj);
        return yVarC;
    }

    public final boolean d(Runnable runnable) {
        return this.f173a.post(runnable);
    }

    public final boolean e(int i10) {
        return this.f173a.sendEmptyMessage(i10);
    }
}
