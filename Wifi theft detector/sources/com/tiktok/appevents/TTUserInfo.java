package com.tiktok.appevents;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class TTUserInfo implements Cloneable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static volatile TTUserInfo f19993b = new TTUserInfo();

    /* renamed from: a, reason: collision with root package name */
    public transient boolean f19994a = false;
    String anonymousId;
    String email;
    String externalId;
    String externalUserName;
    String phoneNumber;

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public TTUserInfo clone() {
        try {
            return (TTUserInfo) super.clone();
        } catch (Exception unused) {
            return new TTUserInfo();
        }
    }
}
