package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f18466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18467b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18468c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18469d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18470e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18471f;

    /* renamed from: g, reason: collision with root package name */
    public final p f18472g;

    /* renamed from: h, reason: collision with root package name */
    public final d f18473h;

    /* renamed from: i, reason: collision with root package name */
    public final w f18474i;

    /* renamed from: j, reason: collision with root package name */
    public final f f18475j;

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        private p f18479d;

        /* renamed from: h, reason: collision with root package name */
        private d f18483h;

        /* renamed from: i, reason: collision with root package name */
        private w f18484i;

        /* renamed from: j, reason: collision with root package name */
        private f f18485j;

        /* renamed from: a, reason: collision with root package name */
        private int f18476a = 50;

        /* renamed from: b, reason: collision with root package name */
        private int f18477b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;

        /* renamed from: c, reason: collision with root package name */
        private int f18478c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f18480e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f18481f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f18482g = 604800000;

        public b a(int i10, p pVar) {
            this.f18478c = i10;
            this.f18479d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f18476a = 50;
                return this;
            }
            this.f18476a = i10;
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f18477b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
                return this;
            }
            this.f18477b = i10;
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f18481f = 50;
                return this;
            }
            this.f18481f = i10;
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f18480e = 2;
                return this;
            }
            this.f18480e = i10;
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f18482g = 604800000;
                return this;
            }
            this.f18482g = i10;
            return this;
        }

        public b a(d dVar) {
            this.f18483h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f18484i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f18485j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f18483h) && com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f18484i) && com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f18479d) || y.b(this.f18479d.b())) && com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f18466a = bVar.f18476a;
        this.f18467b = bVar.f18477b;
        this.f18468c = bVar.f18478c;
        this.f18469d = bVar.f18480e;
        this.f18470e = bVar.f18481f;
        this.f18471f = bVar.f18482g;
        this.f18472g = bVar.f18479d;
        this.f18473h = bVar.f18483h;
        this.f18474i = bVar.f18484i;
        this.f18475j = bVar.f18485j;
    }
}
