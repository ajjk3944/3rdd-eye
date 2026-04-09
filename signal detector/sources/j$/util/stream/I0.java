package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class I0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f20880a;

    /* renamed from: b, reason: collision with root package name */
    public final G0 f20881b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20882c;

    @Override // j$.util.stream.G0
    public final int p() {
        return 2;
    }

    public I0(G0 g02, G0 g03) {
        this.f20880a = g02;
        this.f20881b = g03;
        this.f20882c = g03.count() + g02.count();
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i) {
        if (i == 0) {
            return this.f20880a;
        }
        if (i == 1) {
            return this.f20881b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f20882c;
    }

    @Override // j$.util.stream.G0
    public /* bridge */ /* synthetic */ F0 a(int i) {
        return (F0) a(i);
    }
}
