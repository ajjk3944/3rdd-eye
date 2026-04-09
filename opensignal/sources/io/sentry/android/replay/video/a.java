package io.sentry.android.replay.video;

import br.l;
import java.io.File;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f12003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12005c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12006d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12007e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12008f = "video/avc";

    public a(File file, int i10, int i11, int i12, int i13) {
        this.f12003a = file;
        this.f12004b = i10;
        this.f12005c = i11;
        this.f12006d = i12;
        this.f12007e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f12003a, aVar.f12003a) && this.f12004b == aVar.f12004b && this.f12005c == aVar.f12005c && this.f12006d == aVar.f12006d && this.f12007e == aVar.f12007e && l.a(this.f12008f, aVar.f12008f);
    }

    public final int hashCode() {
        return this.f12008f.hashCode() + c7.a.C(this.f12007e, c7.a.C(this.f12006d, c7.a.C(this.f12005c, c7.a.C(this.f12004b, this.f12003a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MuxerConfig(file=");
        sb2.append(this.f12003a);
        sb2.append(", recordingWidth=");
        sb2.append(this.f12004b);
        sb2.append(", recordingHeight=");
        sb2.append(this.f12005c);
        sb2.append(", frameRate=");
        sb2.append(this.f12006d);
        sb2.append(", bitRate=");
        sb2.append(this.f12007e);
        sb2.append(", mimeType=");
        return h0.b.r(sb2, this.f12008f, ')');
    }
}
