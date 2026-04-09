.class public final Luj/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/l;


# instance fields
.field private final a:Luj/q;

.field private final b:Lorg/kodein/type/q;

.field private final c:Z

.field private final d:Lorg/kodein/type/q;

.field private final e:Z

.field private final f:Lmh/l;

.field private final g:Luj/o;

.field private final h:Luj/r;

.field private final i:Luj/e$a;


# direct methods
.method public constructor <init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creator"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/u;->a:Luj/q;

    iput-object p2, p0, Luj/u;->b:Lorg/kodein/type/q;

    iput-boolean p3, p0, Luj/u;->c:Z

    iput-object p4, p0, Luj/u;->d:Lorg/kodein/type/q;

    iput-boolean p6, p0, Luj/u;->e:Z

    iput-object p7, p0, Luj/u;->f:Lmh/l;

    if-nez p5, :cond_0

    sget-object p5, Luj/v;->a:Luj/v;

    :cond_0
    iput-object p5, p0, Luj/u;->g:Luj/o;

    new-instance p1, Luj/r;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    sget-object p3, LYg/J;->a:LYg/J;

    invoke-direct {p1, p2, p3}, Luj/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Luj/u;->h:Luj/r;

    sget-object p1, Luj/e$a;->a:Luj/e$a$a;

    new-instance p2, Luj/u$a;

    invoke-direct {p2, p0}, Luj/u$a;-><init>(Luj/u;)V

    invoke-virtual {p1, p2}, Luj/e$a$a;->a(Lmh/l;)Luj/e$a;

    move-result-object p1

    iput-object p1, p0, Luj/u;->i:Luj/e$a;

    return-void
.end method

.method public static final synthetic k(Luj/u;)Z
    .locals 0

    iget-boolean p0, p0, Luj/u;->c:Z

    return p0
.end method

.method public static final synthetic l(Luj/u;)Luj/o;
    .locals 0

    iget-object p0, p0, Luj/u;->g:Luj/o;

    return-object p0
.end method

.method public static final synthetic m(Luj/u;)Luj/r;
    .locals 0

    iget-object p0, p0, Luj/u;->h:Luj/r;

    return-object p0
.end method

.method private final n(Ljava/util/List;)Ljava/lang/String;
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "singleton"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    const/16 v9, 0x38

    const/4 v10, 0x0

    const-string v3, ", "

    const-string v4, "("

    const-string v5, ")"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/l$a;->c(Luj/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/u;->b:Lorg/kodein/type/q;

    return-object v0
.end method

.method public c()Luj/q;
    .locals 1

    iget-object v0, p0, Luj/u;->a:Luj/q;

    return-object v0
.end method

.method public d()Lorg/kodein/type/q;
    .locals 1

    invoke-static {p0}, Luj/l$a;->b(Luj/l;)Lorg/kodein/type/q;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Luj/u;->g:Luj/o;

    sget-object v2, Luj/v;->a:Luj/v;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ref = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Luj/u;->g:Luj/o;

    invoke-static {v2}, Lorg/kodein/type/s;->c(Ljava/lang/Object;)Lorg/kodein/type/q;

    move-result-object v2

    invoke-interface {v2}, Lorg/kodein/type/q;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0, v0}, Luj/u;->n(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/l$a;->d(Luj/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    invoke-static {p0}, Luj/l$a;->f(Luj/l;)Z

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Luj/u;->g:Luj/o;

    sget-object v2, Luj/v;->a:Luj/v;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ref = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Luj/u;->g:Luj/o;

    invoke-static {v2}, Lorg/kodein/type/s;->c(Ljava/lang/Object;)Lorg/kodein/type/q;

    move-result-object v2

    invoke-interface {v2}, Lorg/kodein/type/q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0, v0}, Luj/u;->n(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "di"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlin/jvm/internal/N;

    invoke-direct {p1}, Lkotlin/jvm/internal/N;-><init>()V

    iget-boolean v0, p0, Luj/u;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Luj/b;->a()Luj/b;

    move-result-object p2

    :goto_0
    new-instance v0, Luj/u$b;

    invoke-direct {v0, p1, p0, p2}, Luj/u$b;-><init>(Lkotlin/jvm/internal/N;Luj/u;Luj/b;)V

    return-object v0
.end method

.method public j()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/u;->d:Lorg/kodein/type/q;

    return-object v0
.end method

.method public final o()Lmh/l;
    .locals 1

    iget-object v0, p0, Luj/u;->f:Lmh/l;

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Luj/u;->e:Z

    return v0
.end method
