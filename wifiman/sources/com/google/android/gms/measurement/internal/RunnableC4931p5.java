package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.Map;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4931p5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f36644a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f36645b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4899l5 f36646c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36647d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f36648e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4915n5 f36649f;

    public RunnableC4931p5(C4915n5 c4915n5, String str, URL url, byte[] bArr, Map map, InterfaceC4899l5 interfaceC4899l5) {
        this.f36649f = c4915n5;
        AbstractC7901p.f(str);
        AbstractC7901p.l(url);
        AbstractC7901p.l(interfaceC4899l5);
        this.f36644a = url;
        this.f36645b = bArr;
        this.f36646c = interfaceC4899l5;
        this.f36647d = str;
        this.f36648e = map;
    }

    private final void a(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f36649f.zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC4931p5 runnableC4931p5 = this.f36630a;
                runnableC4931p5.f36646c.a(runnableC4931p5.f36647d, i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC4931p5.run():void");
    }
}
