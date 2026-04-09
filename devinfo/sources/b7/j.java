package b7;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2004c;

    public /* synthetic */ j(int i4, Object obj, int i10) {
        this.f2002a = i10;
        this.f2004c = i4;
        this.f2003b = obj;
    }

    @Override // mk.c
    public final Object invoke(Object obj) throws Exception {
        d6.c cVarS;
        switch (this.f2002a) {
            case 0:
                String str = (String) this.f2003b;
                int i4 = this.f2004c;
                d6.a aVar = (d6.a) obj;
                nk.k.e(aVar, "_connection");
                cVarS = aVar.S("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    cVarS.q(1, str);
                    cVarS.a(2, i4);
                    return cVarS.P() ? new i(cVarS.D(ii.a.m(cVarS, "work_spec_id")), (int) cVarS.getLong(ii.a.m(cVarS, "generation")), (int) cVarS.getLong(ii.a.m(cVarS, "system_id"))) : null;
                } finally {
                }
            case 1:
                String str2 = (String) this.f2003b;
                int i10 = this.f2004c;
                d6.a aVar2 = (d6.a) obj;
                nk.k.e(aVar2, "_connection");
                cVarS = aVar2.S("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    cVarS.q(1, str2);
                    cVarS.a(2, i10);
                    cVarS.P();
                    cVarS.close();
                    return yj.u.f37649a;
                } finally {
                }
            case 2:
                int i11 = this.f2004c;
                String str3 = (String) this.f2003b;
                d6.a aVar3 = (d6.a) obj;
                nk.k.e(aVar3, "_connection");
                cVarS = aVar3.S("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    cVarS.a(1, i11);
                    cVarS.q(2, str3);
                    cVarS.P();
                    cVarS.close();
                    return yj.u.f37649a;
                } finally {
                }
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f2004c, (Collection) this.f2003b));
        }
    }

    public /* synthetic */ j(String str, int i4, int i10) {
        this.f2002a = i10;
        this.f2003b = str;
        this.f2004c = i4;
    }
}
