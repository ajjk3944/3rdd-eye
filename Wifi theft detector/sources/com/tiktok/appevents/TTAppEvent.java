package com.tiktok.appevents;

import com.tiktok.TikTokBusinessSdk;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class TTAppEvent implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicLong f19980a = new AtomicLong(new Date().getTime());

    /* renamed from: b, reason: collision with root package name */
    public static String f19981b = null;

    /* renamed from: c, reason: collision with root package name */
    public static b7.a f19982c = null;
    private static final long serialVersionUID = 2;
    private String eventId;
    private String eventName;
    private Boolean isEdp;
    private String propertiesJson;
    private String screenShot;
    private List<String> tiktokAppIds;
    private Date timeStamp;
    private TTAppEventType type;
    private Long uniqueId;
    private TTUserInfo userInfo;

    public enum TTAppEventType {
        track,
        identify
    }

    static {
        String canonicalName = a.class.getCanonicalName();
        f19981b = canonicalName;
        f19982c = new b7.a(canonicalName, TikTokBusinessSdk.a());
    }

    public String toString() {
        return "TTAppEvent{eventName='" + this.eventName + "', timeStamp=" + this.timeStamp + ", propertiesJson='" + this.propertiesJson + "', eventId='" + this.eventId + "', uniqueId=" + this.uniqueId + ", tiktokAppIds=" + this.tiktokAppIds + '}';
    }
}
