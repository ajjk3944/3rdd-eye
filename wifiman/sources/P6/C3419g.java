package P6;

import android.util.Pair;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: P6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3419g extends C3420h {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f18074a;

    public C3419g(UUID uuid, Integer num, byte[] bArr) {
        super(uuid, num);
        this.f18074a = bArr;
    }

    @Override // android.util.Pair
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3419g)) {
            return (obj instanceof C3420h) && super.equals(obj);
        }
        if (super.equals(obj)) {
            return Arrays.equals(this.f18074a, ((C3419g) obj).f18074a);
        }
        return false;
    }

    @Override // android.util.Pair
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f18074a);
    }

    @Override // P6.C3420h, android.util.Pair
    public String toString() {
        return "CharacteristicChangedEvent{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + ", data=" + Arrays.toString(this.f18074a) + '}';
    }
}
