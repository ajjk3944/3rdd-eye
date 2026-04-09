package com.google.android.gms.auth.api.signin;

import A3.q;
import N2.a;
import a.AbstractC0241a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new q(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f6888a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6889b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6890c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6891d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6892e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f6893f;

    /* renamed from: g, reason: collision with root package name */
    public String f6894g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6895h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6896j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6897k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6898l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f6899m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.f6888a = i;
        this.f6889b = str;
        this.f6890c = str2;
        this.f6891d = str3;
        this.f6892e = str4;
        this.f6893f = uri;
        this.f6894g = str5;
        this.f6895h = j6;
        this.i = str6;
        this.f6896j = arrayList;
        this.f6897k = str7;
        this.f6898l = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j6 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j6, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f6894g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
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
        if (!googleSignInAccount.i.equals(this.i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f6896j);
        hashSet.addAll(googleSignInAccount.f6899m);
        HashSet hashSet2 = new HashSet(this.f6896j);
        hashSet2.addAll(this.f6899m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.f6896j);
        hashSet.addAll(this.f6899m);
        return hashSet.hashCode() + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f6888a);
        AbstractC0241a.u(parcel, 2, this.f6889b);
        AbstractC0241a.u(parcel, 3, this.f6890c);
        AbstractC0241a.u(parcel, 4, this.f6891d);
        AbstractC0241a.u(parcel, 5, this.f6892e);
        AbstractC0241a.t(parcel, 6, this.f6893f, i);
        AbstractC0241a.u(parcel, 7, this.f6894g);
        AbstractC0241a.B(parcel, 8, 8);
        parcel.writeLong(this.f6895h);
        AbstractC0241a.u(parcel, 9, this.i);
        AbstractC0241a.y(parcel, 10, this.f6896j);
        AbstractC0241a.u(parcel, 11, this.f6897k);
        AbstractC0241a.u(parcel, 12, this.f6898l);
        AbstractC0241a.H(parcel, iE);
    }
}
