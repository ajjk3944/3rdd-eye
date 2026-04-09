package y0;

import android.app.RemoteInput;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class x {

    /* compiled from: RemoteInput.java */
    public static class a {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }
}
