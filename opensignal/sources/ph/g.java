package ph;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import ch.n;
import h9.r2;
import oh.o;

/* loaded from: classes.dex */
public final class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20562a;

    /* renamed from: b, reason: collision with root package name */
    public final r2 f20563b;

    /* renamed from: c, reason: collision with root package name */
    public final df.c f20564c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20565d;

    /* renamed from: e, reason: collision with root package name */
    public long f20566e;

    /* renamed from: f, reason: collision with root package name */
    public long f20567f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20568g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20569h;

    /* renamed from: i, reason: collision with root package name */
    public final o f20570i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, Looper looper, r2 r2Var, df.c cVar, o oVar, int i10) {
        super(looper);
        this.f20569h = i10;
        this.f20566e = 0L;
        this.f20567f = 0L;
        this.f20568g = false;
        this.f20562a = context;
        this.f20563b = r2Var;
        this.f20564c = cVar;
        this.f20570i = oVar;
    }

    public static void a(Message message, Bundle bundle, int i10) throws RemoteException {
        Messenger messenger = message.replyTo;
        if (messenger != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            messageObtain.setData(bundle);
            try {
                messenger.send(messageObtain);
            } catch (RemoteException e4) {
                n.e("PlayerHandler", e4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, oh.n] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, oh.n] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, oh.n] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, oh.n] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, oh.n] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws RemoteException {
        long currentPosition;
        oh.i iVarJ;
        super.handleMessage(message);
        Bundle data = message.getData();
        int i10 = message.what;
        if (i10 == 0 && this.f20565d == null) {
            int[] intArray = data.getIntArray("buffer_array");
            ak.a aVar = (ak.a) data.getSerializable("adaptive_configuration");
            int i11 = this.f20569h;
            Context context = this.f20562a;
            r2 r2Var = this.f20563b;
            switch (i11) {
                case 0:
                    iVarJ = this.f20570i.j(context, intArray, aVar, r2Var);
                    break;
                default:
                    iVarJ = this.f20570i.j(context, intArray, aVar, r2Var);
                    break;
            }
            this.f20565d = iVarJ.f19474a;
            Bundle bundle = new Bundle();
            bundle.putSerializable("video_player", iVarJ);
            bundle.putSerializable("video_resource", (nh.l) data.getSerializable("video_resource"));
            oh.e eVar = (oh.e) data.getSerializable("network_type_observer");
            if (eVar != null) {
                bundle.putSerializable("network_type_observer", eVar);
            }
            a(message, bundle, 0);
        }
        ?? r32 = this.f20565d;
        if (r32 == 0) {
            n.b("PlayerHandler", "handleMessage: The player is null!");
            return;
        }
        df.c cVar = this.f20564c;
        if (i10 == 12) {
            boolean z10 = data.getBoolean("is_playing", false);
            if (z10 == this.f20568g) {
                return;
            }
            this.f20568g = z10;
            cVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!z10) {
                long j = this.f20566e;
                if (j != 0) {
                    this.f20567f = (jElapsedRealtime - j) + this.f20567f;
                }
            }
            this.f20566e = jElapsedRealtime;
            return;
        }
        long duration = -1;
        switch (i10) {
            case 1:
                r32.a(data.getSerializable("event_listener"));
                this.f20565d.b(data.getSerializable("video_listener"));
                this.f20565d.d(data.getSerializable("analytics_listener"));
                break;
            case 2:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            default:
                n.b("PlayerHandler", "Unhandled message: [" + message + "]");
                break;
            case 3:
                try {
                    r32.c(data.getSerializable("media_source"));
                    break;
                } catch (AbstractMethodError e4) {
                    n.e("PlayerHandler", e4);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("video_player_exception", e4.toString());
                    a(message, bundle2, 4);
                    return;
                }
            case 4:
                int bufferedPercentage = r32.getBufferedPercentage();
                Bundle bundle3 = new Bundle();
                bundle3.putInt("video_buffered_percentage_value", bufferedPercentage);
                a(message, bundle3, 3);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                r32.setPlayWhenReady(data.getBoolean("play_when_ready_value"));
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f20565d.setVolume(data.getFloat("volume_value"));
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    duration = r32.getDuration();
                } catch (IllegalStateException e10) {
                    n.e("PlayerHandler", e10);
                }
                Bundle bundle4 = new Bundle();
                bundle4.putLong("video_duration", duration);
                a(message, bundle4, 1);
                break;
            case 9:
                try {
                } catch (IllegalStateException e11) {
                    n.e("PlayerHandler", e11);
                }
                if (!r32.isCurrentWindowLive()) {
                    currentPosition = this.f20565d.getCurrentPosition();
                } else if (this.f20568g) {
                    long j7 = this.f20567f;
                    cVar.getClass();
                    duration = (SystemClock.elapsedRealtime() - this.f20566e) + j7;
                    n.b("PlayerHandler", "getPlayedDurationAndSendMessage() called with: msg = [" + message + "], playDuration =[" + duration + "]");
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("video_current_position", duration);
                    a(message, bundle5, 2);
                    break;
                } else {
                    currentPosition = this.f20567f;
                }
                duration = currentPosition;
                n.b("PlayerHandler", "getPlayedDurationAndSendMessage() called with: msg = [" + message + "], playDuration =[" + duration + "]");
                Bundle bundle52 = new Bundle();
                bundle52.putLong("video_current_position", duration);
                a(message, bundle52, 2);
            case 10:
                r32.clearVideoSurface();
                break;
            case 11:
                r32.release();
                this.f20565d = null;
                break;
        }
    }
}
