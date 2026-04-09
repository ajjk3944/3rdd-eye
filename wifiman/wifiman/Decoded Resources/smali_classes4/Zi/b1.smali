.class public final LZi/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# instance fields
.field private final a:LVi/b;

.field private final b:LVi/b;

.field private final c:LVi/b;

.field private final d:LXi/f;


# direct methods
.method public constructor <init>(LVi/b;LVi/b;LVi/b;)V
    .locals 1

    const-string v0, "aSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bSerializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cSerializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/b1;->a:LVi/b;

    iput-object p2, p0, LZi/b1;->b:LVi/b;

    iput-object p3, p0, LZi/b1;->c:LVi/b;

    const/4 p1, 0x0

    new-array p1, p1, [LXi/f;

    new-instance p2, LZi/a1;

    invoke-direct {p2, p0}, LZi/a1;-><init>(LZi/b1;)V

    const-string p3, "kotlin.Triple"

    invoke-static {p3, p1, p2}, LXi/l;->c(Ljava/lang/String;[LXi/f;Lmh/l;)LXi/f;

    move-result-object p1

    iput-object p1, p0, LZi/b1;->d:LXi/f;

    return-void
.end method

.method public static synthetic g(LZi/b1;LXi/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LZi/b1;->j(LZi/b1;LXi/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private final h(LYi/c;)LYg/y;
    .locals 9

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v1

    iget-object v3, p0, LZi/b1;->a:LVi/b;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v2

    iget-object v4, p0, LZi/b1;->b:LVi/b;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v3

    iget-object v5, p0, LZi/b1;->c:LVi/b;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v3

    invoke-interface {p1, v3}, LYi/c;->b(LXi/f;)V

    new-instance p1, LYg/y;

    invoke-direct {p1, v0, v1, v2}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private final i(LYi/c;)LYg/y;
    .locals 11

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v3

    invoke-interface {p1, v3}, LYi/c;->k(LXi/f;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v2, 0x2

    if-ne v3, v2, :cond_0

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v5

    iget-object v7, p0, LZi/b1;->c:LVi/b;

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v6, 0x2

    const/4 v8, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v4

    iget-object v6, p0, LZi/b1;->b:LVi/b;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v4

    iget-object v6, p0, LZi/b1;->a:LVi/b;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v3

    invoke-interface {p1, v3}, LYi/c;->b(LXi/f;)V

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_6

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object p1

    if-eq v1, p1, :cond_5

    invoke-static {}, LZi/c1;->a()Ljava/lang/Object;

    move-result-object p1

    if-eq v2, p1, :cond_4

    new-instance p1, LYg/y;

    invoke-direct {p1, v0, v1, v2}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Element \'third\' is missing"

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Element \'second\' is missing"

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Element \'first\' is missing"

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final j(LZi/b1;LXi/a;)LYg/J;
    .locals 8

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZi/b1;->a:LVi/b;

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "first"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    iget-object v0, p0, LZi/b1;->b:LVi/b;

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object v3

    const-string v2, "second"

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    iget-object p0, p0, LZi/b1;->c:LVi/b;

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v1, "third"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    iget-object v0, p0, LZi/b1;->d:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZi/b1;->k(LYi/e;)LYg/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LYg/y;

    invoke-virtual {p0, p1, p2}, LZi/b1;->l(LYi/f;LYg/y;)V

    return-void
.end method

.method public k(LYi/e;)LYg/y;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LZi/b1;->h(LYi/c;)LYg/y;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LZi/b1;->i(LYi/c;)LYg/y;

    move-result-object p1

    return-object p1
.end method

.method public l(LYi/f;LYg/y;)V
    .locals 4

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v0

    iget-object v1, p0, LZi/b1;->a:LVi/b;

    invoke-virtual {p2}, LYg/y;->j()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, v0, v3, v1, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v0

    iget-object v1, p0, LZi/b1;->b:LVi/b;

    invoke-virtual {p2}, LYg/y;->l()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p1, v0, v3, v1, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object v0

    iget-object v1, p0, LZi/b1;->c:LVi/b;

    invoke-virtual {p2}, LYg/y;->m()Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x2

    invoke-interface {p1, v0, v2, v1, p2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    invoke-virtual {p0}, LZi/b1;->a()LXi/f;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/d;->b(LXi/f;)V

    return-void
.end method
