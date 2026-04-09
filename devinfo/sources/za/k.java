package za;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f38156a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f38157b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f38158c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f38159d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f38160e;

    static {
        k kVar = new k("SUCCESS", 0);
        f38156a = kVar;
        k kVar2 = new k("PERMANENT_FAILURE", 1);
        f38157b = kVar2;
        k kVar3 = new k("RETRIABLE_FAILURE", 2);
        f38158c = kVar3;
        k kVar4 = new k("BUFFERED", 3);
        f38159d = kVar4;
        f38160e = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k[] values() {
        return (k[]) f38160e.clone();
    }
}
