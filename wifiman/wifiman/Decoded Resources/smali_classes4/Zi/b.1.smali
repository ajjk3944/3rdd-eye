.class public abstract LZi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic g(LZi/b;LYi/c;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LZi/b;->h(LYi/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(LYi/c;)Ljava/lang/Object;
    .locals 8

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, LVi/g;->a(LZi/b;LYi/c;Ljava/lang/String;)LVi/a;

    move-result-object v4

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(LYi/e;)Ljava/lang/Object;
    .locals 9

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    new-instance v8, Lkotlin/jvm/internal/N;

    invoke-direct {v8}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, LZi/b;->g(LZi/b;LYi/c;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-interface {p1, v2}, LYi/c;->k(LXi/f;)I

    move-result v3

    const/4 v2, -0x1

    if-eq v3, v2, :cond_5

    if-eqz v3, :cond_4

    const/4 v1, 0x1

    if-eq v3, v1, :cond_2

    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid index in polymorphic deserialization of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    const-string v1, "unknown class"

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n Expected 0, 1 or DECODE_DONE(-1), but found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v1, :cond_3

    iput-object v1, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p0, p1, v1}, LVi/g;->a(LZi/b;LYi/c;Ljava/lang/String;)LVi/a;

    move-result-object v4

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot read polymorphic value before its type token"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-interface {p1, v2, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_6

    const-string v2, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    return-object v1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Polymorphic value has not been read for class "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(LYi/f;Ljava/lang/Object;)V
    .locals 5

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LVi/g;->b(LZi/b;LYi/f;Ljava/lang/Object;)LVi/o;

    move-result-object v0

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v1

    invoke-interface {p1, v1}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-interface {v0}, LVi/o;->a()LXi/f;

    move-result-object v3

    invoke-interface {v3}, LXi/f;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {p1, v2, v4, v3}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-interface {p1, v2, v3, v0, p2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, LYi/d;->b(LXi/f;)V

    return-void
.end method

.method public i(LYi/c;Ljava/lang/String;)LVi/a;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYi/c;->a()Lcj/e;

    move-result-object p1

    invoke-virtual {p0}, LZi/b;->k()Lth/d;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcj/e;->e(Lth/d;Ljava/lang/String;)LVi/a;

    move-result-object p1

    return-object p1
.end method

.method public j(LYi/f;Ljava/lang/Object;)LVi/o;
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYi/f;->a()Lcj/e;

    move-result-object p1

    invoke-virtual {p0}, LZi/b;->k()Lth/d;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcj/e;->f(Lth/d;Ljava/lang/Object;)LVi/o;

    move-result-object p1

    return-object p1
.end method

.method public abstract k()Lth/d;
.end method
