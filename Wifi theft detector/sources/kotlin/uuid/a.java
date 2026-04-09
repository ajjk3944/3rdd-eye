package kotlin.uuid;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Object a(Uuid uuid) {
        p.e(uuid, "uuid");
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }
}
