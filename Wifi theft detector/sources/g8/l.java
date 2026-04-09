package g8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.wifihacker.detector.HackerApplication;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f21217a;

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f21218b = new byte[0];

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    Toast.makeText(HackerApplication.l(), message.obj.toString(), 0).show();
                    break;
                case 1002:
                    Toast.makeText(HackerApplication.l(), message.obj.toString(), 1).show();
                    break;
                case BackupConstant.SCENE_CLOSED_WITHOUT_SHOW /* 1003 */:
                    l.c((View) message.obj);
                    break;
            }
        }
    }

    public static Handler a() {
        synchronized (f21218b) {
            try {
                if (f21217a == null) {
                    f21217a = new a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21217a;
    }

    public static void b(Runnable runnable) {
        a().post(runnable);
    }

    public static void c(View view) {
        Toast toast = new Toast(HackerApplication.l());
        toast.setGravity(17, 0, 0);
        toast.setView(view);
        toast.setDuration(0);
        toast.show();
    }

    public static void d(int i10) {
        e(HackerApplication.l().getString(i10));
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a().obtainMessage(1001, str).sendToTarget();
    }

    public static void f(int i10) {
        g(HackerApplication.l().getString(i10));
    }

    public static void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a().obtainMessage(1002, str).sendToTarget();
    }
}
