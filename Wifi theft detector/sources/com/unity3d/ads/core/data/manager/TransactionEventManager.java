package com.unity3d.ads.core.data.manager;

import c9.c;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import d9.e;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.e1;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.o;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0001.BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001fH\u0086\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-¨\u0006/"}, d2 = {"Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "", "Lkotlinx/coroutines/j0;", "scope", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientAdapter", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getTransactionData", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "getTransactionRequest", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "iapTransactionStore", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "isBillingClientAvailable", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "productDetailsFetcher", "<init>", "(Lkotlinx/coroutines/j0;Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Lcom/unity3d/ads/core/domain/events/GetTransactionData;Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "billingResult", "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "purchases", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "transactionOrigin", "Ly8/s;", "onPurchasesReceived", "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;Ljava/util/List;Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;)V", "invoke", "()V", "Lkotlinx/coroutines/j0;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionEventManager {

    @NotNull
    private static final String INAPP = "inapp";

    @NotNull
    private static final String SUBS = "subs";

    @Nullable
    private final BillingClientAdapter billingClientAdapter;

    @NotNull
    private final GetTransactionData getTransactionData;

    @NotNull
    private final GetTransactionRequest getTransactionRequest;

    @NotNull
    private final ByteStringDataSource iapTransactionStore;

    @NotNull
    private final IsBillingClientAvailable isBillingClientAvailable;

    @NotNull
    private final ProductDetailsFetcher productDetailsFetcher;

    @NotNull
    private final j0 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TransactionEventRepository transactionEventRepository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTransactionEventManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionEventManager.kt\ncom/unity3d/ads/core/data/manager/TransactionEventManager$invoke$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,161:1\n314#2,11:162\n*S KotlinDebug\n*F\n+ 1 TransactionEventManager.kt\ncom/unity3d/ads/core/data/manager/TransactionEventManager$invoke$1\n*L\n54#1:162,11\n*E\n"})
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        Object L$0;
        int label;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return TransactionEventManager.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            try {
            } catch (Exception unused) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(TransactionEventManager.this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, null, 62, null);
            }
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (!TransactionEventManager.this.billingClientAdapter.isInitialized()) {
                    final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                    this.L$0 = transactionEventManager;
                    this.label = 1;
                    final kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
                    pVar.F();
                    transactionEventManager.billingClientAdapter.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1

                        @NotNull
                        private final t0 hasBeenResumed = e1.a(Boolean.FALSE);

                        private final void tryResume() {
                            Object value;
                            Boolean bool;
                            if (pVar.isActive()) {
                                t0 t0Var = this.hasBeenResumed;
                                do {
                                    value = t0Var.getValue();
                                    bool = (Boolean) value;
                                    bool.getClass();
                                } while (!t0Var.h(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                o oVar = pVar;
                                Result.Companion companion = Result.INSTANCE;
                                oVar.resumeWith(Result.b(s.f25199a));
                            }
                        }

                        private final void tryResumeWithException(Exception exception) {
                            Object value;
                            Boolean bool;
                            if (pVar.isActive()) {
                                t0 t0Var = this.hasBeenResumed;
                                do {
                                    value = t0Var.getValue();
                                    bool = (Boolean) value;
                                    bool.getClass();
                                } while (!t0Var.h(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                o oVar = pVar;
                                Result.Companion companion = Result.INSTANCE;
                                oVar.resumeWith(Result.b(kotlin.c.a(exception)));
                            }
                        }

                        @NotNull
                        public final t0 getHasBeenResumed() {
                            return this.hasBeenResumed;
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingServiceDisconnected() {
                            tryResumeWithException(new TransactionException("Billing service disconnected"));
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingSetupFinished(@NotNull BillingResultBridge billingResult) {
                            kotlin.jvm.internal.p.e(billingResult, "billingResult");
                            if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                                tryResumeWithException(new TransactionException("Billing setup failed"));
                            } else {
                                tryResume();
                            }
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                        public void onIsAlreadyInitialized() {
                            tryResume();
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                        public void onPurchaseUpdated(@NotNull BillingResultBridge billingResult, @Nullable List<? extends PurchaseBridge> purchases) {
                            kotlin.jvm.internal.p.e(billingResult, "billingResult");
                            transactionEventManager.onPurchasesReceived(billingResult, purchases, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                        }
                    });
                    Object objW = pVar.w();
                    if (objW == kotlin.coroutines.intrinsics.a.f()) {
                        e.c(this);
                    }
                    if (objW == objF) {
                        return objF;
                    }
                }
                return s.f25199a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (TransactionEventManager.this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
                BillingClientAdapter billingClientAdapter = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
                billingClientAdapter.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager2, billingResultBridge, list);
                    }
                });
                BillingClientAdapter billingClientAdapter2 = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager3 = TransactionEventManager.this;
                billingClientAdapter2.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.b
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                    }
                });
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
    @DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {132, 135, 148, 151}, m = "invokeSuspend", n = {"transactionDataList", "deferredPurchaseList", "purchase", InAppPurchaseMetaData.KEY_PRODUCT_ID, "purchaseTime", "index$iv", "index", "transactionDataList", "deferredPurchaseList", "purchase", "index$iv", "index", "transactionDataList"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$4", "I$0", "I$1", "L$0"})
    @SourceDebugExtension({"SMAP\nTransactionEventManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionEventManager.kt\ncom/unity3d/ads/core/data/manager/TransactionEventManager$onPurchasesReceived$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,161:1\n1549#2:162\n1620#2,3:163\n1864#2,2:166\n1866#2:169\n1#3:168\n37#4,2:170\n*S KotlinDebug\n*F\n+ 1 TransactionEventManager.kt\ncom/unity3d/ads/core/data/manager/TransactionEventManager$onPurchasesReceived$1\n*L\n121#1:162\n121#1:163,3\n122#1:166,2\n122#1:169\n148#1:170,2\n*E\n"})
    /* renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    public static final class C24801 extends SuspendLambda implements p {
        final /* synthetic */ List<PurchaseBridge> $purchases;
        final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24801(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, c cVar) {
            super(2, cVar);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
            this.$transactionOrigin = transactionOrigin;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return new C24801(this.$purchases, this.this$0, this.$transactionOrigin, cVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(21:28|(1:30)|31|102|32|33|106|34|35|(1:38)|(2:108|40)(1:43)|44|(1:46)(1:47)|(2:53|(4:56|110|57|(5:59|60|98|61|(10:64|100|65|(0)|71|72|80|81|26|(2:82|(4:85|(0)|91|92))(0)))(7:70|71|72|80|81|26|(0)(0))))|75|104|76|77|81|26|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(5:59|60|98|61|(10:64|100|65|(0)|71|72|80|81|26|(2:82|(4:85|(0)|91|92))(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:
        
            r12 = r4;
            r11 = r13;
            r13 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x01c4, code lost:
        
            r14 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01c5, code lost:
        
            r5 = r2;
            r2 = r4;
            r9 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01d7, code lost:
        
            r14 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0237, code lost:
        
            if (r2 == r1) goto L89;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0170 A[Catch: Exception -> 0x01b1, TRY_LEAVE, TryCatch #7 {Exception -> 0x01b1, blocks: (B:57:0x0156, B:59:0x0170), top: B:110:0x0156 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x019b A[Catch: Exception -> 0x01d9, TryCatch #2 {Exception -> 0x01d9, blocks: (B:65:0x0195, B:67:0x019b, B:71:0x01b7), top: B:100:0x0195 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x021c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0191 -> B:100:0x0195). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01b3 -> B:71:0x01b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01d5 -> B:81:0x01e6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01d9 -> B:72:0x01c2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 584
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C24801.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((C24801) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    public TransactionEventManager(@NotNull j0 scope, @Nullable BillingClientAdapter billingClientAdapter, @NotNull GetTransactionData getTransactionData, @NotNull GetTransactionRequest getTransactionRequest, @NotNull TransactionEventRepository transactionEventRepository, @NotNull ByteStringDataSource iapTransactionStore, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull IsBillingClientAvailable isBillingClientAvailable, @NotNull SessionRepository sessionRepository, @NotNull ProductDetailsFetcher productDetailsFetcher) {
        kotlin.jvm.internal.p.e(scope, "scope");
        kotlin.jvm.internal.p.e(getTransactionData, "getTransactionData");
        kotlin.jvm.internal.p.e(getTransactionRequest, "getTransactionRequest");
        kotlin.jvm.internal.p.e(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.p.e(iapTransactionStore, "iapTransactionStore");
        kotlin.jvm.internal.p.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.p.e(isBillingClientAvailable, "isBillingClientAvailable");
        kotlin.jvm.internal.p.e(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.p.e(productDetailsFetcher, "productDetailsFetcher");
        this.scope = scope;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        List<? extends PurchaseBridge> list;
        if (billingResult.getResponseCode() != BillingResultResponseCode.OK || (list = purchases) == null || list.isEmpty() || this.billingClientAdapter == null) {
            return;
        }
        k.d(this.scope, null, null, new C24801(purchases, this, transactionOrigin, null), 3, null);
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, null, 62, null);
        } else {
            k.d(this.scope, null, null, new AnonymousClass1(null), 3, null);
        }
    }
}
