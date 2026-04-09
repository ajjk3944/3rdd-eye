package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.yj0;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class kh {

    /* renamed from: c, reason: collision with root package name */
    private static final lh f29660c = hm1.a();

    /* renamed from: d, reason: collision with root package name */
    public static final kh f29661d = new kh(new int[]{2}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final kh f29662e = new kh(new int[]{2, 5, 6}, 8);

    /* renamed from: f, reason: collision with root package name */
    private static final yj0<Integer, Integer> f29663f = new yj0.a().a((yj0.a) 5, 6).a((yj0.a) 17, 6).a((yj0.a) 7, 6).a((yj0.a) 18, 6).a((yj0.a) 6, 8).a((yj0.a) 8, 8).a((yj0.a) 14, 8).a();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f29664a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29665b;

    public kh(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f29664a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f29664a = new int[0];
        }
        this.f29665b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return Arrays.equals(this.f29664a, khVar.f29664a) && this.f29665b == khVar.f29665b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f29664a) * 31) + this.f29665b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f29665b + ", supportedEncodings=" + Arrays.toString(this.f29664a) + "]";
    }

    public static kh a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i = s82.f32899a;
        if (i >= 17) {
            lh lhVar = f29660c;
            String strA = lhVar.a();
            String str = s82.f32901c;
            if ((strA.equals(str) || lhVar.c().equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return f29662e;
            }
        }
        return (i < 29 || (!s82.d(context) && (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) ? (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f29661d : new kh(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new kh(a.a(), 8);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f29666a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int a(int i, int i10) {
            for (int i11 = 8; i11 > 0; i11--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i10).setChannelMask(s82.a(i11)).build(), f29666a)) {
                    return i11;
                }
            }
            return 0;
        }

        public static int[] a() {
            int i = xj0.f35328d;
            xj0.a aVar = new xj0.a();
            Iterator it = kh.f29663f.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f29666a)) {
                    aVar.b(num);
                }
            }
            aVar.b((Object) 2);
            return up0.a(aVar.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> a(com.yandex.mobile.ads.impl.dc0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f26083m
            r0.getClass()
            java.lang.String r1 = r10.f26080j
            int r0 = com.yandex.mobile.ads.impl.k01.b(r0, r1)
            com.yandex.mobile.ads.impl.yj0<java.lang.Integer, java.lang.Integer> r1 = com.yandex.mobile.ads.impl.kh.f29663f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2c
            int[] r7 = r9.f29664a
            int r7 = java.util.Arrays.binarySearch(r7, r6)
            if (r7 < 0) goto L2a
            goto L2c
        L2a:
            r0 = r4
            goto L38
        L2c:
            if (r0 != r5) goto L38
            int[] r7 = r9.f29664a
            int r7 = java.util.Arrays.binarySearch(r7, r5)
            if (r7 < 0) goto L37
            goto L38
        L37:
            r0 = r2
        L38:
            int[] r7 = r9.f29664a
            int r7 = java.util.Arrays.binarySearch(r7, r0)
            if (r7 < 0) goto Lb5
            int r7 = r10.f26096z
            r8 = -1
            if (r7 == r8) goto L4d
            if (r0 != r6) goto L48
            goto L4d
        L48:
            int r10 = r9.f29665b
            if (r7 <= r10) goto L76
            return r3
        L4d:
            int r10 = r10.f26066A
            if (r10 == r8) goto L52
            goto L55
        L52:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L55:
            int r6 = com.yandex.mobile.ads.impl.s82.f32899a
            r7 = 29
            if (r6 < r7) goto L60
            int r7 = com.yandex.mobile.ads.impl.kh.a.a(r0, r10)
            goto L76
        L60:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.get(r10)
            if (r10 == 0) goto L70
            r6 = r10
        L70:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
        L76:
            int r10 = com.yandex.mobile.ads.impl.s82.f32899a
            r1 = 28
            if (r10 > r1) goto L8a
            if (r7 != r2) goto L80
            r4 = r5
            goto L8b
        L80:
            r1 = 3
            if (r7 == r1) goto L8b
            r1 = 4
            if (r7 == r1) goto L8b
            r1 = 5
            if (r7 != r1) goto L8a
            goto L8b
        L8a:
            r4 = r7
        L8b:
            r1 = 26
            if (r10 > r1) goto La1
            com.yandex.mobile.ads.impl.lh r10 = com.yandex.mobile.ads.impl.kh.f29660c
            java.lang.String r10 = r10.b()
            java.lang.String r1 = com.yandex.mobile.ads.impl.s82.f32900b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto La1
            r10 = 1
            if (r4 != r10) goto La1
            r4 = 2
        La1:
            int r10 = com.yandex.mobile.ads.impl.s82.a(r4)
            if (r10 != 0) goto La8
            return r3
        La8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kh.a(com.yandex.mobile.ads.impl.dc0):android.util.Pair");
    }
}
