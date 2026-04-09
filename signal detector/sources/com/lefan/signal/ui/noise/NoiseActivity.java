package com.lefan.signal.ui.noise;

import B4.h;
import B4.q;
import D3.f;
import D4.c;
import F4.e;
import K4.d;
import R2.a;
import S4.k;
import U4.g;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Q;
import c5.C0408e;
import c5.C0409f;
import c5.C0410g;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.noise.NoiseActivity;
import d5.AbstractC2282j;
import e.C2284a;
import e.C2291h;
import e.InterfaceC2285b;
import f.C2314a;
import h.AbstractActivityC2349g;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;
import q5.i;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class NoiseActivity extends AbstractActivityC2349g implements Runnable {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f18966r0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public d f18967O;

    /* renamed from: R, reason: collision with root package name */
    public MediaRecorder f18970R;

    /* renamed from: V, reason: collision with root package name */
    public String f18974V;

    /* renamed from: W, reason: collision with root package name */
    public Geocoder f18975W;

    /* renamed from: X, reason: collision with root package name */
    public LocationManager f18976X;

    /* renamed from: Y, reason: collision with root package name */
    public String f18977Y;

    /* renamed from: a0, reason: collision with root package name */
    public Location f18979a0;
    public MaterialButton b0;

    /* renamed from: c0, reason: collision with root package name */
    public MaterialButton f18980c0;

    /* renamed from: d0, reason: collision with root package name */
    public NoiseView f18981d0;

    /* renamed from: e0, reason: collision with root package name */
    public NoiseTrendView f18982e0;

    /* renamed from: f0, reason: collision with root package name */
    public TextView f18983f0;

    /* renamed from: g0, reason: collision with root package name */
    public TextView f18984g0;

    /* renamed from: h0, reason: collision with root package name */
    public TextView f18985h0;

    /* renamed from: i0, reason: collision with root package name */
    public AppCompatTextView f18986i0;

    /* renamed from: j0, reason: collision with root package name */
    public MaterialButton f18987j0;

    /* renamed from: l0, reason: collision with root package name */
    public final C2291h f18989l0;

    /* renamed from: m0, reason: collision with root package name */
    public final C2291h f18990m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f18991n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f18992o0;

    /* renamed from: p0, reason: collision with root package name */
    public final C2291h f18993p0;

    /* renamed from: q0, reason: collision with root package name */
    public final C2291h f18994q0;

    /* renamed from: P, reason: collision with root package name */
    public final String f18968P = "android.permission.RECORD_AUDIO";

    /* renamed from: Q, reason: collision with root package name */
    public final Handler f18969Q = new Handler(Looper.getMainLooper());

    /* renamed from: S, reason: collision with root package name */
    public final String f18971S = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: T, reason: collision with root package name */
    public final C0410g f18972T = new C0410g(new c(5, this));

    /* renamed from: U, reason: collision with root package name */
    public final ArrayList f18973U = new ArrayList();

    /* renamed from: Z, reason: collision with root package name */
    public final Handler f18978Z = new Handler(Looper.getMainLooper());

    /* renamed from: k0, reason: collision with root package name */
    public final ArrayList f18988k0 = new ArrayList();

    public NoiseActivity() {
        final int i = 1;
        this.f18989l0 = (C2291h) p(new C2314a(2), new InterfaceC2285b(this) { // from class: S4.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoiseActivity f3512b;

            {
                this.f3512b = this;
            }

            @Override // e.InterfaceC2285b
            public final void b(Object obj) {
                int i3 = i;
                NoiseActivity noiseActivity = this.f3512b;
                switch (i3) {
                    case 0:
                        int i6 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        noiseActivity.D();
                        break;
                    case 1:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18968P) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z6 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18993p0);
                                break;
                            }
                        } else {
                            int i7 = NoiseActivity.f18966r0;
                            noiseActivity.E();
                            break;
                        }
                        break;
                    case 2:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18971S) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z7 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18994q0);
                                break;
                            }
                        } else {
                            int i8 = NoiseActivity.f18966r0;
                            noiseActivity.D();
                            break;
                        }
                        break;
                    default:
                        int i9 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        String str = noiseActivity.f18968P;
                        q5.i.e(str, "string");
                        if (G.c.a(noiseActivity, str) != 0) {
                            F4.d.b(noiseActivity, noiseActivity.getString(R.string.no_record_permission));
                            break;
                        } else {
                            noiseActivity.E();
                            break;
                        }
                }
            }
        });
        final int i3 = 2;
        this.f18990m0 = (C2291h) p(new C2314a(2), new InterfaceC2285b(this) { // from class: S4.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoiseActivity f3512b;

            {
                this.f3512b = this;
            }

            @Override // e.InterfaceC2285b
            public final void b(Object obj) {
                int i32 = i3;
                NoiseActivity noiseActivity = this.f3512b;
                switch (i32) {
                    case 0:
                        int i6 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        noiseActivity.D();
                        break;
                    case 1:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18968P) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z6 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18993p0);
                                break;
                            }
                        } else {
                            int i7 = NoiseActivity.f18966r0;
                            noiseActivity.E();
                            break;
                        }
                        break;
                    case 2:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18971S) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z7 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18994q0);
                                break;
                            }
                        } else {
                            int i8 = NoiseActivity.f18966r0;
                            noiseActivity.D();
                            break;
                        }
                        break;
                    default:
                        int i9 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        String str = noiseActivity.f18968P;
                        q5.i.e(str, "string");
                        if (G.c.a(noiseActivity, str) != 0) {
                            F4.d.b(noiseActivity, noiseActivity.getString(R.string.no_record_permission));
                            break;
                        } else {
                            noiseActivity.E();
                            break;
                        }
                }
            }
        });
        final int i6 = 3;
        this.f18993p0 = (C2291h) p(new C2314a(3), new InterfaceC2285b(this) { // from class: S4.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoiseActivity f3512b;

            {
                this.f3512b = this;
            }

            @Override // e.InterfaceC2285b
            public final void b(Object obj) {
                int i32 = i6;
                NoiseActivity noiseActivity = this.f3512b;
                switch (i32) {
                    case 0:
                        int i62 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        noiseActivity.D();
                        break;
                    case 1:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18968P) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z6 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18993p0);
                                break;
                            }
                        } else {
                            int i7 = NoiseActivity.f18966r0;
                            noiseActivity.E();
                            break;
                        }
                        break;
                    case 2:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18971S) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z7 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18994q0);
                                break;
                            }
                        } else {
                            int i8 = NoiseActivity.f18966r0;
                            noiseActivity.D();
                            break;
                        }
                        break;
                    default:
                        int i9 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        String str = noiseActivity.f18968P;
                        q5.i.e(str, "string");
                        if (G.c.a(noiseActivity, str) != 0) {
                            F4.d.b(noiseActivity, noiseActivity.getString(R.string.no_record_permission));
                            break;
                        } else {
                            noiseActivity.E();
                            break;
                        }
                }
            }
        });
        final int i7 = 0;
        this.f18994q0 = (C2291h) p(new C2314a(3), new InterfaceC2285b(this) { // from class: S4.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoiseActivity f3512b;

            {
                this.f3512b = this;
            }

            @Override // e.InterfaceC2285b
            public final void b(Object obj) {
                int i32 = i7;
                NoiseActivity noiseActivity = this.f3512b;
                switch (i32) {
                    case 0:
                        int i62 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        noiseActivity.D();
                        break;
                    case 1:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18968P) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z6 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18993p0);
                                break;
                            }
                        } else {
                            int i72 = NoiseActivity.f18966r0;
                            noiseActivity.E();
                            break;
                        }
                        break;
                    case 2:
                        if (!((Boolean) obj).booleanValue()) {
                            if (!noiseActivity.shouldShowRequestPermissionRationale(noiseActivity.f18971S) && System.currentTimeMillis() - noiseActivity.f18992o0 < 500) {
                                boolean z7 = MyApplication.f18812d;
                                MyApplication.f18812d = com.bumptech.glide.d.F(noiseActivity, noiseActivity.f18994q0);
                                break;
                            }
                        } else {
                            int i8 = NoiseActivity.f18966r0;
                            noiseActivity.D();
                            break;
                        }
                        break;
                    default:
                        int i9 = NoiseActivity.f18966r0;
                        q5.i.e((C2284a) obj, "it");
                        String str = noiseActivity.f18968P;
                        q5.i.e(str, "string");
                        if (G.c.a(noiseActivity, str) != 0) {
                            F4.d.b(noiseActivity, noiseActivity.getString(R.string.no_record_permission));
                            break;
                        } else {
                            noiseActivity.E();
                            break;
                        }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(com.lefan.signal.ui.noise.NoiseActivity r11, double r12, double r14, j5.b r16) throws java.lang.Throwable {
        /*
            r0 = r16
            boolean r2 = r0 instanceof S4.f
            if (r2 == 0) goto L16
            r2 = r0
            S4.f r2 = (S4.f) r2
            int r3 = r2.f3525g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f3525g = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            S4.f r2 = new S4.f
            r2.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f3523e
            int r2 = r8.f3525g
            r9 = 1
            if (r2 == 0) goto L33
            if (r2 != r9) goto L2b
            q5.o r1 = r8.f3522d
            R2.a.H(r0)
            goto L5a
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            R2.a.H(r0)
            android.location.Geocoder r0 = r11.f18975W
            if (r0 != 0) goto L3c
            r0 = 0
            return r0
        L3c:
            q5.o r6 = new q5.o
            r6.<init>()
            G5.d r10 = z5.D.f24486b
            S4.h r0 = new S4.h
            r7 = 0
            r1 = r11
            r2 = r12
            r4 = r14
            r0.<init>(r1, r2, r4, r6, r7)
            r8.f3522d = r6
            r8.f3525g = r9
            java.lang.Object r0 = z5.AbstractC3046w.r(r10, r8, r0)
            i5.a r1 = i5.EnumC2380a.f20635a
            if (r0 != r1) goto L59
            return r1
        L59:
            r1 = r6
        L5a:
            java.lang.Object r0 = r1.f23299a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.noise.NoiseActivity.C(com.lefan.signal.ui.noise.NoiseActivity, double, double, j5.b):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [S4.e] */
    public final void D() {
        Object objD;
        if (this.f18975W == null || this.f18977Y == null) {
            return;
        }
        String str = this.f18971S;
        i.e(str, "string");
        if (G.c.a(this, str) != 0) {
            AppCompatTextView appCompatTextView = this.f18986i0;
            if (appCompatTextView != null) {
                appCompatTextView.setText(getString(R.string.no_location_perm));
                return;
            } else {
                i.g("addressTextView");
                throw null;
            }
        }
        MaterialButton materialButton = this.f18987j0;
        if (materialButton == null) {
            i.g("addressBtn");
            throw null;
        }
        materialButton.setEnabled(false);
        AppCompatTextView appCompatTextView2 = this.f18986i0;
        if (appCompatTextView2 == null) {
            i.g("addressTextView");
            throw null;
        }
        appCompatTextView2.setText(getString(R.string.location_getting));
        if (Build.VERSION.SDK_INT < 30) {
            LocationManager locationManager = this.f18976X;
            if (locationManager != null) {
                String str2 = this.f18977Y;
                i.b(str2);
                locationManager.requestSingleUpdate(str2, new k(this), Looper.getMainLooper());
                return;
            }
            return;
        }
        try {
            LocationManager locationManager2 = this.f18976X;
            if (locationManager2 != null) {
                String str3 = this.f18977Y;
                i.b(str3);
                locationManager2.getCurrentLocation(str3, null, new g(3, this), new Consumer() { // from class: S4.e
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        int i = NoiseActivity.f18966r0;
                        NoiseActivity noiseActivity = this.f3521a;
                        AbstractC3046w.l(Q.f(noiseActivity), null, new i(noiseActivity, (Location) obj, null), 3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                objD = C0412i.f5929a;
            } else {
                objD = null;
            }
        } catch (Throwable th) {
            objD = a.d(th);
        }
        if (C0409f.a(objD) != null) {
            AppCompatTextView appCompatTextView3 = this.f18986i0;
            if (appCompatTextView3 == null) {
                i.g("addressTextView");
                throw null;
            }
            String string = this.f18974V;
            if (string == null) {
                string = getString(R.string.string_unknown);
                i.d(string, "getString(...)");
            }
            appCompatTextView3.setText(string);
            MaterialButton materialButton2 = this.f18987j0;
            if (materialButton2 != null) {
                materialButton2.setEnabled(true);
            } else {
                i.g("addressBtn");
                throw null;
            }
        }
    }

    public final void E() {
        Object objD;
        String str;
        String str2;
        String str3;
        Object objD2 = C0412i.f5929a;
        Float fValueOf = Float.valueOf(0.0f);
        if (this.f18991n0) {
            return;
        }
        String str4 = this.f18968P;
        i.e(str4, "string");
        int i = 1;
        if (G.c.a(this, str4) != 0) {
            q qVar = new q(this);
            qVar.f746e = getString(R.string.permission_record_title);
            qVar.f747f = getString(R.string.permission_record_sub);
            qVar.i = new D4.d(5);
            qVar.f749h = new S4.d(this, i);
            qVar.f748g = false;
            qVar.show();
            return;
        }
        MediaRecorder mediaRecorderF = Build.VERSION.SDK_INT >= 31 ? f.f(this) : new MediaRecorder();
        this.f18970R = mediaRecorderF;
        try {
            mediaRecorderF.setAudioSource(1);
            MediaRecorder mediaRecorder = this.f18970R;
            if (mediaRecorder != null) {
                mediaRecorder.setOutputFormat(0);
            }
            MediaRecorder mediaRecorder2 = this.f18970R;
            if (mediaRecorder2 != null) {
                mediaRecorder2.setAudioEncoder(1);
            }
            MediaRecorder mediaRecorder3 = this.f18970R;
            if (mediaRecorder3 != null) {
                mediaRecorder3.setOutputFile(getCacheDir().getAbsolutePath() + "/noise.3gp");
                objD = objD2;
            } else {
                objD = null;
            }
        } catch (Throwable th) {
            objD = a.d(th);
        }
        if (C0409f.a(objD) != null) {
            F4.d.b(this, getString(R.string.unable_to_initialize_media_recorder));
        }
        MaterialButton materialButton = this.f18980c0;
        if (materialButton == null) {
            i.g("saveBtn");
            throw null;
        }
        materialButton.setVisibility(8);
        this.f18973U.clear();
        TextView textView = this.f18983f0;
        if (textView != null) {
            if (a.f3390d) {
                Locale locale = e.f1457a;
                str3 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            } else {
                str3 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            }
            textView.setText(str3);
        }
        TextView textView2 = this.f18984g0;
        if (textView2 != null) {
            if (a.f3390d) {
                Locale locale2 = e.f1457a;
                str2 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            } else {
                str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            }
            textView2.setText(str2);
        }
        TextView textView3 = this.f18985h0;
        if (textView3 != null) {
            if (a.f3390d) {
                Locale locale3 = e.f1457a;
                str = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            } else {
                str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            }
            textView3.setText(str);
        }
        NoiseTrendView noiseTrendView = this.f18982e0;
        if (noiseTrendView == null) {
            i.g("voiceTrendView");
            throw null;
        }
        noiseTrendView.b();
        try {
            MediaRecorder mediaRecorder4 = this.f18970R;
            if (mediaRecorder4 != null) {
                mediaRecorder4.prepare();
            }
            MediaRecorder mediaRecorder5 = this.f18970R;
            if (mediaRecorder5 != null) {
                mediaRecorder5.start();
            } else {
                objD2 = null;
            }
        } catch (Throwable th2) {
            objD2 = a.d(th2);
        }
        if (!(objD2 instanceof C0408e)) {
            MaterialButton materialButton2 = this.b0;
            if (materialButton2 == null) {
                i.g("startBtn");
                throw null;
            }
            materialButton2.setIcon(getDrawable(R.drawable.ic_stop));
            this.f18969Q.postDelayed(this, 1000L);
            this.f18991n0 = true;
        }
        if (C0409f.a(objD2) != null) {
            F4.d.b(this, getString(R.string.record_failed));
        }
    }

    public final void F() {
        if (this.f18991n0) {
            MaterialButton materialButton = this.b0;
            if (materialButton == null) {
                i.g("startBtn");
                throw null;
            }
            materialButton.setIcon(getDrawable(R.drawable.ic_start));
            ArrayList arrayList = this.f18973U;
            if (arrayList.size() > 1) {
                MaterialButton materialButton2 = this.f18980c0;
                if (materialButton2 == null) {
                    i.g("saveBtn");
                    throw null;
                }
                materialButton2.setVisibility(0);
            }
            this.f18969Q.removeCallbacks(this);
            NoiseView noiseView = this.f18981d0;
            if (noiseView == null) {
                i.g("noiseView");
                throw null;
            }
            noiseView.setMdb(0.0f);
            NoiseTrendView noiseTrendView = this.f18982e0;
            if (noiseTrendView == null) {
                i.g("voiceTrendView");
                throw null;
            }
            noiseTrendView.a(0.0f);
            try {
                MediaRecorder mediaRecorder = this.f18970R;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
            } catch (Throwable th) {
                a.d(th);
            }
            MediaRecorder mediaRecorder2 = this.f18970R;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
            }
            MediaRecorder mediaRecorder3 = this.f18970R;
            if (mediaRecorder3 != null) {
                mediaRecorder3.release();
            }
            this.f18970R = null;
            this.f18991n0 = false;
            NoiseTrendView noiseTrendView2 = this.f18982e0;
            if (noiseTrendView2 != null) {
                noiseTrendView2.c(arrayList);
            } else {
                i.g("voiceTrendView");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x025a  */
    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.noise.NoiseActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.activity_help, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        F();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_help) {
            h hVar = new h();
            hVar.g0(R.string.noise_tip, getString(R.string.noise));
            hVar.e0(s(), "noise_help");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < 24 || !this.f18991n0) {
            return;
        }
        try {
            MediaRecorder mediaRecorder = this.f18970R;
            if (mediaRecorder != null) {
                mediaRecorder.pause();
            }
        } catch (Throwable th) {
            a.d(th);
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 24 || !this.f18991n0) {
            return;
        }
        try {
            MediaRecorder mediaRecorder = this.f18970R;
            if (mediaRecorder != null) {
                mediaRecorder.resume();
            }
        } catch (Throwable th) {
            a.d(th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        MediaRecorder mediaRecorder = this.f18970R;
        int maxAmplitude = mediaRecorder != null ? mediaRecorder.getMaxAmplitude() : 0;
        float fLog10 = maxAmplitude > 1 ? ((float) Math.log10(maxAmplitude * 1.0d)) * 20.0f : 0.0f;
        NoiseView noiseView = this.f18981d0;
        if (noiseView == null) {
            i.g("noiseView");
            throw null;
        }
        noiseView.setMdb(fLog10);
        NoiseTrendView noiseTrendView = this.f18982e0;
        if (noiseTrendView == null) {
            i.g("voiceTrendView");
            throw null;
        }
        noiseTrendView.a(fLog10);
        this.f18988k0.add(Float.valueOf(fLog10));
        ArrayList arrayList = this.f18973U;
        boolean zIsEmpty = arrayList.isEmpty();
        Handler handler = this.f18969Q;
        if (zIsEmpty && fLog10 == 0.0f) {
            handler.postDelayed(this, 1000L);
            return;
        }
        arrayList.add(Float.valueOf(fLog10));
        TextView textView = this.f18983f0;
        if (textView != null) {
            Float fD0 = AbstractC2282j.d0(arrayList);
            if (a.f3390d) {
                Locale locale = e.f1457a;
                str3 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fD0}, 1));
            } else {
                str3 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fD0}, 1));
            }
            textView.setText(str3);
        }
        TextView textView2 = this.f18984g0;
        if (textView2 != null) {
            Double dValueOf = Double.valueOf(AbstractC2282j.S(arrayList));
            if (a.f3390d) {
                Locale locale2 = e.f1457a;
                str2 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{dValueOf}, 1));
            } else {
                str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{dValueOf}, 1));
            }
            textView2.setText(str2);
        }
        TextView textView3 = this.f18985h0;
        if (textView3 != null) {
            Float fB0 = AbstractC2282j.b0(arrayList);
            if (a.f3390d) {
                Locale locale3 = e.f1457a;
                str = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fB0}, 1));
            } else {
                str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fB0}, 1));
            }
            textView3.setText(str);
        }
        handler.postDelayed(this, 1000L);
    }
}
