package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public LocationFilter f42270a;

    /* renamed from: d, reason: collision with root package name */
    public Location f42273d;

    /* renamed from: e, reason: collision with root package name */
    public long f42274e;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f42272c = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f42271b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f42270a = locationFilter;
    }
}
