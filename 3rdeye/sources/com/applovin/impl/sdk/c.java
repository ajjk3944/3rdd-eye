package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.a2;
import com.applovin.impl.b7;
import com.applovin.impl.d4;
import com.applovin.impl.f6;
import com.applovin.impl.l4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAdType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.singular.sdk.internal.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final File f21094b = new File(k.o().getFilesDir(), "al/persisted-ads");

    /* renamed from: a, reason: collision with root package name */
    private final k f21095a;

    public static class a implements d4 {

        /* renamed from: a, reason: collision with root package name */
        private final String f21096a;

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdType f21097b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f21098c;

        /* renamed from: d, reason: collision with root package name */
        private final long f21099d;

        /* renamed from: e, reason: collision with root package name */
        private final long f21100e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z10, long j4, long j10) {
            this.f21096a = str;
            this.f21097b = appLovinAdType;
            this.f21098c = z10;
            this.f21099d = j4;
            this.f21100e = j10;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f21100e;
        }

        public long c() {
            return this.f21099d;
        }

        public String d() {
            return this.f21096a + "_" + this.f21097b;
        }

        public String e() {
            return this.f21096a;
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
            return this.f21097b;
        }

        public boolean g() {
            return this.f21098c;
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

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j4, long j10) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.M()) ? bVar.M() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j4, j10);
        }

        public static a a(JSONObject jSONObject, k kVar) {
            String string = JsonUtils.getString(jSONObject, FacebookMediationAdapter.KEY_ID, "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j4 = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j10 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j4, j10);
        }

        @Override // com.applovin.impl.d4
        public JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, FacebookMediationAdapter.KEY_ID, this.f21096a);
            JsonUtils.putString(jSONObject, "type", this.f21097b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f21098c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f21099d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f21100e);
            return jSONObject;
        }
    }

    public interface b {
        void a(a aVar);
    }

    /* renamed from: com.applovin.impl.sdk.c$c, reason: collision with other inner class name */
    public interface InterfaceC0318c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public c(k kVar) {
        this.f21095a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a aVarA = a.a(bVar, ((Long) this.f21095a.a(l4.f19847V0)).longValue(), k.n());
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
            if (this.f21095a.H().a((InputStream) new ByteArrayInputStream(jSONObjectA.toString().getBytes(Constants.ENCODING)), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f21095a.E().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (b()) {
            this.f21095a.q0().a((w4) new f6(this.f21095a, "persistAd", new J4.h(this, bVar, bVar2, 11)), r5.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        File file = f21094b;
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

    public void a(a aVar, InterfaceC0318c interfaceC0318c) {
        File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f21095a.q0().a((w4) new f6(this.f21095a, "retrievePersistedAd", new T1.p(this, fileA, interfaceC0318c, aVar, 5)), r5.b.OTHER);
        } else {
            interfaceC0318c.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, InterfaceC0318c interfaceC0318c, a aVar) throws Throwable {
        com.applovin.impl.sdk.ad.b bVarA;
        String strF = this.f21095a.H().f(file);
        if (strF == null) {
            interfaceC0318c.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strF, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f21095a);
            } else {
                bVarA = b7.a(jSONObjectJsonObjectFromJsonString, this.f21095a);
            }
            if (bVarA == null) {
                interfaceC0318c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                interfaceC0318c.a(bVarA, null);
            }
        } catch (Throwable th) {
            interfaceC0318c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f21095a.E().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f21094b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f21095a.O();
        if (o.a()) {
            this.f21095a.O().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f21095a.g().a(y1.f21763F, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f21095a.O();
        if (o.a()) {
            this.f21095a.O().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map mapA = a2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f21095a.g().d(y1.f21764G, mapA);
    }

    public void a(List list) {
        File[] fileArrListFiles = f21094b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z10 = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).d().equals(file.getName())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z10) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] fileArrListFiles;
        File file = f21094b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
