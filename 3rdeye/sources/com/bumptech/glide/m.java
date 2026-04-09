package com.bumptech.glide;

import com.bumptech.glide.m;
import f3.C4332a;

/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        Object obj2 = C4332a.f37816a;
        ((m) obj).getClass();
        char[] cArr = h3.l.f38217a;
        return obj2.equals(obj2);
    }

    public int hashCode() {
        return C4332a.f37816a.hashCode();
    }
}
