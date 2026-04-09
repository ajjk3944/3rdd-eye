package com.opensignal.sdk.domain.model;

import ak.u0;
import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import h0.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/opensignal/sdk/domain/model/TaskInfo;", "Landroid/os/Parcelable;", "CREATOR", "ak/u0", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TaskInfo implements Parcelable {
    public static final u0 CREATOR = new u0();

    /* renamed from: a, reason: collision with root package name */
    public final long f5862a;

    /* renamed from: d, reason: collision with root package name */
    public final String f5863d;

    /* renamed from: g, reason: collision with root package name */
    public final String f5864g;

    /* renamed from: r, reason: collision with root package name */
    public final long f5865r;

    /* renamed from: x, reason: collision with root package name */
    public final int f5866x;

    public TaskInfo(long j, String str, String str2, long j7, int i10) {
        l.e(str2, "name");
        this.f5862a = j;
        this.f5863d = str;
        this.f5864g = str2;
        this.f5865r = j7;
        this.f5866x = i10;
    }

    public static TaskInfo d(TaskInfo taskInfo, String str) {
        long j = taskInfo.f5862a;
        String str2 = taskInfo.f5864g;
        long j7 = taskInfo.f5865r;
        int i10 = taskInfo.f5866x;
        taskInfo.getClass();
        l.e(str2, "name");
        return new TaskInfo(j, str, str2, j7, i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskInfo)) {
            return false;
        }
        TaskInfo taskInfo = (TaskInfo) obj;
        return this.f5862a == taskInfo.f5862a && l.a(this.f5863d, taskInfo.f5863d) && l.a(this.f5864g, taskInfo.f5864g) && this.f5865r == taskInfo.f5865r && this.f5866x == taskInfo.f5866x;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5866x) + b.b(a.g(this.f5864g, a.g(this.f5863d, Long.hashCode(this.f5862a) * 31, 31), 31), 31, this.f5865r);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskInfo(id=");
        sb2.append(this.f5862a);
        sb2.append(", type=");
        sb2.append(this.f5863d);
        sb2.append(", name=");
        sb2.append(this.f5864g);
        sb2.append(", executionTime=");
        sb2.append(this.f5865r);
        sb2.append(", runCount=");
        return a.q(sb2, this.f5866x, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "parcel");
        parcel.writeLong(this.f5862a);
        parcel.writeString(this.f5863d);
        parcel.writeString(this.f5864g);
        parcel.writeLong(this.f5865r);
        parcel.writeInt(this.f5866x);
    }
}
