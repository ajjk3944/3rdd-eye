package io.sentry;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12100a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.t f12101b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f12102c;

    /* renamed from: d, reason: collision with root package name */
    public final File f12103d;

    /* renamed from: e, reason: collision with root package name */
    public final double f12104e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12105f = "android";

    public c3(io.sentry.protocol.t tVar, io.sentry.protocol.t tVar2, Map map, File file, k4 k4Var) {
        this.f12100a = tVar;
        this.f12101b = tVar2;
        this.f12102c = new ConcurrentHashMap(map);
        this.f12103d = file;
        this.f12104e = k4Var.d() / 1.0E9d;
    }
}
