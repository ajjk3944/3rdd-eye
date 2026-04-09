package v;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.InterfaceC1678a0;
import java.util.HashMap;

/* compiled from: Camera2EncoderProfilesProvider.java */
/* loaded from: classes.dex */
public final class G implements InterfaceC1678a0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46617d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f46618e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final C0 f46619f;

    /* compiled from: Camera2EncoderProfilesProvider.java */
    public static class a {
        public static EncoderProfiles a(int i, String str) {
            return CamcorderProfile.getAll(str, i);
        }
    }

    public G(String str, C0 c02) throws NumberFormatException {
        boolean z10;
        int i;
        this.f46616c = str;
        try {
            i = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            C.S.g("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i = -1;
        }
        this.f46615b = z10;
        this.f46617d = i;
        this.f46619f = c02;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public final boolean b(int i) {
        return this.f46615b && f(i) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    @Override // androidx.camera.core.impl.InterfaceC1678a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.InterfaceC1680b0 f(int r20) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.G.f(int):androidx.camera.core.impl.b0");
    }
}
