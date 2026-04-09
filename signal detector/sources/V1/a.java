package V1;

import com.bytedance.sdk.component.msw.emc.emc;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3839b;

    public /* synthetic */ a(e eVar, int i) {
        this.f3838a = i;
        this.f3839b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3838a) {
            case 0:
                e eVar = this.f3839b;
                if (eVar.ru == null) {
                    try {
                        eVar.ru = new o();
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (eVar.ru != null) {
                        m unused = eVar.ru;
                        eVar.db = "0";
                        ((o) eVar.ru).f3850a = eVar;
                        ((o) eVar.ru).f3851b = eVar;
                        ((o) eVar.ru).f3855f = eVar;
                        ((o) eVar.ru).f3852c = eVar;
                        ((o) eVar.ru).f3853d = eVar;
                        ((o) eVar.ru).f3856g = eVar;
                        ((o) eVar.ru).f3854e = eVar;
                        try {
                            ((o) eVar.ru).i.setLooping(false);
                        } catch (Throwable unused2) {
                        }
                        eVar.gbl = false;
                        break;
                    }
                }
                break;
            case 1:
                e eVar2 = this.f3839b;
                if (eVar2.uym() && eVar2.ru != null) {
                    try {
                        ((o) eVar2.ru).i.start();
                        for (WeakReference weakReference : eVar2.xq) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((J1.a) weakReference.get()).bw(eVar2);
                            }
                        }
                        eVar2.qh = 206;
                        break;
                    } catch (Throwable th2) {
                        th2.getMessage();
                        return;
                    }
                }
                break;
            case 2:
                e eVar3 = this.f3839b;
                if (eVar3.vk != null) {
                    eVar3.vk.sendEmptyMessage(101);
                    break;
                }
                break;
            case 3:
                e eVar4 = this.f3839b;
                if (eVar4.vk != null) {
                    eVar4.vk.sendEmptyMessage(101);
                    break;
                }
                break;
            case 4:
                e eVar5 = this.f3839b;
                if (eVar5.vk != null) {
                    eVar5.vk.sendEmptyMessage(104);
                    break;
                }
                break;
            case 5:
                e eVar6 = this.f3839b;
                if (eVar6.vk != null && eVar6.vk.getLooper() != null) {
                    try {
                        emc.emc().emc(eVar6.vk);
                        eVar6.vk = null;
                        break;
                    } catch (Throwable unused3) {
                        return;
                    }
                }
                break;
            default:
                e eVar7 = this.f3839b;
                try {
                    ((o) eVar7.ru).i.pause();
                    eVar7.qh = 207;
                    eVar7.mkp = false;
                    break;
                } catch (Throwable unused4) {
                    return;
                }
        }
    }
}
