package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

/* loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f1993a;

    public Id3Frame(String str) {
        this.f1993a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f1993a;
    }
}
