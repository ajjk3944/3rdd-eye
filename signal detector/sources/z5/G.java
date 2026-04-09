package z5;

/* loaded from: classes3.dex */
public final class G extends H {

    /* renamed from: c, reason: collision with root package name */
    public final C3030f f24488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J f24489d;

    public G(J j6, long j7, C3030f c3030f) {
        this.f24489d = j6;
        this.f24490a = j7;
        this.f24491b = -1;
        this.f24488c = c3030f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24488c.D(this.f24489d);
    }

    @Override // z5.H
    public final String toString() {
        return super.toString() + this.f24488c;
    }
}
