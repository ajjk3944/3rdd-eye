package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class FilterWord {

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7688lh;
    private String ouw;
    private String vt;
    private List<FilterWord> yu;

    public FilterWord(String str, String str2) {
        this.ouw = str;
        this.vt = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.yu == null) {
            this.yu = new ArrayList();
        }
        this.yu.add(filterWord);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.ouw;
    }

    public boolean getIsSelected() {
        return this.f7688lh;
    }

    public String getName() {
        return this.vt;
    }

    public List<FilterWord> getOptions() {
        return this.yu;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.yu;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.ouw) || TextUtils.isEmpty(this.vt)) ? false : true;
    }

    public void setId(String str) {
        this.ouw = str;
    }

    public void setIsSelected(boolean z3) {
        this.f7688lh = z3;
    }

    public void setName(String str) {
        this.vt = str;
    }

    public FilterWord() {
    }
}
