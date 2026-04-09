.class public abstract LZi/w;
.super LZi/a;
.source "SourceFile"


# instance fields
.field private final a:LVi/b;


# direct methods
.method private constructor <init>(LVi/b;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LZi/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, LZi/w;->a:LVi/b;

    return-void
.end method

.method public synthetic constructor <init>(LVi/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZi/w;-><init>(LVi/b;)V

    return-void
.end method

.method public static final synthetic s(LZi/w;)LVi/b;
    .locals 0

    iget-object p0, p0, LZi/w;->a:LVi/b;

    return-object p0
.end method


# virtual methods
.method public abstract a()LXi/f;
.end method

.method public e(LYi/f;Ljava/lang/Object;)V
    .locals 6

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LZi/a;->k(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, LZi/w;->a()LXi/f;

    move-result-object v1

    invoke-interface {p1, v1, v0}, LYi/f;->x(LXi/f;I)LYi/d;

    move-result-object p1

    invoke-virtual {p0, p2}, LZi/a;->j(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0}, LZi/w;->a()LXi/f;

    move-result-object v3

    invoke-static {p0}, LZi/w;->s(LZi/w;)LVi/b;

    move-result-object v4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p1, v3, v2, v4, v5}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, LYi/d;->b(LXi/f;)V

    return-void
.end method

.method protected final m(LYi/c;Ljava/lang/Object;II)V
    .locals 3

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p4, :cond_1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_0

    add-int v2, p3, v1

    invoke-virtual {p0, p1, v2, p2, v0}, LZi/w;->n(LYi/c;ILjava/lang/Object;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Size must be known in advance when using READ_ALL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected n(LYi/c;ILjava/lang/Object;Z)V
    .locals 7

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/w;->a()LXi/f;

    move-result-object v1

    iget-object v3, p0, LZi/w;->a:LVi/b;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move v2, p2

    invoke-static/range {v0 .. v6}, LYi/c;->j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p3, p2, p1}, LZi/w;->t(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method protected abstract t(Ljava/lang/Object;ILjava/lang/Object;)V
.end method
