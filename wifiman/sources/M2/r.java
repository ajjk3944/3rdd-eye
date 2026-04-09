package m2;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f53080a = new r();

    private r() {
    }

    public static final String a(String hash) {
        AbstractC6492s.i(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
