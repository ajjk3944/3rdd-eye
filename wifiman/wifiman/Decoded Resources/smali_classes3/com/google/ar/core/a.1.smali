.class final enum Lcom/google/ar/core/a;
.super Lcom/google/ar/core/ArCoreApk$Availability;
.source "SourceFile"


# direct methods
.method synthetic constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string/jumbo v2, "UNKNOWN_ERROR"

    invoke-direct {p0, v2, v0, v0, v1}, Lcom/google/ar/core/ArCoreApk$Availability;-><init>(Ljava/lang/String;II[B)V

    return-void
.end method


# virtual methods
.method public final isUnknown()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
