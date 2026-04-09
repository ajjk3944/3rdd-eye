package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services;

import A2.l;
import B.i;
import C.C0638z;
import E.u;
import H6.C0680q;
import H6.I;
import I.j;
import I2.m;
import N7.G8;
import V.f;
import W.C1619g;
import W.C1631t;
import W.C1634w;
import W.F;
import W.M;
import W.T;
import W.a0;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1791y;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.BackgroundVideoActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.BackgroundCameraXService;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import m1.C5317a;
import o0.b;
import y0.o;
import z0.C5848a;

/* loaded from: classes.dex */
public class BackgroundCameraXService extends Service {

    /* renamed from: t, reason: collision with root package name */
    public static Boolean f22207t = Boolean.FALSE;

    /* renamed from: d, reason: collision with root package name */
    public PreviewView f22210d;

    /* renamed from: f, reason: collision with root package name */
    public Chronometer f22212f;

    /* renamed from: g, reason: collision with root package name */
    public WindowManager f22213g;

    /* renamed from: h, reason: collision with root package name */
    public WindowManager.LayoutParams f22214h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public BackgroundCameraXService f22215j;

    /* renamed from: k, reason: collision with root package name */
    public int f22216k;

    /* renamed from: l, reason: collision with root package name */
    public int f22217l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f22218m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f22219n;

    /* renamed from: p, reason: collision with root package name */
    public m f22221p;

    /* renamed from: q, reason: collision with root package name */
    public Vibrator f22222q;

    /* renamed from: s, reason: collision with root package name */
    public I2.c f22224s;

    /* renamed from: b, reason: collision with root package name */
    public M f22208b = null;

    /* renamed from: c, reason: collision with root package name */
    public T<F> f22209c = null;

    /* renamed from: e, reason: collision with root package name */
    public int f22211e = 1;

    /* renamed from: o, reason: collision with root package name */
    public final d f22220o = new d();

    /* renamed from: r, reason: collision with root package name */
    public long f22223r = 0;

    public class a implements Chronometer.OnChronometerTickListener {
        public a() {
        }

        @Override // android.widget.Chronometer.OnChronometerTickListener
        public final void onChronometerTick(Chronometer chronometer) {
            BackgroundCameraXService backgroundCameraXService = BackgroundCameraXService.this;
            switch (backgroundCameraXService.f22221p.f2429a.getInt("DURATION", 0)) {
                case 1:
                    if (chronometer.getText().toString().equalsIgnoreCase("00:30")) {
                        backgroundCameraXService.b();
                        break;
                    }
                    break;
                case 2:
                    if (chronometer.getText().toString().equalsIgnoreCase("01:00")) {
                        backgroundCameraXService.b();
                        break;
                    }
                    break;
                case 3:
                    if (chronometer.getText().toString().equalsIgnoreCase("02:00")) {
                        backgroundCameraXService.b();
                        break;
                    }
                    break;
                case 4:
                    if (chronometer.getText().toString().equalsIgnoreCase("05:00")) {
                        backgroundCameraXService.b();
                        break;
                    }
                    break;
                case 5:
                    if (chronometer.getText().toString().equalsIgnoreCase("15:00")) {
                        backgroundCameraXService.b();
                        break;
                    }
                    break;
                case 6:
                    if (chronometer.getText().toString().equalsIgnoreCase("30:00")) {
                        backgroundCameraXService.b();
                        break;
                    }
                    break;
            }
        }
    }

    public class b implements View.OnTouchListener {

        /* renamed from: b, reason: collision with root package name */
        public int f22226b;

        /* renamed from: c, reason: collision with root package name */
        public int f22227c;

        /* renamed from: d, reason: collision with root package name */
        public float f22228d;

