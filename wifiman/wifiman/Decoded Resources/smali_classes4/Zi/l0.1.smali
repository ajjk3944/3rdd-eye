.class public abstract LZi/l0;
.super LZi/a;
.source "SourceFile"


# instance fields
.field private final a:LVi/b;

.field private final b:LVi/b;


# direct methods
.method private constructor <init>(LVi/b;LVi/b;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LZi/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, LZi/l0;->a:LVi/b;

    .line 4
    iput-object p2, p0, LZi/l0;->b:LVi/b;

    return-void
.end method

.method public synthetic constructor <init>(LVi/b;LVi/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LZi/l0;-><init>(LVi/b;LVi/b;)V

    return-void
.end method


# virtual methods
.method public abstract a()LXi/f;
.end method

.method public e(LYi/f;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LZi/a;->k(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, LZi/l0;->a()LXi/f;

    move-result-object v1

    invoke-interface {p1, v1, v0}, LYi/f;->x(LXi/f;I)LYi/d;

    move-result-object p1

    invoke-virtual {p0, p2}, LZi/a;->j(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, LZi/l0;->a()LXi/f;

    move-result-object v4

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {p0}, LZi/l0;->s()LVi/b;

    move-result-object v6

    invoke-interface {p1, v4, v0, v6, v3}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    invoke-virtual {p0}, LZi/l0;->a()LXi/f;

    move-result-object v3

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, LZi/l0;->t()LVi/b;

    move-result-object v4

    invoke-interface {p1, v3, v5, v4, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, LYi/d;->b(LXi/f;)V

    return-void
.end method

.method public bridge synthetic m(LYi/c;Ljava/lang/Object;II)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3, p4}, LZi/l0;->u(LYi/c;Ljava/util/Map;II)V

    return-void
.end method

.method public bridge synthetic n(LYi/c;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3, p4}, LZi/l0;->v(LYi/c;ILjava/util/Map;Z)V

    return-void
.end method

.method public final s()LVi/b;
    .locals 1

    iget-object v0, p0, LZi/l0;->a:LVi/b;

    return-object v0
.end method

.method public final t()LVi/b;
    .locals 1

    iget-object v0, p0, LZi/l0;->b:LVi/b;

    return-object v0
.end method

.method protected final u(LYi/c;Ljava/util/Map;II)V
    .locals 4

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p4, :cond_3

    const/4 v0, 0x2

    mul-int/2addr p4, v0

    const/4 v1, 0x0

    invoke-static {v1, p4}, Lsh/m;->s(II)Lsh/i;

    move-result-object p4

    invoke-static {p4, v0}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object p4

    invoke-virtual {p4}, Lsh/g;->i()I

    move-result v0

    invoke-virtual {p4}, Lsh/g;->j()I

    move-result v2

    invoke-virtual {p4}, Lsh/g;->k()I

    move-result p4

    if-lez p4, :cond_0

    if-le v0, v2, :cond_1

    :cond_0
    if-gez p4, :cond_2

    if-gt v2, v0, :cond_2

    :cond_1
    :goto_0
    add-int v3, p3, v0

    invoke-virtual {p0, p1, v3, p2, v1}, LZi/l0;->v(LYi/c;ILjava/util/Map;Z)V

    if-eq v0, v2, :cond_2

    add-int/2addr v0, p4

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Size must be known in advance when using READ_ALL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final v(LYi/c;ILjava/util/Map;Z)V
    .locals 8

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/l0;->a()LXi/f;

    move-result-object v2

    iget-object v4, p0, LZi/l0;->a:LVi/b;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move v3, p2

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz p4, :cond_1

    invoke-virtual {p0}, LZi/l0;->a()LXi/f;

    move-result-object p4

    invoke-interface {p1, p4}, LYi/c;->k(LXi/f;)I

    move-result p4

    add-int/lit8 v1, p2, 0x1

    if-ne p4, v1, :cond_0

    :goto_0
    move v3, p4

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Value must follow key in a map, index for key: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", returned index for value: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    add-int/lit8 p4, p2, 0x1

    goto :goto_0

    :goto_1
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LZi/l0;->b:LVi/b;

    invoke-interface {p2}, LVi/b;->a()LXi/f;

    move-result-object p2

    invoke-interface {p2}, LXi/f;->h()LXi/m;

    move-result-object p2

    instance-of p2, p2, LXi/e;

    if-nez p2, :cond_2

    invoke-virtual {p0}, LZi/l0;->a()LXi/f;

    move-result-object p2

    iget-object p4, p0, LZi/l0;->b:LVi/b;

    invoke-static {p3, v0}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, p2, v3, p4, v1}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, LZi/l0;->a()LXi/f;

    move-result-object v2

    iget-object v4, p0, LZi/l0;->b:LVi/b;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-interface {p3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
