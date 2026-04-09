package p4;

import android.app.PendingIntent;
import android.content.IntentSender;
import c5.C0412i;
import com.lefan.signal.MainActivity;
import e.C2291h;
import e.C2292i;
import p5.l;

/* renamed from: p4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2778e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f22884b;

    public /* synthetic */ C2778e(MainActivity mainActivity, int i) {
        this.f22883a = i;
        this.f22884b = mainActivity;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        int i = this.f22883a;
        C0412i c0412i = C0412i.f5929a;
        MainActivity mainActivity = this.f22884b;
        R3.a aVar = (R3.a) obj;
        switch (i) {
            case 0:
                int i3 = MainActivity.f18804V;
                if (aVar.f3394b == 11) {
                    mainActivity.C();
                }
                return c0412i;
            default:
                int i6 = MainActivity.f18804V;
                int i7 = aVar.f3393a;
                PendingIntent pendingIntent = aVar.f3395c;
                if (i7 == 2) {
                    byte b5 = (byte) (((byte) (0 | 1)) | 2);
                    if (b5 != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b5 & 1) == 0) {
                            sb.append(" appUpdateType");
                        }
                        if ((b5 & 2) == 0) {
                            sb.append(" allowAssetPackDeletion");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    if ((pendingIntent != null ? pendingIntent : null) != null) {
                        if (mainActivity.f18806P == null) {
                            q5.i.g("appUpdateManager");
                            throw null;
                        }
                        C2291h c2291h = mainActivity.f18808R;
                        byte b6 = (byte) (((byte) (0 | 1)) | 2);
                        if (b6 != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            if ((b6 & 1) == 0) {
                                sb2.append(" appUpdateType");
                            }
                            if ((b6 & 2) == 0) {
                                sb2.append(" allowAssetPackDeletion");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        }
                        if (c2291h != null) {
                            if ((pendingIntent != null ? pendingIntent : null) != null && !aVar.f3396d) {
                                aVar.f3396d = true;
                                if (pendingIntent == null) {
                                    pendingIntent = null;
                                }
                                IntentSender intentSender = pendingIntent.getIntentSender();
                                q5.i.e(intentSender, "intentSender");
                                c2291h.a(new C2292i(intentSender, null, 0, 0));
                            }
                        }
                    }
                }
                return c0412i;
        }
    }
}
