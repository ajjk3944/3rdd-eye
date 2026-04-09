package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f21783a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f21784b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f21785c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m[] f21786d;

    static {
        m mVar = new m("Yes", 0);
        f21783a = mVar;
        m mVar2 = new m("No", 1);
        f21784b = mVar2;
        m mVar3 = new m("NotInitialized", 2);
        f21785c = mVar3;
        f21786d = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f21786d.clone();
    }
}
