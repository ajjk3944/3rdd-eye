package h5;

import androidx.media3.extractor.metadata.emsg.EventMessage;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final EventMessage[] f9928a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9930c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9931d;

    public f(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.f9930c = str;
        this.f9931d = str2;
        this.f9929b = jArr;
        this.f9928a = eventMessageArr;
    }

    public final String a() {
        return this.f9930c + "/" + this.f9931d;
    }
}
