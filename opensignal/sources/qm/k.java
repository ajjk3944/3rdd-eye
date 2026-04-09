package qm;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class k {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public i f20929a;

    /* renamed from: b, reason: collision with root package name */
    public i f20930b;

    /* renamed from: c, reason: collision with root package name */
    public Location f20931c;

    /* renamed from: f, reason: collision with root package name */
    public float f20934f;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f20932d = new float[2];

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f20933e = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public float f20935g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f20936h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f20937i = 0.0f;

    public final LatLng a(f fVar) {
        LocationManager locationManager;
        Context context = (Context) y3.s(Context.class);
        fVar.getClass();
        if (f.a(context) && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
            try {
                this.f20931c = locationManager.getLastKnownLocation("network");
            } catch (IllegalArgumentException | SecurityException unused) {
            }
        }
        Location location = this.f20931c;
        if (location != null) {
            return new LatLng(location.getLatitude(), this.f20931c.getLongitude());
        }
        return null;
    }
}
