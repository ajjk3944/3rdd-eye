package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iv {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public iv(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + ((str.hashCode() + (c * 31)) * 31);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
