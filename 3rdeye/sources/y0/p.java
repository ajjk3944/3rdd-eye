package y0;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class p extends q {

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    @Override // y0.q
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }

    @Override // y0.q
    public final void b(r rVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(0));
                return;
            }
            return;
        }
        Notification.Builder builder = rVar.f47906b;
        builder.setContentTitle(null);
        Bundle bundle = this.f47904a.f47897n;
        CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f47904a.f47897n.getCharSequence("android.text");
        builder.setContentText(charSequence != null ? charSequence : null);
        a.b(builder, "call");
    }

    @Override // y0.q
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }
}
