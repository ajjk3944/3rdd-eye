package A8;

import H6.C0675l;
import J8.C0690e;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import c9.C2079C;
import c9.C2097r;
import c9.C2101v;
import d9.C4289g;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k6.C5246y;

/* compiled from: RelaunchCoordinator.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.k implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i, obj, cls, str, str2, i10);
        this.f155b = i11;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f155b) {
            case 0:
                AppCompatActivity p02 = (AppCompatActivity) obj;
                kotlin.jvm.internal.l.f(p02, "p0");
                k kVar = (k) this.receiver;
                kVar.getClass();
                if (C0690e.c(p02)) {
                    kVar.g(p02, new b(kVar, p02, false));
                } else {
                    k.f(kVar, p02, 2);
                }
                return C1992A.f18074a;
            case 1:
                Throwable p03 = (Throwable) obj;
                kotlin.jvm.internal.l.f(p03, "p0");
                C5246y.d((C0675l) this.receiver, p03);
                return C1992A.f18074a;
            default:
                Set p04 = (Set) obj;
                kotlin.jvm.internal.l.f(p04, "p0");
                androidx.room.c cVar = (androidx.room.c) this.receiver;
                ReentrantLock reentrantLock = cVar.f16793e;
                reentrantLock.lock();
                try {
                    List<androidx.room.f> listG0 = C2097r.G0(cVar.f16792d.values());
                    reentrantLock.unlock();
                    for (androidx.room.f fVar : listG0) {
                        fVar.getClass();
                        int[] iArr = fVar.f16819b;
                        int length = iArr.length;
                        Set<String> setA = C2101v.f18583b;
                        if (length != 0) {
                            int i = 0;
                            if (length != 1) {
                                C4289g c4289g = new C4289g();
                                int length2 = iArr.length;
                                int i10 = 0;
                                while (i < length2) {
                                    int i11 = i10 + 1;
                                    if (p04.contains(Integer.valueOf(iArr[i]))) {
                                        c4289g.add(fVar.f16820c[i10]);
                                    }
                                    i++;
                                    i10 = i11;
                                }
                                setA = C2079C.a(c4289g);
                            } else if (p04.contains(Integer.valueOf(iArr[0]))) {
                                setA = fVar.f16821d;
                            }
                        }
                        if (!setA.isEmpty()) {
                            fVar.f16818a.a(setA);
                        }
                    }
                    return C1992A.f18074a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj) {
        super(1, obj, C5246y.class, "logError", "logError(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", 1);
        this.f155b = 1;
    }
}
