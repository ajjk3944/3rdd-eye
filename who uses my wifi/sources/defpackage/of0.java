package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class of0 {
    public final /* synthetic */ int a = 0;
    public String b;
    public String c;

    public /* synthetic */ of0() {
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return (obj instanceof hk0) && this.b == null && this.c == null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public of0(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
