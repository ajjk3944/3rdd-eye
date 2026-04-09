package d9;

import android.os.HandlerThread;
import com.bytedance.sdk.component.pno.ouw.ouw;
import com.bytedance.sdk.component.pno.ouw.vt;
import com.bytedance.sdk.component.pno.ouw.yu;
import com.bytedance.sdk.component.utils.jae;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f22073b;

    public /* synthetic */ l(o oVar, int i4) {
        this.f22072a = i4;
        this.f22073b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HandlerThread handlerThread;
        int i4 = this.f22072a;
        boolean zOffer = false;
        o oVar = this.f22073b;
        switch (i4) {
            case 0:
                if (oVar.f22087th == null) {
                    try {
                        oVar.f22087th = new k();
                    } catch (Throwable th2) {
                        pk.a.m("CSJ_VIDEO_MEDIA", th2.getMessage());
                    }
                    if (oVar.f22087th != null) {
                        StringBuilder sb2 = new StringBuilder("initMediaPlayer mMediaPlayer is null :");
                        sb2.append(oVar.f22087th == null);
                        pk.a.p(sb2.toString());
                        oVar.f22081cd = "0";
                        ((i) oVar.f22087th).f22059a = oVar;
                        ((i) oVar.f22087th).f22060b = oVar;
                        ((i) oVar.f22087th).f22064f = oVar;
                        ((i) oVar.f22087th).f22061c = oVar;
                        ((i) oVar.f22087th).f22062d = oVar;
                        ((i) oVar.f22087th).g = oVar;
                        ((i) oVar.f22087th).f22063e = oVar;
                        try {
                            ((k) oVar.f22087th).f22067i.setLooping(false);
                        } catch (Throwable th3) {
                            pk.a.q("setLooping error: ", th3);
                        }
                        o.bly(oVar);
                        break;
                    }
                }
                break;
            case 1:
                if (oVar.ra() && oVar.f22087th != null) {
                    try {
                        ((k) oVar.f22087th).f22067i.start();
                        pk.a.x("CSJ_VIDEO_MEDIA", "resume play exec start ");
                        for (WeakReference weakReference : oVar.rn) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((v8.b) weakReference.get()).fkw(oVar);
                            }
                        }
                        oVar.f22083le = 206;
                        break;
                    } catch (Throwable th4) {
                        pk.a.y("CSJ_VIDEO_MEDIA", "play: catch exception ", th4.getMessage());
                        return;
                    }
                }
                break;
            case 2:
                if (oVar.ra != null) {
                    oVar.ra.sendEmptyMessage(101);
                    break;
                }
                break;
            case 3:
                if (oVar.ra != null) {
                    oVar.ra.sendEmptyMessage(101);
                    break;
                }
                break;
            case 4:
                if (oVar.ra != null) {
                    oVar.ra.sendEmptyMessage(104);
                    pk.a.p("[video] MediaPlayerProxy#start first play prepare invoke ! sendMsg --> OP_PREPARE_ASYNC");
                    break;
                }
                break;
            case 5:
                if (oVar.ra != null && oVar.ra.getLooper() != null) {
                    try {
                        pk.a.p("onDestory............");
                        ouw ouwVarOuw = ouw.ouw();
                        jae jaeVar = oVar.ra;
                        if (jaeVar instanceof vt) {
                            vt vtVar = (vt) jaeVar;
                            yu<vt> yuVar = ouwVarOuw.ouw;
                            vtVar.ouw();
                            if (yuVar.vt.size() < yuVar.ouw) {
                                zOffer = yuVar.vt.offer(vtVar);
                            }
                            if (!zOffer && (handlerThread = vtVar.ouw) != null) {
                                handlerThread.quit();
                            }
                        }
                        oVar.ra = null;
                        break;
                    } catch (Throwable th5) {
                        pk.a.q("onDestroy error: ", th5);
                    }
                }
                break;
            default:
                try {
                    ((k) oVar.f22087th).f22067i.pause();
                    oVar.f22083le = 207;
                    o.ryl(oVar);
                    break;
                } catch (Throwable th6) {
                    pk.a.q("pauseBeforePlayIfNeed error: ", th6);
                    return;
                }
        }
    }
}
