package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ce2 {
    public static final ce2 e = new ce2(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ce2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = v23.a(i3) ? v23.d(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce2)) {
            return false;
        }
        ce2 ce2Var = (ce2) obj;
        return this.a == ce2Var.a && this.b == ce2Var.b && this.c == ce2Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i3).length() + 1);
        ex0.o(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i2);
        return ga1.k(sb, ", encoding=", i3, "]");
    }
}
