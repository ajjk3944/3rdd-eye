.class public abstract LZi/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# instance fields
.field private final a:LVi/b;

.field private final b:LVi/b;


# direct methods
.method private constructor <init>(LVi/b;LVi/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LZi/Z;->a:LVi/b;

    .line 4
    iput-object p2, p0, LZi/Z;->b:LVi/b;

    return-void
.end method

.method public synthetic constructor <init>(LVi/b;LVi/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LZi/Z;-><init>(LVi/b;LVi/b;)V

    return-void
.end method


# virtual methods
.method public c(LYi/e;)Ljava/lang/Object;
    .locals 10

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-virtual {p0}, LZi/Z;->h()LVi/b;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-virtual {p0}, LZi/Z;->j()LVi/b;

    move-result-object v4

    const/4 v3, 0x1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v8, v1}, LZi/Z;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v1

    move-object v9, v2

    :goto_0
    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v1

    invoke-interface {p1, v1}, LYi/c;->k(LXi/f;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-virtual {p0}, LZi/Z;->j()LVi/b;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid index: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    invoke-virtual {p0}, LZi/Z;->h()LVi/b;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_0

    :cond_3
    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object v1

    if-eq v8, v1, :cond_5

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object v1

    if-eq v9, v1, :cond_4

    invoke-virtual {p0, v8, v9}, LZi/Z;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    return-object v1

    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Element \'value\' is missing"

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Element \'key\' is missing"

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(LYi/f;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    iget-object v1, p0, LZi/Z;->a:LVi/b;

    invoke-virtual {p0, p2}, LZi/Z;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, v0, v3, v1, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    iget-object v1, p0, LZi/Z;->b:LVi/b;

    invoke-virtual {p0, p2}, LZi/Z;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x1

    invoke-interface {p1, v0, v2, v1, p2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/d;->b(LXi/f;)V

    return-void
.end method

.method protected abstract g(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected final h()LVi/b;
    .locals 1

    iget-object v0, p0, LZi/Z;->a:LVi/b;

    return-object v0
.end method

.method protected abstract i(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected final j()LVi/b;
    .locals 1

    iget-object v0, p0, LZi/Z;->b:LVi/b;

    return-object v0
.end method

.method protected abstract k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
