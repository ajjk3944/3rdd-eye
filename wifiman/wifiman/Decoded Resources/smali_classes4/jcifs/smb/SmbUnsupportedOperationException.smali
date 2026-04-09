.class public Ljcifs/smb/SmbUnsupportedOperationException;
.super Ljcifs/smb/SmbException;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Operation is not supported with the negotiated capabilities"

    invoke-direct {p0, v0}, Ljcifs/smb/SmbException;-><init>(Ljava/lang/String;)V

    return-void
.end method
