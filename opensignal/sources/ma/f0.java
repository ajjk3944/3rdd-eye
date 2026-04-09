package ma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16451a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16452b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16453c;

    public f0(int i10, String str, ArrayList arrayList, byte[] bArr, int i11) {
        switch (i11) {
            case 1:
                this.f16451a = str;
                this.f16452b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                this.f16453c = bArr;
                break;
            default:
                this.f16451a = str;
                this.f16452b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                this.f16453c = bArr;
                break;
        }
    }
}
