package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class ih implements em {

    /* renamed from: h, reason: collision with root package name */
    public static final ih f28660h = new ih(0, 0, 1, 1, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int f28661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28665f;

    /* renamed from: g, reason: collision with root package name */
    private c f28666g;

    public static final class a {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f28667a;

        public /* synthetic */ c(ih ihVar, int i) {
            this(ihVar);
        }

        private c(ih ihVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(ihVar.f28661b).setFlags(ihVar.f28662c).setUsage(ihVar.f28663d);
            int i = s82.f32899a;
            if (i >= 29) {
                a.a(usage, ihVar.f28664e);
            }
            if (i >= 32) {
                b.a(usage, ihVar.f28665f);
            }
            this.f28667a = usage.build();
        }
    }

    private ih(int i, int i10, int i11, int i12, int i13) {
        this.f28661b = i;
        this.f28662c = i10;
        this.f28663d = i11;
        this.f28664e = i12;
        this.f28665f = i13;
    }

    public final c a() {
        if (this.f28666g == null) {
            this.f28666g = new c(this, 0);
        }
        return this.f28666g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ih.class == obj.getClass()) {
            ih ihVar = (ih) obj;
            if (this.f28661b == ihVar.f28661b && this.f28662c == ihVar.f28662c && this.f28663d == ihVar.f28663d && this.f28664e == ihVar.f28664e && this.f28665f == ihVar.f28665f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f28661b + 527) * 31) + this.f28662c) * 31) + this.f28663d) * 31) + this.f28664e) * 31) + this.f28665f;
    }

    private static ih a(Bundle bundle) {
        return new ih(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }
}
