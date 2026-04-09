package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.util.x;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ClickCoordinateTracker {

    @NotNull
    private static final String TAG = "ClickCoordinateTracker";

    @NotNull
    private final q7.a advertisement;

    @NotNull
    private final Context context;

    @NotNull
    private final a currentClick;

    @NotNull
    public static final b Companion = new b(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    public static final class a {

        @NotNull
        private c downCoordinate;

        @NotNull
        private c upCoordinate;

        public a(@NotNull c downCoordinate, @NotNull c upCoordinate) {
            p.e(downCoordinate, "downCoordinate");
            p.e(upCoordinate, "upCoordinate");
            this.downCoordinate = downCoordinate;
            this.upCoordinate = upCoordinate;
        }

        public static /* synthetic */ a copy$default(a aVar, c cVar, c cVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.downCoordinate;
            }
            if ((i10 & 2) != 0) {
                cVar2 = aVar.upCoordinate;
            }
            return aVar.copy(cVar, cVar2);
        }

        @NotNull
        public final c component1() {
            return this.downCoordinate;
        }

        @NotNull
        public final c component2() {
            return this.upCoordinate;
        }

        @NotNull
        public final a copy(@NotNull c downCoordinate, @NotNull c upCoordinate) {
            p.e(downCoordinate, "downCoordinate");
            p.e(upCoordinate, "upCoordinate");
            return new a(downCoordinate, upCoordinate);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.a(this.downCoordinate, aVar.downCoordinate) && p.a(this.upCoordinate, aVar.upCoordinate);
        }

        @NotNull
        public final c getDownCoordinate() {
            return this.downCoordinate;
        }

        @NotNull
        public final c getUpCoordinate() {
            return this.upCoordinate;
        }

        public int hashCode() {
            return (this.downCoordinate.hashCode() * 31) + this.upCoordinate.hashCode();
        }

        public final boolean ready() {
            return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
        }

        public final void setDownCoordinate(@NotNull c cVar) {
            p.e(cVar, "<set-?>");
            this.downCoordinate = cVar;
        }

        public final void setUpCoordinate(@NotNull c cVar) {
            p.e(cVar, "<set-?>");
            this.upCoordinate = cVar;
        }

        @NotNull
        public String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: x, reason: collision with root package name */
        private final int f20159x;

        /* renamed from: y, reason: collision with root package name */
        private final int f20160y;

        public c(int i10, int i11) {
            this.f20159x = i10;
            this.f20160y = i11;
        }

        public static /* synthetic */ c copy$default(c cVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = cVar.f20159x;
            }
            if ((i12 & 2) != 0) {
                i11 = cVar.f20160y;
            }
            return cVar.copy(i10, i11);
        }

        public final int component1() {
            return this.f20159x;
        }

        public final int component2() {
            return this.f20160y;
        }

        @NotNull
        public final c copy(int i10, int i11) {
            return new c(i10, i11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20159x == cVar.f20159x && this.f20160y == cVar.f20160y;
        }

        public final int getX() {
            return this.f20159x;
        }

        public final int getY() {
            return this.f20160y;
        }

        public int hashCode() {
            return (this.f20159x * 31) + this.f20160y;
        }

        @NotNull
        public String toString() {
            return "Coordinate(x=" + this.f20159x + ", y=" + this.f20160y + ')';
        }
    }

    public static final class d {

        @NotNull
        private final Context context;

        @NotNull
        private final DisplayMetrics dm;

        public d(@NotNull Context context) {
            p.e(context, "context");
            this.context = context;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.dm = displayMetrics;
            Object systemService = context.getSystemService("window");
            p.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public static /* synthetic */ d copy$default(d dVar, Context context, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = dVar.context;
            }
            return dVar.copy(context);
        }

        @NotNull
        public final Context component1() {
            return this.context;
        }

        @NotNull
        public final d copy(@NotNull Context context) {
            p.e(context, "context");
            return new d(context);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.a(this.context, ((d) obj).context);
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        public final int getDeviceHeight() {
            return this.dm.heightPixels;
        }

        public final int getDeviceWidth() {
            return this.dm.widthPixels;
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeviceScreenInfo(context=" + this.context + ')';
        }
    }

    public ClickCoordinateTracker(@NotNull Context context, @NotNull q7.a advertisement) {
        p.e(context, "context");
        p.e(advertisement, "advertisement");
        this.context = context;
        this.advertisement = advertisement;
        this.currentClick = new a(new c(Integer.MIN_VALUE, Integer.MIN_VALUE), new c(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @VisibleForTesting
    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }

    private final int getDeviceHeight() {
        return new d(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new d(this.context).getDeviceWidth();
    }

    private final int getRequestedHeight() {
        int iAdHeight = this.advertisement.adHeight();
        return iAdHeight == 0 ? getDeviceHeight() : x.INSTANCE.dpToPixels(this.context, iAdHeight);
    }

    private final int getRequestedWidth() {
        int iAdWidth = this.advertisement.adWidth();
        return iAdWidth == 0 ? getDeviceWidth() : x.INSTANCE.dpToPixels(this.context, iAdWidth);
    }

    private final void sendClickCoordinates() {
        List<String> tpatUrls$default = q7.a.getTpatUrls$default(this.advertisement, q7.a.TPAT_CLICK_COORDINATES_URLS, null, null, 6, null);
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk$SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        y8.h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.ClickCoordinateTracker$sendClickCoordinates$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.h, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.network.h invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.network.h.class);
            }
        });
        for (String str : tpatUrls$default) {
            String MACRO_REQ_WIDTH2 = MACRO_REQ_WIDTH;
            p.d(MACRO_REQ_WIDTH2, "MACRO_REQ_WIDTH");
            String strB = new Regex(MACRO_REQ_WIDTH2).b(str, String.valueOf(requestedWidth));
            String MACRO_REQ_HEIGHT2 = MACRO_REQ_HEIGHT;
            p.d(MACRO_REQ_HEIGHT2, "MACRO_REQ_HEIGHT");
            String strB2 = new Regex(MACRO_REQ_HEIGHT2).b(strB, String.valueOf(requestedHeight));
            String MACRO_WIDTH2 = MACRO_WIDTH;
            p.d(MACRO_WIDTH2, "MACRO_WIDTH");
            String strB3 = new Regex(MACRO_WIDTH2).b(strB2, String.valueOf(requestedWidth2));
            String MACRO_HEIGHT2 = MACRO_HEIGHT;
            p.d(MACRO_HEIGHT2, "MACRO_HEIGHT");
            String strB4 = new Regex(MACRO_HEIGHT2).b(strB3, String.valueOf(requestedHeight2));
            String MACRO_DOWN_X2 = MACRO_DOWN_X;
            p.d(MACRO_DOWN_X2, "MACRO_DOWN_X");
            String strB5 = new Regex(MACRO_DOWN_X2).b(strB4, String.valueOf(this.currentClick.getDownCoordinate().getX()));
            String MACRO_DOWN_Y2 = MACRO_DOWN_Y;
            p.d(MACRO_DOWN_Y2, "MACRO_DOWN_Y");
            String strB6 = new Regex(MACRO_DOWN_Y2).b(strB5, String.valueOf(this.currentClick.getDownCoordinate().getY()));
            String MACRO_UP_X2 = MACRO_UP_X;
            p.d(MACRO_UP_X2, "MACRO_UP_X");
            String strB7 = new Regex(MACRO_UP_X2).b(strB6, String.valueOf(this.currentClick.getUpCoordinate().getX()));
            String MACRO_UP_Y2 = MACRO_UP_Y;
            p.d(MACRO_UP_Y2, "MACRO_UP_Y");
            com.vungle.ads.internal.network.h.sendTpat$default(m289sendClickCoordinates$lambda0(hVarA), new f.a(new Regex(MACRO_UP_Y2).b(strB7, String.valueOf(this.currentClick.getUpCoordinate().getY()))).tpatKey(com.vungle.ads.internal.b.COORDINATE).build(), false, 2, null);
        }
    }

    /* renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.h m289sendClickCoordinates$lambda0(y8.h hVar) {
        return (com.vungle.ads.internal.network.h) hVar.getValue();
    }

    @NotNull
    public final a getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(@NotNull MotionEvent event) {
        p.e(event, "event");
        if (this.advertisement.isClickCoordinatesTrackingEnabled()) {
            int action = event.getAction();
            if (action == 0) {
                this.currentClick.setDownCoordinate(new c((int) event.getX(), (int) event.getY()));
            } else {
                if (action != 1) {
                    return;
                }
                this.currentClick.setUpCoordinate(new c((int) event.getX(), (int) event.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                }
            }
        }
    }
}
