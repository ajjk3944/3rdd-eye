package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Yn;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f42471a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f42472a;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends Yn> userProfileUpdate) {
            this.f42472a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f42472a, 0);
        }

        private Builder() {
            this.f42472a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends Yn>> getUserProfileUpdates() {
        return this.f42471a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f42471a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
