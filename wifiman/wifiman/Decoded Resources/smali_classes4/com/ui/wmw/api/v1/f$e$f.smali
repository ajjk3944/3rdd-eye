.class public final Lcom/ui/wmw/api/v1/f$e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$e;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:Ljava/io/InputStream;

.field final synthetic c:Lkotlin/jvm/internal/N;

.field final synthetic d:Lkotlin/jvm/internal/L;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/L;Ljava/io/InputStream;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/L;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$e$f;->a:Lkotlin/jvm/internal/L;

    iput-object p2, p0, Lcom/ui/wmw/api/v1/f$e$f;->b:Ljava/io/InputStream;

    iput-object p3, p0, Lcom/ui/wmw/api/v1/f$e$f;->c:Lkotlin/jvm/internal/N;

    iput-object p4, p0, Lcom/ui/wmw/api/v1/f$e$f;->d:Lkotlin/jvm/internal/L;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$f;->a:Lkotlin/jvm/internal/L;

    iget-object v1, p0, Lcom/ui/wmw/api/v1/f$e$f;->b:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/ui/wmw/api/v1/f$e$f;->c:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, [B

    iget-object v4, p0, Lcom/ui/wmw/api/v1/f$e$f;->d:Lkotlin/jvm/internal/L;

    iget v4, v4, Lkotlin/jvm/internal/L;->a:I

    check-cast v2, [B

    array-length v2, v2

    sub-int/2addr v2, v4

    invoke-virtual {v1, v3, v4, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    iput v1, v0, Lkotlin/jvm/internal/L;->a:I

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$f;->a:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    const/4 v1, 0x0

    if-ltz v0, :cond_2

    iget-object v2, p0, Lcom/ui/wmw/api/v1/f$e$f;->d:Lkotlin/jvm/internal/L;

    iget v3, v2, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr v3, v0

    iput v3, v2, Lkotlin/jvm/internal/L;->a:I

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$f;->c:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [B

    array-length v2, v2

    if-ne v3, v2, :cond_0

    move-object v1, v0

    check-cast v1, [B

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lgg/o;->a()V

    goto :goto_2

    :cond_2
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;

    const-string v2, "Failed to read fw file"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v1, v3, v1}, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
