package c7;

import android.os.Bundle;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static String f4753b = "query_info_type";

    /* renamed from: c, reason: collision with root package name */
    public static String f4754c = "requester_type_5";

    /* renamed from: d, reason: collision with root package name */
    public static String f4755d = "UnityScar";

    /* renamed from: a, reason: collision with root package name */
    public String f4756a;

    public a(String str) {
        this.f4756a = f4755d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f4753b, f4754c);
        return bundle;
    }

    public String b() {
        return this.f4756a;
    }
}
