package e7;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.a f20982a;

    /* renamed from: b, reason: collision with root package name */
    public f f20983b;

    public d(com.unity3d.scar.adapter.common.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    @Override // e7.a
    public void a(String str, String str2, Object obj) {
        this.f20983b.a(str, str2);
        this.f20982a.b();
    }

    @Override // e7.a
    public void onFailure(String str) {
        this.f20983b.d(str);
        this.f20982a.b();
    }

    public d(com.unity3d.scar.adapter.common.a aVar, g gVar, f fVar) {
        this.f20982a = aVar;
        this.f20983b = fVar;
    }
}
