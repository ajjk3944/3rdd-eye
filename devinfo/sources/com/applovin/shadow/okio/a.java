package com.applovin.shadow.okio;

import android.content.pm.ApkChecksum;
import android.graphics.drawable.AnimatedImageDrawable;
import android.media.AudioFocusRequest;
import android.media.MediaCodecInfo;
import com.google.gson.internal.n;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6465a;

    public static /* bridge */ /* synthetic */ ApkChecksum a(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable c(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest d(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ boolean i(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }

    @Override // com.google.gson.internal.n
    public Object b() {
        switch (this.f6465a) {
            case 24:
                return new LinkedHashMap();
            case 25:
                return new TreeMap();
            case 26:
                return new ConcurrentHashMap();
            case 27:
                return new ConcurrentSkipListMap();
            case 28:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }
}
