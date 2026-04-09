package b5;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import com.survicate.surveys.infrastructure.network.URLRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f2442i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2443a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2444b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2445c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2446d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2447e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2448f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2449g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2450h;

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    public k(Uri uri, int i10, byte[] bArr, Map map, long j, long j7, String str, int i11) {
        a5.a.e(j >= 0);
        a5.a.e(j >= 0);
        a5.a.e(j7 > 0 || j7 == -1);
        this.f2443a = uri;
        this.f2444b = i10;
        this.f2445c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f2446d = Collections.unmodifiableMap(new HashMap(map));
        this.f2447e = j;
        this.f2448f = j7;
        this.f2449g = str;
        this.f2450h = i11;
    }

    public final k a(long j) {
        long j7 = this.f2448f;
        long j10 = j7 != -1 ? j7 - j : -1L;
        if (j == 0 && j7 == j10) {
            return this;
        }
        return new k(this.f2443a, this.f2444b, this.f2445c, this.f2446d, this.f2447e + j, j10, this.f2449g, this.f2450h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f2444b;
        if (i10 == 1) {
            str = URLRequest.METHOD_GET;
        } else if (i10 == 2) {
            str = URLRequest.METHOD_POST;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f2443a);
        sb2.append(", ");
        sb2.append(this.f2447e);
        sb2.append(", ");
        sb2.append(this.f2448f);
        sb2.append(", ");
        sb2.append(this.f2449g);
        sb2.append(", ");
        return h0.b.i(this.f2450h, "]", sb2);
    }
}
