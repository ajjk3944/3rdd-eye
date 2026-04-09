package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cc.s;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tc.c;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c(19);
    public final long B;
    public final String D;
    public final List E;
    public final String F;
    public final String G;
    public final HashSet H = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f4797a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4798d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4799g;

    /* renamed from: r, reason: collision with root package name */
    public final String f4800r;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f4801x;

    /* renamed from: y, reason: collision with root package name */
    public String f4802y;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4797a = str;
        this.f4798d = str2;
        this.f4799g = str3;
        this.f4800r = str4;
        this.f4801x = uri;
        this.f4802y = str5;
        this.B = j;
        this.D = str6;
        this.E = arrayList;
        this.F = str7;
        this.G = str8;
    }

    public static GoogleSignInAccount d(String str) throws JSONException, NumberFormatException {
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
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        s.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f4802y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.D.equals(this.D)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.E);
        hashSet.addAll(googleSignInAccount.H);
        HashSet hashSet2 = new HashSet(this.E);
        hashSet2.addAll(this.H);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.D.hashCode() + 527;
        HashSet hashSet = new HashSet(this.E);
        hashSet.addAll(this.H);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 2, this.f4797a);
        i4.P(parcel, 3, this.f4798d);
        i4.P(parcel, 4, this.f4799g);
        i4.P(parcel, 5, this.f4800r);
        i4.O(parcel, 6, this.f4801x, i10);
        i4.P(parcel, 7, this.f4802y);
        i4.S(parcel, 8, 8);
        parcel.writeLong(this.B);
        i4.P(parcel, 9, this.D);
        i4.R(parcel, 10, this.E);
        i4.P(parcel, 11, this.F);
        i4.P(parcel, 12, this.G);
        i4.W(parcel, iU);
    }
}
