package ij;

import com.opensignal.sdk.data.traceroute.TracerouteListener;

/* loaded from: classes.dex */
public interface b {
    boolean init(boolean z10);

    void start(TracerouteListener tracerouteListener, String str, String str2, boolean z10, int i10, int i11, long j, long j7);

    void stop();
}
