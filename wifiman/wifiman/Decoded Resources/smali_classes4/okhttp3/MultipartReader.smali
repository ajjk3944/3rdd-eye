.class public final Lokhttp3/MultipartReader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/MultipartReader$Companion;,
        Lokhttp3/MultipartReader$Part;,
        Lokhttp3/MultipartReader$PartSource;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u001b\u001cJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0008\u0018\u00010\u0015R\u00020\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001d"
    }
    d2 = {
        "Lokhttp3/MultipartReader;",
        "Ljava/io/Closeable;",
        "",
        "maxResult",
        "p",
        "(J)J",
        "LYg/J;",
        "close",
        "()V",
        "Lej/g;",
        "a",
        "Lej/g;",
        "source",
        "Lej/h;",
        "b",
        "Lej/h;",
        "crlfDashDashBoundary",
        "",
        "c",
        "Z",
        "closed",
        "Lokhttp3/MultipartReader$PartSource;",
        "d",
        "Lokhttp3/MultipartReader$PartSource;",
        "currentPart",
        "e",
        "Companion",
        "Part",
        "PartSource",
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
.field public static final e:Lokhttp3/MultipartReader$Companion;

.field private static final f:Lej/s;


# instance fields
.field private final a:Lej/g;

.field private final b:Lej/h;

.field private c:Z

.field private d:Lokhttp3/MultipartReader$PartSource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lokhttp3/MultipartReader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/MultipartReader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lokhttp3/MultipartReader;->e:Lokhttp3/MultipartReader$Companion;

    sget-object v0, Lej/s;->d:Lej/s$a;

    sget-object v1, Lej/h;->d:Lej/h$a;

    const-string v2, "\r\n"

    invoke-virtual {v1, v2}, Lej/h$a;->d(Ljava/lang/String;)Lej/h;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v1, v3}, Lej/h$a;->d(Ljava/lang/String;)Lej/h;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v1, v4}, Lej/h$a;->d(Ljava/lang/String;)Lej/h;

    move-result-object v4

    const-string v5, "\t"

    invoke-virtual {v1, v5}, Lej/h$a;->d(Ljava/lang/String;)Lej/h;

    move-result-object v1

    filled-new-array {v2, v3, v4, v1}, [Lej/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lej/s$a;->d([Lej/h;)Lej/s;

    move-result-object v0

    sput-object v0, Lokhttp3/MultipartReader;->f:Lej/s;

    return-void
.end method

.method public static final synthetic a(Lokhttp3/MultipartReader;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Lokhttp3/MultipartReader;->p(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic g(Lokhttp3/MultipartReader;)Lokhttp3/MultipartReader$PartSource;
    .locals 0

    iget-object p0, p0, Lokhttp3/MultipartReader;->d:Lokhttp3/MultipartReader$PartSource;

    return-object p0
.end method

.method public static final synthetic h(Lokhttp3/MultipartReader;)Lej/g;
    .locals 0

    iget-object p0, p0, Lokhttp3/MultipartReader;->a:Lej/g;

    return-object p0
.end method

.method public static final synthetic j(Lokhttp3/MultipartReader;Lokhttp3/MultipartReader$PartSource;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/MultipartReader;->d:Lokhttp3/MultipartReader$PartSource;

    return-void
.end method

.method private final p(J)J
    .locals 4

    iget-object v0, p0, Lokhttp3/MultipartReader;->a:Lej/g;

    iget-object v1, p0, Lokhttp3/MultipartReader;->b:Lej/h;

    invoke-virtual {v1}, Lej/h;->b0()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lej/g;->g0(J)V

    iget-object v0, p0, Lokhttp3/MultipartReader;->a:Lej/g;

    invoke-interface {v0}, Lej/g;->b()Lej/e;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/MultipartReader;->b:Lej/h;

    invoke-virtual {v0, v1}, Lej/e;->W(Lej/h;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lokhttp3/MultipartReader;->a:Lej/g;

    invoke-interface {v0}, Lej/g;->b()Lej/e;

    move-result-object v0

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    iget-object v2, p0, Lokhttp3/MultipartReader;->b:Lej/h;

    invoke-virtual {v2}, Lej/h;->b0()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-boolean v0, p0, Lokhttp3/MultipartReader;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/MultipartReader;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/MultipartReader;->d:Lokhttp3/MultipartReader$PartSource;

    iget-object v0, p0, Lokhttp3/MultipartReader;->a:Lej/g;

    invoke-interface {v0}, Lej/D;->close()V

    return-void
.end method
