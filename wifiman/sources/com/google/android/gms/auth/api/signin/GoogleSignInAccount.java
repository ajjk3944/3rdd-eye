package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.AbstractC7901p;
import t3.AbstractC8026a;
import t3.b;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC8026a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: n, reason: collision with root package name */
    public static final d f34692n = g.d();

    /* renamed from: a, reason: collision with root package name */
    final int f34693a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34694b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34695c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34696d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34697e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f34698f;

    /* renamed from: g, reason: collision with root package name */
    private String f34699g;

    /* renamed from: h, reason: collision with root package name */
    private final long f34700h;

    /* renamed from: i, reason: collision with root package name */
    private final String f34701i;

    /* renamed from: j, reason: collision with root package name */
    final List f34702j;

    /* renamed from: k, reason: collision with root package name */
    private final String f34703k;

    /* renamed from: l, reason: collision with root package name */
    private final String f34704l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f34705m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f34693a = i10;
        this.f34694b = str;
        this.f34695c = str2;
        this.f34696d = str3;
        this.f34697e = str4;
        this.f34698f = uri;
        this.f34699g = str5;
        this.f34700h = j10;
        this.f34701i = str6;
        this.f34702j = list;
        this.f34703k = str7;
        this.f34704l = str8;
    }

    public static GoogleSignInAccount q(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), AbstractC7901p.f(str7), new ArrayList((Collection) AbstractC7901p.l(set)), str5, str6);
    }

    public static GoogleSignInAccount u(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountQ = q(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountQ.f34699g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountQ;
    }

    public String b() {
        return this.f34697e;
    }

    public String e() {
        return this.f34696d;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f34701i.equals(this.f34701i) && googleSignInAccount.m().equals(m());
    }

    public String f() {
        return this.f34704l;
    }

    public String g() {
        return this.f34703k;
    }

    public int hashCode() {
        return ((this.f34701i.hashCode() + 527) * 31) + m().hashCode();
    }

    public String i() {
        return this.f34694b;
    }

    public String j() {
        return this.f34695c;
    }

    public Uri k() {
        return this.f34698f;
    }

    public Set m() {
        HashSet hashSet = new HashSet(this.f34702j);
        hashSet.addAll(this.f34705m);
        return hashSet;
    }

    public String o() {
        return this.f34699g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.k(parcel, 1, this.f34693a);
        b.q(parcel, 2, i(), false);
        b.q(parcel, 3, j(), false);
        b.q(parcel, 4, e(), false);
        b.q(parcel, 5, b(), false);
        b.p(parcel, 6, k(), i10, false);
        b.q(parcel, 7, o(), false);
        b.n(parcel, 8, this.f34700h);
        b.q(parcel, 9, this.f34701i, false);
        b.t(parcel, 10, this.f34702j, false);
        b.q(parcel, 11, g(), false);
        b.q(parcel, 12, f(), false);
        b.b(parcel, iA);
    }
}
