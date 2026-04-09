package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.c;
import androidx.datastore.core.d;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.j;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.r1;
import l9.a;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020.H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "()V", "CDN_CREATIVES_HOST", "", "CDN_CREATIVES_PORT", "", "DATA_STORE_GATEWAY_CACHE", "DATA_STORE_GL_INFO", "DATA_STORE_IAP_TRANSACTION", "DATA_STORE_NATIVE_CONFIG", "DATA_STORE_PRIVACY", "DATA_STORE_PRIVACY_FSM", "DATA_STORE_UNIVERSAL_REQUEST", "DATA_STORE_WEBVIEW_CONFIG", "DEFAULT_DISPATCHER", "DEV_CONSENT_PRIVACY_RULES", "GATEWAY_HOST", "GATEWAY_PORT", "HTTP_CACHE_DISK_SIZE", "", "HTTP_CLIENT_FETCH_TIMEOUT", "IO_DISPATCHER", "LEGACY_PRIVACY_RULES", "MAIN_DISPATCHER", "NAMED_AD_REQ", "NAMED_GATEWAY_HTTP_CLIENT", "NAMED_GET_TOKEN_SCOPE", "NAMED_INIT_REQ", "NAMED_INIT_SCOPE", "NAMED_LOAD_SCOPE", "NAMED_LOCAL", "NAMED_OFFERWALL_SCOPE", "NAMED_OMID_SCOPE", "NAMED_OPERATIVE_REQ", "NAMED_OTHER_REQ", "NAMED_PUBLIC_JOB", "NAMED_REMOTE", "NAMED_SCAR_SCOPE", "NAMED_SDK", "NAMED_SHOW_SCOPE", "NAMED_TRANSACTION_SCOPE", "PREF_GL_INFO", "SCAR_SIGNALS_FETCH_TIMEOUT", "SCAR_VERSION_FETCH_TIMEOUT", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", MobileAdsBridgeBase.initializeMethodName, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceProvider implements IServiceProvider {

    @NotNull
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;

    @NotNull
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";

    @NotNull
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";

    @NotNull
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";

    @NotNull
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY = "privacy.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";

    @NotNull
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";

    @NotNull
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";

    @NotNull
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";

    @NotNull
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";

    @NotNull
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;

    @NotNull
    public static final ServiceProvider INSTANCE;

    @NotNull
    public static final String IO_DISPATCHER = "io_dispatcher";

    @NotNull
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";

    @NotNull
    public static final String MAIN_DISPATCHER = "main_dispatcher";

    @NotNull
    public static final String NAMED_AD_REQ = "ad_req";

    @NotNull
    public static final String NAMED_GATEWAY_HTTP_CLIENT = "gateway_http_client";

    @NotNull
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";

    @NotNull
    public static final String NAMED_INIT_REQ = "init_req";

    @NotNull
    public static final String NAMED_INIT_SCOPE = "init_scope";

    @NotNull
    public static final String NAMED_LOAD_SCOPE = "load_scope";

    @NotNull
    public static final String NAMED_LOCAL = "local";

    @NotNull
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";

    @NotNull
    public static final String NAMED_OMID_SCOPE = "omid_scope";

    @NotNull
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";

    @NotNull
    public static final String NAMED_OTHER_REQ = "other_req";

    @NotNull
    public static final String NAMED_PUBLIC_JOB = "public_job";

    @NotNull
    public static final String NAMED_REMOTE = "remote";

    @NotNull
    public static final String NAMED_SCAR_SCOPE = "scar_scope";

    @NotNull
    public static final String NAMED_SDK = "sdk";

    @NotNull
    public static final String NAMED_SHOW_SCOPE = "show_scope";

    @NotNull
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";

    @NotNull
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;

    @NotNull
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new l() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1
            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ServicesRegistry) obj);
                return s.f25199a;
            }

            public final void invoke(@NotNull final ServicesRegistry registry) {
                p.e(registry, "$this$registry");
                final UnityAdsModule unityAdsModule = new UnityAdsModule();
                registry.updateService(new ServiceKey("", t.b(Context.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.1
                    @Override // l9.a
                    public final Context invoke() {
                        return ClientProperties.getApplicationContext();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(CoroutineDispatcher.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.2
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.mainDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.3
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.defaultDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.4
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.ioDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ISDKDispatchers.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.5
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ISDKDispatchers invoke() {
                        return unityAdsModule.sdkDispatchers();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SDKMetricsSender.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.6
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SDKMetricsSender invoke() {
                        return unityAdsModule.sdkMetrics();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.initCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.loadCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.showCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.scarSignalsCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, t.b(j0.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final j0 invoke() {
                        return unityAdsModule.omidCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (g0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class))), (r1) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(r1.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final r1 invoke() {
                        return unityAdsModule.publicApiJob((DiagnosticEventRepository) registry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, t.b(ByteStringDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.16
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return new AndroidLegacyConfigStoreDataSource((StorageManager) registry.resolveService(new ServiceKey("", t.b(StorageManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(d.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final d invoke() {
                        return unityAdsModule.privacyDataStore((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(ByteStringDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.privacyDataStore((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(d.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(d.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final d invoke() {
                        return unityAdsModule.privacyFsmDataStore((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(ByteStringDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.privacyFsmDataStore((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(d.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(d.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.21
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final d invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(ByteStringDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.22
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(d.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(d.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.23
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final d invoke() {
                        return unityAdsModule.glInfoDataStore((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))), (c) registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, t.b(c.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(ByteStringDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.24
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.glInfoDataStore((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(d.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, t.b(d.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.25
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final d invoke() {
                        return unityAdsModule.universalRequestDataStore((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(d.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.26
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final d invoke() {
                        return unityAdsModule.iapTransactionDataStore((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(ByteStringDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.27
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.iapTransactionDataStore((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(d.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, t.b(d.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.28
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final d invoke() {
                        return unityAdsModule.webViewConfigurationDataStore((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AsyncTokenStorage.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.29
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AsyncTokenStorage invoke() {
                        return unityAdsModule.asyncTokenStorage((TokenStorage) registry.resolveService(new ServiceKey("", t.b(TokenStorage.class))), (SDKMetricsSender) registry.resolveService(new ServiceKey("", t.b(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(VolumeChangeMonitor.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.30
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final VolumeChangeMonitor invoke() {
                        return unityAdsModule.volumeChangeMonitor((VolumeChange) registry.resolveService(new ServiceKey("", t.b(VolumeChange.class))));
                    }
                }));
                registry.updateService(new ServiceKey("PUBLIC", t.b(JsonStorage.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.31
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.publicJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("PRIVATE", t.b(JsonStorage.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.32
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.privateJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("MEMORY", t.b(JsonStorage.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.33
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.memoryJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(NativeConfigurationOuterClass.NativeConfiguration.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.34
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                        return unityAdsModule.defaultNativeConfiguration();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(MeasurementsService.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.35
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final MeasurementsService invoke() {
                        return unityAdsModule.measurementService((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TopicsService.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.36
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final TopicsService invoke() {
                        return unityAdsModule.topicsService((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CronetEngineBuilderFactory.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.37
                    @Override // l9.a
                    @NotNull
                    public final CronetEngineBuilderFactory invoke() {
                        return new CronetEngineBuilderFactory();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HttpClientProvider.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.38
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HttpClientProvider invoke() {
                        return new AndroidHttpClientProvider((ConfigFileFromLocalStorage) registry.resolveService(new ServiceKey("", t.b(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) registry.resolveService(new ServiceKey("", t.b(AlternativeFlowReader.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CronetEngineBuilderFactory) registry.resolveService(new ServiceKey("", t.b(CronetEngineBuilderFactory.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CleanupDirectory) registry.resolveService(new ServiceKey("", t.b(CleanupDirectory.class))), (MediationTraitsMetadataReader) registry.resolveService(new ServiceKey("", t.b(MediationTraitsMetadataReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HttpClient.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.39

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Lcom/unity3d/services/core/network/core/HttpClient;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lcom/unity3d/services/core/network/core/HttpClient;"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", i = {}, l = {460}, m = "invokeSuspend", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nServiceProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProvider.kt\ncom/unity3d/services/core/di/ServiceProvider$initialize$1$39$1\n+ 2 ServicesRegistry.kt\ncom/unity3d/services/core/di/ServicesRegistry\n*L\n1#1,1167:1\n57#2,3:1168\n*S KotlinDebug\n*F\n+ 1 ServiceProvider.kt\ncom/unity3d/services/core/di/ServiceProvider$initialize$1$39$1\n*L\n460#1:1168,3\n*E\n"})
                    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1, reason: invalid class name and collision with other inner class name */
                    public static final class C03611 extends SuspendLambda implements l9.p {
                        final /* synthetic */ ServicesRegistry $this_registry;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C03611(ServicesRegistry servicesRegistry, c9.c cVar) {
                            super(2, cVar);
                            this.$this_registry = servicesRegistry;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final c9.c create(@Nullable Object obj, @NotNull c9.c cVar) {
                            return new C03611(this.$this_registry, cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object objF = kotlin.coroutines.intrinsics.a.f();
                            int i10 = this.label;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.b(obj);
                                return obj;
                            }
                            kotlin.c.b(obj);
                            HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", t.b(HttpClientProvider.class)));
                            this.label = 1;
                            Object objInvoke$default = HttpClientProvider.DefaultImpls.invoke$default(httpClientProvider, false, this, 1, null);
                            return objInvoke$default == objF ? objF : objInvoke$default;
                        }

                        @Override // l9.p
                        @Nullable
                        public final Object invoke(@NotNull j0 j0Var, @Nullable c9.c cVar) {
                            return ((C03611) create(j0Var, cVar)).invokeSuspend(s.f25199a);
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HttpClient invoke() {
                        return (HttpClient) j.b(null, new C03611(registry, null), 1, null);
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, t.b(HttpClient.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.40

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Lcom/unity3d/services/core/network/core/HttpClient;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lcom/unity3d/services/core/network/core/HttpClient;"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1", f = "ServiceProvider.kt", i = {}, l = {461}, m = "invokeSuspend", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nServiceProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProvider.kt\ncom/unity3d/services/core/di/ServiceProvider$initialize$1$40$1\n+ 2 ServicesRegistry.kt\ncom/unity3d/services/core/di/ServicesRegistry\n*L\n1#1,1167:1\n57#2,3:1168\n*S KotlinDebug\n*F\n+ 1 ServiceProvider.kt\ncom/unity3d/services/core/di/ServiceProvider$initialize$1$40$1\n*L\n461#1:1168,3\n*E\n"})
                    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1, reason: invalid class name and collision with other inner class name */
                    public static final class C03621 extends SuspendLambda implements l9.p {
                        final /* synthetic */ ServicesRegistry $this_registry;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C03621(ServicesRegistry servicesRegistry, c9.c cVar) {
                            super(2, cVar);
                            this.$this_registry = servicesRegistry;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final c9.c create(@Nullable Object obj, @NotNull c9.c cVar) {
                            return new C03621(this.$this_registry, cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object objF = kotlin.coroutines.intrinsics.a.f();
                            int i10 = this.label;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.b(obj);
                                return obj;
                            }
                            kotlin.c.b(obj);
                            HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", t.b(HttpClientProvider.class)));
                            this.label = 1;
                            Object objInvoke = httpClientProvider.invoke(true, this);
                            return objInvoke == objF ? objF : objInvoke;
                        }

                        @Override // l9.p
                        @Nullable
                        public final Object invoke(@NotNull j0 j0Var, @Nullable c9.c cVar) {
                            return ((C03621) create(j0Var, cVar)).invokeSuspend(s.f25199a);
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HttpClient invoke() {
                        return (HttpClient) j.b(null, new C03621(registry, null), 1, null);
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.41
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final MediationTraitsMetadataReader invoke() {
                        return new MediationTraitsMetadataReader((JsonStorage) registry.resolveService(new ServiceKey("MEMORY", t.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AlternativeFlowReader.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.42
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AlternativeFlowReader invoke() {
                        return new CommonAlternativeFlowReader((ConfigurationReader) registry.resolveService(new ServiceKey("", t.b(ConfigurationReader.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (MediationTraitsMetadataReader) registry.resolveService(new ServiceKey("", t.b(MediationTraitsMetadataReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TcfDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.43
                    @Override // l9.a
                    @NotNull
                    public final TcfDataSource invoke() {
                        return new AndroidTcfDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TcfRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.44
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final TcfRepository invoke() {
                        return new AndroidTcfRepository((TcfDataSource) registry.resolveService(new ServiceKey("", t.b(TcfDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidManifestIntPropertyReader.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.45
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidManifestIntPropertyReader invoke() {
                        return new AndroidManifestIntPropertyReader((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidTestDataInfo.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.46
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidTestDataInfo invoke() {
                        return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) registry.resolveService(new ServiceKey("", t.b(AndroidManifestIntPropertyReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GameServerIdReader.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.47
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GameServerIdReader invoke() {
                        return new GameServerIdReader((JsonStorage) registry.resolveService(new ServiceKey("PUBLIC", t.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(StoreDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.48
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final StoreDataSource invoke() {
                        return new AndroidStoreDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AnalyticsDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.49
                    @Override // l9.a
                    @NotNull
                    public final AnalyticsDataSource invoke() {
                        return new AndroidAnalyticsDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DeveloperConsentDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.50
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final DeveloperConsentDataSource invoke() {
                        return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class))), (JsonStorage) registry.resolveService(new ServiceKey("PUBLIC", t.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DynamicDeviceInfoDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.51
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final DynamicDeviceInfoDataSource invoke() {
                        return new AndroidDynamicDeviceInfoDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (LifecycleDataSource) registry.resolveService(new ServiceKey("", t.b(LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(LegacyUserConsentDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.52
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final LegacyUserConsentDataSource invoke() {
                        return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class))), (JsonStorage) registry.resolveService(new ServiceKey("PRIVATE", t.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(LifecycleDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.53
                    @Override // l9.a
                    @NotNull
                    public final LifecycleDataSource invoke() {
                        return new AndroidLifecycleDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("local", t.b(CacheDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.54
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CacheDataSource invoke() {
                        return new AndroidLocalCacheDataSource((CreateFile) registry.resolveService(new ServiceKey("", t.b(CreateFile.class))), (GetFileExtensionFromUrl) registry.resolveService(new ServiceKey("", t.b(GetFileExtensionFromUrl.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CreateFile.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.55
                    @Override // l9.a
                    @NotNull
                    public final CreateFile invoke() {
                        return new CommonCreateFile();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetFileExtensionFromUrl.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.56
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetFileExtensionFromUrl invoke() {
                        return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) registry.resolveService(new ServiceKey("", t.b(RemoveUrlQuery.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(RemoveUrlQuery.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.57
                    @Override // l9.a
                    @NotNull
                    public final RemoveUrlQuery invoke() {
                        return new AndroidRemoveUrlQuery();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(MediationDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.58
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final MediationDataSource invoke() {
                        return new AndroidMediationDataSource((JsonStorage) registry.resolveService(new ServiceKey("MEMORY", t.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(PrivacyDeviceInfoDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.59
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final PrivacyDeviceInfoDataSource invoke() {
                        return new AndroidPrivacyDeviceInfoDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (FIdDataSource) registry.resolveService(new ServiceKey("", t.b(FIdDataSource.class))), (AndroidAppSetIdDataSource) registry.resolveService(new ServiceKey("", t.b(AndroidAppSetIdDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, t.b(CacheDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.60
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CacheDataSource invoke() {
                        return new AndroidRemoteCacheDataSource((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))), (CreateFile) registry.resolveService(new ServiceKey("", t.b(CreateFile.class))), (GetFileExtensionFromUrl) registry.resolveService(new ServiceKey("", t.b(GetFileExtensionFromUrl.class))), (HttpClient) registry.resolveService(new ServiceKey("", t.b(HttpClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(StaticDeviceInfoDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.61
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final StaticDeviceInfoDataSource invoke() {
                        return new AndroidStaticDeviceInfoDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(ByteStringDataSource.class))), (AnalyticsDataSource) registry.resolveService(new ServiceKey("", t.b(AnalyticsDataSource.class))), (StoreDataSource) registry.resolveService(new ServiceKey("", t.b(StoreDataSource.class))), (UnityBootConfigDataSource) registry.resolveService(new ServiceKey("", t.b(UnityBootConfigDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, t.b(c.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.62
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final c invoke() {
                        return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) registry.resolveService(new ServiceKey("", t.b(GetOpenGLRendererInfo.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(UniversalRequestDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.63
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final UniversalRequestDataSource invoke() {
                        return new UniversalRequestDataSource((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, t.b(d.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(WebviewConfigurationDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.64
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final WebviewConfigurationDataSource invoke() {
                        return new WebviewConfigurationDataSource((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, t.b(d.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OmidManager.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.65
                    @Override // l9.a
                    @NotNull
                    public final OmidManager invoke() {
                        return new AndroidOmidManager();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SDKPropertiesManager.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.66
                    @Override // l9.a
                    @NotNull
                    public final SDKPropertiesManager invoke() {
                        return new AndroidSDKPropertiesManager();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(StorageManager.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.67
                    @Override // l9.a
                    @NotNull
                    public final StorageManager invoke() {
                        return new AndroidStorageManager();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(BillingClientAdapter.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.68
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @Nullable
                    public final BillingClientAdapter invoke() {
                        return new BillingClientAdapterFactory().createBillingClientAdapter((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ProductDetailsFetcher.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.69
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ProductDetailsFetcher invoke() {
                        return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) registry.resolveService(new ServiceKey("", t.b(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) registry.resolveService(new ServiceKey("", t.b(BillingClientAdapter.class))), "subs"));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TransactionEventManager.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.70
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final TransactionEventManager invoke() {
                        return new TransactionEventManager((j0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, t.b(j0.class))), (BillingClientAdapter) registry.resolveService(new ServiceKey("", t.b(BillingClientAdapter.class))), (GetTransactionData) registry.resolveService(new ServiceKey("", t.b(GetTransactionData.class))), (GetTransactionRequest) registry.resolveService(new ServiceKey("", t.b(GetTransactionRequest.class))), (TransactionEventRepository) registry.resolveService(new ServiceKey("", t.b(TransactionEventRepository.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(ByteStringDataSource.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (IsBillingClientAvailable) registry.resolveService(new ServiceKey("", t.b(IsBillingClientAvailable.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (ProductDetailsFetcher) registry.resolveService(new ServiceKey("", t.b(ProductDetailsFetcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AdRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.71
                    @Override // l9.a
                    @NotNull
                    public final AdRepository invoke() {
                        return new AndroidAdRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CacheRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.72
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CacheRepository invoke() {
                        return new AndroidCacheRepository((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))), (GetCacheDirectory) registry.resolveService(new ServiceKey("", t.b(GetCacheDirectory.class))), (CacheDataSource) registry.resolveService(new ServiceKey("local", t.b(CacheDataSource.class))), (CacheDataSource) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, t.b(CacheDataSource.class))), (Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CleanupDirectory) registry.resolveService(new ServiceKey("", t.b(CleanupDirectory.class))), (DownloadPriorityQueue) registry.resolveService(new ServiceKey("", t.b(DownloadPriorityQueue.class))), (CreateFile) registry.resolveService(new ServiceKey("", t.b(CreateFile.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetCacheDirectory.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.73
                    @Override // l9.a
                    @NotNull
                    public final GetCacheDirectory invoke() {
                        return new CommonGetCacheDirectory();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CampaignRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.74
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CampaignRepository invoke() {
                        return new AndroidCampaignRepository((GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DeveloperConsentRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.75
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final DeveloperConsentRepository invoke() {
                        return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) registry.resolveService(new ServiceKey("", t.b(DeveloperConsentDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DeviceInfoRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.76
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final DeviceInfoRepository invoke() {
                        return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) registry.resolveService(new ServiceKey("", t.b(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) registry.resolveService(new ServiceKey("", t.b(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) registry.resolveService(new ServiceKey("", t.b(PrivacyDeviceInfoDataSource.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DiagnosticEventRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.77
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final DiagnosticEventRepository invoke() {
                        return new AndroidDiagnosticEventRepository((CoroutineTimer) registry.resolveService(new ServiceKey("", t.b(CoroutineTimer.class))), (GetDiagnosticEventRequest) registry.resolveService(new ServiceKey("", t.b(GetDiagnosticEventRequest.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(LegacyUserConsentRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.78
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final LegacyUserConsentRepository invoke() {
                        return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) registry.resolveService(new ServiceKey("", t.b(LegacyUserConsentDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(MediationRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.79
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final MediationRepository invoke() {
                        return new AndroidMediationRepository((MediationDataSource) registry.resolveService(new ServiceKey("", t.b(MediationDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OpenMeasurementRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.80
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final OpenMeasurementRepository invoke() {
                        return new AndroidOpenMeasurementRepository((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(CoroutineDispatcher.class))), (OmidManager) registry.resolveService(new ServiceKey("", t.b(OmidManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SessionRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.81
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SessionRepository invoke() {
                        return new AndroidSessionRepository((ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, t.b(ByteStringDataSource.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(ByteStringDataSource.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(ByteStringDataSource.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) registry.resolveService(new ServiceKey("", t.b(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) registry.resolveService(new ServiceKey("", t.b(NativeConfigurationOuterClass.NativeConfiguration.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TransactionEventRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.82
                    @Override // l9.a
                    @NotNull
                    public final TransactionEventRepository invoke() {
                        return new AndroidTransactionEventRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OperativeEventRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.83
                    @Override // l9.a
                    @NotNull
                    public final OperativeEventRepository invoke() {
                        return new OperativeEventRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ExecuteAdViewerRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.84
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ExecuteAdViewerRequest invoke() {
                        return new AndroidExecuteAdViewerRequest((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))), (HttpClient) registry.resolveService(new ServiceKey("", t.b(HttpClient.class))), (GetCachedAsset) registry.resolveService(new ServiceKey("", t.b(GetCachedAsset.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetByteStringId.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.85
                    @Override // l9.a
                    @NotNull
                    public final GetByteStringId invoke() {
                        return new AndroidGenerateByteStringId();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleOpenUrl.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.86
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HandleOpenUrl invoke() {
                        return new AndroidHandleOpenUrl((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(Refresh.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.87
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final Refresh invoke() {
                        return new AndroidRefresh((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (GetAdDataRefreshRequest) registry.resolveService(new ServiceKey("", t.b(GetAdDataRefreshRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SendDiagnosticEvent.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.88
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SendDiagnosticEvent invoke() {
                        return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) registry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) registry.resolveService(new ServiceKey("", t.b(GetDiagnosticEventRequest.class))), (LifecycleDataSource) registry.resolveService(new ServiceKey("", t.b(LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SendWebViewClientErrorDiagnostics.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.89
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SendWebViewClientErrorDiagnostics invoke() {
                        return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(Show.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.90
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final Show invoke() {
                        return new AndroidShow((AdRepository) registry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (GameServerIdReader) registry.resolveService(new ServiceKey("", t.b(GameServerIdReader.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CacheFile.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.91
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CacheFile invoke() {
                        return new CommonCacheFile((CacheRepository) registry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CleanAssets.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.92
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CleanAssets invoke() {
                        return new CommonCleanAssets((CacheRepository) registry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetAdObject.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.93
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetAdObject invoke() {
                        return new CommonGetAdObject((AdRepository) registry.resolveService(new ServiceKey("", t.b(AdRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.94
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetHeaderBiddingToken invoke() {
                        return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) registry.resolveService(new ServiceKey("", t.b(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) registry.resolveService(new ServiceKey("", t.b(FetchSignalsAndSendUseCase.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.95
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final BuildHeaderBiddingToken invoke() {
                        return new AndroidBuildHeaderBiddingToken((GetByteStringId) registry.resolveService(new ServiceKey("", t.b(GetByteStringId.class))), (GetClientInfo) registry.resolveService(new ServiceKey("", t.b(GetClientInfo.class))), (GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) registry.resolveService(new ServiceKey("", t.b(GetLimitedSessionToken.class))), (GetInitializationData) registry.resolveService(new ServiceKey("", t.b(GetInitializationData.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))), (TcfRepository) registry.resolveService(new ServiceKey("", t.b(TcfRepository.class))), (AndroidTestDataInfo) registry.resolveService(new ServiceKey("", t.b(AndroidTestDataInfo.class))), (OfferwallManager) registry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.96
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final TokenNumberProvider invoke() {
                        return new CommonTokenNumberProvider((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetInitializationData.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.97
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetInitializationData invoke() {
                        return new AndroidGetInitializationData((GetInitializationRequestPayload) registry.resolveService(new ServiceKey("", t.b(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestSharedData.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.98
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final MediationInitBlobMetadataReader invoke() {
                        return new MediationInitBlobMetadataReader((JsonStorage) registry.resolveService(new ServiceKey("MEMORY", t.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetInitializationRequestPayload.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.99
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetInitializationRequestPayload invoke() {
                        return new AndroidGetInitializationRequestPayload((GetClientInfo) registry.resolveService(new ServiceKey("", t.b(GetClientInfo.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (LegacyUserConsentRepository) registry.resolveService(new ServiceKey("", t.b(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) registry.resolveService(new ServiceKey("", t.b(MediationInitBlobMetadataReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetInitializationState.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.100
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetInitializationState invoke() {
                        return new CommonGetInitializationState((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SDKPropertiesManager) registry.resolveService(new ServiceKey("", t.b(SDKPropertiesManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetIsFileCache.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.101
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetIsFileCache invoke() {
                        return new CommonGetIsFileCache((CacheRepository) registry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SetInitializationState.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.102
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SetInitializationState invoke() {
                        return new CommonSetInitializationState((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SDKPropertiesManager) registry.resolveService(new ServiceKey("", t.b(SDKPropertiesManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, t.b(GetRequestPolicy.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.103
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new AndroidGetAdRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetAdDataRefreshRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.104
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetAdDataRefreshRequest invoke() {
                        return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetAdPlayerConfigRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.105
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetAdPlayerConfigRequest invoke() {
                        return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidGetAdPlayerContext.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.106
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidGetAdPlayerContext invoke() {
                        return new AndroidGetAdPlayerContext((DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetAdRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.107
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetAdRequest invoke() {
                        return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))), (WebviewConfigurationDataSource) registry.resolveService(new ServiceKey("", t.b(WebviewConfigurationDataSource.class))), (TcfRepository) registry.resolveService(new ServiceKey("", t.b(TcfRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetHbTokenEventRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.108
                    @Override // l9.a
                    @NotNull
                    public final GetHbTokenEventRequest invoke() {
                        return new GetAndroidTokenEventRequest();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CommonScarEventReceiver.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.109
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CommonScarEventReceiver invoke() {
                        return new CommonScarEventReceiver((j0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, t.b(j0.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GMAScarAdapterBridge.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.110
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GMAScarAdapterBridge invoke() {
                        GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) registry.resolveService(new ServiceKey("", t.b(CommonScarEventReceiver.class))))).getBridge();
                        p.d(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                        return bridge;
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ScarTimeHackFixer.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.111
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ScarTimeHackFixer invoke() {
                        return new ScarTimeHackFixer((SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ScarManager.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.112
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ScarManager invoke() {
                        return new AndroidScarManager((CommonScarEventReceiver) registry.resolveService(new ServiceKey("", t.b(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) registry.resolveService(new ServiceKey("", t.b(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) registry.resolveService(new ServiceKey("", t.b(ScarTimeHackFixer.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(FetchSignalsAndSendUseCase.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.113
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final FetchSignalsAndSendUseCase invoke() {
                        return new AndroidFetchSignalsAndSendUseCase((j0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, t.b(j0.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (ScarManager) registry.resolveService(new ServiceKey("", t.b(ScarManager.class))), (HandleGetTokenRequest) registry.resolveService(new ServiceKey("", t.b(HandleGetTokenRequest.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(LoadScarAd.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.114
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final LoadScarAd invoke() {
                        return new LoadScarAd((ScarManager) registry.resolveService(new ServiceKey("", t.b(ScarManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleGetTokenRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.115
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HandleGetTokenRequest invoke() {
                        return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) registry.resolveService(new ServiceKey("", t.b(GetHbTokenEventRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetClientInfo.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.116
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetClientInfo invoke() {
                        return new AndroidGetClientInfo((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (MediationRepository) registry.resolveService(new ServiceKey("", t.b(MediationRepository.class))), (OmidManager) registry.resolveService(new ServiceKey("", t.b(OmidManager.class))), (ScarManager) registry.resolveService(new ServiceKey("", t.b(ScarManager.class))), (OfferwallManager) registry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))), (FIdExistenceDataSource) registry.resolveService(new ServiceKey("", t.b(FIdExistenceDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetInitializationCompletedRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.117
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetInitializationCompletedRequest invoke() {
                        return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetInitializationRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.118
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetInitializationRequest invoke() {
                        return new AndroidGetInitializationRequest((GetInitializationRequestPayload) registry.resolveService(new ServiceKey("", t.b(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetLimitedSessionToken.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.119
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetLimitedSessionToken invoke() {
                        return new AndroidGetLimitedSessionToken((DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (MediationRepository) registry.resolveService(new ServiceKey("", t.b(MediationRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetOpenGLRendererInfo.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.120
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetOpenGLRendererInfo invoke() {
                        return new AndroidGetOpenGLRendererInfo((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetSharedDataTimestamps.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.121
                    @Override // l9.a
                    @NotNull
                    public final GetSharedDataTimestamps invoke() {
                        return new AndroidGetSharedDataTimestamps();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.122
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetUniversalRequestForPayLoad invoke() {
                        return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestSharedData.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetUniversalRequestSharedData.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.123
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetUniversalRequestSharedData invoke() {
                        return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (GetLimitedSessionToken) registry.resolveService(new ServiceKey("", t.b(GetLimitedSessionToken.class))), (DeveloperConsentRepository) registry.resolveService(new ServiceKey("", t.b(DeveloperConsentRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetCachedAsset.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.124
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetCachedAsset invoke() {
                        return new GetCachedAsset((CacheRepository) registry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (CacheWebViewAssets) registry.resolveService(new ServiceKey("", t.b(CacheWebViewAssets.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetWebViewBridgeUseCase.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.125
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetWebViewBridgeUseCase invoke() {
                        return new CommonGetWebViewBridgeUseCase((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, t.b(GetRequestPolicy.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.126
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetInitRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetLatestWebViewConfiguration.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.127
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetLatestWebViewConfiguration invoke() {
                        return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) registry.resolveService(new ServiceKey("", t.b(WebviewConfigurationDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, t.b(GetRequestPolicy.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.128
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetOperativeEventRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.129
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetOtherRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetPrivacyUpdateRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.130
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetPrivacyUpdateRequest invoke() {
                        return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleGatewayInitializationResponse.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.131
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HandleGatewayInitializationResponse invoke() {
                        return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) registry.resolveService(new ServiceKey("", t.b(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) registry.resolveService(new ServiceKey("", t.b(TriggerInitializationCompletedRequest.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (j0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, t.b(j0.class))), (HandleDebugSettings) registry.resolveService(new ServiceKey("", t.b(HandleDebugSettings.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleGatewayUniversalResponse.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.132
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HandleGatewayUniversalResponse invoke() {
                        return new AndroidHandleGatewayUniversalResponse((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) registry.resolveService(new ServiceKey("", t.b(AndroidAppSetIdDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeBoldSDK.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.133
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeBoldSDK invoke() {
                        return new AndroidInitializeBoldSDK((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (InitializeOMSDK) registry.resolveService(new ServiceKey("", t.b(InitializeOMSDK.class))), (GetInitializationRequest) registry.resolveService(new ServiceKey("", t.b(GetInitializationRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, t.b(GetRequestPolicy.class))), (CleanAssets) registry.resolveService(new ServiceKey("", t.b(CleanAssets.class))), (HandleGatewayInitializationResponse) registry.resolveService(new ServiceKey("", t.b(HandleGatewayInitializationResponse.class))), (GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (EventObservers) registry.resolveService(new ServiceKey("", t.b(EventObservers.class))), (TriggerInitializeListener) registry.resolveService(new ServiceKey("", t.b(TriggerInitializeListener.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (DiagnosticEventRepository) registry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))), (StorageManager) registry.resolveService(new ServiceKey("", t.b(StorageManager.class))), (ConfigurationReader) registry.resolveService(new ServiceKey("", t.b(ConfigurationReader.class))), (SDKPropertiesManager) registry.resolveService(new ServiceKey("", t.b(SDKPropertiesManager.class))), (GetGameId) registry.resolveService(new ServiceKey("", t.b(GetGameId.class))), (AndroidHandleFocusCounters) registry.resolveService(new ServiceKey("", t.b(AndroidHandleFocusCounters.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.134
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final LegacyShowUseCase invoke() {
                        return new LegacyShowUseCase((Show) registry.resolveService(new ServiceKey("", t.b(Show.class))), (AdRepository) registry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) registry.resolveService(new ServiceKey("", t.b(GetOperativeEventApi.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SafeCallbackInvoke) registry.resolveService(new ServiceKey("", t.b(SafeCallbackInvoke.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SendPrivacyUpdateRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.135
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SendPrivacyUpdateRequest invoke() {
                        return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) registry.resolveService(new ServiceKey("", t.b(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TriggerInitializationCompletedRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.136
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final TriggerInitializationCompletedRequest invoke() {
                        return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) registry.resolveService(new ServiceKey("", t.b(GetInitializationCompletedRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TriggerInitializeListener.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.137
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final TriggerInitializeListener invoke() {
                        return new TriggerInitializeListener((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DiagnosticEventObserver.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.138
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final DiagnosticEventObserver invoke() {
                        return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) registry.resolveService(new ServiceKey("", t.b(GetDiagnosticEventBatchRequest.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (DiagnosticEventRepository) registry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))), (UniversalRequestDataSource) registry.resolveService(new ServiceKey("", t.b(UniversalRequestDataSource.class))), (BackgroundWorker) registry.resolveService(new ServiceKey("", t.b(BackgroundWorker.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(EventObservers.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.139
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final EventObservers invoke() {
                        return new EventObservers((OperativeEventObserver) registry.resolveService(new ServiceKey("", t.b(OperativeEventObserver.class))), (DiagnosticEventObserver) registry.resolveService(new ServiceKey("", t.b(DiagnosticEventObserver.class))), (TransactionEventObserver) registry.resolveService(new ServiceKey("", t.b(TransactionEventObserver.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetTransactionData.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.140
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetTransactionData invoke() {
                        return new AndroidGetTransactionData((GetByteStringId) registry.resolveService(new ServiceKey("", t.b(GetByteStringId.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetTransactionRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.141
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetTransactionRequest invoke() {
                        return new CommonGetTransactionRequest((DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetDiagnosticEventBatchRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.142
                    @Override // l9.a
                    @NotNull
                    public final GetDiagnosticEventBatchRequest invoke() {
                        return new GetDiagnosticEventBatchRequest();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetDiagnosticEventRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.143
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetDiagnosticEventRequest invoke() {
                        return new GetDiagnosticEventRequest((GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetOperativeEventApi.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.144
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetOperativeEventApi invoke() {
                        return new GetOperativeEventApi((OperativeEventRepository) registry.resolveService(new ServiceKey("", t.b(OperativeEventRepository.class))), (GetOperativeEventRequest) registry.resolveService(new ServiceKey("", t.b(GetOperativeEventRequest.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetOperativeEventRequest.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.145
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetOperativeEventRequest invoke() {
                        return new GetOperativeEventRequest((GetByteStringId) registry.resolveService(new ServiceKey("", t.b(GetByteStringId.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleGatewayEventResponse.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.146
                    @Override // l9.a
                    @NotNull
                    public final HandleGatewayEventResponse invoke() {
                        return new AndroidHandleGatewayEventResponse();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OperativeEventObserver.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.147
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final OperativeEventObserver invoke() {
                        return new OperativeEventObserver((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (OperativeEventRepository) registry.resolveService(new ServiceKey("", t.b(OperativeEventRepository.class))), (UniversalRequestDataSource) registry.resolveService(new ServiceKey("", t.b(UniversalRequestDataSource.class))), (BackgroundWorker) registry.resolveService(new ServiceKey("", t.b(BackgroundWorker.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TransactionEventObserver.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.148
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final TransactionEventObserver invoke() {
                        return new TransactionEventObserver((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (TransactionEventRepository) registry.resolveService(new ServiceKey("", t.b(TransactionEventRepository.class))), (GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(ByteStringDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(UniversalRequestTtlValidator.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.149
                    @Override // l9.a
                    @NotNull
                    public final UniversalRequestTtlValidator invoke() {
                        return new CommonUniversalRequestTtlValidator();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(UniversalRequestEventSender.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.150
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final UniversalRequestEventSender invoke() {
                        return new UniversalRequestEventSender((GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (HandleGatewayEventResponse) registry.resolveService(new ServiceKey("", t.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) registry.resolveService(new ServiceKey("", t.b(UniversalRequestTtlValidator.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OmFinishSession.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.151
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final OmFinishSession invoke() {
                        return new AndroidOmFinishSession((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OmImpressionOccurred.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.152
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final OmImpressionOccurred invoke() {
                        return new AndroidOmImpressionOccurred((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidOmInteraction.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.153
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidOmInteraction invoke() {
                        return new AndroidOmStartSession((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetOmData.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.154
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetOmData invoke() {
                        return new CommonGetOmData((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(IsOMActivated.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.155
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final IsOMActivated invoke() {
                        return new CommonIsOMActivated((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeOMSDK.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.156
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeOMSDK invoke() {
                        return new AndroidInitializeOMSDK((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (OpenMeasurementRepository) registry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.157
                    @Override // l9.a
                    @NotNull
                    public final FlattenerRulesUseCase invoke() {
                        return new DeveloperConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.158
                    @Override // l9.a
                    @NotNull
                    public final FlattenerRulesUseCase invoke() {
                        return new LegacyUserConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(BackgroundWorker.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.159
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final BackgroundWorker invoke() {
                        return new BackgroundWorker((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DiagnosticEventRequestWorkModifier.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.160
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final DiagnosticEventRequestWorkModifier invoke() {
                        return new DiagnosticEventRequestWorkModifier((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GatewayClient.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.161
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GatewayClient invoke() {
                        return new CommonGatewayClient((HttpClient) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, t.b(HttpClient.class))), (HandleGatewayUniversalResponse) registry.resolveService(new ServiceKey("", t.b(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, t.b(g0.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.162
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final g0 invoke() {
                        return new SDKErrorHandler((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(CoroutineDispatcher.class))), (AlternativeFlowReader) registry.resolveService(new ServiceKey("", t.b(AlternativeFlowReader.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (SDKMetricsSender) registry.resolveService(new ServiceKey("", t.b(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(TokenStorage.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.163
                    @Override // l9.a
                    @NotNull
                    public final TokenStorage invoke() {
                        return new InMemoryTokenStorage();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(VolumeChange.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.164
                    @Override // l9.a
                    @NotNull
                    public final VolumeChange invoke() {
                        return new VolumeChangeContentObserver();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ConfigFileFromLocalStorage.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.165
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ConfigFileFromLocalStorage invoke() {
                        return new ConfigFileFromLocalStorage((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeSDK.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.166
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeSDK invoke() {
                        return new InitializeSDK((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) registry.resolveService(new ServiceKey("", t.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) registry.resolveService(new ServiceKey("", t.b(InitializeStateReset.class))), (InitializeStateError) registry.resolveService(new ServiceKey("", t.b(InitializeStateError.class))), (InitializeStateConfig) registry.resolveService(new ServiceKey("", t.b(InitializeStateConfig.class))), (InitializeStateCreate) registry.resolveService(new ServiceKey("", t.b(InitializeStateCreate.class))), (InitializeStateLoadCache) registry.resolveService(new ServiceKey("", t.b(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) registry.resolveService(new ServiceKey("", t.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) registry.resolveService(new ServiceKey("", t.b(InitializeStateComplete.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateComplete.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.167
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateComplete invoke() {
                        return new InitializeStateComplete((d) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(d.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateConfig.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.168
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateConfig invoke() {
                        return new InitializeStateConfig((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) registry.resolveService(new ServiceKey("", t.b(InitializeStateConfigWithLoader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateConfigWithLoader.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.169
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateConfigWithLoader invoke() {
                        return new InitializeStateConfigWithLoader((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (InitializeStateNetworkError) registry.resolveService(new ServiceKey("", t.b(InitializeStateNetworkError.class))), (TokenStorage) registry.resolveService(new ServiceKey("", t.b(TokenStorage.class))), (SDKMetricsSender) registry.resolveService(new ServiceKey("", t.b(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateCreate.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.170
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateCreate invoke() {
                        return new InitializeStateCreate((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateError.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.171
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateError invoke() {
                        return new InitializeStateError((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateLoadCache.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.172
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateLoadCache invoke() {
                        return new InitializeStateLoadCache((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateLoadWeb.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.173
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateLoadWeb invoke() {
                        return new InitializeStateLoadWeb((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (InitializeStateNetworkError) registry.resolveService(new ServiceKey("", t.b(InitializeStateNetworkError.class))), (HttpClient) registry.resolveService(new ServiceKey("", t.b(HttpClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateReset.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.174
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateReset invoke() {
                        return new InitializeStateReset((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(StoreMonitor.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.175
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final StoreMonitor invoke() {
                        return new StoreMonitor((StoreExceptionHandler) registry.resolveService(new ServiceKey("", t.b(StoreExceptionHandler.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(StoreWebViewEventSender.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.176
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final StoreWebViewEventSender invoke() {
                        return new StoreWebViewEventSender((IEventSender) registry.resolveService(new ServiceKey("", t.b(IEventSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(StoreExceptionHandler.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.177
                    @Override // l9.a
                    @NotNull
                    public final StoreExceptionHandler invoke() {
                        return new GatewayStoreExceptionHandler();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(StoreEventListenerFactory.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.178
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final StoreEventListenerFactory invoke() {
                        return new StoreEventListenerFactory((StoreWebViewEventSender) registry.resolveService(new ServiceKey("", t.b(StoreWebViewEventSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ConfigurationReader.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.179
                    @Override // l9.a
                    @NotNull
                    public final ConfigurationReader invoke() {
                        return new ConfigurationReader();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidAttribution.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.180
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidAttribution invoke() {
                        return new AndroidAttribution((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.181
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AdPlayerScope invoke() {
                        return new AdPlayerScope((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.182
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidWebViewClient invoke() {
                        return new AndroidWebViewClient((GetCachedAsset) registry.resolveService(new ServiceKey("", t.b(GetCachedAsset.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.183
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidGetWebViewContainerUseCase invoke() {
                        return new AndroidGetWebViewContainerUseCase((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))), (AndroidWebViewClient) registry.resolveService(new ServiceKey("", t.b(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) registry.resolveService(new ServiceKey("", t.b(SendWebViewClientErrorDiagnostics.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(CoroutineDispatcher.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(Load.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.184
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final Load invoke() {
                        return new AndroidLoad((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (GetAdRequest) registry.resolveService(new ServiceKey("", t.b(GetAdRequest.class))), (GetAdPlayerConfigRequest) registry.resolveService(new ServiceKey("", t.b(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, t.b(GetRequestPolicy.class))), (HandleGatewayAdResponse) registry.resolveService(new ServiceKey("", t.b(HandleGatewayAdResponse.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (GatewayClient) registry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (AdRepository) registry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.185
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AwaitInitialization invoke() {
                        return new CommonAwaitInitialization((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.186
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetAsyncHeaderBiddingToken invoke() {
                        return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) registry.resolveService(new ServiceKey("", t.b(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (AwaitInitialization) registry.resolveService(new ServiceKey("", t.b(AwaitInitialization.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SafeCallbackInvoke) registry.resolveService(new ServiceKey("", t.b(SafeCallbackInvoke.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.187
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetAdPlayer invoke() {
                        return new CommonGetAdPlayer((DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), (j0) registry.resolveService(new ServiceKey("", t.b(AdPlayerScope.class))), (OpenMeasurementRepository) registry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (ScarManager) registry.resolveService(new ServiceKey("", t.b(ScarManager.class))), (OfferwallManager) registry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))), (AdRepository) registry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (LifecycleDataSource) registry.resolveService(new ServiceKey("", t.b(LifecycleDataSource.class))), (OrientationRepository) registry.resolveService(new ServiceKey("", t.b(OrientationRepository.class))), (Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CacheWebViewAssets.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.188
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CacheWebViewAssets invoke() {
                        return new AndroidCacheWebViewAssets((CacheRepository) registry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.189
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final HandleGatewayAdResponse invoke() {
                        return new AndroidHandleGatewayAdResponse((AdRepository) registry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (AndroidGetWebViewContainerUseCase) registry.resolveService(new ServiceKey("", t.b(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) registry.resolveService(new ServiceKey("", t.b(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) registry.resolveService(new ServiceKey("", t.b(HandleInvocationsFromAdViewer.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) registry.resolveService(new ServiceKey("", t.b(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) registry.resolveService(new ServiceKey("", t.b(GetLatestWebViewConfiguration.class))), (AdPlayerScope) registry.resolveService(new ServiceKey("", t.b(AdPlayerScope.class))), (GetAdPlayer) registry.resolveService(new ServiceKey("", t.b(GetAdPlayer.class))), (CacheWebViewAssets) registry.resolveService(new ServiceKey("", t.b(CacheWebViewAssets.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.190
                    @Override // l9.a
                    @NotNull
                    public final HandleInvocationsFromAdViewer invoke() {
                        return new HandleInvocationsFromAdViewer();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.191
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final LegacyLoadUseCase invoke() {
                        return new LegacyLoadUseCase((Load) registry.resolveService(new ServiceKey("", t.b(Load.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (AwaitInitialization) registry.resolveService(new ServiceKey("", t.b(AwaitInitialization.class))), (SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (AdRepository) registry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (SafeCallbackInvoke) registry.resolveService(new ServiceKey("", t.b(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) registry.resolveService(new ServiceKey("", t.b(CleanUpWhenOpportunityExpires.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SafeCallbackInvoke.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.192
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SafeCallbackInvoke invoke() {
                        return new CommonSafeCallbackInvoke((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.193
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final InitializeStateNetworkError invoke() {
                        return new InitializeStateNetworkError((ISDKDispatchers) registry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.194
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CoroutineTimer invoke() {
                        return new CommonCoroutineTimer((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(IEventSender.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.195
                    @Override // l9.a
                    @NotNull
                    public final IEventSender invoke() {
                        return SharedInstances.INSTANCE.getWebViewEventSender();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(SetGameId.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.196
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final SetGameId invoke() {
                        return new CommonSetGameId((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetGameId.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.197
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetGameId invoke() {
                        return new CommonGetGameId((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ValidateGameId.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.198
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ValidateGameId invoke() {
                        return new CommonValidateGameId((GetGameId) registry.resolveService(new ServiceKey("", t.b(GetGameId.class))), (SetGameId) registry.resolveService(new ServiceKey("", t.b(SetGameId.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(ShouldAllowInitialization.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.199
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final ShouldAllowInitialization invoke() {
                        return new CommonShouldAllowInitialization((AlternativeFlowReader) registry.resolveService(new ServiceKey("", t.b(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) registry.resolveService(new ServiceKey("", t.b(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (SetInitializationState) registry.resolveService(new ServiceKey("", t.b(SetInitializationState.class))), (ValidateGameId) registry.resolveService(new ServiceKey("", t.b(ValidateGameId.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CheckForGameIdAndTestModeChanges.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.200
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CheckForGameIdAndTestModeChanges invoke() {
                        return new CommonCheckForGameIdAndTestModeChanges((GetGameId) registry.resolveService(new ServiceKey("", t.b(GetGameId.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(DownloadPriorityQueue.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.201
                    @Override // l9.a
                    @NotNull
                    public final DownloadPriorityQueue invoke() {
                        return new DownloadPriorityQueue();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CleanupDirectory.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.202
                    @Override // l9.a
                    @NotNull
                    public final CleanupDirectory invoke() {
                        return new CleanupDirectory();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(FocusRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.203
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final FocusRepository invoke() {
                        return new FocusRepository((AndroidGetLifecycleFlow) registry.resolveService(new ServiceKey("", t.b(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidGetIsAdActivity.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.204
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidGetIsAdActivity invoke() {
                        return new AndroidGetIsAdActivity((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidGetLifecycleFlow.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.205
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidGetLifecycleFlow invoke() {
                        return new AndroidGetLifecycleFlow((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidHandleFocusCounters.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.206
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidHandleFocusCounters invoke() {
                        return new AndroidHandleFocusCounters((SessionRepository) registry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (FocusRepository) registry.resolveService(new ServiceKey("", t.b(FocusRepository.class))), (AndroidGetIsAdActivity) registry.resolveService(new ServiceKey("", t.b(AndroidGetIsAdActivity.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))), null, 16, null);
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OfferwallAdapterBridge.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.207
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final OfferwallAdapterBridge invoke() {
                        return new OfferwallAdapterBridge((j0) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, t.b(j0.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OfferwallManager.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.208
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final OfferwallManager invoke() {
                        return new AndroidOfferwallManager((OfferwallAdapterBridge) registry.resolveService(new ServiceKey("", t.b(OfferwallAdapterBridge.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(LoadOfferwallAd.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.209
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final LoadOfferwallAd invoke() {
                        return new LoadOfferwallAd((OfferwallManager) registry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(GetIsOfferwallAdReady.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.210
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final GetIsOfferwallAdReady invoke() {
                        return new GetIsOfferwallAdReady((OfferwallManager) registry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(FIdDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.211
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final FIdDataSource invoke() {
                        return new AndroidFIdDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(FIdExistenceDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.212
                    @Override // l9.a
                    @NotNull
                    public final FIdExistenceDataSource invoke() {
                        return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(CleanUpWhenOpportunityExpires.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.213
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final CleanUpWhenOpportunityExpires invoke() {
                        return new CleanUpWhenOpportunityExpires((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(OrientationRepository.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.214
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final OrientationRepository invoke() {
                        return new OrientationRepository((AndroidGetLifecycleFlow) registry.resolveService(new ServiceKey("", t.b(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidAppSetIdDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.215
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidAppSetIdDataSource invoke() {
                        return new AndroidAppSetIdDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(AndroidUnityInfoDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.216
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final AndroidUnityInfoDataSource invoke() {
                        return new AndroidUnityInfoDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(HandleDebugSettings.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.217
                    @Override // l9.a
                    @NotNull
                    public final HandleDebugSettings invoke() {
                        return new HandleDebugSettings();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(Logger.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.218
                    @Override // l9.a
                    @NotNull
                    public final Logger invoke() {
                        return new UnityLogger();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(IsBillingClientAvailable.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.219
                    @Override // l9.a
                    @NotNull
                    public final IsBillingClientAvailable invoke() {
                        return new IsBillingClientAvailable();
                    }
                }));
                registry.updateService(new ServiceKey("", t.b(UnityBootConfigDataSource.class)), b.b(new a() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.220
                    {
                        super(0);
                    }

                    @Override // l9.a
                    @NotNull
                    public final UnityBootConfigDataSource invoke() {
                        return new AndroidUnityBootConfigDataSource((Context) registry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
            }
        });
    }
}
