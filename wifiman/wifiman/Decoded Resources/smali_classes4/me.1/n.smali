.class public abstract synthetic Lme/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/net/wifi/ScanResult;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Landroid/net/wifi/ScanResult;->getAffiliatedMloLinks()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
