.class public final LZi/j0;
.super LZi/Z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZi/j0$a;
    }
.end annotation


# instance fields
.field private final c:LXi/f;


# direct methods
.method public constructor <init>(LVi/b;LVi/b;)V
    .locals 3

    const-string v0, "keySerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueSerializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LZi/Z;-><init>(LVi/b;LVi/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, LXi/n$c;->a:LXi/n$c;

    const/4 v1, 0x0

    new-array v1, v1, [LXi/f;

    new-instance v2, LZi/i0;

    invoke-direct {v2, p1, p2}, LZi/i0;-><init>(LVi/b;LVi/b;)V

    const-string p1, "kotlin.collections.Map.Entry"

    invoke-static {p1, v0, v1, v2}, LXi/l;->d(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;)LXi/f;

    move-result-object p1

    iput-object p1, p0, LZi/j0;->c:LXi/f;

    return-void
.end method

.method public static synthetic l(LVi/b;LVi/b;LXi/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LZi/j0;->m(LVi/b;LVi/b;LXi/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final m(LVi/b;LVi/b;LXi/a;)LYg/J;
    .locals 8

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "key"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    invoke-interface {p1}, LVi/b;->a()LXi/f;

    move-result-object v3

    const-string v2, "value"

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    iget-object v0, p0, LZi/j0;->c:LXi/f;

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, LZi/j0;->n(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, LZi/j0;->o(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZi/j0;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method protected n(Ljava/util/Map$Entry;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected o(Ljava/util/Map$Entry;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    new-instance v0, LZi/j0$a;

    invoke-direct {v0, p1, p2}, LZi/j0$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
