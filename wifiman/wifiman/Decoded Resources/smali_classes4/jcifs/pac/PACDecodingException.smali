.class public Ljcifs/pac/PACDecodingException;
.super Ljcifs/CIFSException;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0}, Ljcifs/pac/PACDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljcifs/CIFSException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
