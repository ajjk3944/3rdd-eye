package kotlin;

import kotlin.jvm.internal.l;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes3.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final a Companion = new a();
    public static final KotlinVersion CURRENT = new KotlinVersion(2, 1, 10);

    /* compiled from: KotlinVersion.kt */
    public static final class a {
    }

    public KotlinVersion(int i, int i10, int i11) {
        this.major = i;
        this.minor = i10;
        this.patch = i11;
        this.version = versionOf(i, i10, i11);
    }

    private final int versionOf(int i, int i10, int i11) {
        if (i >= 0 && i < 256 && i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256) {
            return (i << 16) + (i10 << 8) + i11;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i10 + '.' + i11).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i, int i10) {
        int i11 = this.major;
        if (i11 <= i) {
            return i11 == i && this.minor >= i10;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion other) {
        l.f(other, "other");
        return this.version - other.version;
    }

    public KotlinVersion(int i, int i10) {
        this(i, i10, 0);
    }

    public final boolean isAtLeast(int i, int i10, int i11) {
        int i12 = this.major;
        if (i12 > i) {
            return true;
        }
        if (i12 != i) {
            return false;
        }
        int i13 = this.minor;
        if (i13 <= i10) {
            return i13 == i10 && this.patch >= i11;
        }
        return true;
    }
}
