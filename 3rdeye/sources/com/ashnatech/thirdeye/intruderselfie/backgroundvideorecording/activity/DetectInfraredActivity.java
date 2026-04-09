package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import I2.m;
import android.graphics.Color;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC2021s;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zipoapps.premiumhelper.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import x2.AbstractActivityC5757a;
import z0.C5848a;

/* loaded from: classes.dex */
public class DetectInfraredActivity extends AbstractActivityC5757a implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public Camera f22060e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceView f22061f;

    /* renamed from: g, reason: collision with root package name */
    public SurfaceHolder f22062g;
    public TextView i;

    /* renamed from: j, reason: collision with root package name */
    public SeekBar f22064j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f22065k;

    /* renamed from: l, reason: collision with root package name */
    public SeekBar f22066l;

    /* renamed from: m, reason: collision with root package name */
    public String f22067m;

    /* renamed from: n, reason: collision with root package name */
    public String f22068n;

    /* renamed from: o, reason: collision with root package name */
    public m f22069o;

    /* renamed from: q, reason: collision with root package name */
    public BottomSheetBehavior<ConstraintLayout> f22071q;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22063h = false;

    /* renamed from: p, reason: collision with root package name */
    public final List<String> f22070p = Arrays.asList("00", "0D", "1A", "26", "33", "40", "4D", "59", "66", "73", "80", "8C", "99", "A6", "B3", "BF", "CC", "D9", "E6", "F2", "FF");

    public class c extends AbstractC2021s {
        public c() {
            super(true);
        }

        @Override // c.AbstractC2021s
        public final void a() {
            DetectInfraredActivity detectInfraredActivity = DetectInfraredActivity.this;
            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = detectInfraredActivity.f22071q;
            if (bottomSheetBehavior.f22545L == 3) {
                bottomSheetBehavior.D(4);
            } else {
                detectInfraredActivity.finish();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            DetectInfraredActivity detectInfraredActivity = DetectInfraredActivity.this;
            detectInfraredActivity.getClass();
            try {
                detectInfraredActivity.f22060e = Camera.open();
            } catch (Exception e4) {
                Camera camera = detectInfraredActivity.f22060e;
                if (camera != null) {
                    camera.stopPreview();
                    detectInfraredActivity.f22060e.release();
                    detectInfraredActivity.f22060e = null;
                    detectInfraredActivity.f22063h = false;
                }
                e4.printStackTrace();
            }
            Camera camera2 = detectInfraredActivity.f22060e;
            if (camera2 != null) {
                try {
                    camera2.setPreviewDisplay(detectInfraredActivity.f22062g);
                    detectInfraredActivity.f22060e.startPreview();
                    detectInfraredActivity.f22060e.setDisplayOrientation(90);
                    detectInfraredActivity.f22063h = true;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    detectInfraredActivity.f22063h = false;
                }
            }
            detectInfraredActivity.f22065k.setVisibility(8);
            detectInfraredActivity.f22069o.d(detectInfraredActivity.f22068n);
            detectInfraredActivity.f22067m = "#" + detectInfraredActivity.f22070p.get(detectInfraredActivity.f22069o.a()) + detectInfraredActivity.f22068n;
            detectInfraredActivity.f22061f.setBackgroundColor(Color.parseColor(detectInfraredActivity.f22067m));
            detectInfraredActivity.i.setVisibility(0);
        }
    }

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_detect_infrared;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        e.f37006D.getClass();
        e.a.a().f37021k.s("infrared_camera", new Bundle[0]);
        this.f22069o = new m(this);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        window.setStatusBarColor(C5848a.getColor(this, R.color.colorPrimaryDark));
        this.f22071q = BottomSheetBehavior.x((ConstraintLayout) findViewById(R.id.bottomSheetCamera));
        this.f22064j = (SeekBar) findViewById(R.id.mySeekBar);
        this.f22066l = (SeekBar) findViewById(R.id.color_seekbar);
        setRequestedOrientation(-1);
        getWindow().setFormat(0);
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.camerapreview);
        this.f22061f = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f22062g = holder;
        holder.addCallback(this);
        this.f22062g.setType(3);
        this.i = (TextView) findViewById(R.id.txt);
        this.f22065k = (LinearLayout) findViewById(R.id.please_wait);
        findViewById(R.id.colorOne).setOnClickListener(this);
        findViewById(R.id.colorTwo).setOnClickListener(this);
        findViewById(R.id.colorThree).setOnClickListener(this);
        findViewById(R.id.colorFour).setOnClickListener(this);
        this.f22068n = this.f22069o.f2429a.getString("CAMERA_COLOR", "1ed87b");
        this.f22066l.setProgress(this.f22069o.a());
        this.f22066l.setOnSeekBarChangeListener(new a());
        this.f22064j.setOnSeekBarChangeListener(new b());
        getOnBackPressedDispatcher().a(this, new c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        List<String> list = this.f22070p;
        switch (id) {
            case R.id.colorFour /* 2131362070 */:
                this.f22068n = "F3F80C";
                this.f22069o.d("F3F80C");
                String str = "#" + list.get(this.f22069o.a()) + this.f22068n;
                this.f22067m = str;
                this.f22061f.setBackgroundColor(Color.parseColor(str));
                break;
            case R.id.colorOne /* 2131362071 */:
                this.f22068n = "1ED87B";
                this.f22069o.d("1ED87B");
                String str2 = "#" + list.get(this.f22069o.a()) + this.f22068n;
                this.f22067m = str2;
                this.f22061f.setBackgroundColor(Color.parseColor(str2));
                break;
            case R.id.colorThree /* 2131362072 */:
                this.f22068n = "2753F0";
                this.f22069o.d("2753F0");
                String str3 = "#" + list.get(this.f22069o.a()) + this.f22068n;
                this.f22067m = str3;
                this.f22061f.setBackgroundColor(Color.parseColor(str3));
                break;
            case R.id.colorTwo /* 2131362073 */:
                this.f22068n = "A91FAC";
                this.f22069o.d("A91FAC");
                String str4 = "#" + list.get(this.f22069o.a()) + this.f22068n;
                this.f22067m = str4;
                this.f22061f.setBackgroundColor(Color.parseColor(str4));
                break;
        }
    }

    @Override // x2.AbstractActivityC5757a, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f22065k.setVisibility(0);
        new Handler().postDelayed(new d(), 1500L);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
        if (this.f22063h) {
            this.f22060e.stopPreview();
            this.f22063h = false;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f22063h) {
            this.f22060e.stopPreview();
            this.f22060e.release();
            this.f22060e = null;
            this.f22063h = false;
        }
    }

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z10) {
            DetectInfraredActivity detectInfraredActivity = DetectInfraredActivity.this;
            detectInfraredActivity.f22069o.f2429a.edit().putInt("COLOR_PROGRESS", seekBar.getProgress()).apply();
            detectInfraredActivity.f22067m = "#" + detectInfraredActivity.f22070p.get(seekBar.getProgress()) + detectInfraredActivity.f22068n;
            detectInfraredActivity.f22061f.setBackgroundColor(Color.parseColor(detectInfraredActivity.f22067m));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z10) {
            int progress = seekBar.getProgress();
            DetectInfraredActivity detectInfraredActivity = DetectInfraredActivity.this;
            detectInfraredActivity.getClass();
            try {
                Camera.Parameters parameters = detectInfraredActivity.f22060e.getParameters();
                parameters.setZoom(progress);
                Log.i("TAG", "zoom : " + parameters.getMaxZoom());
                detectInfraredActivity.f22060e.setParameters(parameters);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
