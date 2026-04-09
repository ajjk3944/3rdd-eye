package p2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f31050a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f31050a == ((h) obj).f31050a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31050a;
    }

    public final String toString() {
        int i4 = this.f31050a;
        return i4 == 0 ? "Button" : i4 == 1 ? "Checkbox" : i4 == 2 ? "Switch" : i4 == 3 ? "RadioButton" : i4 == 4 ? "Tab" : i4 == 5 ? "Image" : i4 == 6 ? "DropdownList" : i4 == 7 ? "Picker" : i4 == 8 ? "Carousel" : "Unknown";
    }
}
