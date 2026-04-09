.class final Le9/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d;->e(Le9/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/d;


# direct methods
.method constructor <init>(Le9/d;)V
    .locals 0

    iput-object p1, p0, Le9/d$e;->a:Le9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le9/d;Le9/c$a;)V
    .locals 0

    invoke-static {p0, p1}, Le9/d$e;->c(Le9/d;Le9/c$a;)V

    return-void
.end method

.method private static final c(Le9/d;Le9/c$a;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$packResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/d$e$c;

    invoke-direct {v0, p0, p1}, Le9/d$e$c;-><init>(Le9/d;Le9/c$a;)V

    invoke-static {v0}, Lf9/a;->b(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le9/c$a;

    invoke-virtual {p0, p1}, Le9/d$e;->b(Le9/c$a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Le9/c$a;)Lgg/D;
    .locals 4

    const-string/jumbo v0, "packResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le9/c$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le9/d$e;->a:Le9/d;

    new-instance v1, Le9/d$e$h;

    invoke-direct {v1, v0, p1}, Le9/d$e$h;-><init>(Le9/d;Le9/c$a;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Le9/d$e;->a:Le9/d;

    invoke-virtual {v0}, Le9/d;->c()LT8/d;

    move-result-object v0

    invoke-interface {p1}, Le9/c$a;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v3}, LT8/d$a;->b([B)[B

    move-result-object v3

    invoke-static {v3}, LT8/d$a;->a([B)LT8/d$a;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0, v2}, LT8/d;->b(Ljava/util/List;)Lgg/b;

    move-result-object v0

    new-instance v1, Le9/d$e$b;

    iget-object v2, p0, Le9/d$e;->a:Le9/d;

    invoke-direct {v1, v2, p1}, Le9/d$e$b;-><init>(Le9/d;Le9/c$a;)V

    invoke-static {v0, v1}, Lk9/e;->e(Lgg/b;Lmh/l;)Lgg/b;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Le9/d$e;->a:Le9/d;

    new-instance v2, Le9/e;

    invoke-direct {v2, v1, p1}, Le9/e;-><init>(Le9/d;Le9/c$a;)V

    invoke-virtual {v0, v2}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object v0

    instance-of v1, p1, Le9/c$a$a;

    if-eqz v1, :cond_2

    new-instance p1, Ll9/a;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "just(NullableValue(null))"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    instance-of v1, p1, Le9/c$a$b;

    if-eqz v1, :cond_3

    iget-object v1, p0, Le9/d$e;->a:Le9/d;

    move-object v2, p1

    check-cast v2, Le9/c$a$b;

    invoke-static {v1, v2}, Le9/d;->b(Le9/d;Le9/c$a$b;)Lgg/z;

    move-result-object v1

    new-instance v2, Le9/d$e$d;

    iget-object v3, p0, Le9/d$e;->a:Le9/d;

    invoke-direct {v2, v3, p1}, Le9/d$e$d;-><init>(Le9/d;Le9/c$a;)V

    invoke-virtual {v1, v2}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v1

    sget-object v2, Le9/d$e$e;->a:Le9/d$e$e;

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, Le9/d$e$f;

    iget-object v3, p0, Le9/d$e;->a:Le9/d;

    invoke-direct {v2, v3, p1}, Le9/d$e$f;-><init>(Le9/d;Le9/c$a;)V

    invoke-virtual {v1, v2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v1

    const-string/jumbo v2, "override fun send(msg: M\u2026          )\n            }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Le9/d$e$g;

    iget-object v3, p0, Le9/d$e;->a:Le9/d;

    invoke-direct {v2, v3, p1}, Le9/d$e$g;-><init>(Le9/d;Le9/c$a;)V

    invoke-static {v1, v2}, Lk9/e;->f(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object p1

    :goto_2
    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
