.class public abstract synthetic Lme/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/net/wifi/ScanResult$InformationElement;)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-virtual {p0}, Landroid/net/wifi/ScanResult$InformationElement;->getBytes()Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method
