package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xi1 implements gg1 {
    public final /* synthetic */ int f = 1;
    public int g;
    public long h;
    public int i;

    public /* synthetic */ xi1() {
    }

    public String toString() {
        switch (this.f) {
            case 0:
                String strX = v23.x(this.g);
                int length = strX.length();
                long j = this.h;
                int length2 = String.valueOf(j).length();
                int i = this.i;
                StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
                sb.append("AtomSizeTooSmall{type=");
                sb.append(strX);
                sb.append(", size=");
                sb.append(j);
                sb.append(", minHeaderSize=");
                sb.append(i);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public xi1(int i, long j, int i2) {
        this.g = i;
        this.h = j;
        this.i = i2;
    }
}
