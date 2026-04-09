package n2;

import java.util.ArrayList;

/* compiled from: FontCharacter.java */
/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5350d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f44264a;

    /* renamed from: b, reason: collision with root package name */
    public final char f44265b;

    /* renamed from: c, reason: collision with root package name */
    public final double f44266c;

    /* renamed from: d, reason: collision with root package name */
    public final String f44267d;

    /* renamed from: e, reason: collision with root package name */
    public final String f44268e;

    public C5350d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f44264a = arrayList;
        this.f44265b = c10;
        this.f44266c = d10;
        this.f44267d = str;
        this.f44268e = str2;
    }

    public static int a(String str, String str2, char c10) {
        return str2.hashCode() + B4.g.n(c10 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f44268e, this.f44267d, this.f44265b);
    }
}
