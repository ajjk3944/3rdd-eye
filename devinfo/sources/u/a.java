package u;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        return null;
    }

    public abstract void onNavigationEvent(int i4, Bundle bundle);

    public void onMessageChannelReady(Bundle bundle) {
    }

    public void onMinimized(Bundle bundle) {
    }

    public void onUnminimized(Bundle bundle) {
    }

    public void onWarmupCompleted(Bundle bundle) {
    }

    public void extraCallback(String str, Bundle bundle) {
    }

    public void onPostMessage(String str, Bundle bundle) {
    }

    public void onActivityResized(int i4, int i10, Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i4, Uri uri, boolean z3, Bundle bundle) {
    }

    public void onActivityLayout(int i4, int i10, int i11, int i12, int i13, Bundle bundle) {
    }
}
