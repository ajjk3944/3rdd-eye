package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {

    /* renamed from: a, reason: collision with root package name */
    private final List f4547a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4548b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* renamed from: a, reason: collision with root package name */
        private final List f4549a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f4549a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f4548b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f4547a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f4547a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f4549a;
        this.f4547a = list;
        this.f4548b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f4548b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
