package com.vungle.ads.internal;

import N7.H7;
import a6.C1653b;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.C4055m;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.s;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: ClickCoordinateTracker.kt */
/* loaded from: classes2.dex */
public final class e {
    private static final String TAG = "ClickCoordinateTracker";
    private final C1653b advertisement;
    private final Context context;
    private final a currentClick;
    private final Executor executor;
    private final InterfaceC2000g executors$delegate;
    private final InterfaceC2000g vungleApiClient$delegate;
    public static final b Companion = new b(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    /* compiled from: ClickCoordinateTracker.kt */
    public static final class a {
        private c downCoordinate;
        private c upCoordinate;

        public a(c downCoordinate, c upCoordinate) {
            kotlin.jvm.internal.l.f(downCoordinate, "downCoordinate");
            kotlin.jvm.internal.l.f(upCoordinate, "upCoordinate");
            this.downCoordinate = downCoordinate;
            this.upCoordinate = upCoordinate;
        }

        public static /* synthetic */ a copy$default(a aVar, c cVar, c cVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.downCoordinate;
            }
            if ((i & 2) != 0) {
                cVar2 = aVar.upCoordinate;
            }
            return aVar.copy(cVar, cVar2);
        }

        public final c component1() {
            return this.downCoordinate;
        }

        public final c component2() {
            return this.upCoordinate;
        }

        public final a copy(c downCoordinate, c upCoordinate) {
            kotlin.jvm.internal.l.f(downCoordinate, "downCoordinate");
            kotlin.jvm.internal.l.f(upCoordinate, "upCoordinate");
            return new a(downCoordinate, upCoordinate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.downCoordinate, aVar.downCoordinate) && kotlin.jvm.internal.l.b(this.upCoordinate, aVar.upCoordinate);
        }

        public final c getDownCoordinate() {
            return this.downCoordinate;
        }

        public final c getUpCoordinate() {
            return this.upCoordinate;
        }

        public int hashCode() {
            return this.upCoordinate.hashCode() + (this.downCoordinate.hashCode() * 31);
        }

        public final boolean ready() {
            return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
        }

        public final void setDownCoordinate(c cVar) {
            kotlin.jvm.internal.l.f(cVar, "<set-?>");
            this.downCoordinate = cVar;
        }

        public final void setUpCoordinate(c cVar) {
            kotlin.jvm.internal.l.f(cVar, "<set-?>");
            this.upCoordinate = cVar;
        }

        public String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
        }
    }

    /* compiled from: ClickCoordinateTracker.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: ClickCoordinateTracker.kt */
    public static final class c {

        /* renamed from: x, reason: collision with root package name */
        private final int f23802x;

        /* renamed from: y, reason: collision with root package name */
        private final int f23803y;

        public c(int i, int i10) {
            this.f23802x = i;
            this.f23803y = i10;
        }

        public static /* synthetic */ c copy$default(c cVar, int i, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i = cVar.f23802x;
            }
            if ((i11 & 2) != 0) {
                i10 = cVar.f23803y;
            }
            return cVar.copy(i, i10);
        }

        public final int component1() {
            return this.f23802x;
        }

        public final int component2() {
            return this.f23803y;
        }

        public final c copy(int i, int i10) {
            return new c(i, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f23802x == cVar.f23802x && this.f23803y == cVar.f23803y;
        }

        public final int getX() {
            return this.f23802x;
        }

        public final int getY() {
            return this.f23803y;
        }

        public int hashCode() {
            return (this.f23802x * 31) + this.f23803y;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Coordinate(x=");
            sb.append(this.f23802x);
            sb.append(", y=");
            return H7.p(sb, this.f23803y, ')');
        }
    }

    /* compiled from: ClickCoordinateTracker.kt */
    public static final class d {
        private final Context context;
        private final DisplayMetrics dm;

        public d(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.context = context;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.dm = displayMetrics;
            Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public static /* synthetic */ d copy$default(d dVar, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = dVar.context;
            }
            return dVar.copy(context);
        }

        public final Context component1() {
            return this.context;
        }

        public final d copy(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            return new d(context);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.l.b(this.context, ((d) obj).context);
        }

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

        public String toString() {
            return "DeviceScreenInfo(context=" + this.context + ')';
        }
    }

    /* compiled from: ServiceLocator.kt */
    /* renamed from: com.vungle.ads.internal.e$e, reason: collision with other inner class name */
    public static final class C0379e extends m implements InterfaceC5480a<com.vungle.ads.internal.util.l> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0379e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.l, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.l invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.l.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class g extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class h extends m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    public e(Context context, C1653b advertisement, Executor executor) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        kotlin.jvm.internal.l.f(executor, "executor");
        this.context = context;
        this.advertisement = advertisement;
        this.executor = executor;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        b9.i iVar = b9.i.SYNCHRONIZED;
        this.vungleApiClient$delegate = C2001h.a(iVar, new g(context));
        this.executors$delegate = C2001h.a(iVar, new h(context));
        this.currentClick = new a(new c(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION), new c(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION));
    }

    private final int getDeviceHeight() {
        return new d(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new d(this.context).getDeviceWidth();
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final int getRequestedHeight() {
        int iAdHeight = this.advertisement.adHeight();
        return iAdHeight == 0 ? getDeviceHeight() : s.INSTANCE.dpToPixels(this.context, iAdHeight);
    }

    private final int getRequestedWidth() {
        int iAdWidth = this.advertisement.adWidth();
        return iAdWidth == 0 ? getDeviceWidth() : s.INSTANCE.dpToPixels(this.context, iAdWidth);
    }

    private final com.vungle.ads.internal.network.g getVungleApiClient() {
        return (com.vungle.ads.internal.network.g) this.vungleApiClient$delegate.getValue();
    }

    private final void sendClickCoordinates() {
        List<String> tpatUrls$default = C1653b.getTpatUrls$default(this.advertisement, C1653b.TPAT_CLICK_COORDINATES_URLS, null, null, 6, null);
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            C4055m.INSTANCE.logError$vungle_ads_release(129, "Empty urls for tpat: video.clickCoordinates", this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = this.context;
        b9.i iVar = b9.i.SYNCHRONIZED;
        com.vungle.ads.internal.network.e eVar = new com.vungle.ads.internal.network.e(getVungleApiClient(), this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), getExecutors().getIoExecutor(), m42sendClickCoordinates$lambda0(C2001h.a(iVar, new C0379e(context))), m43sendClickCoordinates$lambda1(C2001h.a(iVar, new f(this.context))));
        for (String input : tpatUrls$default) {
            String MACRO_REQ_WIDTH2 = MACRO_REQ_WIDTH;
            kotlin.jvm.internal.l.e(MACRO_REQ_WIDTH2, "MACRO_REQ_WIDTH");
            Pattern patternCompile = Pattern.compile(MACRO_REQ_WIDTH2);
            kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
            String replacement = String.valueOf(requestedWidth);
            kotlin.jvm.internal.l.f(input, "input");
            kotlin.jvm.internal.l.f(replacement, "replacement");
            String strReplaceAll = patternCompile.matcher(input).replaceAll(replacement);
            kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
            String MACRO_REQ_HEIGHT2 = MACRO_REQ_HEIGHT;
            kotlin.jvm.internal.l.e(MACRO_REQ_HEIGHT2, "MACRO_REQ_HEIGHT");
            Pattern patternCompile2 = Pattern.compile(MACRO_REQ_HEIGHT2);
            kotlin.jvm.internal.l.e(patternCompile2, "compile(...)");
            String replacement2 = String.valueOf(requestedHeight);
            kotlin.jvm.internal.l.f(replacement2, "replacement");
            String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(replacement2);
            kotlin.jvm.internal.l.e(strReplaceAll2, "replaceAll(...)");
            String MACRO_WIDTH2 = MACRO_WIDTH;
            kotlin.jvm.internal.l.e(MACRO_WIDTH2, "MACRO_WIDTH");
            Pattern patternCompile3 = Pattern.compile(MACRO_WIDTH2);
            kotlin.jvm.internal.l.e(patternCompile3, "compile(...)");
            String replacement3 = String.valueOf(requestedWidth2);
            kotlin.jvm.internal.l.f(replacement3, "replacement");
            String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll(replacement3);
            kotlin.jvm.internal.l.e(strReplaceAll3, "replaceAll(...)");
            String MACRO_HEIGHT2 = MACRO_HEIGHT;
            kotlin.jvm.internal.l.e(MACRO_HEIGHT2, "MACRO_HEIGHT");
            Pattern patternCompile4 = Pattern.compile(MACRO_HEIGHT2);
            kotlin.jvm.internal.l.e(patternCompile4, "compile(...)");
            String replacement4 = String.valueOf(requestedHeight2);
            kotlin.jvm.internal.l.f(replacement4, "replacement");
            String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll(replacement4);
            kotlin.jvm.internal.l.e(strReplaceAll4, "replaceAll(...)");
            String MACRO_DOWN_X2 = MACRO_DOWN_X;
            kotlin.jvm.internal.l.e(MACRO_DOWN_X2, "MACRO_DOWN_X");
            Pattern patternCompile5 = Pattern.compile(MACRO_DOWN_X2);
            kotlin.jvm.internal.l.e(patternCompile5, "compile(...)");
            String replacement5 = String.valueOf(this.currentClick.getDownCoordinate().getX());
            kotlin.jvm.internal.l.f(replacement5, "replacement");
            String strReplaceAll5 = patternCompile5.matcher(strReplaceAll4).replaceAll(replacement5);
            kotlin.jvm.internal.l.e(strReplaceAll5, "replaceAll(...)");
            String MACRO_DOWN_Y2 = MACRO_DOWN_Y;
            kotlin.jvm.internal.l.e(MACRO_DOWN_Y2, "MACRO_DOWN_Y");
            Pattern patternCompile6 = Pattern.compile(MACRO_DOWN_Y2);
            kotlin.jvm.internal.l.e(patternCompile6, "compile(...)");
            String replacement6 = String.valueOf(this.currentClick.getDownCoordinate().getY());
            kotlin.jvm.internal.l.f(replacement6, "replacement");
            String strReplaceAll6 = patternCompile6.matcher(strReplaceAll5).replaceAll(replacement6);
            kotlin.jvm.internal.l.e(strReplaceAll6, "replaceAll(...)");
            String MACRO_UP_X2 = MACRO_UP_X;
            kotlin.jvm.internal.l.e(MACRO_UP_X2, "MACRO_UP_X");
            Pattern patternCompile7 = Pattern.compile(MACRO_UP_X2);
            kotlin.jvm.internal.l.e(patternCompile7, "compile(...)");
            String replacement7 = String.valueOf(this.currentClick.getUpCoordinate().getX());
            kotlin.jvm.internal.l.f(replacement7, "replacement");
            String strReplaceAll7 = patternCompile7.matcher(strReplaceAll6).replaceAll(replacement7);
            kotlin.jvm.internal.l.e(strReplaceAll7, "replaceAll(...)");
            String MACRO_UP_Y2 = MACRO_UP_Y;
            kotlin.jvm.internal.l.e(MACRO_UP_Y2, "MACRO_UP_Y");
            Pattern patternCompile8 = Pattern.compile(MACRO_UP_Y2);
            kotlin.jvm.internal.l.e(patternCompile8, "compile(...)");
            String replacement8 = String.valueOf(this.currentClick.getUpCoordinate().getY());
            kotlin.jvm.internal.l.f(replacement8, "replacement");
            String strReplaceAll8 = patternCompile8.matcher(strReplaceAll7).replaceAll(replacement8);
            kotlin.jvm.internal.l.e(strReplaceAll8, "replaceAll(...)");
            eVar.sendTpat(strReplaceAll8, this.executor);
        }
    }

    /* renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.util.l m42sendClickCoordinates$lambda0(InterfaceC2000g<com.vungle.ads.internal.util.l> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: sendClickCoordinates$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.b m43sendClickCoordinates$lambda1(InterfaceC2000g<com.vungle.ads.internal.signals.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public final a getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
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

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }
}
