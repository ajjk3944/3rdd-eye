package p2;

import i2.C4448h;
import i2.EnumC4428A;
import i2.z;
import k2.InterfaceC5212c;
import u2.C5624c;

/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public final class i implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final a f45046a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45047b;

    /* compiled from: MergePaths.java */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public i(String str, a aVar, boolean z10) {
        this.f45046a = aVar;
        this.f45047b = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        if (zVar.f38434n.f38282a.contains(EnumC4428A.MergePathsApi19)) {
            return new k2.l(this);
        }
        C5624c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f45046a + '}';
    }
}
