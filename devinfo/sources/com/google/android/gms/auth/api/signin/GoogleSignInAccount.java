package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.f;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j4.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pb.y;
import qb.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new g(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f9045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9046b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9047c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9048d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9049e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f9050f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9051h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9052i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9053k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9054l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f9055m = new HashSet();

    public GoogleSignInAccount(int i4, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f9045a = i4;
        this.f9046b = str;
        this.f9047c = str2;
        this.f9048d = str3;
        this.f9049e = str4;
        this.f9050f = uri;
        this.g = str5;
        this.f9051h = j;
        this.f9052i = str6;
        this.j = arrayList;
        this.f9053k = str7;
        this.f9054l = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(1, jSONArray.getString(i4)));
        }
        String strOptString2 = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        y.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f9052i.equals(this.f9052i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.j);
        hashSet.addAll(googleSignInAccount.f9055m);
        HashSet hashSet2 = new HashSet(this.j);
        hashSet2.addAll(this.f9055m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f9052i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.f9055m);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.N(parcel, 1, 4);
        parcel.writeInt(this.f9045a);
        f.I(parcel, 2, this.f9046b);
        f.I(parcel, 3, this.f9047c);
        f.I(parcel, 4, this.f9048d);
        f.I(parcel, 5, this.f9049e);
        f.H(parcel, 6, this.f9050f, i4);
        f.I(parcel, 7, this.g);
        f.N(parcel, 8, 8);
        parcel.writeLong(this.f9051h);
        f.I(parcel, 9, this.f9052i);
        f.M(parcel, 10, this.j);
        f.I(parcel, 11, this.f9053k);
        f.I(parcel, 12, this.f9054l);
        f.P(parcel, iO);
    }
}
