package b2;

import n.AbstractC5340b;

/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: b2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1831l extends AbstractC5340b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1831l(w1.k kVar, int i) {
        super(kVar);
        this.f17122d = i;
    }

    @Override // n.AbstractC5340b
    public final String e() {
        switch (this.f17122d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 2:
                return "UPDATE workspec SET state=? WHERE id=?";
            default:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }
}
