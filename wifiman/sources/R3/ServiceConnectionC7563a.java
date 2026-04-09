package r3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s3.AbstractC7901p;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceConnectionC7563a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f60068a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f60069b = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) throws TimeoutException {
        AbstractC7901p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f60068a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f60068a = true;
        IBinder iBinder = (IBinder) this.f60069b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f60069b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
