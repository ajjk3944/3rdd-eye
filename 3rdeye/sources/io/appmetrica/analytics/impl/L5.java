package io.appmetrica.analytics.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class L5 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f39741a = CollectionUtils.createSortedListWithoutRepetitions(FacebookMediationAdapter.KEY_ID, "session_id", "session_type", "number_in_session", "type", "global_number", "time", "event_description");
}
