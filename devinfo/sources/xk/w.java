package xk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f37244a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f37245b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f37246c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f37247d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f37248e;

    static {
        w wVar = new w("DEFAULT", 0);
        f37244a = wVar;
        w wVar2 = new w("LAZY", 1);
        f37245b = wVar2;
        w wVar3 = new w("ATOMIC", 2);
        f37246c = wVar3;
        w wVar4 = new w("UNDISPATCHED", 3);
        f37247d = wVar4;
        f37248e = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f37248e.clone();
    }
}
