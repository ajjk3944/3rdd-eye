package x8;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25086a;

    /* renamed from: b, reason: collision with root package name */
    public final char f25087b;

    /* renamed from: c, reason: collision with root package name */
    public final double f25088c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25089d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25090e;

    public e(ArrayList arrayList, char c4, double d6, String str, String str2) {
        this.f25086a = arrayList;
        this.f25087b = c4;
        this.f25088c = d6;
        this.f25089d = str;
        this.f25090e = str2;
    }

    public static int a(char c4, String str, String str2) {
        return str2.hashCode() + c7.a.g(str, c4 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f25087b, this.f25090e, this.f25089d);
    }
}
