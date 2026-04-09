package io.appmetrica.analytics.coreapi.internal.permission;

import N7.C1154e9;

/* loaded from: classes3.dex */
public class PermissionState {
    public final boolean granted;
    public final String name;

    public PermissionState(String str, boolean z10) {
        this.name = str;
        this.granted = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionState permissionState = (PermissionState) obj;
        if (this.granted != permissionState.granted) {
            return false;
        }
        return this.name.equals(permissionState.name);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.granted ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PermissionState{name='");
        sb.append(this.name);
        sb.append("', granted=");
        return C1154e9.k(sb, this.granted, '}');
    }
}
