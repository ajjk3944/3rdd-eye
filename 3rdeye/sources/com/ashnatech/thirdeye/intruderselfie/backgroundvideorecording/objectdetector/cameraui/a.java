package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui;

import android.app.AlertDialog;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: CameraActivity.java */
/* loaded from: classes.dex */
public abstract class a extends AppCompatActivity implements ImageReader.OnImageAvailableListener, Camera.PreviewCallback, CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final D2.c f22146y = new D2.c();

    /* renamed from: e, reason: collision with root package name */
    public Handler f22149e;

    /* renamed from: f, reason: collision with root package name */
    public HandlerThread f22150f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22151g;

    /* renamed from: k, reason: collision with root package name */
    public int f22154k;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f22155l;

    /* renamed from: m, reason: collision with root package name */
    public Runnable f22156m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f22157n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f22158o;

    /* renamed from: p, reason: collision with root package name */
    public BottomSheetBehavior<LinearLayout> f22159p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f22160q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f22161r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f22162s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f22163t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f22164u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f22165v;

    /* renamed from: w, reason: collision with root package name */
    public SwitchCompat f22166w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f22167x;

    /* renamed from: c, reason: collision with root package name */
    public int f22147c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f22148d = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22152h = false;
    public final byte[][] i = new byte[3][];

    /* renamed from: j, reason: collision with root package name */
    public int[] f22153j = null;

    /* compiled from: CameraActivity.java */
    /* renamed from: com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a$a, reason: collision with other inner class name */
    public class ViewTreeObserverOnGlobalLayoutListenerC0329a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0329a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a aVar = a.this;
            aVar.f22158o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            aVar.f22159p.C(aVar.f22158o.getMeasuredHeight());
        }
    }

    /* compiled from: CameraActivity.java */
    public class b extends BottomSheetBehavior.c {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(int i) {
            a aVar = a.this;
            if (i == 2) {
                aVar.f22163t.setImageResource(R.drawable.ic_arrow_up);
            } else if (i == 3) {
                aVar.f22163t.setImageResource(R.drawable.ic_arrow_down);
            } else {
                if (i != 4) {
                    return;
                }
                aVar.f22163t.setImageResource(R.drawable.ic_arrow_up);
            }
        }
    }

    /* compiled from: CameraActivity.java */
    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f22170b;

        public c(byte[] bArr) {
            this.f22170b = bArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            int i = aVar.f22147c;
            int i10 = aVar.f22148d;
            int[] iArr = aVar.f22153j;
            D2.c cVar = D2.b.f1033a;
            int i11 = i * i10;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = ((i13 >> 1) * i) + i11;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i15 < i) {
                    byte[] bArr = this.f22170b;
                    int i18 = bArr[i12] & 255;
                    if ((i15 & 1) == 0) {
                        int i19 = i14 + 1;
                        i17 = bArr[i14] & 255;
                        i14 += 2;
                        i16 = bArr[i19] & 255;
                    }
                    iArr[i12] = D2.b.a(i18, i16, i17);
                    i15++;
                    i12++;
                }
            }
        }
    }

    /* compiled from: CameraActivity.java */
    public class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Camera f22172b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f22173c;

        public d(Camera camera, byte[] bArr) {
            this.f22172b = camera;
            this.f22173c = bArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22172b.addCallbackBuffer(this.f22173c);
            a.this.f22152h = false;
        }
    }

    /* compiled from: CameraActivity.java */
    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f22175b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22176c;

        public e(int i, int i10) {
            this.f22175b = i;
            this.f22176c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = this;
            boolean z10 = true;
            a aVar = a.this;
            byte[][] bArr = aVar.i;
            int i = 0;
            byte[] bArr2 = bArr[0];
            byte[] bArr3 = bArr[1];
            byte[] bArr4 = bArr[2];
            int i10 = aVar.f22147c;
            int i11 = aVar.f22148d;
            int i12 = aVar.f22154k;
            int[] iArr = aVar.f22153j;
            D2.c cVar = D2.b.f1033a;
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                int i15 = i12 * i13;
                int i16 = eVar.f22175b * (i13 >> 1);
                int i17 = i;
                while (i17 < i10) {
                    int i18 = ((i17 >> 1) * eVar.f22176c) + i16;
                    iArr[i14] = D2.b.a(bArr2[i15 + i17] & 255, bArr3[i18] & 255, bArr4[i18] & 255);
                    i17++;
                    eVar = this;
                    i14++;
                    z10 = z10;
                }
                i13++;
                eVar = this;
                i = 0;
            }
        }
    }

    /* compiled from: CameraActivity.java */
    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Image f22178b;

        public f(Image image) {
            this.f22178b = image;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22178b.close();
            a.this.f22152h = false;
        }
    }

    /* compiled from: CameraActivity.java */
    public class g {
        public g() {
        }
    }

    public static void k(Image.Plane[] planeArr, byte[][] bArr) {
        for (int i = 0; i < planeArr.length; i++) {
            ByteBuffer buffer = planeArr[i].getBuffer();
            if (bArr[i] == null) {
                f22146y.a("Initializing buffer %d at size %d", Integer.valueOf(i), Integer.valueOf(buffer.capacity()));
                bArr[i] = new byte[buffer.capacity()];
            }
            buffer.get(bArr[i]);
        }
    }

    public abstract Size l();

    public abstract void m(Size size, int i);

    public abstract void n();

    public final synchronized void o(Runnable runnable) {
        Handler handler = this.f22149e;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) throws CameraAccessException {
        super.onActivityResult(i, i10, intent);
        if (i == 123) {
            if (checkSelfPermission("android.permission.CAMERA") == 0) {
                p();
            } else {
                s();
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        r(z10);
        if (z10) {
            this.f22166w.setText("NNAPI");
        } else {
            this.f22166w.setText("TFLITE");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws NumberFormatException {
        int i;
        if (view.getId() == R.id.plus) {
            int i10 = Integer.parseInt(this.f22167x.getText().toString().trim());
            if (i10 >= 9) {
                return;
            }
            int i11 = i10 + 1;
            this.f22167x.setText(String.valueOf(i11));
            q(i11);
            return;
        }
        if (view.getId() != R.id.minus || (i = Integer.parseInt(this.f22167x.getText().toString().trim())) == 1) {
            return;
        }
        int i12 = i - 1;
        this.f22167x.setText(String.valueOf(i12));
        q(i12);
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public void onCreate(Bundle bundle) throws CameraAccessException {
        f22146y.a("onCreate " + this, new Object[0]);
        super.onCreate(null);
        getWindow().addFlags(128);
        setContentView(R.layout.tfe_od_activity_camera);
        if (checkSelfPermission("android.permission.CAMERA") == 0) {
            p();
        } else if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            t();
        } else {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
        }
        this.f22167x = (TextView) findViewById(R.id.threads);
        this.f22164u = (ImageView) findViewById(R.id.plus);
        this.f22165v = (ImageView) findViewById(R.id.minus);
        this.f22166w = (SwitchCompat) findViewById(R.id.api_info_switch);
        this.f22157n = (LinearLayout) findViewById(R.id.bottom_sheet_layout);
        this.f22158o = (LinearLayout) findViewById(R.id.gesture_layout);
        this.f22159p = BottomSheetBehavior.x(this.f22157n);
        this.f22163t = (ImageView) findViewById(R.id.bottom_sheet_arrow);
        this.f22158o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0329a());
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.f22159p;
        if (bottomSheetBehavior.f22542I) {
            bottomSheetBehavior.f22542I = false;
            if (bottomSheetBehavior.f22545L == 5) {
                bottomSheetBehavior.D(4);
            }
            bottomSheetBehavior.H();
        }
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.f22159p;
        b bVar = new b();
        bottomSheetBehavior2.getClass();
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehavior2.f22556W;
        arrayList.clear();
        arrayList.add(bVar);
        this.f22160q = (TextView) findViewById(R.id.frame_info);
        this.f22161r = (TextView) findViewById(R.id.crop_info);
        this.f22162s = (TextView) findViewById(R.id.inference_info);
        this.f22166w.setOnCheckedChangeListener(this);
        this.f22164u.setOnClickListener(this);
        this.f22165v.setOnClickListener(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final synchronized void onDestroy() {
        f22146y.a("onDestroy " + this, new Object[0]);
        super.onDestroy();
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        int i;
        int i10 = this.f22147c;
        if (i10 == 0 || (i = this.f22148d) == 0) {
            return;
        }
        if (this.f22153j == null) {
            this.f22153j = new int[i10 * i];
        }
        try {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return;
            }
            if (this.f22152h) {
                imageAcquireLatestImage.close();
                return;
            }
            this.f22152h = true;
            Trace.beginSection("imageAvailable");
            Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
            k(planes, this.i);
            this.f22154k = planes[0].getRowStride();
            this.f22156m = new e(planes[1].getRowStride(), planes[1].getPixelStride());
            this.f22155l = new f(imageAcquireLatestImage);
            n();
            Trace.endSection();
        } catch (Exception e4) {
            f22146y.b(e4, "Exception!", new Object[0]);
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final synchronized void onPause() {
        f22146y.a("onPause " + this, new Object[0]);
        this.f22150f.quitSafely();
        try {
            this.f22150f.join();
            this.f22150f = null;
            this.f22149e = null;
        } catch (InterruptedException e4) {
            f22146y.b(e4, "Exception!", new Object[0]);
        }
        super.onPause();
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean z10 = this.f22152h;
        D2.c cVar = f22146y;
        if (z10) {
            cVar.f("Dropping frame!", new Object[0]);
            return;
        }
        try {
            if (this.f22153j == null) {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                int i = previewSize.height;
                this.f22148d = i;
                int i10 = previewSize.width;
                this.f22147c = i10;
                this.f22153j = new int[i10 * i];
                m(new Size(previewSize.width, previewSize.height), 90);
            }
            this.f22152h = true;
            this.i[0] = bArr;
            this.f22154k = this.f22147c;
            this.f22156m = new c(bArr);
            this.f22155l = new d(camera, bArr);
            n();
        } catch (Exception e4) {
            cVar.b(e4, "Exception!", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws CameraAccessException {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i10 : iArr) {
                if (i10 != 0) {
                    if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        t();
                        return;
                    } else {
                        s();
                        return;
                    }
                }
            }
            p();
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final synchronized void onResume() {
        f22146y.a("onResume " + this, new Object[0]);
        super.onResume();
        HandlerThread handlerThread = new HandlerThread("inference");
        this.f22150f = handlerThread;
        handlerThread.start();
        this.f22149e = new Handler(this.f22150f.getLooper());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final synchronized void onStart() {
        f22146y.a("onStart " + this, new Object[0]);
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final synchronized void onStop() {
        f22146y.a("onStop " + this, new Object[0]);
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() throws android.hardware.camera2.CameraAccessException {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            D2.c r2 = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a.f22146y
            java.lang.String r3 = "camera"
            java.lang.Object r3 = r11.getSystemService(r3)
            android.hardware.camera2.CameraManager r3 = (android.hardware.camera2.CameraManager) r3
            java.lang.String[] r4 = r3.getCameraIdList()     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            int r5 = r4.length     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            r6 = r0
        L12:
            if (r6 >= r5) goto L6e
            r7 = r4[r6]     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            android.hardware.camera2.CameraCharacteristics r8 = r3.getCameraCharacteristics(r7)     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            java.lang.Object r9 = r8.get(r9)     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            if (r9 == 0) goto L2d
            int r10 = r9.intValue()     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            if (r10 != 0) goto L2d
            goto L37
        L2b:
            r1 = move-exception
            goto L67
        L2d:
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            java.lang.Object r10 = r8.get(r10)     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            if (r10 != 0) goto L39
        L37:
            int r6 = r6 + r1
            goto L12
        L39:
            int r3 = r9.intValue()     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            r4 = 2
            if (r3 == r4) goto L56
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            java.lang.Object r3 = r8.get(r3)     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            int r3 = r3.intValue()     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            if (r3 != r4) goto L51
            if (r1 != r3) goto L54
            goto L56
        L51:
            if (r1 > r3) goto L54
            goto L56
        L54:
            r3 = r0
            goto L57
        L56:
            r3 = r1
        L57:
            r11.f22151g = r3     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            java.lang.String r4 = "Camera API lv2?: %s"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            r1[r0] = r3     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            r2.c(r4, r1)     // Catch: android.hardware.camera2.CameraAccessException -> L2b
            goto L6f
        L67:
            java.lang.String r3 = "Not allowed to access camera"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.b(r1, r3, r0)
        L6e:
            r7 = 0
        L6f:
            boolean r0 = r11.f22151g
            r1 = 2131558674(0x7f0d0112, float:1.874267E38)
            if (r0 == 0) goto L87
            com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a$g r0 = new com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a$g
            r0.<init>()
            android.util.Size r2 = r11.l()
            C2.e r3 = new C2.e
            r3.<init>(r0, r11, r1, r2)
            r3.f881j = r7
            goto L90
        L87:
            C2.j r3 = new C2.j
            android.util.Size r0 = r11.l()
            r3.<init>(r11, r1, r0)
        L90:
            android.app.FragmentManager r0 = r11.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131362086(0x7f0a0126, float:1.8343943E38)
            android.app.FragmentTransaction r0 = r0.replace(r1, r3)
            r0.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a.p():void");
    }

    public abstract void q(int i);

    public abstract void r(boolean z10);

    public final void s() {
        new AlertDialog.Builder(this).setTitle(R.string.camera_permission_required_title_perm).setMessage(R.string.camera_permission_is_permanently_denied).setPositiveButton(R.string.open_settings, new C2.a(this, 0)).setNegativeButton(R.string.exit, new C2.b(this, 0)).setCancelable(false).show();
    }

    public final void t() {
        new AlertDialog.Builder(this).setTitle(R.string.camera_permission_required_title_perm).setMessage(R.string.this_app_needs_camera_access).setPositiveButton(R.string.grant, new C2.c(this, 0)).setNegativeButton(R.string.exit, new C2.d(this, 0)).setCancelable(false).show();
    }
}
