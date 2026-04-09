package j1;

import A1.s;
import java.io.File;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2543b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21294a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f21295b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f21296c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f21297d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21298e;

    /* renamed from: f, reason: collision with root package name */
    public s f21299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2544c f21300g;

    public C2543b(C2544c c2544c, String str) {
        this.f21300g = c2544c;
        this.f21294a = str;
        int i = c2544c.f21307g;
        File file = c2544c.f21301a;
        this.f21295b = new long[i];
        this.f21296c = new File[i];
        this.f21297d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(i3);
            this.f21296c[i3] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f21297d[i3] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j6 : this.f21295b) {
            sb.append(' ');
            sb.append(j6);
        }
        return sb.toString();
    }
}
