package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class RemoteInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f2456a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2457b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f2458c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2459d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2460e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f2461f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2462g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Source {
    }

    public static class a {
        @DoNotInline
        public static void a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        public static android.app.RemoteInput b(RemoteInput remoteInput) {
            Set setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(remoteInput.i()).setLabel(remoteInput.h()).setChoices(remoteInput.e()).setAllowFreeFormInput(remoteInput.c()).addExtras(remoteInput.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = remoteInput.d()) != null) {
                Iterator it = setD.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(builderAddExtras, remoteInput.f());
            }
            return builderAddExtras.build();
        }

        @DoNotInline
        public static Bundle c(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static class b {
        @DoNotInline
        public static void a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.a(remoteInput), intent, map);
        }

        @DoNotInline
        public static Set<String> b(Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        @DoNotInline
        public static Map<String, Uri> c(Intent intent, String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @DoNotInline
        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    public static class c {
        @DoNotInline
        public static int a(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f2456a = str;
        this.f2457b = charSequence;
        this.f2458c = charSequenceArr;
        this.f2459d = z10;
        this.f2460e = i10;
        this.f2461f = bundle;
        this.f2462g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static android.app.RemoteInput a(RemoteInput remoteInput) {
        return a.b(remoteInput);
    }

    public static android.app.RemoteInput[] b(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i10 = 0; i10 < remoteInputArr.length; i10++) {
            remoteInputArr2[i10] = a(remoteInputArr[i10]);
        }
        return remoteInputArr2;
    }

    public boolean c() {
        return this.f2459d;
    }

    public Set d() {
        return this.f2462g;
    }

    public CharSequence[] e() {
        return this.f2458c;
    }

    public int f() {
        return this.f2460e;
    }

    public Bundle g() {
        return this.f2461f;
    }

    public CharSequence h() {
        return this.f2457b;
    }

    public String i() {
        return this.f2456a;
    }
}
