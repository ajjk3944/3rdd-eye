package y9;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f25917e = new e(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f25918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25921d;

    public e(int i10, int i11, int i12) {
        this.f25918a = i10;
        this.f25919b = i11;
        this.f25920c = i12;
        this.f25921d = qb.v.A(i12) ? qb.v.u(i12, i11) : -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(83);
        sb2.append("AudioFormat[sampleRate=");
        sb2.append(this.f25918a);
        sb2.append(", channelCount=");
        sb2.append(this.f25919b);
        sb2.append(", encoding=");
        sb2.append(this.f25920c);
        sb2.append(']');
        return sb2.toString();
    }
}
