package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.i5;
import com.applovin.impl.o7;
import com.applovin.impl.q4;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final File f5455b = new File(k.o().getFilesDir(), "al/persisted-ads");

    /* renamed from: a, reason: collision with root package name */
    private final k f5456a;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a implements q4 {

        /* renamed from: a, reason: collision with root package name */
        private final String f5457a;

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdType f5458b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5459c;

        /* renamed from: d, reason: collision with root package name */
        private final long f5460d;

        /* renamed from: e, reason: collision with root package name */
        private final long f5461e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z3, long j, long j8) {
            this.f5457a = str;
            this.f5458b = appLovinAdType;
            this.f5459c = z3;
            this.f5460d = j;
            this.f5461e = j8;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f5461e;
        }

        public long c() {
            return this.f5460d;
        }

        public String d() {
            return this.f5457a + "_" + this.f5458b;
        }

        public String e() {
            return this.f5457a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            if (strE != null ? !strE.equals(strE2) : strE2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeF = f();
            AppLovinAdType appLovinAdTypeF2 = aVar.f();
            return appLovinAdTypeF != null ? appLovinAdTypeF.equals(appLovinAdTypeF2) : appLovinAdTypeF2 == null;
        }

        public AppLovinAdType f() {
            return this.f5458b;
        }

        public boolean g() {
            return this.f5459c;
        }

        public int hashCode() {
            String strE = e();
            int iHashCode = strE == null ? 43 : strE.hashCode();
            AppLovinAdType appLovinAdTypeF = f();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeF != null ? appLovinAdTypeF.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j, long j8) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j, j8);
        }

        public static a a(JSONObject jSONObject, k kVar) {
            String string = JsonUtils.getString(jSONObject, FacebookMediationAdapter.KEY_ID, "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j8 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j, j8);
        }

        @Override // com.applovin.impl.q4
        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, FacebookMediationAdapter.KEY_ID, this.f5457a);
            JsonUtils.putString(jSONObject, "type", this.f5458b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f5459c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f5460d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f5461e);
            return jSONObject;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.sdk.c$c, reason: collision with other inner class name */
    public interface InterfaceC0020c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public c(k kVar) {
        this.f5456a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a aVarA = a.a(bVar, ((Long) this.f5456a.a(x4.Z0)).longValue(), k.n());
        File fileA = a(aVarA);
        if (fileA == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject jSONObjectA = bVar.a();
            if (jSONObjectA == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f5456a.G().a((InputStream) new ByteArrayInputStream(jSONObjectA.toString().getBytes("UTF-8")), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th2) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f5456a.D().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (b()) {
            this.f5456a.q0().a((i5) new r6(this.f5456a, "persistAd", new r(this, bVar, bVar2, 2)), d6.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        File file = f5455b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File fileA = a(aVar);
        if (fileA != null) {
            fileA.delete();
        }
    }

    public void a(a aVar, InterfaceC0020c interfaceC0020c) {
        File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f5456a.q0().a((i5) new r6(this.f5456a, "retrievePersistedAd", new ci.a(this, fileA, interfaceC0020c, aVar, 11)), d6.b.OTHER);
        } else {
            interfaceC0020c.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, InterfaceC0020c interfaceC0020c, a aVar) throws Throwable {
        com.applovin.impl.sdk.ad.b bVarA;
        String strF = this.f5456a.G().f(file);
        if (strF == null) {
            interfaceC0020c.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strF, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f5456a);
            } else {
                bVarA = o7.a(jSONObjectJsonObjectFromJsonString, this.f5456a);
            }
            if (bVarA == null) {
                interfaceC0020c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                interfaceC0020c.a(bVarA, null);
            }
        } catch (Throwable th2) {
            interfaceC0020c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f5456a.D().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f5455b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f5456a.O();
        if (o.a()) {
            this.f5456a.O().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f5456a.g().a(d2.U, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f5456a.O();
        if (o.a()) {
            this.f5456a.O().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f5456a.g().d(d2.V, mapA);
    }

    public void a(List list) {
        File[] fileArrListFiles = f5455b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z3 = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).d().equals(file.getName())) {
                        z3 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z3) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] fileArrListFiles;
        File file = f5455b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
