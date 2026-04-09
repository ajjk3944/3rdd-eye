.class public final synthetic Lcom/ui/wmw/api/v1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/j;->a:Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/j;->a:Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    invoke-static {v0}, Lcom/ui/wmw/api/v1/f$e;->b(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
