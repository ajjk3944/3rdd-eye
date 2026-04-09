package com.applovin.impl.privacy.cmp;

import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ConsentInformation.OnConsentInfoUpdateFailureListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f20717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0315a f20718c;

    public /* synthetic */ b(a aVar, a.InterfaceC0315a interfaceC0315a) {
        this.f20717b = aVar;
        this.f20718c = interfaceC0315a;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        this.f20717b.a(this.f20718c, formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        this.f20717b.b(this.f20718c, formError);
    }
}
