package com.zipoapps.premiumhelper.toto;

import b9.n;
import c9.C2097r;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;
import t9.c;

/* compiled from: WeightedValueParameter.kt */
/* loaded from: classes3.dex */
public final class WeightedValueParameter {
    private final String name;
    private final Map<String, Integer> weightedValues;

    public WeightedValueParameter(String name, Map<String, Integer> weightedValues) {
        l.f(name, "name");
        l.f(weightedValues, "weightedValues");
        this.name = name;
        this.weightedValues = weightedValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightedValueParameter copy$default(WeightedValueParameter weightedValueParameter, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weightedValueParameter.name;
        }
        if ((i & 2) != 0) {
            map = weightedValueParameter.weightedValues;
        }
        return weightedValueParameter.copy(str, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, Integer> component2() {
        return this.weightedValues;
    }

    public final WeightedValueParameter copy(String name, Map<String, Integer> weightedValues) {
        l.f(name, "name");
        l.f(weightedValues, "weightedValues");
        return new WeightedValueParameter(name, weightedValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeightedValueParameter)) {
            return false;
        }
        WeightedValueParameter weightedValueParameter = (WeightedValueParameter) obj;
        return l.b(this.name, weightedValueParameter.name) && l.b(this.weightedValues, weightedValueParameter.weightedValues);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Integer> getWeightedValues() {
        return this.weightedValues;
    }

    public final int hash() {
        return this.weightedValues.hashCode();
    }

    public int hashCode() {
        return this.weightedValues.hashCode() + (this.name.hashCode() * 31);
    }

    public final String pickRandomValue() {
        try {
            Map<String, Integer> map = this.weightedValues;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().intValue() < 0) {
                        throw new IllegalArgumentException("Weighted values must be non-negative.");
                    }
                }
            }
            if (this.weightedValues.size() == 1) {
                return (String) C2097r.o0(this.weightedValues.keySet());
            }
            c.a aVar = c.f46467b;
            Iterator<T> it2 = this.weightedValues.values().iterator();
            int iIntValue = 0;
            while (it2.hasNext()) {
                iIntValue += ((Number) it2.next()).intValue();
            }
            aVar.getClass();
            int iC = c.f46468c.c(iIntValue);
            for (Map.Entry<String, Integer> entry : this.weightedValues.entrySet()) {
                iC -= entry.getValue().intValue();
                if (iC < 0) {
                    return entry.getKey();
                }
            }
            throw new IllegalStateException("Should never get here!");
        } catch (Throwable th) {
            n.a(th);
            return null;
        }
    }

    public String toString() {
        return "WeightedValueParameter(name=" + this.name + ", weightedValues=" + this.weightedValues + ")";
    }
}
