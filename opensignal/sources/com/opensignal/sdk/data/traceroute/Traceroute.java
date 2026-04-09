package com.opensignal.sdk.data.traceroute;

import br.l;
import ij.a;
import ij.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJX\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u001dJ\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/opensignal/sdk/data/traceroute/Traceroute;", "Lij/b;", "<init>", "()V", "", "verbose", "", "initialise", "(Z)J", "pointer", "Lcom/opensignal/sdk/data/traceroute/TracerouteListener;", "listener", "", "endpoint", "ipAddress", "forceUseIpAddress", "", "maxHops", "sendRequestNumberTimes", "minWaitResponseMs", "maxWaitResponseMs", "Llq/b0;", "start", "(JLcom/opensignal/sdk/data/traceroute/TracerouteListener;Ljava/lang/String;Ljava/lang/String;ZIIJJ)V", "stop", "(J)V", "init", "(Z)Z", "tracerouteListener", "(Lcom/opensignal/sdk/data/traceroute/TracerouteListener;Ljava/lang/String;Ljava/lang/String;ZIIJJ)V", "tracerouteInstance", "J", "Companion", "ij/a", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Traceroute implements b {
    public static final a Companion;
    private static final boolean libraryLoaded;
    private long tracerouteInstance = -1;

    static {
        a aVar = new a();
        Companion = aVar;
        libraryLoaded = a.a(aVar);
    }

    private final native long initialise(boolean verbose);

    private static final boolean loadLibrary() {
        return a.a(Companion);
    }

    private final native void start(long pointer, TracerouteListener listener, String endpoint, String ipAddress, boolean forceUseIpAddress, int maxHops, int sendRequestNumberTimes, long minWaitResponseMs, long maxWaitResponseMs);

    private final native void stop(long pointer);

    @Override // ij.b
    public boolean init(boolean verbose) {
        if (!libraryLoaded) {
            return false;
        }
        this.tracerouteInstance = initialise(verbose);
        return true;
    }

    @Override // ij.b
    public void start(TracerouteListener tracerouteListener, String endpoint, String ipAddress, boolean forceUseIpAddress, int maxHops, int sendRequestNumberTimes, long minWaitResponseMs, long maxWaitResponseMs) {
        l.e(tracerouteListener, "tracerouteListener");
        l.e(endpoint, "endpoint");
        l.e(ipAddress, "ipAddress");
        start(this.tracerouteInstance, tracerouteListener, endpoint, ipAddress, forceUseIpAddress, maxHops, sendRequestNumberTimes, minWaitResponseMs, maxWaitResponseMs);
    }

    @Override // ij.b
    public void stop() {
        long j = this.tracerouteInstance;
        if (j != -1) {
            stop(j);
        }
    }
}
