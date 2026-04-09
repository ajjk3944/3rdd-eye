.class public final LMh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/T;


# instance fields
.field private final a:LMh/k;

.field private final b:Loi/a;


# direct methods
.method public constructor <init>(LMh/d;)V
    .locals 3

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LMh/k;

    sget-object v1, LMh/p$a;->a:LMh/p$a;

    const/4 v2, 0x0

    invoke-static {v2}, LYg/n;->c(Ljava/lang/Object;)LYg/m;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, LMh/k;-><init>(LMh/d;LMh/p;LYg/m;)V

    iput-object v0, p0, LMh/j;->a:LMh/k;

    invoke-virtual {v0}, LMh/k;->e()Loi/n;

    move-result-object p1

    invoke-interface {p1}, Loi/n;->c()Loi/a;

    move-result-object p1

    iput-object p1, p0, LMh/j;->b:Loi/a;

    return-void
.end method

.method static synthetic d(LMh/j;LQh/u;)LNh/D;
    .locals 0

    invoke-static {p0, p1}, LMh/j;->f(LMh/j;LQh/u;)LNh/D;

    move-result-object p0

    return-object p0
.end method

.method private final e(LZh/c;)LNh/D;
    .locals 4

    iget-object v0, p0, LMh/j;->a:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->d()LJh/u;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, LJh/t;->a(LJh/u;LZh/c;ZILjava/lang/Object;)LQh/u;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v3

    :cond_0
    iget-object v1, p0, LMh/j;->b:Loi/a;

    new-instance v2, LMh/i;

    invoke-direct {v2, p0, v0}, LMh/i;-><init>(LMh/j;LQh/u;)V

    invoke-interface {v1, p1, v2}, Loi/a;->a(Ljava/lang/Object;Lmh/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNh/D;

    return-object p1
.end method

.method private static final f(LMh/j;LQh/u;)LNh/D;
    .locals 1

    new-instance v0, LNh/D;

    iget-object p0, p0, LMh/j;->a:LMh/k;

    invoke-direct {v0, p0, p1}, LNh/D;-><init>(LMh/k;LQh/u;)V

    return-object v0
.end method


# virtual methods
.method public a(LZh/c;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LMh/j;->e(LZh/c;)LNh/D;

    move-result-object p1

    invoke-static {p2, p1}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    return-void
.end method

.method public b(LZh/c;)Z
    .locals 4

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMh/j;->a:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->d()LJh/u;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LJh/t;->a(LJh/u;LZh/c;ZILjava/lang/Object;)LQh/u;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v3, 0x1

    :cond_0
    return v3
.end method

.method public c(LZh/c;)Ljava/util/List;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LMh/j;->e(LZh/c;)LNh/D;

    move-result-object p1

    invoke-static {p1}, LZg/v;->p(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public g(LZh/c;Lmh/l;)Ljava/util/List;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LMh/j;->e(LZh/c;)LNh/D;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LNh/D;->Q0()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public bridge synthetic s(LZh/c;Lmh/l;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, LMh/j;->g(LZh/c;Lmh/l;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LazyJavaPackageFragmentProvider of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LMh/j;->a:LMh/k;

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->m()LBh/G;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
