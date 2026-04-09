.class public abstract Lkb/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lkb/p;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final f(Ljava/nio/ByteBuffer;)V
    .locals 3

    iget-object v0, p0, Lkb/r;->a:Lkb/p;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkb/r;->c()Lkb/p;

    move-result-object v0

    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Lkb/p;->a(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v0}, Lkb/r;->e(Lkb/p;)V

    invoke-virtual {v0}, Lkb/p;->d()Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v0, p0, Lkb/r;->a:Lkb/p;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lkb/r;->a:Lkb/p;

    invoke-virtual {p0, v0}, Lkb/r;->d(Lkb/p;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lez v0, :cond_2

    invoke-direct {p0, p1}, Lkb/r;->f(Ljava/nio/ByteBuffer;)V

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception p1

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Failed to append data"

    invoke-virtual {v0, p1, v2, v1}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0, p1}, Lkb/r;->f(Ljava/nio/ByteBuffer;)V

    :cond_0
    return-void
.end method

.method protected abstract c()Lkb/p;
.end method

.method protected abstract d(Lkb/p;)V
.end method

.method protected e(Lkb/p;)V
    .locals 1

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
