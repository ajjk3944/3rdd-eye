package j4;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e {
    public static q5.c a(GetTopicsResponse getTopicsResponse) {
        nk.k.e(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new q5.d(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new q5.c(arrayList);
    }

    public static q5.c b(GetTopicsResponse getTopicsResponse) {
        nk.k.e(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new q5.d(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (EncryptedTopic encryptedTopic : getTopicsResponse.getEncryptedTopics()) {
            byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
            nk.k.d(encryptedTopic2, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopic.getKeyIdentifier();
            nk.k.d(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
            nk.k.d(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new q5.a(encryptedTopic2, keyIdentifier, encapsulatedKey));
        }
        return new q5.c(arrayList, arrayList2);
    }

    public static void c(NestedScrollView nestedScrollView, float f10) {
        try {
            nestedScrollView.setFrameContentVelocity(f10);
        } catch (LinkageError unused) {
        }
    }
}
