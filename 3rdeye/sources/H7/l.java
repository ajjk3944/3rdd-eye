package H7;

import c9.C2097r;
import java.util.LinkedHashSet;

/* compiled from: StorageStatements.kt */
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f2298a;

    public l(LinkedHashSet linkedHashSet) {
        this.f2298a = linkedHashSet;
    }

    @Override // H7.j
    public final void a(c cVar) {
        cVar.t("DELETE FROM raw_json WHERE raw_json_id IN " + C2097r.u0(this.f2298a, "', '", "('", "')", null, 56)).executeUpdateDelete();
    }

    public final String toString() {
        return "Deleting raw jsons with ids: " + this.f2298a;
    }
}
