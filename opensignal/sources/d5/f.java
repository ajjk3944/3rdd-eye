package d5;

import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f extends androidx.media3.common.m0 {
    public final int B;
    public final androidx.media3.common.h0 D;
    public final boolean E;

    /* renamed from: g, reason: collision with root package name */
    public final int f6984g;

    /* renamed from: r, reason: collision with root package name */
    public final String f6985r;

    /* renamed from: x, reason: collision with root package name */
    public final int f6986x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.media3.common.r f6987y;

    static {
        int i10 = a5.d0.f105a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public f(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    public final f a(androidx.media3.common.h0 h0Var) {
        String message = getMessage();
        int i10 = a5.d0.f105a;
        return new f(message, getCause(), this.f1722a, this.f6984g, this.f6985r, this.f6986x, this.f6987y, this.B, h0Var, this.f1723d, this.E);
    }

    public f(String str, Throwable th2, int i10, int i11, String str2, int i12, androidx.media3.common.r rVar, int i13, androidx.media3.common.h0 h0Var, long j, boolean z10) {
        super(str, th2, i10, j);
        a5.a.e(!z10 || i11 == 1);
        a5.a.e(th2 != null || i11 == 3);
        this.f6984g = i11;
        this.f6985r = str2;
        this.f6986x = i12;
        this.f6987y = rVar;
        this.B = i13;
        this.D = h0Var;
        this.E = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(int i10, Throwable th2, int i11, String str, int i12, androidx.media3.common.r rVar, int i13, boolean z10) {
        String str2;
        int i14;
        androidx.media3.common.r rVar2;
        String string;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            rVar2 = rVar;
            string = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i14 = i12;
            rVar2 = rVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            rVar2 = rVar;
            sb2.append(rVar2);
            sb2.append(", format_supported=");
            sb2.append(a5.d0.s(i13));
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : w.g.f(string, ": null"), th2, i11, i10, str2, i14, rVar2, i13, null, SystemClock.elapsedRealtime(), z10);
    }
}
