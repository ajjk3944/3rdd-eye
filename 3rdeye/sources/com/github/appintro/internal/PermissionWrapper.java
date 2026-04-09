package com.github.appintro.internal;

import N7.C1154e9;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: PermissionWrapper.kt */
/* loaded from: classes.dex */
public final class PermissionWrapper implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;
    private String[] permissions;
    private int position;
    private boolean required;

    /* compiled from: PermissionWrapper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public PermissionWrapper(String[] permissions, int i, boolean z10) {
        l.f(permissions, "permissions");
        this.permissions = permissions;
        this.position = i;
        this.required = z10;
    }

    public static /* synthetic */ PermissionWrapper copy$default(PermissionWrapper permissionWrapper, String[] strArr, int i, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            strArr = permissionWrapper.permissions;
        }
        if ((i10 & 2) != 0) {
            i = permissionWrapper.position;
        }
        if ((i10 & 4) != 0) {
            z10 = permissionWrapper.required;
        }
        return permissionWrapper.copy(strArr, i, z10);
    }

    public final String[] component1() {
        return this.permissions;
    }

    public final int component2() {
        return this.position;
    }

    public final boolean component3() {
        return this.required;
    }

    public final PermissionWrapper copy(String[] permissions, int i, boolean z10) {
        l.f(permissions, "permissions");
        return new PermissionWrapper(permissions, i, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PermissionWrapper.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.github.appintro.internal.PermissionWrapper");
        }
        PermissionWrapper permissionWrapper = (PermissionWrapper) obj;
        return Arrays.equals(this.permissions, permissionWrapper.permissions) && this.position == permissionWrapper.position && this.required == permissionWrapper.required;
    }

    public final String[] getPermissions() {
        return this.permissions;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.permissions) * 31) + this.position) * 31) + (this.required ? 1231 : 1237);
    }

    public final void setPermissions(String[] strArr) {
        l.f(strArr, "<set-?>");
        this.permissions = strArr;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRequired(boolean z10) {
        this.required = z10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PermissionWrapper(permissions=");
        sb.append(Arrays.toString(this.permissions));
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", required=");
        return C1154e9.k(sb, this.required, ')');
    }

    public /* synthetic */ PermissionWrapper(String[] strArr, int i, boolean z10, int i10, g gVar) {
        this(strArr, i, (i10 & 4) != 0 ? true : z10);
    }
}
