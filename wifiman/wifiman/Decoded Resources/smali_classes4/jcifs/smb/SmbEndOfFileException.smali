.class public Ljcifs/smb/SmbEndOfFileException;
.super Ljcifs/smb/SmbException;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Unexpectedly reached end of file"

    invoke-direct {p0, v0}, Ljcifs/smb/SmbException;-><init>(Ljava/lang/String;)V

    return-void
.end method
