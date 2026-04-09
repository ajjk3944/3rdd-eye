package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ui4 {
    public final String a;
    public final String b;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ui4(String str, String str2) {
        this.a = v23.n(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ui4.class == obj.getClass()) {
            ui4 ui4Var = (ui4) obj;
            if (Objects.equals(this.a, ui4Var.a) && Objects.equals(this.b, ui4Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
