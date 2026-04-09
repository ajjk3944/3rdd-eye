package r2;

/* compiled from: FileExtension.java */
/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5518c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String extension;

    EnumC5518c(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
