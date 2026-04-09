package Ga;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final int f7253a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7254b;

    public a(int i10, String interconnectPortInterface) {
        AbstractC6492s.i(interconnectPortInterface, "interconnectPortInterface");
        this.f7253a = i10;
        this.f7254b = interconnectPortInterface;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7253a == aVar.f7253a && AbstractC6492s.d(this.f7254b, aVar.f7254b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f7253a) * 31) + this.f7254b.hashCode();
    }

    public String toString() {
        return "UnifiNetworkProductShadowMode(interconnectPortNumber=" + this.f7253a + ", interconnectPortInterface=" + this.f7254b + ")";
    }
}
