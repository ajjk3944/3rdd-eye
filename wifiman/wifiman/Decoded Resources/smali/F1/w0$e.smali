.class abstract LF1/w0$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final a:LF1/w0;

.field b:[Lw1/f;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, LF1/w0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF1/w0;-><init>(LF1/w0;)V

    invoke-direct {p0, v0}, LF1/w0$e;-><init>(LF1/w0;)V

    return-void
.end method

.method constructor <init>(LF1/w0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LF1/w0$e;->a:LF1/w0;

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 5

    iget-object v0, p0, LF1/w0$e;->b:[Lw1/f;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, LF1/w0$l;->d(I)I

    move-result v2

    aget-object v0, v0, v2

    iget-object v2, p0, LF1/w0$e;->b:[Lw1/f;

    const/4 v3, 0x2

    invoke-static {v3}, LF1/w0$l;->d(I)I

    move-result v4

    aget-object v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, LF1/w0$e;->a:LF1/w0;

    invoke-virtual {v2, v3}, LF1/w0;->f(I)Lw1/f;

    move-result-object v2

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, LF1/w0$e;->a:LF1/w0;

    invoke-virtual {v0, v1}, LF1/w0;->f(I)Lw1/f;

    move-result-object v0

    :cond_1
    invoke-static {v0, v2}, Lw1/f;->a(Lw1/f;Lw1/f;)Lw1/f;

    move-result-object v0

    invoke-virtual {p0, v0}, LF1/w0$e;->g(Lw1/f;)V

    iget-object v0, p0, LF1/w0$e;->b:[Lw1/f;

    const/16 v1, 0x10

    invoke-static {v1}, LF1/w0$l;->d(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, LF1/w0$e;->f(Lw1/f;)V

    :cond_2
    iget-object v0, p0, LF1/w0$e;->b:[Lw1/f;

    const/16 v1, 0x20

    invoke-static {v1}, LF1/w0$l;->d(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, LF1/w0$e;->d(Lw1/f;)V

    :cond_3
    iget-object v0, p0, LF1/w0$e;->b:[Lw1/f;

    const/16 v1, 0x40

    invoke-static {v1}, LF1/w0$l;->d(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, LF1/w0$e;->h(Lw1/f;)V

    :cond_4
    return-void
.end method

.method abstract b()LF1/w0;
.end method

.method c(ILw1/f;)V
    .locals 3

    iget-object v0, p0, LF1/w0$e;->b:[Lw1/f;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [Lw1/f;

    iput-object v0, p0, LF1/w0$e;->b:[Lw1/f;

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    and-int v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LF1/w0$e;->b:[Lw1/f;

    invoke-static {v0}, LF1/w0$l;->d(I)I

    move-result v2

    aput-object p2, v1, v2

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method d(Lw1/f;)V
    .locals 0

    return-void
.end method

.method abstract e(Lw1/f;)V
.end method

.method f(Lw1/f;)V
    .locals 0

    return-void
.end method

.method abstract g(Lw1/f;)V
.end method

.method h(Lw1/f;)V
    .locals 0

    return-void
.end method
