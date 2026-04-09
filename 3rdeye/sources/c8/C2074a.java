package c8;

import N7.G8;
import android.text.TextUtils;

/* compiled from: Counter.java */
/* renamed from: c8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2074a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18549a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18550b;

    /* renamed from: c, reason: collision with root package name */
    public int f18551c;

    public C2074a(String str, String str2) {
        this.f18549a = str;
        this.f18550b = str2;
    }

    public static String a(String str, String str2) {
        return G8.s(!TextUtils.isEmpty(str) ? G8.s(str, ".") : null, str2);
    }
}
