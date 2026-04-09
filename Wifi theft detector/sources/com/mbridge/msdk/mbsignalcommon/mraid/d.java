package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    public static double f16211f = -1.0d;

    /* renamed from: a, reason: collision with root package name */
    private Context f16212a;

    /* renamed from: b, reason: collision with root package name */
    private AudioManager f16213b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16214c = false;

    /* renamed from: d, reason: collision with root package name */
    private b f16215d;

    /* renamed from: e, reason: collision with root package name */
    private a f16216e;

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<d> f16217a;

        public a(d dVar) {
            this.f16217a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f16217a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f16212a = context;
        this.f16213b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f16213b;
        double streamVolume = ((this.f16213b != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f16211f = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.f16215d;
    }

    public void c() {
        if (this.f16212a != null) {
            this.f16216e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f16212a.registerReceiver(this.f16216e, intentFilter);
            this.f16214c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f16214c || (context = this.f16212a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f16216e);
            this.f16215d = null;
            this.f16214c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.f16215d = bVar;
    }
}
