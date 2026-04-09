.class final Lcom/ui/wmw/api/v1/f$e$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$e$c;->a([B)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:[B


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;[B)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$e$c$a;->a:Lkotlin/jvm/internal/M;

    iput-object p2, p0, Lcom/ui/wmw/api/v1/f$e$c$a;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wmw/api/v1/f$e$c$a;->a:Lkotlin/jvm/internal/M;

    iget-wide v0, p1, Lkotlin/jvm/internal/M;->a:J

    iget-object v2, p0, Lcom/ui/wmw/api/v1/f$e$c$a;->b:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p1, Lkotlin/jvm/internal/M;->a:J

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$e$c$a;->a(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V

    return-void
.end method
