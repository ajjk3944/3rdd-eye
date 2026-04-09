package ol;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30585a;

    public d(int i4) {
        switch (i4) {
            case 1:
                this.f30585a = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            default:
                this.f30585a = new ConcurrentHashMap(16);
                break;
        }
    }
}
