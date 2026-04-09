package Q6;

import G6.O;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final O f19211a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19212b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19213c;

    /* renamed from: d, reason: collision with root package name */
    private final c f19214d;

    /* renamed from: e, reason: collision with root package name */
    private final e f19215e;

    /* renamed from: f, reason: collision with root package name */
    private final b f19216f;

    public f(O o10, int i10, long j10, c cVar, e eVar, b bVar) {
        this.f19211a = o10;
        this.f19212b = i10;
        this.f19213c = j10;
        this.f19214d = cVar;
        this.f19215e = eVar;
        this.f19216f = bVar;
    }

    public O a() {
        return this.f19211a;
    }

    public int b() {
        return this.f19212b;
    }

    public e c() {
        return this.f19215e;
    }

    public b d() {
        return this.f19216f;
    }

    public String toString() {
        return "ScanResult{bleDevice=" + this.f19211a + ", rssi=" + this.f19212b + ", timestampNanos=" + this.f19213c + ", callbackType=" + this.f19214d + ", scanRecord=" + L6.b.a(this.f19215e.b()) + ", isConnectable=" + this.f19216f + '}';
    }
}
