package t4;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: t4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5605c {
    public static k c() {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            return new k();
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((b10 & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public abstract boolean a();

    public abstract int b();
}
