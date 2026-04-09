.class public final Lej/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lej/y$a;
    }
.end annotation


# static fields
.field public static final h:Lej/y$a;


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Lej/y;

.field public g:Lej/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lej/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lej/y$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lej/y;->h:Lej/y$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 2
    new-array v0, v0, [B

    iput-object v0, p0, Lej/y;->a:[B

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lej/y;->e:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lej/y;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lej/y;->a:[B

    .line 7
    iput p2, p0, Lej/y;->b:I

    .line 8
    iput p3, p0, Lej/y;->c:I

    .line 9
    iput-boolean p4, p0, Lej/y;->d:Z

    .line 10
    iput-boolean p5, p0, Lej/y;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lej/y;->g:Lej/y;

    if-eq v0, p0, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v0, v0, Lej/y;->e:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lej/y;->c:I

    iget v1, p0, Lej/y;->b:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lej/y;->g:Lej/y;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v1, v1, Lej/y;->c:I

    rsub-int v1, v1, 0x2000

    iget-object v2, p0, Lej/y;->g:Lej/y;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v2, v2, Lej/y;->d:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lej/y;->g:Lej/y;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v2, v2, Lej/y;->b:I

    :goto_0
    add-int/2addr v1, v2

    if-le v0, v1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Lej/y;->g:Lej/y;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v0}, Lej/y;->g(Lej/y;I)V

    invoke-virtual {p0}, Lej/y;->b()Lej/y;

    invoke-static {p0}, Lej/z;->b(Lej/y;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot compact"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lej/y;
    .locals 4

    iget-object v0, p0, Lej/y;->f:Lej/y;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lej/y;->g:Lej/y;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, Lej/y;->f:Lej/y;

    iput-object v3, v2, Lej/y;->f:Lej/y;

    iget-object v2, p0, Lej/y;->f:Lej/y;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, Lej/y;->g:Lej/y;

    iput-object v3, v2, Lej/y;->g:Lej/y;

    iput-object v1, p0, Lej/y;->f:Lej/y;

    iput-object v1, p0, Lej/y;->g:Lej/y;

    return-object v0
.end method

.method public final c(Lej/y;)Lej/y;
    .locals 1

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lej/y;->g:Lej/y;

    iget-object v0, p0, Lej/y;->f:Lej/y;

    iput-object v0, p1, Lej/y;->f:Lej/y;

    iget-object v0, p0, Lej/y;->f:Lej/y;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iput-object p1, v0, Lej/y;->g:Lej/y;

    iput-object p1, p0, Lej/y;->f:Lej/y;

    return-object p1
.end method

.method public final d()Lej/y;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lej/y;->d:Z

    new-instance v0, Lej/y;

    iget-object v2, p0, Lej/y;->a:[B

    iget v3, p0, Lej/y;->b:I

    iget v4, p0, Lej/y;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lej/y;-><init>([BIIZZ)V

    return-object v0
.end method

.method public final e(I)Lej/y;
    .locals 8

    if-lez p1, :cond_1

    iget v0, p0, Lej/y;->c:I

    iget v1, p0, Lej/y;->b:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_1

    const/16 v0, 0x400

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lej/y;->d()Lej/y;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lej/z;->c()Lej/y;

    move-result-object v0

    iget-object v1, p0, Lej/y;->a:[B

    iget-object v2, v0, Lej/y;->a:[B

    iget v4, p0, Lej/y;->b:I

    add-int v5, v4, p1

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, LZg/n;->n([B[BIIIILjava/lang/Object;)[B

    :goto_0
    iget v1, v0, Lej/y;->b:I

    add-int/2addr v1, p1

    iput v1, v0, Lej/y;->c:I

    iget v1, p0, Lej/y;->b:I

    add-int/2addr v1, p1

    iput v1, p0, Lej/y;->b:I

    iget-object p1, p0, Lej/y;->g:Lej/y;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lej/y;->c(Lej/y;)Lej/y;

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteCount out of range"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()Lej/y;
    .locals 7

    new-instance v6, Lej/y;

    iget-object v0, p0, Lej/y;->a:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    const-string v0, "copyOf(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lej/y;->b:I

    iget v3, p0, Lej/y;->c:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lej/y;-><init>([BIIZZ)V

    return-object v6
.end method

.method public final g(Lej/y;I)V
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lej/y;->e:Z

    if-eqz v0, :cond_3

    iget v5, p1, Lej/y;->c:I

    add-int v0, v5, p2

    const/16 v1, 0x2000

    if-le v0, v1, :cond_2

    iget-boolean v0, p1, Lej/y;->d:Z

    if-nez v0, :cond_1

    add-int v0, v5, p2

    iget v4, p1, Lej/y;->b:I

    sub-int/2addr v0, v4

    if-gt v0, v1, :cond_0

    iget-object v2, p1, Lej/y;->a:[B

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v1, v2

    invoke-static/range {v1 .. v7}, LZg/n;->n([B[BIIIILjava/lang/Object;)[B

    iget v0, p1, Lej/y;->c:I

    iget v1, p1, Lej/y;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, Lej/y;->c:I

    const/4 v0, 0x0

    iput v0, p1, Lej/y;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lej/y;->a:[B

    iget-object v1, p1, Lej/y;->a:[B

    iget v2, p1, Lej/y;->c:I

    iget v3, p0, Lej/y;->b:I

    add-int v4, v3, p2

    invoke-static {v0, v1, v2, v3, v4}, LZg/n;->h([B[BIII)[B

    iget v0, p1, Lej/y;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lej/y;->c:I

    iget p1, p0, Lej/y;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lej/y;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
