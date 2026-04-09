.class public abstract synthetic Lje/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/net/wifi/MloLink;)Landroid/net/MacAddress;
    .locals 0

    invoke-virtual {p0}, Landroid/net/wifi/MloLink;->getApMacAddress()Landroid/net/MacAddress;

    move-result-object p0

    return-object p0
.end method
