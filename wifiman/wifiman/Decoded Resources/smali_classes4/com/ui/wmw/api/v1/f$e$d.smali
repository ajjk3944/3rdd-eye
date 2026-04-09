.class final Lcom/ui/wmw/api/v1/f$e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$e;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/api/v1/f$e$d$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:J

.field final synthetic c:Lkotlin/jvm/internal/J;

.field final synthetic d:Lkotlin/jvm/internal/N;

.field final synthetic e:Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;JLkotlin/jvm/internal/J;Lkotlin/jvm/internal/N;Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$e$d;->a:Lkotlin/jvm/internal/M;

    iput-wide p2, p0, Lcom/ui/wmw/api/v1/f$e$d;->b:J

    iput-object p4, p0, Lcom/ui/wmw/api/v1/f$e$d;->c:Lkotlin/jvm/internal/J;

    iput-object p5, p0, Lcom/ui/wmw/api/v1/f$e$d;->d:Lkotlin/jvm/internal/N;

    iput-object p6, p0, Lcom/ui/wmw/api/v1/f$e$d;->e:Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f$e$d;->e(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/api/v1/f$e$d;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final d()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW API - Firmware Uploaded request completed"

    return-object v0
.end method

.method private static final e(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW API - Firmware Uploaded Changing chunk size to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$e$d;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V

    return-void
.end method

.method public final c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V
    .locals 9

    const-string v0, "chunkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c()Lcom/ui/wmw/api/v1/c;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/ui/wmw/api/v1/f$e$d$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    if-eq v0, v1, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-eq v0, v3, :cond_3

    const/4 v3, 0x4

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$d;->a:Lkotlin/jvm/internal/M;

    iget-wide v5, v0, Lkotlin/jvm/internal/M;->a:J

    iget-wide v7, p0, Lcom/ui/wmw/api/v1/f$e$d;->b:J

    cmp-long v0, v5, v7

    if-nez v0, :cond_1

    new-instance v0, Lcom/ui/wmw/api/v1/l;

    invoke-direct {v0}, Lcom/ui/wmw/api/v1/l;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$d;->c:Lkotlin/jvm/internal/J;

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    const-string v0, "Firmware upload complete signalled by the device but we didn\'t sent all the data"

    invoke-direct {p1, v0, v4, v2, v4}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;

    const-string v0, "Firmware upload failed"

    invoke-direct {p1, v0, v4, v2, v4}, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$d;->c:Lkotlin/jvm/internal/J;

    iget-boolean v0, v0, Lkotlin/jvm/internal/J;->a:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$d;->d:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, [B

    array-length v0, v0

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b()I

    move-result v1

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$e$d;->d:Lkotlin/jvm/internal/N;

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b()I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object p1, p0, Lcom/ui/wmw/api/v1/f$e$d;->e:Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    new-instance v0, Lcom/ui/wmw/api/v1/m;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/m;-><init>(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    :cond_5
    return-void
.end method
