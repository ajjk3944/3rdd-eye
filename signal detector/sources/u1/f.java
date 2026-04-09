package u1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import o.a1;

/* loaded from: classes.dex */
public final class f implements l1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23735a;

    /* renamed from: b, reason: collision with root package name */
    public final p f23736b;

    public /* synthetic */ f(p pVar, int i) {
        this.f23735a = i;
        this.f23736b = pVar;
    }

    @Override // l1.j
    public final boolean a(Object obj, l1.h hVar) {
        switch (this.f23735a) {
            case 0:
                this.f23736b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // l1.j
    public final n1.z b(Object obj, int i, int i3, l1.h hVar) {
        switch (this.f23735a) {
            case 0:
                p pVar = this.f23736b;
                return pVar.a(new a1((ByteBuffer) obj, pVar.f23762d, pVar.f23761c, 3), i, i3, hVar, p.f23757k);
            default:
                p pVar2 = this.f23736b;
                return pVar2.a(new a1((ParcelFileDescriptor) obj, pVar2.f23762d, pVar2.f23761c), i, i3, hVar, p.f23757k);
        }
    }
}
