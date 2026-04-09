package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.b1;

/* loaded from: classes.dex */
public interface TrackSelection {
    public static final int TYPE_CUSTOM_BASE = 10000;
    public static final int TYPE_UNSET = 0;

    androidx.media3.common.r getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    b1 getTrackGroup();

    int getType();

    int indexOf(int i10);

    int indexOf(androidx.media3.common.r rVar);

    int length();
}
