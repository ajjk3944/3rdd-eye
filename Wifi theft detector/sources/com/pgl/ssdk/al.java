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

/* loaded from: classes3.dex */
public class al {

    /* renamed from: a, reason: collision with root package name */
    private static volatile al f19839a;

    /* renamed from: b, reason: collision with root package name */
    private Context f19840b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f19841c = new ArrayList();

    private al(Context context) {
        this.f19840b = null;
        this.f19840b = context;
    }

    public static al a(Context context) {
        if (f19839a == null) {
            synchronized (al.class) {
                try {
                    if (f19839a == null) {
                        f19839a = new al(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19839a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f19840b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        if (this.f19840b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return 0;
        }
        return Math.round(((r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / r0.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f19841c.size() <= 0) {
            return "-1";
        }
        return String.valueOf(this.f19841c.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f19841c).toString();
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
        this.f19841c.add(Integer.valueOf(iF));
        try {
            int size = this.f19841c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f19841c.subList(size - 10, size));
                this.f19841c.clear();
                this.f19841c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
