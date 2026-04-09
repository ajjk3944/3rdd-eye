package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4892q8;
import io.appmetrica.analytics.impl.C4917r8;
import io.appmetrica.analytics.impl.C5032vl;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Um;
import io.appmetrica.analytics.impl.Vk;
import io.appmetrica.analytics.impl.Yn;

/* loaded from: classes3.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final L6 f42465a = new L6("appmetrica_gender", new C4917r8(), new C5032vl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f42467a;

        Gender(String str) {
            this.f42467a = str;
        }

        public String getStringValue() {
            return this.f42467a;
        }
    }

    public UserProfileUpdate<? extends Yn> withValue(Gender gender) {
        String str = this.f42465a.f39744c;
        String stringValue = gender.getStringValue();
        C4892q8 c4892q8 = new C4892q8();
        L6 l62 = this.f42465a;
        return new UserProfileUpdate<>(new Um(str, stringValue, c4892q8, l62.f39742a, new N4(l62.f39743b)));
    }

    public UserProfileUpdate<? extends Yn> withValueIfUndefined(Gender gender) {
        String str = this.f42465a.f39744c;
        String stringValue = gender.getStringValue();
        C4892q8 c4892q8 = new C4892q8();
        L6 l62 = this.f42465a;
        return new UserProfileUpdate<>(new Um(str, stringValue, c4892q8, l62.f39742a, new Vk(l62.f39743b)));
    }

    public UserProfileUpdate<? extends Yn> withValueReset() {
        L6 l62 = this.f42465a;
        return new UserProfileUpdate<>(new Li(0, l62.f39744c, l62.f39742a, l62.f39743b));
    }
}
