package xh;

import android.widget.Toast;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.d f37110b;

    public /* synthetic */ b(hg.d dVar, int i4) {
        this.f37109a = i4;
        this.f37110b = dVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f37109a) {
            case 0:
                d dVar = (d) this.f37110b;
                try {
                    if (dVar.f37115c0.isEnabled()) {
                        dVar.f37115c0.disable();
                    } else {
                        dVar.f37115c0.enable();
                    }
                    final int i4 = 0;
                    bi.d.b(new Runnable(this) { // from class: xh.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f37108b;

                        {
                            this.f37108b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    ((d) this.f37108b.f37110b).f37113a0.setText(R.string.bluetooth_test_start);
                                    break;
                                default:
                                    Toast.makeText(((d) this.f37108b.f37110b).f37118f0, R.string.failed, 0).show();
                                    break;
                            }
                        }
                    });
                    Thread.sleep(2000L);
                    if (!dVar.c0()) {
                        if (!dVar.f37115c0.isEnabled()) {
                            dVar.f37116d0 = 0;
                            dVar.f37115c0.enable();
                            break;
                        } else {
                            dVar.f37116d0 = 1;
                            dVar.f37115c0.disable();
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    final int i10 = 1;
                    bi.d.b(new Runnable(this) { // from class: xh.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f37108b;

                        {
                            this.f37108b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ((d) this.f37108b.f37110b).f37113a0.setText(R.string.bluetooth_test_start);
                                    break;
                                default:
                                    Toast.makeText(((d) this.f37108b.f37110b).f37118f0, R.string.failed, 0).show();
                                    break;
                            }
                        }
                    });
                    return;
                }
            default:
                w wVar = (w) this.f37110b;
                if (wVar.f37159c0.isWifiEnabled()) {
                    wVar.f37159c0.setWifiEnabled(false);
                } else {
                    wVar.f37159c0.setWifiEnabled(true);
                }
                bi.d.b(new ig.l(24, this));
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException unused2) {
                }
                if (!wVar.c0()) {
                    if (!wVar.f37159c0.isWifiEnabled()) {
                        wVar.f37160d0 = 0;
                        wVar.f37159c0.setWifiEnabled(true);
                        break;
                    } else {
                        wVar.f37160d0 = 1;
                        wVar.f37159c0.setWifiEnabled(false);
                        break;
                    }
                }
                break;
        }
    }
}
