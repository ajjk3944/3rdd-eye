package ob;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Status f30482a;

    public d(Status status) {
        int i4 = status.f9060a;
        String str = status.f9061b;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 2 + String.valueOf(str).length());
        sb2.append(i4);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.f30482a = status;
    }
}
