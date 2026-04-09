package je;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f27547a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f27548b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f27549c;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    static {
        f fVar = new f("X86_32", 0);
        f fVar2 = new f("X86_64", 1);
        f fVar3 = new f("ARM_UNKNOWN", 2);
        f fVar4 = new f("PPC", 3);
        f fVar5 = new f("PPC64", 4);
        f fVar6 = new f("ARMV6", 5);
        f fVar7 = new f("ARMV7", 6);
        f fVar8 = new f("UNKNOWN", 7);
        f27547a = fVar8;
        f fVar9 = new f("ARMV7S", 8);
        f fVar10 = new f("ARM64", 9);
        f27549c = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        HashMap map = new HashMap(4);
        f27548b = map;
        map.put("armeabi-v7a", fVar7);
        map.put("armeabi", fVar6);
        map.put("arm64-v8a", fVar10);
        map.put("x86", fVar);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f27549c.clone();
    }
}
