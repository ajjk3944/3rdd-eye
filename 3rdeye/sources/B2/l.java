package B2;

import B0.g;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ActivityC1762o;
import androidx.fragment.app.ComponentCallbacksC1759l;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.BackgroundCameraXService;
import com.zipoapps.premiumhelper.e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import m1.C5317a;

/* compiled from: RecordingFragment.java */
/* loaded from: classes.dex */
public class l extends ComponentCallbacksC1759l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f413b;

    /* renamed from: c, reason: collision with root package name */
    public RelativeLayout f414c;

    /* renamed from: d, reason: collision with root package name */
    public Dialog f415d;

    /* renamed from: e, reason: collision with root package name */
    public I2.m f416e;

    /* renamed from: g, reason: collision with root package name */
    public BackgroundCameraXService f418g;

    /* renamed from: h, reason: collision with root package name */
    public AppCompatImageView f419h;
    public Chronometer i;

    /* renamed from: j, reason: collision with root package name */
    public AppCompatTextView f420j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f417f = false;

    /* renamed from: k, reason: collision with root package name */
    public long f421k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final a f422l = new a();

    /* renamed from: m, reason: collision with root package name */
    public final b f423m = new b();

    /* compiled from: RecordingFragment.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l lVar = l.this;
            if (!lVar.isAdded() || lVar.getActivity() == null) {
                return;
            }
            lVar.i.setBase(intent.getLongExtra("chronometer_base", 0L));
            lVar.i.start();
            lVar.f420j.setText(lVar.getResources().getString(R.string.recording_is_on));
            lVar.f419h.setImageResource(R.drawable.ic_pause);
            RelativeLayout relativeLayout = lVar.f414c;
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
            relativeLayout.setBackground(g.a.a(resources, R.drawable.orange_circle_bg, null));
            if ("stop_chronometer_action".equals(intent.getAction())) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) lVar.getActivity();
                if (appCompatActivity != null && !appCompatActivity.isFinishing() && !appCompatActivity.isDestroyed()) {
                    va.a.f47104a.a("onHappyMoment: Activity=%s", appCompatActivity.getClass().getSimpleName());
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    com.zipoapps.premiumhelper.e.i(e.a.a(), appCompatActivity, 8);
                }
                lVar.i.stop();
                lVar.f420j.setText(lVar.getResources().getString(R.string.tab_to_start_recording));
                lVar.f419h.setImageResource(R.drawable.ic_play);
                lVar.f414c.setBackground(g.a.a(context.getResources(), R.drawable.circle_bg, null));
                String[] strArrSplit = "00:00".split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                lVar.i.setBase(SystemClock.elapsedRealtime() - (((Integer.parseInt(strArrSplit[0]) * 60) + Integer.parseInt(strArrSplit[1])) * 1000));
                BackgroundCameraXService backgroundCameraXService = lVar.f418g;
                if (backgroundCameraXService == null || !lVar.f417f) {
                    return;
                }
                backgroundCameraXService.stopSelf();
            }
        }
    }

    /* compiled from: RecordingFragment.java */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            BackgroundCameraXService backgroundCameraXService = BackgroundCameraXService.this;
            l lVar = l.this;
            lVar.f418g = backgroundCameraXService;
            lVar.f417f = true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            l.this.f417f = false;
        }
    }

    public final void c() {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        e.a.a().f();
        try {
            startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + this.f413b.getPackageName())), 524);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BackgroundCameraXService backgroundCameraXService;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f421k < 1000) {
            return;
        }
        this.f421k = jCurrentTimeMillis;
        if (view.getId() == R.id.start_recording) {
            if (BackgroundCameraXService.f22207t.booleanValue()) {
                if (!this.f417f || (backgroundCameraXService = this.f418g) == null) {
                    return;
                }
                backgroundCameraXService.b();
                return;
            }
            if (!Settings.canDrawOverlays(this.f413b)) {
                this.f415d.show();
                return;
            }
            try {
                Context context = this.f413b;
                if (context != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        context.startForegroundService(new Intent(this.f413b, (Class<?>) BackgroundCameraXService.class));
                    } else {
                        context.startService(new Intent(this.f413b, (Class<?>) BackgroundCameraXService.class));
                    }
                    if (this.f417f || getActivity() == null) {
                        return;
                    }
                    getActivity().bindService(new Intent(getActivity(), (Class<?>) BackgroundCameraXService.class), this.f423m, 1);
                }
            } catch (Exception e4) {
                va.a.a(e4);
                Context context2 = this.f413b;
                if (context2 != null) {
                    Toast.makeText(context2, R.string.error_in_capturing_the_video, 0).show();
                }
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recording, viewGroup, false);
        this.f413b = getContext();
        ActivityC1762o activity = getActivity();
        this.f416e = new I2.m(this.f413b);
        this.f419h = (AppCompatImageView) viewInflate.findViewById(R.id.play);
        this.f414c = (RelativeLayout) viewInflate.findViewById(R.id.start_recording);
        this.f420j = (AppCompatTextView) viewInflate.findViewById(R.id.recording_status);
        this.i = (Chronometer) viewInflate.findViewById(R.id.time_stamp_main);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.preview);
        checkBox.setChecked(this.f416e.f2429a.getBoolean("PREVIEW", true));
        checkBox.setOnCheckedChangeListener(new k(this, 0));
        viewInflate.findViewById(R.id.start_recording).setOnClickListener(this);
        Dialog dialog = new Dialog(this.f413b, R.style.Theme_Dialog);
        this.f415d = dialog;
        dialog.setContentView(R.layout.overlay_dialog);
        this.f415d.findViewById(R.id.ok).setOnClickListener(new m(this));
        this.f415d.findViewById(R.id.allow_permission).setOnClickListener(new n(this));
        activity.bindService(new Intent(activity, (Class<?>) BackgroundCameraXService.class), this.f423m, 1);
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onDestroy() {
        super.onDestroy();
        if (!this.f417f || getActivity() == null) {
            return;
        }
        try {
            getActivity().unbindService(this.f423m);
        } catch (Exception e4) {
            va.a.a(e4);
        }
        this.f417f = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onDestroyView() {
        super.onDestroyView();
        if (getActivity() != null) {
            try {
                C5317a.a(requireActivity()).d(this.f422l);
            } catch (Exception e4) {
                va.a.a(e4);
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onResume() {
        super.onResume();
        if (BackgroundCameraXService.f22207t.booleanValue()) {
            RelativeLayout relativeLayout = this.f414c;
            Resources resources = this.f413b.getResources();
            ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
            relativeLayout.setBackground(g.a.a(resources, R.drawable.circle_bg, null));
            this.f420j.setText(getResources().getString(R.string.recording_is_on));
            this.f419h.setImageResource(R.drawable.ic_pause);
            return;
        }
        this.f419h.setImageResource(R.drawable.ic_play);
        this.f420j.setText(getResources().getString(R.string.tab_to_start_recording));
        RelativeLayout relativeLayout2 = this.f414c;
        Resources resources2 = this.f413b.getResources();
        ThreadLocal<TypedValue> threadLocal2 = B0.g.f359a;
        relativeLayout2.setBackground(g.a.a(resources2, R.drawable.orange_circle_bg, null));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onStop() {
        super.onStop();
        if (!this.f417f || getActivity() == null) {
            return;
        }
        getActivity().unbindService(this.f423m);
        this.f417f = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            IntentFilter intentFilter = new IntentFilter("video_recording_action");
            C5317a c5317aA = C5317a.a(requireActivity());
            a aVar = this.f422l;
            c5317aA.b(aVar, intentFilter);
            C5317a.a(requireActivity()).b(aVar, new IntentFilter("stop_chronometer_action"));
        }
    }
}
