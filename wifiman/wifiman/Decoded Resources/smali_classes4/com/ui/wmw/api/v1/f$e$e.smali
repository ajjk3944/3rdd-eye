.class final Lcom/ui/wmw/api/v1/f$e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$e;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lkotlin/jvm/internal/M;


# direct methods
.method constructor <init>(JLkotlin/jvm/internal/M;)V
    .locals 0

    iput-wide p1, p0, Lcom/ui/wmw/api/v1/f$e$e;->a:J

    iput-object p3, p0, Lcom/ui/wmw/api/v1/f$e$e;->b:Lkotlin/jvm/internal/M;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Lcom/ui/wmw/api/v1/d;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/wmw/api/v1/d;

    iget-wide v0, p0, Lcom/ui/wmw/api/v1/f$e$e;->a:J

    iget-object v2, p0, Lcom/ui/wmw/api/v1/f$e$e;->b:Lkotlin/jvm/internal/M;

    iget-wide v2, v2, Lkotlin/jvm/internal/M;->a:J

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ui/wmw/api/v1/d;-><init>(JJ)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$e$e;->a(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Lcom/ui/wmw/api/v1/d;

    move-result-object p1

    return-object p1
.end method
