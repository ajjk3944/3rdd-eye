package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class DebugImage implements c2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.c2
    public void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.uuid != null) {
            bVar.I("uuid");
            bVar.V(this.uuid);
        }
        if (this.type != null) {
            bVar.I("type");
            bVar.V(this.type);
        }
        if (this.debugId != null) {
            bVar.I("debug_id");
            bVar.V(this.debugId);
        }
        if (this.debugFile != null) {
            bVar.I("debug_file");
            bVar.V(this.debugFile);
        }
        if (this.codeId != null) {
            bVar.I("code_id");
            bVar.V(this.codeId);
        }
        if (this.codeFile != null) {
            bVar.I("code_file");
            bVar.V(this.codeFile);
        }
        if (this.imageAddr != null) {
            bVar.I("image_addr");
            bVar.V(this.imageAddr);
        }
        if (this.imageSize != null) {
            bVar.I("image_size");
            bVar.U(this.imageSize);
        }
        if (this.arch != null) {
            bVar.I("arch");
            bVar.V(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                bVar.I(str);
                bVar.S(u0Var, obj);
            }
        }
        bVar.F();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l10) {
        this.imageSize = l10;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