        /* renamed from: e, reason: collision with root package name */
        public float f22229e;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            BackgroundCameraXService backgroundCameraXService = BackgroundCameraXService.this;
            if (action == 0) {
                WindowManager.LayoutParams layoutParams = backgroundCameraXService.f22214h;
                this.f22226b = layoutParams.x;
                this.f22227c = layoutParams.y;
                this.f22228d = motionEvent.getRawX();
                this.f22229e = motionEvent.getRawY();
                return true;
            }
            if (action != 2) {
                return false;
            }
            try {
                backgroundCameraXService.f22214h.x = this.f22226b + ((int) (motionEvent.getRawX() - this.f22228d));
                backgroundCameraXService.f22214h.y = this.f22227c + ((int) (motionEvent.getRawY() - this.f22229e));
                backgroundCameraXService.f22213g.updateViewLayout(backgroundCameraXService.i, backgroundCameraXService.f22214h);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return true;
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b.d dVarA;
            BackgroundCameraXService.this.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BackgroundCameraXService backgroundCameraXService = BackgroundCameraXService.this;
            int i = backgroundCameraXService.f22211e;
            f fVar = f.f12823g;
            synchronized (fVar.f12824a) {
                dVarA = fVar.f12825b;
                if (dVarA == null) {
                    dVarA = o0.b.a(new i(5, fVar, new C0638z(backgroundCameraXService)));
                    fVar.f12825b = dVarA;
                }
            }
            V.d dVar = new V.d(new C0680q(backgroundCameraXService, 5), 0);
            I.b bVarJ = j.j(dVarA, new I(dVar, 2), u.y());
            bVarJ.addListener(new H2.d(backgroundCameraXService, i, 0, bVarJ), C5848a.getMainExecutor(backgroundCameraXService));
        }
    }

    public class d extends Binder {
        public d() {
        }
    }

    public static void a(BackgroundCameraXService backgroundCameraXService, a0 a0Var) {
        backgroundCameraXService.getClass();
        if (a0Var instanceof a0.d) {
            backgroundCameraXService.f22218m.setEnabled(true);
            f22207t = Boolean.TRUE;
            backgroundCameraXService.f22212f.setBase(SystemClock.elapsedRealtime());
            backgroundCameraXService.f22212f.setVisibility(0);
            backgroundCameraXService.f22212f.start();
            backgroundCameraXService.e(backgroundCameraXService.f22212f.getBase(), "video_recording_action");
            return;
        }
        if (a0Var instanceof a0.a) {
            a0.a aVar = (a0.a) a0Var;
            if (aVar.f13233b == 0) {
                f22207t = Boolean.FALSE;
                backgroundCameraXService.f22212f.stop();
                backgroundCameraXService.f22212f.setVisibility(4);
                backgroundCameraXService.e(0L, "stop_chronometer_action");
                Toast.makeText(backgroundCameraXService, backgroundCameraXService.getResources().getString(R.string.video_saved_path), 0).show();
                return;
            }
            f22207t = Boolean.FALSE;
            M m10 = backgroundCameraXService.f22208b;
            if (m10 != null) {
                try {
                    try {
                        m10.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                } finally {
                    backgroundCameraXService.f22208b = null;
                }
            }
            String strS = "Error: " + aVar.f13233b;
            if (Build.VERSION.SDK_INT <= 23) {
                strS = G8.s(strS, " - Try lower quality settings");
            }
            StringBuilder sbU = G8.u(strS);
            sbU.append(backgroundCameraXService.getString(R.string.record_video_not_supported));
            Toast.makeText(backgroundCameraXService, sbU.toString(), 0).show();
        }
    }

    public static float d(BackgroundCameraXService backgroundCameraXService, float f10) {
        return f10 * backgroundCameraXService.getResources().getDisplayMetrics().density;
    }

    public final void b() {
        if (this.f22208b == null) {
            if (this.f22221p.f2429a.getBoolean("VIBRATION", false)) {
                this.f22222q.vibrate(300L);
            }
            try {
                f(c(new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()))));
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                Toast.makeText(this, "Error creating video output: " + e4.getMessage(), 0).show();
                return;
            }
        }
        try {
            this.f22212f.stop();
            this.f22212f.setVisibility(4);
            C5317a.a(this).c(new Intent("stop_chronometer_action"));
            this.f22208b.close();
            this.f22208b = null;
            if (this.i.isAttachedToWindow()) {
                this.f22213g.removeView(this.i);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } finally {
            stopForeground(true);
            stopSelf();
        }
    }

