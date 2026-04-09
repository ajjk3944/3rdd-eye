.class public abstract Lkb/m;
.super Lkb/p;
.source "SourceFile"


# instance fields
.field private d:Lkb/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lkb/p;-><init>()V

    new-instance v0, Lkb/k;

    invoke-direct {v0}, Lkb/k;-><init>()V

    iput-object v0, p0, Lkb/m;->d:Lkb/k;

    return-void
.end method


# virtual methods
.method public b()[B
    .locals 1

    iget-object v0, p0, Lkb/m;->d:Lkb/k;

    invoke-virtual {v0}, Lkb/k;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    invoke-virtual {p0}, Lkb/p;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkb/m;->d:Lkb/k;

    invoke-virtual {v0}, Lkb/k;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkb/m;->d:Lkb/k;

    invoke-virtual {v0}, Lkb/k;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkb/m;->d:Lkb/k;

    invoke-virtual {v0, p1}, Lkb/k;->a(Ljava/nio/ByteBuffer;)V

    :cond_0
    return-void
.end method
