package q8;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final m f20749a = new m();

    /* renamed from: d, reason: collision with root package name */
    public static d8.h f20750d;

    @Override // q8.k
    public boolean a(m8.h hVar) {
        a.a aVar = hVar.f16325a;
        if ((aVar instanceof m8.a ? ((m8.a) aVar).f16320f : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        a.a aVar2 = hVar.f16326b;
        return (aVar2 instanceof m8.a ? ((m8.a) aVar2).f16320f : Integer.MAX_VALUE) > 100;
    }

    @Override // q8.k
    public boolean b() {
        boolean z10;
        synchronized (j.f20739a) {
            try {
                int i10 = j.f20741c;
                j.f20741c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > j.f20742d + 30000) {
                    j.f20741c = 0;
                    j.f20742d = SystemClock.uptimeMillis();
                    String[] list = j.f20740b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    j.f20743e = list.length < 800;
                }
                z10 = j.f20743e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
