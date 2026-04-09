package k7;

import java.util.ArrayList;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28056a;

    /* renamed from: b, reason: collision with root package name */
    public final char f28057b;

    /* renamed from: c, reason: collision with root package name */
    public final double f28058c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28059d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28060e;

    public d(ArrayList arrayList, char c9, double d10, String str, String str2) {
        this.f28056a = arrayList;
        this.f28057b = c9;
        this.f28058c = d10;
        this.f28059d = str;
        this.f28060e = str2;
    }

    public static int a(char c9, String str, String str2) {
        return str2.hashCode() + u.m(c9 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f28057b, this.f28060e, this.f28059d);
    }
}
