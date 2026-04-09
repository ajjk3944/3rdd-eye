.class final Lcom/ui/wmw/api/v1/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f;->g(JLjava/io/InputStream;Z)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/io/InputStream;

.field final synthetic c:Lcom/ui/wmw/api/v1/f;

.field final synthetic d:Z


# direct methods
.method constructor <init>(JLjava/io/InputStream;Lcom/ui/wmw/api/v1/f;Z)V
    .locals 0

    iput-wide p1, p0, Lcom/ui/wmw/api/v1/f$e;->a:J

    iput-object p3, p0, Lcom/ui/wmw/api/v1/f$e;->b:Ljava/io/InputStream;

    iput-object p4, p0, Lcom/ui/wmw/api/v1/f$e;->c:Lcom/ui/wmw/api/v1/f;

    iput-boolean p5, p0, Lcom/ui/wmw/api/v1/f$e;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/internal/J;)Z
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f$e;->e(Lkotlin/jvm/internal/J;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f$e;->d(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b()I

    move-result v0

    invoke-virtual {p0}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c()Lcom/ui/wmw/api/v1/c;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WMW API - Firmware Uploaded started with chunk size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " and state "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/internal/J;)Z
    .locals 0

    iget-boolean p0, p0, Lkotlin/jvm/internal/J;->a:Z

    return p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$e;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;
    .locals 11

    const-string v0, "initialChunkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wmw/api/v1/j;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/j;-><init>(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    new-instance v0, Lkotlin/jvm/internal/M;

    invoke-direct {v0}, Lkotlin/jvm/internal/M;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/J;

    invoke-direct {v8}, Lkotlin/jvm/internal/J;-><init>()V

    new-instance v6, Lkotlin/jvm/internal/N;

    invoke-direct {v6}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, v6, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v1, Lkotlin/jvm/internal/L;

    invoke-direct {v1}, Lkotlin/jvm/internal/L;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/L;

    invoke-direct {v2}, Lkotlin/jvm/internal/L;-><init>()V

    iget-object v3, p0, Lcom/ui/wmw/api/v1/f$e;->b:Ljava/io/InputStream;

    new-instance v4, Lcom/ui/wmw/api/v1/f$e$f;

    invoke-direct {v4, v2, v3, v6, v1}, Lcom/ui/wmw/api/v1/f$e$f;-><init>(Lkotlin/jvm/internal/L;Ljava/io/InputStream;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/L;)V

    invoke-static {v4}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object v2

    const-string v3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/ui/wmw/api/v1/f$e$a;->a:Lcom/ui/wmw/api/v1/f$e$a;

    invoke-virtual {v2, v3}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object v2

    invoke-virtual {v2}, Lgg/n;->t()Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->o0()Lgg/z;

    move-result-object v2

    new-instance v3, Lcom/ui/wmw/api/v1/f$e$b;

    invoke-direct {v3, v1}, Lcom/ui/wmw/api/v1/f$e$b;-><init>(Lkotlin/jvm/internal/L;)V

    invoke-virtual {v2, v3}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ui/wmw/api/v1/f$e$c;

    iget-object v3, p0, Lcom/ui/wmw/api/v1/f$e;->c:Lcom/ui/wmw/api/v1/f;

    iget-boolean v4, p0, Lcom/ui/wmw/api/v1/f$e;->d:Z

    invoke-direct {v2, v3, v4, v0}, Lcom/ui/wmw/api/v1/f$e$c;-><init>(Lcom/ui/wmw/api/v1/f;ZLkotlin/jvm/internal/M;)V

    invoke-virtual {v1, v2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v9

    new-instance v10, Lcom/ui/wmw/api/v1/f$e$d;

    iget-wide v3, p0, Lcom/ui/wmw/api/v1/f$e;->a:J

    move-object v1, v10

    move-object v2, v0

    move-object v5, v8

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lcom/ui/wmw/api/v1/f$e$d;-><init>(Lkotlin/jvm/internal/M;JLkotlin/jvm/internal/J;Lkotlin/jvm/internal/N;Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)V

    invoke-virtual {v9, v10}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v1, Lcom/ui/wmw/api/v1/k;

    invoke-direct {v1, v8}, Lcom/ui/wmw/api/v1/k;-><init>(Lkotlin/jvm/internal/J;)V

    invoke-virtual {p1, v1}, Lgg/z;->J(Lkg/d;)Lgg/i;

    move-result-object p1

    new-instance v1, Lcom/ui/wmw/api/v1/f$e$e;

    iget-wide v2, p0, Lcom/ui/wmw/api/v1/f$e;->a:J

    invoke-direct {v1, v2, v3, v0}, Lcom/ui/wmw/api/v1/f$e$e;-><init>(JLkotlin/jvm/internal/M;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v1, Lcom/ui/wmw/api/v1/d;

    iget-wide v2, p0, Lcom/ui/wmw/api/v1/f$e;->a:J

    iget-wide v4, v0, Lkotlin/jvm/internal/M;->a:J

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/ui/wmw/api/v1/d;-><init>(JJ)V

    invoke-virtual {p1, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
