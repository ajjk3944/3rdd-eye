package P6;

import android.util.Pair;
import java.util.UUID;

/* renamed from: P6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3420h extends Pair {
    public C3420h(UUID uuid, Integer num) {
        super(uuid, num);
    }

    @Override // android.util.Pair
    public String toString() {
        return "CharacteristicNotificationId{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + '}';
    }
}
