.class public abstract Lkb/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lkb/q;

.field private b:Ljava/lang/String;

.field private c:Lkb/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkb/k;

    invoke-direct {v0}, Lkb/k;-><init>()V

    iput-object v0, p0, Lkb/p;->c:Lkb/k;

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)V
    .locals 3

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkb/p;->c:Lkb/k;

    invoke-virtual {v0}, Lkb/k;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkb/p;->c:Lkb/k;

    invoke-virtual {v0, p1}, Lkb/k;->a(Ljava/nio/ByteBuffer;)V

    :cond_0
    iget-object v0, p0, Lkb/p;->c:Lkb/k;

    invoke-virtual {v0}, Lkb/k;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkb/p;->a:Lkb/q;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lkb/p;->c:Lkb/k;

    invoke-virtual {v1}, Lkb/k;->c()[B

    move-result-object v1

    sget-object v2, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Lkb/p;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkb/p;->g(Ljava/lang/String;)Lkb/q;

    move-result-object v0

    iput-object v0, p0, Lkb/p;->a:Lkb/q;

    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lkb/p;->f(Ljava/nio/ByteBuffer;)V

    :cond_2
    return-void
.end method

.method public abstract b()[B
.end method

.method public final c()Lkb/q;
    .locals 1

    iget-object v0, p0, Lkb/p;->a:Lkb/q;

    return-object v0
.end method

.method public abstract d()Z
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lkb/p;->c:Lkb/k;

    invoke-virtual {v0}, Lkb/k;->d()Z

    move-result v0

    return v0
.end method

.method public abstract f(Ljava/nio/ByteBuffer;)V
.end method

.method public abstract g(Ljava/lang/String;)Lkb/q;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lkb/p;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkb/p;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string/jumbo v0, "_headerString"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "header: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string/jumbo v0, "Still waiting!"

    :goto_0
    return-object v0
.end method
