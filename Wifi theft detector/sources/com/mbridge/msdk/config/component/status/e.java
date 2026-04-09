package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private AudioManager f13709b;

    /* renamed from: c, reason: collision with root package name */
    private b f13710c;

    /* renamed from: a, reason: collision with root package name */
    private final String f13708a = "MBVolumeEventPublisher";

    /* renamed from: d, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f13711d = new CopyOnWriteArrayList();

    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                e.this.b();
            }
        }
    }

    public e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            this.f13709b = (AudioManager) contextD.getApplicationContext().getSystemService("audio");
        }
        c();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f13711d.remove(aVar);
        }
    }

    public void c() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                this.f13710c = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                contextD.registerReceiver(this.f13710c, intentFilter);
            }
        } catch (Throwable th) {
            q0.b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    public void d() {
        if (this.f13711d.isEmpty()) {
            e();
            this.f13709b = null;
        }
    }

    public void e() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.unregisterReceiver(this.f13710c);
            }
        } catch (Throwable th) {
            q0.b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916005");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.a("volume"), String.valueOf(a()));
            bVar.a(map);
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f13711d.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("MBVolumeEventPublisher", th.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (this.f13711d.contains(aVar)) {
            return;
        }
        this.f13711d.add(aVar);
    }

    private double a() {
        AudioManager audioManager = this.f13709b;
        return ((this.f13709b != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
    }
}
