package I8;

import android.app.Activity;
import b9.C1992A;
import com.zipoapps.premiumhelper.c;
import com.zipoapps.premiumhelper.e;
import p9.l;
import t4.AbstractC5605c;
import t4.C5603a;
import t4.InterfaceC5604b;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f2601c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5604b f2602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f2603e;

    public /* synthetic */ a(e eVar, Integer num, InterfaceC5604b interfaceC5604b, Activity activity) {
        this.f2600b = eVar;
        this.f2601c = num;
        this.f2602d = interfaceC5604b;
        this.f2603e = activity;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        C5603a c5603a = (C5603a) obj;
        if (c5603a.f46399b != 2 || c5603a.a(AbstractC5605c.c()) == null) {
            a.b bVar = va.a.f47104a;
            bVar.o("PremiumHelper");
            bVar.a("UpdateManager: no updates available " + c5603a, new Object[0]);
        } else {
            e eVar = this.f2600b;
            c cVar = eVar.i;
            int i = cVar.f37004a.getInt("latest_update_version", -1);
            int i10 = cVar.f37004a.getInt("update_attempts", 0);
            int i11 = c5603a.f46398a;
            if (i != i11 || i10 < this.f2601c.intValue()) {
                a.b bVar2 = va.a.f47104a;
                bVar2.o("PremiumHelper");
                bVar2.a("UpdateManager: starting update flow " + c5603a, new Object[0]);
                this.f2602d.b(c5603a, this.f2603e, AbstractC5605c.c());
                eVar.f();
                if (i != i11) {
                    cVar.l("latest_update_version", i11);
                    cVar.l("update_attempts", 1);
                } else {
                    cVar.l("update_attempts", i10 + 1);
                }
            } else {
                a.b bVar3 = va.a.f47104a;
                bVar3.o("PremiumHelper");
                bVar3.a("UpdateManager: max update attempts reached", new Object[0]);
            }
        }
        return C1992A.f18074a;
    }
}
