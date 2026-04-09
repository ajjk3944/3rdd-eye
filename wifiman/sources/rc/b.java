package Rc;

import Cc.AbstractC2558b;
import Rc.a;
import Zg.AbstractC3689v;
import gg.i;
import inet.ipaddr.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import rd.b;

/* loaded from: classes4.dex */
public final class b implements Rc.a {

    /* renamed from: a, reason: collision with root package name */
    private final i f19709a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19710a;

        static {
            int[] iArr = new int[b.a.EnumC2104a.values().length];
            try {
                iArr[b.a.EnumC2104a.PHONE_ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.EnumC2104a.TABLET_ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.a.EnumC2104a.PHONE_IOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.a.EnumC2104a.TABLE_IOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19710a = iArr;
        }
    }

    /* renamed from: Rc.b$b, reason: collision with other inner class name */
    static final class C0704b implements n {
        C0704b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List results) {
            AbstractC6492s.i(results, "results");
            List list = results;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(bVar.d((b.a) it.next()));
            }
            return arrayList;
        }
    }

    public b(rd.b app2AppSpeedtestDiscovery) {
        AbstractC6492s.i(app2AppSpeedtestDiscovery, "app2AppSpeedtestDiscovery");
        i iVarN0 = app2AppSpeedtestDiscovery.a().N0(new C0704b());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f19709a = iVarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.C0703a d(b.a aVar) {
        AbstractC2558b abstractC2558b;
        g gVarB = aVar.b();
        int iE = aVar.e();
        String strD = aVar.d();
        String strC = aVar.c();
        S8.g gVarG = aVar.g();
        b.a.EnumC2104a enumC2104aF = aVar.f();
        if (aVar.f() != null) {
            b.a.EnumC2104a enumC2104aF2 = aVar.f();
            int i10 = enumC2104aF2 == null ? -1 : a.f19710a[enumC2104aF2.ordinal()];
            if (i10 == 1) {
                abstractC2558b = AbstractC2558b.a.C0118a.f2480b;
            } else if (i10 == 2) {
                abstractC2558b = AbstractC2558b.a.C0119b.f2481b;
            } else if (i10 == 3) {
                abstractC2558b = AbstractC2558b.AbstractC0120b.d.f2486c;
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC2558b = AbstractC2558b.AbstractC0120b.c.f2485c;
            }
        } else {
            abstractC2558b = null;
        }
        return new a.C0703a(gVarB, iE, strD, strC, gVarG, enumC2104aF, abstractC2558b, System.currentTimeMillis(), Long.MAX_VALUE);
    }

    @Override // Ec.t
    public i b() {
        return this.f19709a;
    }
}
