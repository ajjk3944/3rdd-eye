package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C02033h {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C1959pg, C1957pe> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{Utf8.REPLACEMENT_BYTE, 61, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public C02033h() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public C02033h(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public C02033h(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(C1955pc.A0e, C1955pc.A0U.A06);
        this.A05 = bundle.getInt(C1955pc.A0d, C1955pc.A0U.A05);
        this.A04 = bundle.getInt(C1955pc.A0c, C1955pc.A0U.A04);
        this.A03 = bundle.getInt(C1955pc.A0b, C1955pc.A0U.A03);
        this.A0A = bundle.getInt(C1955pc.A0i, C1955pc.A0U.A0A);
        this.A09 = bundle.getInt(C1955pc.A0h, C1955pc.A0U.A09);
        this.A08 = bundle.getInt(C1955pc.A0n(), C1955pc.A0U.A08);
        this.A07 = bundle.getInt(C1955pc.A0f, C1955pc.A0U.A07);
        this.A0F = bundle.getInt(C1955pc.A0v, C1955pc.A0U.A0F);
        this.A0E = bundle.getInt(C1955pc.A0t, C1955pc.A0U.A0E);
        this.A0Q = bundle.getBoolean(C1955pc.A0u, C1955pc.A0U.A0Q);
        this.A0M = BP.A07((String[]) AbstractC1659ka.A00(bundle.getStringArray(C1955pc.A0p), new String[0]));
        this.A0D = bundle.getInt(C1955pc.A0q, C1955pc.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC1659ka.A00(bundle.getStringArray(C1955pc.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages12 = new String[0];
        this.A0I = A0G((String[]) AbstractC1659ka.A00(bundle.getStringArray(C1955pc.A0j), preferredVideoLanguages12));
        this.A0B = bundle.getInt(C1955pc.A0l, C1955pc.A0U.A0B);
        this.A02 = bundle.getInt(C1955pc.A0a, C1955pc.A0U.A02);
        this.A01 = bundle.getInt(C1955pc.A0Z, C1955pc.A0U.A01);
        String[] preferredVideoLanguages13 = new String[0];
        this.A0J = BP.A07((String[]) AbstractC1659ka.A00(bundle.getStringArray(C1955pc.A0k), preferredVideoLanguages13));
        String[] preferredVideoLanguages14 = new String[0];
        this.A0K = A0G((String[]) AbstractC1659ka.A00(bundle.getStringArray(C1955pc.A0m), preferredVideoLanguages14));
        this.A0C = bundle.getInt(C1955pc.A0n, C1955pc.A0U.A0C);
        this.A00 = bundle.getInt(C1955pc.A0e(), C1955pc.A0U.A00);
        this.A0P = bundle.getBoolean(C1955pc.A0s, C1955pc.A0U.A0P);
        this.A0O = bundle.getBoolean(C1955pc.A0X, C1955pc.A0U.A0O);
        this.A0N = bundle.getBoolean(C1955pc.A0W, C1955pc.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C1955pc.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = AnonymousClass44.A01(C1957pe.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i4 = 0; i4 < listA01.size(); i4++) {
            C1957pe c1957pe = (C1957pe) listA01.get(i4);
            this.A0G.put(c1957pe.A00, c1957pe);
        }
        int[] iArr = (int[]) AbstractC1659ka.A00(bundle.getIntArray(C1955pc.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i10 : iArr) {
            this.A0H.add(Integer.valueOf(i10));
        }
    }

    public C02033h(C1955pc c1955pc) {
        A0R(c1955pc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static BP<String> A0G(String[] strArr) {
        C2K c2kA01 = BP.A01();
        for (String str : (String[]) AbstractC02203y.A01(strArr)) {
            c2kA01.A04(C5C.A0k((String) AbstractC02203y.A01(str)));
        }
        return c2kA01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((C5C.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, WebSocketProtocol.PAYLOAD_SHORT))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = BP.A04(C5C.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C1955pc c1955pc) {
        this.A06 = c1955pc.A06;
        this.A05 = c1955pc.A05;
        this.A04 = c1955pc.A04;
        this.A03 = c1955pc.A03;
        this.A0A = c1955pc.A0A;
        this.A09 = c1955pc.A09;
        this.A08 = c1955pc.A08;
        this.A07 = c1955pc.A07;
        this.A0F = c1955pc.A0F;
        this.A0E = c1955pc.A0E;
        this.A0Q = c1955pc.A0Q;
        this.A0M = c1955pc.A0M;
        this.A0D = c1955pc.A0D;
        this.A0L = c1955pc.A0L;
        this.A0I = c1955pc.A0I;
        this.A0B = c1955pc.A0B;
        this.A02 = c1955pc.A02;
        this.A01 = c1955pc.A01;
        this.A0J = c1955pc.A0J;
        this.A0K = c1955pc.A0K;
        this.A0C = c1955pc.A0C;
        this.A00 = c1955pc.A00;
        this.A0P = c1955pc.A0P;
        this.A0O = c1955pc.A0O;
        this.A0N = c1955pc.A0N;
        this.A0H = new HashSet<>(c1955pc.A0H);
        this.A0G = new HashMap<>(c1955pc.A0G);
    }

    public C02033h A0W(C1955pc c1955pc) {
        A0R(c1955pc);
        return this;
    }

    public C02033h A0m(int i4, int i10, boolean z3) {
        this.A0F = i4;
        this.A0E = i10;
        this.A0Q = z3;
        return this;
    }

    public C02033h A0n(Context context) {
        if (C5C.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public C02033h A0o(Context context, boolean z3) {
        Point viewportSize = C5C.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z3);
    }

    public C1955pc A0p() {
        return new C1955pc(this);
    }
}
