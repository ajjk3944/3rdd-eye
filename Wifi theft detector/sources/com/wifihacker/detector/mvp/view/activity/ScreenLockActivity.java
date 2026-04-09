package com.wifihacker.detector.mvp.view.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.applovin.sdk.AppLovinEventTypes;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.detector.mvp.view.widget.SildingFinishLayout;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.k;
import g8.s;
import g8.u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.jmdns.impl.constants.DNSConstants;
import l8.o;

/* loaded from: classes3.dex */
public class ScreenLockActivity extends BaseActivity<o> implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public ObjectAnimator f20386j;

    /* renamed from: k, reason: collision with root package name */
    public AnimatorSet f20387k;

    /* renamed from: l, reason: collision with root package name */
    public SildingFinishLayout f20388l;

    /* renamed from: m, reason: collision with root package name */
    public c f20389m = null;

    /* renamed from: n, reason: collision with root package name */
    public Handler f20390n = new a();

    /* renamed from: o, reason: collision with root package name */
    public PhoneStateListener f20391o = new b();

    /* renamed from: p, reason: collision with root package name */
    public int f20392p = 0;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            ((o) ScreenLockActivity.this.f20418i).G.setText(simpleDateFormat.format(calendar.getTime()));
        }
    }

    public class b extends PhoneStateListener {
        public b() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i10, String str) {
            super.onCallStateChanged(i10, str);
            if (i10 == 1 || i10 == 2) {
                try {
                    ScreenLockActivity.this.finish();
                } catch (Exception e10) {
                    k.b(Log.getStackTraceString(e10));
                }
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i10 = (intent.getExtras().getInt(AppLovinEventTypes.USER_COMPLETED_LEVEL) * 100) / intent.getExtras().getInt("scale");
            ViewGroup.LayoutParams layoutParams = ((o) ScreenLockActivity.this.f20418i).D.getLayoutParams();
            layoutParams.width = s.g(ScreenLockActivity.this.getApplicationContext(), i10 - 4);
            ((o) ScreenLockActivity.this.f20418i).D.setLayoutParams(layoutParams);
            ((o) ScreenLockActivity.this.f20418i).E.setText(i10 + "%");
        }

        public /* synthetic */ c(ScreenLockActivity screenLockActivity, a aVar) {
            this();
        }
    }

    public class d implements z7.a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f20396a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                ScreenLockActivity.this.m0(dVar.f20396a);
            }
        }

        public d() {
        }

        @Override // z7.a
        public void a(HostInfo hostInfo) {
        }

        @Override // z7.a
        public void b(int i10) {
        }

        @Override // z7.a
        public void c(HostInfo hostInfo) {
            if (this.f20396a == null) {
                this.f20396a = new ArrayList();
            }
            this.f20396a.add(hostInfo);
            ((o) ScreenLockActivity.this.f20418i).f23298w.B.setText(String.valueOf(this.f20396a.size()));
        }

        @Override // z7.a
        public void onFinish() {
            ScreenLockActivity.this.runOnUiThread(new a());
            g8.f.c(ScreenLockActivity.this, this.f20396a, g8.f.b(ScreenLockActivity.this));
            g8.f.d(ScreenLockActivity.this, this.f20396a);
        }
    }

    public final class e implements SildingFinishLayout.a {
        public e() {
        }

        @Override // com.wifihacker.detector.mvp.view.widget.SildingFinishLayout.a
        public void a() {
            ScreenLockActivity.this.finish();
        }

        @Override // com.wifihacker.detector.mvp.view.widget.SildingFinishLayout.a
        public void b() {
            ScreenLockActivity.this.finish();
        }

        public /* synthetic */ e(ScreenLockActivity screenLockActivity, a aVar) {
            this();
        }
    }

    public class f extends Thread {
        public f() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            while (true) {
                try {
                    Thread.sleep(1000L);
                    Message message = new Message();
                    message.what = 1;
                    ScreenLockActivity.this.f20390n.sendMessage(message);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public boolean S() {
        return false;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_lock_screen;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(4718592);
        SildingFinishLayout sildingFinishLayout = (SildingFinishLayout) findViewById(R.id.sfl);
        this.f20388l = sildingFinishLayout;
        sildingFinishLayout.setEnableLeftSildeEvent(true);
        this.f20388l.setEnableRightSildeEvent(false);
        k0();
        new f().start();
        w7.a.b().f(this, new d());
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
        this.f20388l.setOnSildingFinishListener(new e(this, null));
        ((o) this.f20418i).f23300y.setOnClickListener(this);
        ((o) this.f20418i).f23298w.f23306w.setOnClickListener(this);
    }

    public final synchronized void i0(ArrayList arrayList) {
        int size;
        int i10 = 0;
        try {
            if (arrayList != null) {
                int size2 = arrayList.size();
                int i11 = 0;
                size = 0;
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    if (g8.o.c().a(this, "device_marked", ((HostInfo) obj).hardwareAddress, false)) {
                        i11++;
                    } else {
                        size++;
                    }
                }
                i10 = i11;
            } else {
                size = arrayList.size();
            }
            ((o) this.f20418i).f23298w.f23309z.setText(String.valueOf(i10));
            ((o) this.f20418i).f23298w.D.setText(String.valueOf(size));
        } catch (Throwable th) {
            throw th;
        }
    }

    public String j0(int i10) {
        switch (i10) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }

    public final void k0() {
        this.f20389m = new c(this, null);
        registerReceiver(this.f20389m, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        try {
            ((TelephonyManager) getSystemService("phone")).listen(this.f20391o, 32);
        } catch (Exception e10) {
            k.b(Log.getStackTraceString(e10));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        ((o) this.f20418i).G.setText(simpleDateFormat.format(calendar.getTime()));
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        ((o) this.f20418i).H.setText(j0(calendar2.get(2) + 1));
        ((o) this.f20418i).F.setText(calendar2.get(5) + "th");
    }

    public final void l0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((o) this.f20418i).f23298w.F, "rotation", 0.0f, 360.0f);
        this.f20386j = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.f20386j.setDuration(DNSConstants.SERVICE_INFO_TIMEOUT);
        this.f20386j.setInterpolator(new LinearInterpolator());
        this.f20386j.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((o) this.f20418i).f23298w.G, "scaleX", 1.0f, 1.4f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(((o) this.f20418i).f23298w.G, "scaleY", 1.0f, 1.4f);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(((o) this.f20418i).f23298w.G, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat4.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f20387k = animatorSet;
        animatorSet.setDuration(1000L);
        this.f20387k.setInterpolator(new LinearInterpolator());
        this.f20387k.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        this.f20387k.start();
    }

    public final synchronized void m0(ArrayList arrayList) {
        if (arrayList.size() > this.f20392p) {
            int size = arrayList.size();
            this.f20392p = size;
            ((o) this.f20418i).f23298w.B.setText(String.valueOf(size));
            i0(arrayList);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewDataBinding viewDataBinding = this.f20418i;
        if (view == ((o) viewDataBinding).f23300y) {
            h.m(this);
            finish();
        } else if (view == ((o) viewDataBinding).f23298w.f23306w) {
            h.n(this);
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f20389m);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            l0();
        }
        ((o) this.f20418i).f23298w.E.setText(u.c(this));
    }
}
