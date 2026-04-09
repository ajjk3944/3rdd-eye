package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.vb0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public interface bi1 {

    public static final class a implements em {

        /* renamed from: c, reason: collision with root package name */
        public static final a f25285c = new a(new vb0.a().a());

        /* renamed from: b, reason: collision with root package name */
        private final vb0 f25286b;

        /* renamed from: com.yandex.mobile.ads.impl.bi1$a$a, reason: collision with other inner class name */
        public static final class C0400a {

            /* renamed from: a, reason: collision with root package name */
            private final vb0.a f25287a = new vb0.a();

            public final C0400a a(int i) {
                this.f25287a.a(i);
                return this;
            }

            public final C0400a a(a aVar) {
                this.f25287a.a(aVar.f25286b);
                return this;
            }

            public final C0400a a(int... iArr) {
                vb0.a aVar = this.f25287a;
                aVar.getClass();
                for (int i : iArr) {
                    aVar.a(i);
                }
                return this;
            }

            public final C0400a a(boolean z10, int i) {
                vb0.a aVar = this.f25287a;
                if (z10) {
                    aVar.a(i);
                    return this;
                }
                aVar.getClass();
                return this;
            }

            public final a a() {
                return new a(this.f25287a.a(), 0);
            }
        }

        public /* synthetic */ a(vb0 vb0Var, int i) {
            this(vb0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f25286b.equals(((a) obj).f25286b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f25286b.hashCode();
        }

        private a(vb0 vb0Var) {
            this.f25286b = vb0Var;
        }

        private static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
            if (integerArrayList == null) {
                return f25285c;
            }
            vb0.a aVar = new vb0.a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.a(integerArrayList.get(i).intValue());
            }
            return new a(aVar.a());
        }
    }

    public interface b {
        void a(int i);

        void a(aw0 aw0Var);

        void a(a aVar);

        void a(c cVar, c cVar2, int i);

        void a(cv cvVar);

        void a(d10 d10Var);

        void a(h60 h60Var);

        void a(o62 o62Var);

        void a(pf2 pf2Var);

        void a(vh1 vh1Var);

        void a(xv0 xv0Var, int i);

        void a(yz0 yz0Var);

        void a(boolean z10, int i);

        void b(h60 h60Var);

        @Deprecated
        void onCues(List<av> list);

        void onIsLoadingChanged(boolean z10);

        void onIsPlayingChanged(boolean z10);

        void onPlayWhenReadyChanged(boolean z10, int i);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        @Deprecated
        void onPlayerStateChanged(boolean z10, int i);

        void onRenderedFirstFrame();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onSurfaceSizeChanged(int i, int i10);

        void onVolumeChanged(float f10);
    }

    public static final class c implements em {

        /* renamed from: b, reason: collision with root package name */
        public final Object f25288b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25289c;

        /* renamed from: d, reason: collision with root package name */
        public final xv0 f25290d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f25291e;

        /* renamed from: f, reason: collision with root package name */
        public final int f25292f;

        /* renamed from: g, reason: collision with root package name */
        public final long f25293g;

        /* renamed from: h, reason: collision with root package name */
        public final long f25294h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f25295j;

        public c(Object obj, int i, xv0 xv0Var, Object obj2, int i10, long j4, long j10, int i11, int i12) {
            this.f25288b = obj;
            this.f25289c = i;
            this.f25290d = xv0Var;
            this.f25291e = obj2;
            this.f25292f = i10;
            this.f25293g = j4;
            this.f25294h = j10;
            this.i = i11;
            this.f25295j = i12;
        }

        private static c a(Bundle bundle) {
            int i = bundle.getInt(Integer.toString(0, 36), -1);
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            return new c(null, i, bundle2 == null ? null : (xv0) xv0.f35437h.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f25289c == cVar.f25289c && this.f25292f == cVar.f25292f && this.f25293g == cVar.f25293g && this.f25294h == cVar.f25294h && this.i == cVar.i && this.f25295j == cVar.f25295j && pd1.a(this.f25288b, cVar.f25288b) && pd1.a(this.f25291e, cVar.f25291e) && pd1.a(this.f25290d, cVar.f25290d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f25288b, Integer.valueOf(this.f25289c), this.f25290d, this.f25291e, Integer.valueOf(this.f25292f), Long.valueOf(this.f25293g), Long.valueOf(this.f25294h), Integer.valueOf(this.i), Integer.valueOf(this.f25295j)});
        }
    }

    h60 a();

    void a(b bVar);

    void b(b bVar);

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    v42 getCurrentTimeline();

    o62 getCurrentTracks();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    long getTotalBufferedDuration();

    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlayingAd();

    void prepare();

    void release();

    void setPlayWhenReady(boolean z10);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);

    void stop();
}
