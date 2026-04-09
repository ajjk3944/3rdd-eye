package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f39036a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f39037b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationCallback f39038c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f39039d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f39040e;

    /* renamed from: f, reason: collision with root package name */
    private final long f39041f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39042a;

        static {
            int[] iArr = new int[Priority.values().length];
            f39042a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39042a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39042a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f39043a;

        public ClientProvider(Context context) {
            this.f39043a = context;
        }

        public final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.f39043a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j4) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j4);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(Priority priority) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.f39036a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f39041f);
        int i = AnonymousClass1.f39042a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i != 1 ? i != 2 ? i != 3 ? 105 : 100 : 102 : 104), this.f39038c, this.f39039d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f39036a.removeLocationUpdates(this.f39038c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f39036a.getLastLocation().addOnSuccessListener(this.f39040e, new GplOnSuccessListener(this.f39037b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j4) {
        this.f39036a = clientProvider.a();
        this.f39037b = locationListener;
        this.f39039d = looper;
        this.f39040e = executor;
        this.f39041f = j4;
        this.f39038c = new GplLocationCallback(locationListener);
    }
}
