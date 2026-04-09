package b2;

import n.AbstractC5340b;

/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: b2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832m extends AbstractC5340b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1832m(w1.k kVar, int i) {
        super(kVar);
        this.f17123d = i;
    }

    @Override // n.AbstractC5340b
    public final String e() {
        switch (this.f17123d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 1:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 2:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 3:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            default:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }
}
