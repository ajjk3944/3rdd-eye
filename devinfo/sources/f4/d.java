package f4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;
import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d {
    public static final k5.b a(BackEvent backEvent) {
        return new k5.b(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }

    public static boolean g(Uri uri) {
        return uri != null && AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static AssetFileDescriptor h(ContentResolver contentResolver, Uri uri) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
    }
}
