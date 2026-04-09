package com.unity3d.ads.adplayer;

import androidx.core.app.NotificationCompat;
import c9.c;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.log.DeviceLog;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e1;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.x0;
import kotlinx.coroutines.flow.y0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.o0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.xbill.DNS.WKSRecord;
import y8.i;
import y8.s;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019J'\u0010#\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0017\u0010*\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R8\u00102\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001501000/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\b\u0012\u0004\u0012\u000205088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lkotlinx/coroutines/j0;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/j0;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "", "arguments", "Ly8/s;", "execute", "(Lcom/unity3d/ads/adplayer/HandlerType;Ljava/lang/String;Lc9/c;)Ljava/lang/Object;", "callbackId", NotificationCompat.CATEGORY_STATUS, "", "", "params", "respond", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", NotificationCompat.CATEGORY_EVENT, "sendEvent", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lc9/c;)Ljava/lang/Object;", "className", "method", AdActivity.REQUEST_KEY_EXTRA, "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PglCryptUtils.KEY_MESSAGE, "handleInvocation", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "scope", "Lkotlinx/coroutines/j0;", "getScope", "()Lkotlinx/coroutines/j0;", "Lkotlinx/coroutines/flow/t0;", "", "Lkotlin/Pair;", "Lkotlinx/coroutines/x;", "callbacks", "Lkotlinx/coroutines/flow/t0;", "Lkotlinx/coroutines/flow/s0;", "Lcom/unity3d/ads/adplayer/Invocation;", "_onInvocation", "Lkotlinx/coroutines/flow/s0;", "Lkotlinx/coroutines/flow/x0;", "onInvocation", "Lkotlinx/coroutines/flow/x0;", "getOnInvocation", "()Lkotlinx/coroutines/flow/x0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonWebViewBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWebViewBridge.kt\ncom/unity3d/ads/adplayer/CommonWebViewBridge\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n13579#2,2:166\n13579#2,2:173\n230#3,5:168\n230#3,5:176\n1#4:175\n*S KotlinDebug\n*F\n+ 1 CommonWebViewBridge.kt\ncom/unity3d/ads/adplayer/CommonWebViewBridge\n*L\n45#1:166,2\n63#1:173,2\n57#1:168,5\n90#1:176,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonWebViewBridge implements WebViewBridge {

    @NotNull
    private final s0 _onInvocation;

    @NotNull
    private final t0 callbacks;

    @NotNull
    private final x0 onInvocation;

    @NotNull
    private final j0 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final WebViewContainer webViewContainer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return CommonWebViewBridge.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return s.f25199a;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", i = {0, 1}, l = {127, 129, 130, 131, 132, WKSRecord.Service.NETBIOS_SSN}, m = "invokeSuspend", n = {"invocation", "invocation"}, s = {"L$0", "L$0"})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements p {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ JSONArray $parameters;
        Object L$0;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements p {
            final /* synthetic */ Invocation $invocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Invocation invocation, c cVar) {
                super(2, cVar);
                this.$invocation = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c create(@Nullable Object obj, @NotNull c cVar) {
                return new AnonymousClass1(this.$invocation, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objF = kotlin.coroutines.intrinsics.a.f();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    o0 o0VarIsHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (o0VarIsHandled.q(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return s.f25199a;
            }

            @Override // l9.p
            @Nullable
            public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
                return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, c cVar) {
            super(2, cVar);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return new AnonymousClass7(this.$location, this.$parameters, this.this$0, this.$callback, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        
            if (r1.respond(r5, "OK", r7, r8) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
        
            if (r1.respond(r5, "ERROR", r3, r8) != r0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: Exception -> 0x001e, PHI: r1
  0x006c: PHI (r1v15 com.unity3d.ads.adplayer.Invocation) = (r1v12 com.unity3d.ads.adplayer.Invocation), (r1v17 com.unity3d.ads.adplayer.Invocation) binds: [B:21:0x0068, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:26:0x0079, B:28:0x007d, B:31:0x008b, B:13:0x0029, B:23:0x006c, B:20:0x0058), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: Exception -> 0x001e, PHI: r9
  0x0079: PHI (r9v17 java.lang.Object) = (r9v16 java.lang.Object), (r9v0 java.lang.Object) binds: [B:24:0x0075, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:26:0x0079, B:28:0x007d, B:31:0x008b, B:13:0x0029, B:23:0x006c, B:20:0x0058), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:26:0x0079, B:28:0x007d, B:31:0x008b, B:13:0x0029, B:23:0x006c, B:20:0x0058), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: Exception -> 0x001e, TRY_LEAVE, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:26:0x0079, B:28:0x007d, B:31:0x008b, B:13:0x0029, B:23:0x006c, B:20:0x0058), top: B:46:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass7) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", i = {0}, l = {66, 68}, m = AdActivity.REQUEST_KEY_EXTRA, n = {"callback"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    public static final class C24471 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C24471(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(@NotNull CoroutineDispatcher dispatcher, @NotNull WebViewContainer webViewContainer, @NotNull j0 adPlayerScope, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.p.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.p.e(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.p.e(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.p.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        j0 j0VarH = k0.h(k0.h(adPlayerScope, dispatcher), new i0("CommonWebViewBridge"));
        this.scope = j0VarH;
        this.callbacks = e1.a(z8.j0.d());
        s0 s0VarB = y0.b(0, 64, null, 5, null);
        this._onInvocation = s0VarB;
        this.onInvocation = d.a(s0VarB);
        k.d(j0VarH, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, String str, c cVar) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", cVar);
        return objEvaluateJavascript == kotlin.coroutines.intrinsics.a.f() ? objEvaluateJavascript : s.f25199a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, c cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        HandlerType handlerType = HandlerType.CALLBACK;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(jSONArray);
        sb.append(']');
        Object objExecute = execute(handlerType, sb.toString(), cVar);
        return objExecute == kotlin.coroutines.intrinsics.a.f() ? objExecute : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @NotNull
    public x0 getOnInvocation() {
        return this.onInvocation;
    }

    @NotNull
    public final j0 getScope() {
        return this.scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleCallback(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "callbackId"
            kotlin.jvm.internal.p.e(r1, r4)
            java.lang.String r4 = "callbackStatus"
            kotlin.jvm.internal.p.e(r2, r4)
            java.lang.String r4 = "rawParameters"
            kotlin.jvm.internal.p.e(r3, r4)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r3)
            java.lang.Object[] r3 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r4)
            kotlinx.coroutines.flow.t0 r4 = r0.callbacks
            java.lang.Object r4 = r4.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L2c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()
            r6 = r5
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r6 = r6.getFirst()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = kotlin.jvm.internal.p.a(r6, r1)
            if (r6 == 0) goto L2c
            goto L47
        L46:
            r5 = 0
        L47:
            kotlin.Pair r5 = (kotlin.Pair) r5
            if (r5 != 0) goto L4d
            goto Ld6
        L4d:
            java.lang.Object r1 = r5.getSecond()
            kotlinx.coroutines.x r1 = (kotlinx.coroutines.x) r1
            java.lang.String r4 = "success"
            java.lang.String r6 = "error"
            java.lang.String[] r7 = new java.lang.String[]{r4, r6}
            java.util.Set r7 = z8.j0.f(r7)
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L75
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            r15 = 62
            r16 = 0
            java.lang.String r9 = "old_callback_status"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L75:
            int r7 = r2.hashCode()
            r8 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r7 == r8) goto Lb9
            r4 = 2524(0x9dc, float:3.537E-42)
            if (r7 == r4) goto Lb0
            r4 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r7 == r4) goto L94
            r4 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r7 == r4) goto L8d
            goto Lc3
        L8d:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L9d
            goto Lc3
        L94:
            java.lang.String r4 = "ERROR"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L9d
            goto Lc3
        L9d:
            java.lang.Exception r2 = new java.lang.Exception
            r4 = 0
            r3 = r3[r4]
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.p.c(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            r1.o(r2)
            goto Lc3
        Lb0:
            java.lang.String r4 = "OK"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lc0
            goto Lc3
        Lb9:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lc0
            goto Lc3
        Lc0:
            r1.p(r3)
        Lc3:
            kotlinx.coroutines.flow.t0 r1 = r0.callbacks
        Lc5:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.Set r3 = z8.k0.g(r3, r5)
            boolean r2 = r1.h(r2, r3)
            if (r2 == 0) goto Lc5
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(@NotNull String message) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.p.e(message, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    DeviceLog.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    k.d(this.scope, null, null, new AnonymousClass7(str4, jSONArray3, this, str3, null), 3, null);
                }
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + message, e10);
            }
        } catch (Exception e11) {
            DeviceLog.error("Error handling invocation from webview (" + message + ')');
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = e11.getMessage();
            if (message2 == null) {
                message2 = e11.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, kotlin.collections.a.k(i.a("reason_debug", message2), i.a("webview_invocation", message)), null, null, null, 58, null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: " + message, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object request(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.Object[] r13, @org.jetbrains.annotations.NotNull c9.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.C24471
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge.C24471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.c.b(r14)
            return r14
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.Object r11 = r0.L$0
            kotlinx.coroutines.x r11 = (kotlinx.coroutines.x) r11
            kotlin.c.b(r14)
            goto L94
        L3d:
            kotlin.c.b(r14)
            kotlinx.coroutines.x r14 = kotlinx.coroutines.z.b(r4, r5, r4)
            int r2 = r14.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlinx.coroutines.flow.t0 r6 = r10.callbacks
        L4e:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            kotlin.Pair r9 = y8.i.a(r2, r14)
            java.util.Set r8 = z8.k0.i(r8, r9)
            boolean r7 = r6.h(r7, r8)
            if (r7 == 0) goto L4e
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r11)
            r6.put(r12)
            r6.put(r2)
            int r11 = r13.length
            r12 = 0
        L73:
            if (r12 >= r11) goto L7d
            r2 = r13[r12]
            r6.put(r2)
            int r12 = r12 + 1
            goto L73
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            java.lang.String r12 = r6.toString()
            java.lang.String r13 = "arguments.toString()"
            kotlin.jvm.internal.p.d(r12, r13)
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r11 = r10.execute(r11, r12, r0)
            if (r11 != r1) goto L93
            goto L9e
        L93:
            r11 = r14
        L94:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r11 = r11.q(r0)
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], c9.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @Nullable
    public Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull c cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        HandlerType handlerType = HandlerType.EVENT;
        String string = jSONArray.toString();
        kotlin.jvm.internal.p.d(string, "arguments.toString()");
        Object objExecute = execute(handlerType, string, cVar);
        return objExecute == kotlin.coroutines.intrinsics.a.f() ? objExecute : s.f25199a;
    }
}
