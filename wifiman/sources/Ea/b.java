package Ea;

import com.ui.product.firmware.UiFirmwarePlatform;
import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Set f4414a;

    /* renamed from: b, reason: collision with root package name */
    private final UiFirmwarePlatform f4415b;

    public b(Set board, UiFirmwarePlatform platform) {
        AbstractC6492s.i(board, "board");
        AbstractC6492s.i(platform, "platform");
        this.f4414a = board;
        this.f4415b = platform;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f4414a, bVar.f4414a) && AbstractC6492s.d(this.f4415b, bVar.f4415b);
    }

    public int hashCode() {
        return (this.f4414a.hashCode() * 31) + this.f4415b.hashCode();
    }

    public String toString() {
        return "UispProductFirmware(board=" + this.f4414a + ", platform=" + this.f4415b + ")";
    }
}
