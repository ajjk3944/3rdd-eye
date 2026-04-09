.class public final LZi/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# instance fields
.field private final a:LVi/b;

.field private final b:LXi/f;


# direct methods
.method public constructor <init>(LVi/b;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/s0;->a:LVi/b;

    new-instance v0, LZi/Q0;

    invoke-interface {p1}, LVi/b;->a()LXi/f;

    move-result-object p1

    invoke-direct {v0, p1}, LZi/Q0;-><init>(LXi/f;)V

    iput-object v0, p0, LZi/s0;->b:LXi/f;

    return-void
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    iget-object v0, p0, LZi/s0;->b:LXi/f;

    return-object v0
.end method

.method public c(LYi/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYi/e;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZi/s0;->a:LVi/b;

    invoke-interface {p1, v0}, LYi/e;->t(LVi/a;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LYi/e;->r()Ljava/lang/Void;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public e(LYi/f;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p1}, LYi/f;->v()V

    iget-object v0, p0, LZi/s0;->a:LVi/b;

    invoke-interface {p1, v0, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LYi/f;->f()V

    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LZi/s0;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LZi/s0;

    iget-object v2, p0, LZi/s0;->a:LVi/b;

    iget-object p1, p1, LZi/s0;->a:LVi/b;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LZi/s0;->a:LVi/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
