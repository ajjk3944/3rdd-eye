package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLegacyConfigStoreDataSource;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "storageManager", "<init>", "(Lcom/unity3d/ads/core/data/manager/StorageManager;)V", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "get", "(Lc9/c;)Ljava/lang/Object;", "Lcom/google/protobuf/ByteString;", "data", "Ly8/s;", "set", "(Lcom/google/protobuf/ByteString;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidLegacyConfigStoreDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidLegacyConfigStoreDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidLegacyConfigStoreDataSource\n+ 2 ByteStringStoreKt.kt\ncom/unity3d/ads/datastore/ByteStringStoreKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n10#2:43\n1#3:44\n*S KotlinDebug\n*F\n+ 1 AndroidLegacyConfigStoreDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidLegacyConfigStoreDataSource\n*L\n26#1:43\n26#1:44\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {

    @NotNull
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";

    @NotNull
    private final StorageManager storageManager;

    public AndroidLegacyConfigStoreDataSource(@NotNull StorageManager storageManager) {
        p.e(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object get(@NotNull c9.c cVar) {
        Object objB;
        Object obj = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(str != null ? ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        ByteString EMPTY = (ByteString) (Result.g(objB) ? null : objB);
        ByteStringStoreKt.Dsl.Companion companion3 = ByteStringStoreKt.Dsl.INSTANCE;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion3._create(builderNewBuilder);
        if (EMPTY == null) {
            EMPTY = ByteString.EMPTY;
            p.d(EMPTY, "EMPTY");
        }
        dsl_create.setData(EMPTY);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object set(@NotNull ByteString byteString, @NotNull c9.c cVar) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return s.f25199a;
    }
}
