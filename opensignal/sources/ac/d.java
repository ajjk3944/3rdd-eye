package ac;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Status f323a;

    public d(Status status) {
        int i10 = status.f4819a;
        String str = status.f4820d;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2 + String.valueOf(str).length());
        sb2.append(i10);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.f323a = status;
    }
}
