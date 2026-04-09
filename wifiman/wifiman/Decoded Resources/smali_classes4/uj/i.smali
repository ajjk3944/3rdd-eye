.class public final Luj/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/e;


# instance fields
.field private final a:Luj/q;

.field private final b:Lorg/kodein/type/q;

.field private final c:Z

.field private final d:Lorg/kodein/type/q;

.field private final e:Lorg/kodein/type/q;

.field private final f:Z

.field private final g:Lmh/p;

.field private final h:Luj/o;

.field private final i:Ljava/lang/Object;

.field private final j:Luj/e$a;


# direct methods
.method public constructor <init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Lorg/kodein/type/q;Luj/o;ZLmh/p;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creator"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/i;->a:Luj/q;

    iput-object p2, p0, Luj/i;->b:Lorg/kodein/type/q;

    iput-boolean p3, p0, Luj/i;->c:Z

    iput-object p4, p0, Luj/i;->d:Lorg/kodein/type/q;

    iput-object p5, p0, Luj/i;->e:Lorg/kodein/type/q;

    iput-boolean p7, p0, Luj/i;->f:Z

    iput-object p8, p0, Luj/i;->g:Lmh/p;

    if-nez p6, :cond_0

    sget-object p6, Luj/v;->a:Luj/v;

    :cond_0
    iput-object p6, p0, Luj/i;->h:Luj/o;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/i;->i:Ljava/lang/Object;

    sget-object p1, Luj/e$a;->a:Luj/e$a$a;

    new-instance p2, Luj/i$a;

    invoke-direct {p2, p0}, Luj/i$a;-><init>(Luj/i;)V

    invoke-virtual {p1, p2}, Luj/e$a$a;->a(Lmh/l;)Luj/e$a;

    move-result-object p1

    iput-object p1, p0, Luj/i;->j:Luj/e$a;

    return-void
.end method

.method public static final synthetic k(Luj/i;)Lmh/p;
    .locals 0

    iget-object p0, p0, Luj/i;->g:Lmh/p;

    return-object p0
.end method

.method public static final synthetic l(Luj/i;)Z
    .locals 0

    iget-boolean p0, p0, Luj/i;->c:Z

    return p0
.end method

.method public static final synthetic m(Luj/i;)Luj/o;
    .locals 0

    iget-object p0, p0, Luj/i;->h:Luj/o;

    return-object p0
.end method

.method public static final synthetic n(Luj/i;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Luj/i;->i:Ljava/lang/Object;

    return-object p0
.end method

.method private final o(Ljava/util/List;)Ljava/lang/String;
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "multiton"

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

    invoke-static {p0}, Luj/e$b;->b(Luj/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/i;->b:Lorg/kodein/type/q;

    return-object v0
.end method

.method public c()Luj/q;
    .locals 1

    iget-object v0, p0, Luj/i;->a:Luj/q;

    return-object v0
.end method

.method public d()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/i;->d:Lorg/kodein/type/q;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Luj/i;->h:Luj/o;

    sget-object v2, Luj/v;->a:Luj/v;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ref = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Luj/i;->h:Luj/o;

    invoke-static {v2}, Lorg/kodein/type/s;->c(Ljava/lang/Object;)Lorg/kodein/type/q;

    move-result-object v2

    invoke-interface {v2}, Lorg/kodein/type/q;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0, v0}, Luj/i;->o(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/e$b;->c(Luj/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    invoke-static {p0}, Luj/e$b;->e(Luj/e;)Z

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Luj/i;->h:Luj/o;

    sget-object v2, Luj/v;->a:Luj/v;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ref = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Luj/i;->h:Luj/o;

    invoke-static {v2}, Lorg/kodein/type/s;->c(Ljava/lang/Object;)Lorg/kodein/type/q;

    move-result-object v2

    invoke-interface {v2}, Lorg/kodein/type/q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0, v0}, Luj/i;->o(Ljava/util/List;)Ljava/lang/String;

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

    iget-boolean v0, p0, Luj/i;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Luj/b;->a()Luj/b;

    move-result-object p2

    :goto_0
    new-instance v0, Luj/i$b;

    invoke-direct {v0, p1, p0, p2}, Luj/i$b;-><init>(Lkotlin/jvm/internal/N;Luj/i;Luj/b;)V

    return-object v0
.end method

.method public j()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/i;->e:Lorg/kodein/type/q;

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Luj/i;->f:Z

    return v0
.end method
