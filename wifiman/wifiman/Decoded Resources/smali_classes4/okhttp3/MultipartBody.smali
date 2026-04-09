.class public final Lokhttp3/MultipartBody;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/MultipartBody$Builder;,
        Lokhttp3/MultipartBody$Companion;,
        Lokhttp3/MultipartBody$Part;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u0000 (2\u00020\u0001:\u0003)*+B\'\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0007\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0005\u0010\u0013R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0007\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0008\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001bR\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0011\u0010\'\u001a\u00020$8G\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&\u00a8\u0006,"
    }
    d2 = {
        "Lokhttp3/MultipartBody;",
        "Lokhttp3/RequestBody;",
        "Lej/h;",
        "boundaryByteString",
        "Lokhttp3/MediaType;",
        "type",
        "",
        "Lokhttp3/MultipartBody$Part;",
        "parts",
        "<init>",
        "(Lej/h;Lokhttp3/MediaType;Ljava/util/List;)V",
        "Lej/f;",
        "sink",
        "",
        "countBytes",
        "",
        "j",
        "(Lej/f;Z)J",
        "b",
        "()Lokhttp3/MediaType;",
        "a",
        "()J",
        "LYg/J;",
        "h",
        "(Lej/f;)V",
        "Lej/h;",
        "c",
        "Lokhttp3/MediaType;",
        "d",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "e",
        "contentType",
        "f",
        "J",
        "contentLength",
        "",
        "i",
        "()Ljava/lang/String;",
        "boundary",
        "g",
        "Builder",
        "Companion",
        "Part",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:Lokhttp3/MultipartBody$Companion;

.field public static final h:Lokhttp3/MediaType;

.field public static final i:Lokhttp3/MediaType;

.field public static final j:Lokhttp3/MediaType;

.field public static final k:Lokhttp3/MediaType;

.field public static final l:Lokhttp3/MediaType;

.field private static final m:[B

.field private static final n:[B

.field private static final o:[B


# instance fields
.field private final b:Lej/h;

.field private final c:Lokhttp3/MediaType;

.field private final d:Ljava/util/List;

.field private final e:Lokhttp3/MediaType;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/MultipartBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/MultipartBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lokhttp3/MultipartBody;->g:Lokhttp3/MultipartBody$Companion;

    sget-object v0, Lokhttp3/MediaType;->e:Lokhttp3/MediaType$Companion;

    const-string v1, "multipart/mixed"

    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    sput-object v1, Lokhttp3/MultipartBody;->h:Lokhttp3/MediaType;

    const-string v1, "multipart/alternative"

    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    sput-object v1, Lokhttp3/MultipartBody;->i:Lokhttp3/MediaType;

    const-string v1, "multipart/digest"

    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    sput-object v1, Lokhttp3/MultipartBody;->j:Lokhttp3/MediaType;

    const-string v1, "multipart/parallel"

    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    sput-object v1, Lokhttp3/MultipartBody;->k:Lokhttp3/MediaType;

    const-string v1, "multipart/form-data"

    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lokhttp3/MultipartBody;->l:Lokhttp3/MediaType;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lokhttp3/MultipartBody;->m:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_1

    sput-object v1, Lokhttp3/MultipartBody;->n:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lokhttp3/MultipartBody;->o:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Lej/h;Lokhttp3/MediaType;Ljava/util/List;)V
    .locals 1

    const-string v0, "boundaryByteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parts"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    iput-object p1, p0, Lokhttp3/MultipartBody;->b:Lej/h;

    iput-object p2, p0, Lokhttp3/MultipartBody;->c:Lokhttp3/MediaType;

    iput-object p3, p0, Lokhttp3/MultipartBody;->d:Ljava/util/List;

    sget-object p1, Lokhttp3/MediaType;->e:Lokhttp3/MediaType$Companion;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lokhttp3/MultipartBody;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/MultipartBody;->e:Lokhttp3/MediaType;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lokhttp3/MultipartBody;->f:J

    return-void
.end method

.method private final j(Lej/f;Z)J
    .locals 12

    if-eqz p2, :cond_0

    new-instance p1, Lej/e;

    invoke-direct {p1}, Lej/e;-><init>()V

    move-object v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lokhttp3/MultipartBody;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move v5, v2

    :goto_1
    if-ge v5, v1, :cond_6

    iget-object v6, p0, Lokhttp3/MultipartBody;->d:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lokhttp3/MultipartBody$Part;

    invoke-virtual {v6}, Lokhttp3/MultipartBody$Part;->b()Lokhttp3/Headers;

    move-result-object v7

    invoke-virtual {v6}, Lokhttp3/MultipartBody$Part;->a()Lokhttp3/RequestBody;

    move-result-object v6

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v8, Lokhttp3/MultipartBody;->o:[B

    invoke-interface {p1, v8}, Lej/f;->X([B)Lej/f;

    iget-object v8, p0, Lokhttp3/MultipartBody;->b:Lej/h;

    invoke-interface {p1, v8}, Lej/f;->R(Lej/h;)Lej/f;

    sget-object v8, Lokhttp3/MultipartBody;->n:[B

    invoke-interface {p1, v8}, Lej/f;->X([B)Lej/f;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lokhttp3/Headers;->size()I

    move-result v8

    move v9, v2

    :goto_2
    if-ge v9, v8, :cond_1

    invoke-virtual {v7, v9}, Lokhttp3/Headers;->e(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {p1, v10}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    move-result-object v10

    sget-object v11, Lokhttp3/MultipartBody;->m:[B

    invoke-interface {v10, v11}, Lej/f;->X([B)Lej/f;

    move-result-object v10

    invoke-virtual {v7, v9}, Lokhttp3/Headers;->j(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    move-result-object v10

    sget-object v11, Lokhttp3/MultipartBody;->n:[B

    invoke-interface {v10, v11}, Lej/f;->X([B)Lej/f;

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, Lokhttp3/RequestBody;->b()Lokhttp3/MediaType;

    move-result-object v7

    if-eqz v7, :cond_2

    const-string v8, "Content-Type: "

    invoke-interface {p1, v8}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    move-result-object v8

    invoke-virtual {v7}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    move-result-object v7

    sget-object v8, Lokhttp3/MultipartBody;->n:[B

    invoke-interface {v7, v8}, Lej/f;->X([B)Lej/f;

    :cond_2
    invoke-virtual {v6}, Lokhttp3/RequestBody;->a()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-eqz v11, :cond_3

    const-string v9, "Content-Length: "

    invoke-interface {p1, v9}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    move-result-object v9

    invoke-interface {v9, v7, v8}, Lej/f;->h0(J)Lej/f;

    move-result-object v9

    sget-object v10, Lokhttp3/MultipartBody;->n:[B

    invoke-interface {v9, v10}, Lej/f;->X([B)Lej/f;

    goto :goto_3

    :cond_3
    if-eqz p2, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lej/e;->clear()V

    return-wide v9

    :cond_4
    :goto_3
    sget-object v9, Lokhttp3/MultipartBody;->n:[B

    invoke-interface {p1, v9}, Lej/f;->X([B)Lej/f;

    if-eqz p2, :cond_5

    add-long/2addr v3, v7

    goto :goto_4

    :cond_5
    invoke-virtual {v6, p1}, Lokhttp3/RequestBody;->h(Lej/f;)V

    :goto_4
    invoke-interface {p1, v9}, Lej/f;->X([B)Lej/f;

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_6
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v1, Lokhttp3/MultipartBody;->o:[B

    invoke-interface {p1, v1}, Lej/f;->X([B)Lej/f;

    iget-object v2, p0, Lokhttp3/MultipartBody;->b:Lej/h;

    invoke-interface {p1, v2}, Lej/f;->R(Lej/h;)Lej/f;

    invoke-interface {p1, v1}, Lej/f;->X([B)Lej/f;

    sget-object v1, Lokhttp3/MultipartBody;->n:[B

    invoke-interface {p1, v1}, Lej/f;->X([B)Lej/f;

    if-eqz p2, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide p1

    add-long/2addr v3, p1

    invoke-virtual {v0}, Lej/e;->clear()V

    :cond_7
    return-wide v3
.end method


# virtual methods
.method public a()J
    .locals 4

    iget-wide v0, p0, Lokhttp3/MultipartBody;->f:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lokhttp3/MultipartBody;->j(Lej/f;Z)J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/MultipartBody;->f:J

    :cond_0
    return-wide v0
.end method

.method public b()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Lokhttp3/MultipartBody;->e:Lokhttp3/MediaType;

    return-object v0
.end method

.method public h(Lej/f;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lokhttp3/MultipartBody;->j(Lej/f;Z)J

    return-void
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lokhttp3/MultipartBody;->b:Lej/h;

    invoke-virtual {v0}, Lej/h;->q0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
