package S9;

import R9.AbstractC1564a;
import R9.C1565b;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes3.dex */
public final class G extends AbstractC1570b {

    /* renamed from: f, reason: collision with root package name */
    public final C1565b f12021f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12022g;

    /* renamed from: h, reason: collision with root package name */
    public int f12023h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AbstractC1564a json, C1565b value) {
        super(json, value);
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(value, "value");
        this.f12021f = value;
        this.f12022g = value.f11784b.size();
        this.f12023h = -1;
    }

    @Override // Q9.AbstractC1525d0
    public final String S(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // S9.AbstractC1570b
    public final R9.i U(String tag) throws NumberFormatException {
        kotlin.jvm.internal.l.f(tag, "tag");
        return this.f12021f.f11784b.get(Integer.parseInt(tag));
    }

    @Override // S9.AbstractC1570b
    public final R9.i X() {
        return this.f12021f;
    }

    @Override // P9.b
    public final int x(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        int i = this.f12023h;
        if (i >= this.f12022g - 1) {
            return -1;
        }
        int i10 = i + 1;
        this.f12023h = i10;
        return i10;
    }
}
