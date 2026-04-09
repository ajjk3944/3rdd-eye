package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public final class n extends j {

    /* renamed from: c, reason: collision with root package name */
    public final z9.a f23036c;

    /* renamed from: d, reason: collision with root package name */
    public int f23037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d0 writer, z9.a json) {
        super(writer);
        kotlin.jvm.internal.p.e(writer, "writer");
        kotlin.jvm.internal.p.e(json, "json");
        this.f23036c = json;
    }

    @Override // kotlinx.serialization.json.internal.j
    public void b() {
        n(true);
        this.f23037d++;
    }

    @Override // kotlinx.serialization.json.internal.j
    public void c() {
        n(false);
        j("\n");
        int i10 = this.f23037d;
        for (int i11 = 0; i11 < i10; i11++) {
            j(this.f23036c.e().i());
        }
    }

    @Override // kotlinx.serialization.json.internal.j
    public void o() {
        e(' ');
    }

    @Override // kotlinx.serialization.json.internal.j
    public void p() {
        this.f23037d--;
    }
}
