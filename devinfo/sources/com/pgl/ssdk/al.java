package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class al {

    /* renamed from: a, reason: collision with root package name */
    private static volatile al f21455a;

    /* renamed from: b, reason: collision with root package name */
    private Context f21456b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f21457c = new ArrayList();

    private al(Context context) {
        this.f21456b = null;
        this.f21456b = context;
    }

    public static al a(Context context) {
        if (f21455a == null) {
            synchronized (al.class) {
                try {
                    if (f21455a == null) {
                        f21455a = new al(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21455a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f21456b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        if (this.f21456b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return 0;
        }
        return Math.round(((r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / r0.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f21457c.size() <= 0) {
            return "-1";
        }
        return String.valueOf(this.f21457c.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f21457c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f21457c.add(Integer.valueOf(iF));
        try {
            int size = this.f21457c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f21457c.subList(size - 10, size));
                this.f21457c.clear();
                this.f21457c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
