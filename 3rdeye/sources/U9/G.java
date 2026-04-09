package U9;

/* compiled from: ResponseBody.kt */
/* loaded from: classes3.dex */
public final class G extends F {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f12591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia.g f12593d;

    public G(v vVar, long j4, ia.g gVar) {
        this.f12591b = vVar;
        this.f12592c = j4;
        this.f12593d = gVar;
    }

    @Override // U9.F
    public final long contentLength() {
        return this.f12592c;
    }

    @Override // U9.F
    public final v contentType() {
        return this.f12591b;
    }

    @Override // U9.F
    public final ia.g source() {
        return this.f12593d;
    }
}
