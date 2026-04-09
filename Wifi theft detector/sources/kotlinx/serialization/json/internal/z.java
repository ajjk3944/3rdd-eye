package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public final class z extends c {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.a f23050f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23051g;

    /* renamed from: h, reason: collision with root package name */
    public int f23052h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(z9.a json, kotlinx.serialization.json.a value) {
        super(json, value, null);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(value, "value");
        this.f23050f = value;
        this.f23051g = s0().size();
        this.f23052h = -1;
    }

    @Override // kotlinx.serialization.internal.e1
    public String a0(kotlinx.serialization.descriptors.f desc, int i10) {
        kotlin.jvm.internal.p.e(desc, "desc");
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.json.internal.c
    public kotlinx.serialization.json.b e0(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        return s0().get(Integer.parseInt(tag));
    }

    @Override // y9.c
    public int o(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        int i10 = this.f23052h;
        if (i10 >= this.f23051g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f23052h = i11;
        return i11;
    }

    @Override // kotlinx.serialization.json.internal.c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.a s0() {
        return this.f23050f;
    }
}
