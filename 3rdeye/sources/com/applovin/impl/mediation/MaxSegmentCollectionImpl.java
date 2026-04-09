package com.applovin.impl.mediation;

import N7.C1094a9;
import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {

    /* renamed from: a, reason: collision with root package name */
    private final List f20203a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f20204b;

    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* renamed from: a, reason: collision with root package name */
        private final List f20205a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f20205a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f20204b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f20203a;
    }

    public String toString() {
        return C1094a9.h(new StringBuilder("MaxSegmentColletionImpl{segments="), this.f20203a, "}");
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f20205a;
        this.f20203a = list;
        this.f20204b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f20204b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
