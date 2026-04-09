package hf;

import ff.EnumC5820a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: hf.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6036h {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5820a f48665a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f48666b;

    public C6036h(EnumC5820a direction, float[] data) {
        AbstractC6492s.i(direction, "direction");
        AbstractC6492s.i(data, "data");
        this.f48665a = direction;
        this.f48666b = data;
    }

    public final float[] a() {
        return this.f48666b;
    }

    public final EnumC5820a b() {
        return this.f48665a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6036h)) {
            return false;
        }
        C6036h c6036h = (C6036h) obj;
        return this.f48665a == c6036h.f48665a && Arrays.equals(this.f48666b, c6036h.f48666b);
    }

    public int hashCode() {
        return (this.f48665a.hashCode() * 31) + Arrays.hashCode(this.f48666b);
    }

    public String toString() {
        return "Model(direction=" + this.f48665a + ", data=" + Arrays.toString(this.f48666b) + ")";
    }
}
