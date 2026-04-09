package d4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2269c {

    /* renamed from: c, reason: collision with root package name */
    public static final C2269c f19790c;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f19791a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f19792b;

    static {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap());
        if (mapUnmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        f19790c = new C2269c(null, mapUnmodifiableMap);
    }

    public C2269c(Integer num, Map map) {
        this.f19791a = num;
        this.f19792b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2269c) {
            C2269c c2269c = (C2269c) obj;
            Integer num = this.f19791a;
            if (num != null ? num.equals(c2269c.f19791a) : c2269c.f19791a == null) {
                if (this.f19792b.equals(c2269c.f19792b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f19791a;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f19792b.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f19791a + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f19792b) + "}";
    }
}
