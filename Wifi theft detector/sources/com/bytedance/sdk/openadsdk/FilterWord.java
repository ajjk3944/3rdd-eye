package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FilterWord {
    private List<FilterWord> dg;
    private String emc;
    private boolean xq;
    private String ypw;

    public FilterWord(String str, String str2) {
        this.emc = str;
        this.ypw = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.dg == null) {
            this.dg = new ArrayList();
        }
        this.dg.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.emc;
    }

    public boolean getIsSelected() {
        return this.xq;
    }

    public String getName() {
        return this.ypw;
    }

    public List<FilterWord> getOptions() {
        return this.dg;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.dg;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.emc) || TextUtils.isEmpty(this.ypw)) ? false : true;
    }

    public void setId(String str) {
        this.emc = str;
    }

    public void setIsSelected(boolean z10) {
        this.xq = z10;
    }

    public void setName(String str) {
        this.ypw = str;
    }

    public FilterWord() {
    }
}
