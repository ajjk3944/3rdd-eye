package com.unity3d.ads.core.domain;

import androidx.core.app.NotificationCompat;
import c9.c;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.d;
import l9.p;
import l9.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.i;
import y8.s;
import z8.h0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidShow;", "Lcom/unity3d/ads/core/domain/Show;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "gameServerIdReader", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/configuration/GameServerIdReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/UnityAdsShowOptions;", "showOptions", "Lkotlinx/coroutines/flow/b;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/UnityAdsShowOptions;)Lkotlinx/coroutines/flow/b;", "Ly8/s;", "terminate", "(Lcom/unity3d/ads/core/data/model/AdObject;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidShow implements Show {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GameServerIdReader gameServerIdReader;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAndroidShow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShow.kt\ncom/unity3d/ads/core/domain/AndroidShow$invoke$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidShow this$0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nAndroidShow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShow.kt\ncom/unity3d/ads/core/domain/AndroidShow$invoke$1$2\n+ 2 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n*L\n1#1,72:1\n17#2:73\n8#2,14:74\n*S KotlinDebug\n*F\n+ 1 AndroidShow.kt\ncom/unity3d/ads/core/domain/AndroidShow$invoke$1$2\n*L\n37#1:73\n37#1:74,14\n*E\n"})
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements p {
            final /* synthetic */ AdObject $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, c cVar) {
                super(2, cVar);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c create(@Nullable Object obj, @NotNull c cVar) {
                return new AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$showOptions, cVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                /*
                    r13 = this;
                    kotlin.coroutines.intrinsics.a.f()
                    int r0 = r13.label
                    if (r0 != 0) goto Lb9
                    kotlin.c.b(r14)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.core.domain.AndroidShow r0 = r13.this$0
                    com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                    com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                    java.lang.String r2 = r0.getKey()
                    java.lang.Object r1 = r1.get(r2)
                    java.lang.String r2 = "get(key)"
                    r3 = 0
                    if (r1 == 0) goto L2e
                    kotlin.jvm.internal.p.d(r1, r2)
                    boolean r4 = r1 instanceof java.lang.String
                    if (r4 == 0) goto L2b
                    goto L2c
                L2b:
                    r1 = r3
                L2c:
                    if (r1 != 0) goto L2f
                L2e:
                    r1 = r3
                L2f:
                    com.unity3d.services.core.misc.JsonStorage r4 = r0.getJsonStorage()
                    java.lang.String r5 = r0.getKey()
                    java.lang.Object r4 = r4.get(r5)
                    if (r4 == 0) goto L4b
                    kotlin.jvm.internal.p.d(r4, r2)
                    com.unity3d.services.core.misc.JsonStorage r2 = r0.getJsonStorage()
                    java.lang.String r0 = r0.getKey()
                    r2.delete(r0)
                L4b:
                    java.lang.String r1 = (java.lang.String) r1
                    r14.setPlayerServerId(r1)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$adObject
                    kotlinx.coroutines.flow.t0 r14 = r14.getState()
                    com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
                    r14.setValue(r0)
                    com.unity3d.ads.core.domain.AndroidShow r14 = r13.this$0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = com.unity3d.ads.core.domain.AndroidShow.access$getSendDiagnosticEvent$p(r14)
                    com.unity3d.ads.core.data.model.AdObject r9 = r13.$adObject
                    r11 = 46
                    r12 = 0
                    java.lang.String r5 = "native_show_event_flow_started"
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r10 = 0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.adplayer.AdPlayer r14 = r14.getAdPlayer()
                    com.unity3d.ads.UnityAdsShowOptions r0 = r13.$showOptions
                    if (r0 == 0) goto L83
                    org.json.JSONObject r0 = r0.getData()
                    if (r0 == 0) goto L83
                    java.util.Map r3 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
                L83:
                    r5 = r3
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r7 = r0.isScarAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r9 = r0.getScarAdString()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r8 = r0.getScarQueryId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r10 = r0.getScarAdUnitId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r11 = r0.isOfferwallAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r12 = r0.getOfferwallPlacementName()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r6 = r0.getPlacementId()
                    com.unity3d.ads.adplayer.AndroidShowOptions r4 = new com.unity3d.ads.adplayer.AndroidShowOptions
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                    r14.show(r4)
                    y8.s r14 = y8.s.f25199a
                    return r14
                Lb9:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // l9.p
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.flow.c cVar, @Nullable c cVar2) {
                return ((AnonymousClass2) create(cVar, cVar2)).invokeSuspend(s.f25199a);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements q {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AndroidShow androidShow, AdObject adObject, ByteString byteString, c cVar) {
                super(3, cVar);
                this.this$0 = androidShow;
                this.$adObject = adObject;
                this.$opportunityId = byteString;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_event_flow_completed", null, null, null, this.$adObject, null, 46, null);
                this.$adObject.getState().setValue(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return s.f25199a;
            }

            @Override // l9.q
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.flow.c cVar, @Nullable Throwable th, @Nullable c cVar2) {
                return new AnonymousClass3(this.this$0, this.$adObject, this.$opportunityId, cVar2).invokeSuspend(s.f25199a);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/c;Lcom/unity3d/ads/core/data/model/ShowEvent;)Z"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", i = {0}, l = {58}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements q {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public AnonymousClass4(c cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ShowEvent showEvent;
                Object objF = kotlin.coroutines.intrinsics.a.f();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    kotlinx.coroutines.flow.c cVar = (kotlinx.coroutines.flow.c) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (cVar.emit(showEvent2, this) == objF) {
                        return objF;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    kotlin.c.b(obj);
                }
                return d9.a.a(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }

            @Override // l9.q
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull ShowEvent showEvent, @Nullable c cVar2) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(cVar2);
                anonymousClass4.L$0 = cVar;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(s.f25199a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, c cVar) {
            super(2, cVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$showOptions, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final kotlinx.coroutines.flow.c cVar = (kotlinx.coroutines.flow.c) this.L$0;
                if (this.$adObject.getOpportunityId().isEmpty()) {
                    throw new IllegalArgumentException("No opportunityId");
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad = this.this$0.adRepository.getAd(opportunityId);
                if (ad == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                b bVarH = d.H(d.z(d.B(adPlayer.getOnShowEvent(), new AnonymousClass2(ad, this.this$0, this.$adObject, this.$showOptions, null)), new AnonymousClass3(this.this$0, this.$adObject, opportunityId, null)), new AnonymousClass4(null));
                final AndroidShow androidShow = this.this$0;
                final AdObject adObject = this.$adObject;
                kotlinx.coroutines.flow.c cVar2 = new kotlinx.coroutines.flow.c() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                    @Override // kotlinx.coroutines.flow.c
                    @Nullable
                    public final Object emit(@NotNull ShowEvent showEvent, @NotNull c cVar3) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidShow.sendDiagnosticEvent, "native_show_event_flow_collected", null, h0.f(i.a(NotificationCompat.CATEGORY_EVENT, showEvent.getClass().getSimpleName())), null, adObject, null, 42, null);
                        Object objEmit = cVar.emit(showEvent, cVar3);
                        return objEmit == kotlin.coroutines.intrinsics.a.f() ? objEmit : s.f25199a;
                    }
                };
                this.label = 1;
                if (bVarH.collect(cVar2, this) == objF) {
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
        public final Object invoke(@NotNull kotlinx.coroutines.flow.c cVar, @Nullable c cVar2) {
            return ((AnonymousClass1) create(cVar, cVar2)).invokeSuspend(s.f25199a);
        }
    }

    public AndroidShow(@NotNull AdRepository adRepository, @NotNull GameServerIdReader gameServerIdReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.p.e(adRepository, "adRepository");
        kotlin.jvm.internal.p.e(gameServerIdReader, "gameServerIdReader");
        kotlin.jvm.internal.p.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    @NotNull
    public b invoke(@NotNull AdObject adObject, @Nullable UnityAdsShowOptions showOptions) {
        kotlin.jvm.internal.p.e(adObject, "adObject");
        return d.u(new AnonymousClass1(adObject, this, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    @Nullable
    public Object terminate(@NotNull AdObject adObject, @NotNull c cVar) {
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null) {
            return s.f25199a;
        }
        Object objDestroy = adPlayer.destroy(cVar);
        return objDestroy == kotlin.coroutines.intrinsics.a.f() ? objDestroy : s.f25199a;
    }
}
