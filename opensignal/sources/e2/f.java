package e2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f7685a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f7685a == ((f) obj).f7685a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7685a);
    }

    public final String toString() {
        int i10 = this.f7685a;
        return i10 == 0 ? "Button" : i10 == 1 ? "Checkbox" : i10 == 2 ? "Switch" : i10 == 3 ? "RadioButton" : i10 == 4 ? "Tab" : i10 == 5 ? "Image" : i10 == 6 ? "DropdownList" : i10 == 7 ? "Picker" : i10 == 8 ? "Carousel" : "Unknown";
    }
}