    public final C1631t c(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", "DCIM/Third Eye/Videos");
        } else {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Third Eye/Videos");
            if (!file.exists() && !file.mkdirs()) {
                throw new RuntimeException("Cannot create video directory");
            }
            contentValues.put("_data", new File(file, G8.s(str, ".mp4")).getAbsolutePath());
        }
        ContentResolver contentResolver = getContentResolver();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        C1619g.a aVar = new C1619g.a();
        aVar.f13264a = 0L;
        aVar.f13265b = 0L;
        l.p(contentResolver, "Content resolver can't be null.");
        l.p(uri, "Collection Uri can't be null.");
        aVar.f13266c = contentResolver;
        if (uri == null) {
            throw new NullPointerException("Null collectionUri");
        }
        aVar.f13267d = uri;
        if (C1631t.f13298c == null) {
            throw new NullPointerException("Null contentValues");
        }
        aVar.f13268e = contentValues;
        String strS = aVar.f13264a == null ? " fileSizeLimit" : "";
        if (aVar.f13265b == null) {
            strS = strS.concat(" durationLimitMillis");
        }
        if (aVar.f13266c == null) {
            strS = G8.s(strS, " contentResolver");
        }
        if (aVar.f13267d == null) {
            strS = G8.s(strS, " collectionUri");
        }
        if (aVar.f13268e == null) {
            strS = G8.s(strS, " contentValues");
        }
        if (strS.isEmpty()) {
            return new C1631t(new C1619g(aVar.f13264a.longValue(), aVar.f13265b.longValue(), aVar.f13266c, aVar.f13267d, aVar.f13268e));
        }
        throw new IllegalStateException("Missing required properties:".concat(strS));
    }

    public final void e(long j4, String str) {
        try {
            Intent intent = new Intent(str);
            if (str.equals("video_recording_action")) {
                intent.putExtra("chronometer_base", j4);
            }
            C5317a.a(this).c(intent);
        } catch (Exception e4) {
            va.a.a(e4);
        }
    }

    public final void f(C1631t c1631t) {
        if (this.f22209c == null) {
            Toast.makeText(this, R.string.error_in_capturing_the_video, 0).show();
            return;
        }
        if (Build.VERSION.SDK_INT < 29 && C5848a.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Toast.makeText(this, "Storage write permission not granted", 0).show();
            return;
        }
        try {
            M m10 = this.f22208b;
            if (m10 != null) {
                m10.close();
                this.f22208b = null;
            }
            boolean z10 = this.f22221p.f2429a.getBoolean("AUDIO", false);
            boolean z11 = C5848a.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0;
            if (z10 || !z11) {
                this.f22208b = new C1634w(this, (F) this.f22209c.I(), c1631t).a(C5848a.getMainExecutor(this), new E.j(this, 1));
                return;
            }
            C1634w c1634w = new C1634w(this, (F) this.f22209c.I(), c1631t);
            c1634w.b();
            this.f22208b = c1634w.a(C5848a.getMainExecutor(this), new E.j(this, 1));
        } catch (SecurityException e4) {
            e4.printStackTrace();
            Toast.makeText(this, "Security error: Missing permissions", 0).show();
        } catch (Exception e10) {
            Log.e("Camera", "Fail", e10);
            String string = getString(R.string.error_in_capturing_the_video);
            int i = Build.VERSION.SDK_INT;
            if (i <= 23) {
                string = string + " (API " + i + ")";
            }
            Toast.makeText(this, string, 0).show();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f22220o;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f22221p = new m(this);
        I2.c cVar = new I2.c();
        C1791y c1791y = new C1791y(cVar);
        cVar.f2416b = c1791y;
        c1791y.f(AbstractC1781n.b.CREATED);
        this.f22224s = cVar;
        c1791y.f(AbstractC1781n.b.STARTED);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f22224s.f2416b.f(AbstractC1781n.b.DESTROYED);
        stopSelf();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        this.f22215j = this;
        this.f22222q = (Vibrator) getSystemService("vibrator");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(B2.j.c());
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) BackgroundVideoActivity.class), 67108864);
        o oVar = new o(this, "ForeGroundID");
        oVar.f47889e = o.b(getString(R.string.offscreen_recording));
        oVar.f47890f = o.b(getString(R.string.recording_has_been_started));
        oVar.f47902s.icon = R.drawable.icon;
        oVar.f47891g = activity;
        Notification notificationA = oVar.a();
        int i12 = (!(C5848a.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0) || this.f22221p.f2429a.getBoolean("AUDIO", false)) ? 64 : 192;
        if (i11 >= 30) {
            startForeground(123, notificationA, i12);
        } else {
            startForeground(123, notificationA);
        }
        View viewInflate = View.inflate(this.f22215j, R.layout.recording_preview, null);
        this.i = viewInflate;
        Chronometer chronometer = (Chronometer) this.i.findViewById(R.id.time_stamp);
        this.f22212f = chronometer;
        chronometer.setOnChronometerTickListener(new a());
        final int i13 = i11 >= 26 ? 2038 : 2002;
        if (!this.f22221p.f2429a.getBoolean("PREVIEW", true)) {
            this.f22216k = (int) d(this, 1.0f);
            this.f22217l = (int) d(this, 1.0f);
        } else if (this.f22221p.f2429a.getInt("CAMERA_SIZE", 0) == 0) {
            this.f22216k = (int) d(this, 130.0f);
            this.f22217l = (int) d(this, 150.0f);
        } else if (this.f22221p.f2429a.getInt("CAMERA_SIZE", 0) == 1) {
            this.f22216k = (int) d(this, 160.0f);
            this.f22217l = (int) d(this, 210.0f);
        } else {
            this.f22216k = (int) d(this, 200.0f);
            this.f22217l = (int) d(this, 260.0f);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(this.f22216k, this.f22217l, i13, 67368, -3);
        this.f22214h = layoutParams;
        layoutParams.gravity = 8388627;
        this.f22213g = (WindowManager) this.f22215j.getSystemService("window");
        try {
            if (this.i.getParent() == null) {
                this.f22213g.addView(this.i, this.f22214h);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f22210d = (PreviewView) this.i.findViewById(R.id.viewFinder);
        this.f22212f = (Chronometer) this.i.findViewById(R.id.time_stamp);
        this.f22218m = (ImageView) this.i.findViewById(R.id.stop_video);
        this.f22219n = (ImageView) this.i.findViewById(R.id.close_preview);
        this.f22218m.setOnClickListener(new F8.c(this, 3));
        this.f22219n.setOnClickListener(new View.OnClickListener() { // from class: H2.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                Boolean bool = BackgroundCameraXService.f22207t;
                BackgroundCameraXService backgroundCameraXService = this.f2022b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - backgroundCameraXService.f22223r < 1000) {
                    return;
                }
                backgroundCameraXService.f22223r = jCurrentTimeMillis;
                try {
                    backgroundCameraXService.f22216k = 1;
                    backgroundCameraXService.f22217l = 1;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(backgroundCameraXService.f22216k, backgroundCameraXService.f22217l, i14, 67368, -3);
                    backgroundCameraXService.f22214h = layoutParams2;
                    layoutParams2.gravity = 8388627;
                    backgroundCameraXService.f22213g = (WindowManager) backgroundCameraXService.f22215j.getSystemService("window");
                    try {
                        if (backgroundCameraXService.i.isAttachedToWindow()) {
                            backgroundCameraXService.f22213g.updateViewLayout(backgroundCameraXService.i, backgroundCameraXService.f22214h);
                        }
                    } catch (Exception e10) {
                        va.a.a(e10);
                    }
                } catch (Exception e11) {
                    va.a.a(e11);
                }
            }
        });
        this.i.setOnTouchListener(new b());
        if (this.f22221p.f2429a.getInt("CAMERA_FRONT", 0) == 0) {
            this.f22211e = 1;
        } else {
            this.f22211e = 0;
        }
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new c());
        return 1;
    }
}
