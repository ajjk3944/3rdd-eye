package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.aR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884aR extends C0771Va {

    /* renamed from: F, reason: collision with root package name */
    public static final C0884aR f13125F = new C0884aR(new ZQ());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f13126A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f13127B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f13128C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f13129D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f13130E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13131w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13132x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f13133y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f13134z;

    static {
        String str = Vt.f12096a;
        Integer.toString(TTAdConstant.STYLE_SIZE_RADIO_1_1, 36);
        Integer.toString(BackupConstant.SCENE_RENDER_FAIL, 36);
        Integer.toString(BackupConstant.SCENE_BACKUP_RENDER_FAIL, 36);
        Integer.toString(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1010, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1011, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public C0884aR(ZQ zq) {
        super(zq);
        this.f13131w = zq.f12899w;
        this.f13132x = zq.f12900x;
        this.f13133y = zq.f12901y;
        this.f13134z = zq.f12902z;
        this.f13126A = zq.f12894A;
        this.f13127B = zq.f12895B;
        this.f13128C = zq.f12896C;
        this.f13129D = zq.f12897D;
        this.f13130E = zq.f12898E;
    }

    @Override // com.google.android.gms.internal.ads.C0771Va
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0884aR.class == obj.getClass()) {
            C0884aR c0884aR = (C0884aR) obj;
            if (super.equals(c0884aR) && this.f13131w == c0884aR.f13131w && this.f13132x == c0884aR.f13132x && this.f13133y == c0884aR.f13133y && this.f13134z == c0884aR.f13134z && this.f13126A == c0884aR.f13126A && this.f13127B == c0884aR.f13127B && this.f13128C == c0884aR.f13128C) {
                SparseBooleanArray sparseBooleanArray = c0884aR.f13130E;
                SparseBooleanArray sparseBooleanArray2 = this.f13130E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = c0884aR.f13129D;
                            SparseArray sparseArray2 = this.f13129D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i3 = 0; i3 < size2; i3++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i3));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i3);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                SQ sq = (SQ) entry.getKey();
                                                if (!map2.containsKey(sq) || !Objects.equals(entry.getValue(), map2.get(sq))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C0771Va
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f13131w ? 1 : 0)) * 961) + (this.f13132x ? 1 : 0)) * 961) + (this.f13133y ? 1 : 0)) * 28629151) + (this.f13134z ? 1 : 0)) * 31) + (this.f13126A ? 1 : 0)) * 31) + (this.f13127B ? 1 : 0)) * 961) + (this.f13128C ? 1 : 0)) * 31;
    }
}
