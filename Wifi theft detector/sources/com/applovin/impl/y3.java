package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class y3 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final List f8678a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a();

        void b();
    }

    public y3(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void a(a aVar) {
        this.f8678a.add(aVar);
    }

    public void b(a aVar) {
        this.f8678a.remove(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8678a);
        int i10 = 0;
        if (a(intent)) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).a();
            }
            return;
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((a) obj2).b();
        }
    }

    private static boolean a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }
}
