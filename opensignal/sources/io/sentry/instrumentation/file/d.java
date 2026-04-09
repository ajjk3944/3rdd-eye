package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12338a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f12339d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12340g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12341r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Closeable f12342x;

    public /* synthetic */ d(Closeable closeable, byte[] bArr, int i10, int i11, int i12) {
        this.f12338a = i12;
        this.f12342x = closeable;
        this.f12339d = bArr;
        this.f12340g = i10;
        this.f12341r = i11;
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() throws IOException {
        switch (this.f12338a) {
            case 0:
                e eVar = (e) this.f12342x;
                return Integer.valueOf(eVar.f12343a.read(this.f12339d, this.f12340g, this.f12341r));
            default:
                FileOutputStream fileOutputStream = ((f) this.f12342x).f12345a;
                byte[] bArr = this.f12339d;
                int i10 = this.f12340g;
                int i11 = this.f12341r;
                fileOutputStream.write(bArr, i10, i11);
                return Integer.valueOf(i11);
        }
    }
}
