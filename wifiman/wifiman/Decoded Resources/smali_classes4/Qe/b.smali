.class public final LQe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQe/d;


# instance fields
.field private final a:Ljava/util/List;

.field private b:LQe/c$a;

.field private final c:LLi/z;

.field private final d:LLi/z;

.field private final e:LLi/z;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LQe/c$a;)V
    .locals 1

    const-string v0, "initialTab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, LQe/c;->a:LQe/c;

    invoke-virtual {v0}, LQe/c;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LQe/b;->a:Ljava/util/List;

    .line 3
    iput-object p1, p0, LQe/b;->b:LQe/c$a;

    .line 4
    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LQe/b;->c:LLi/z;

    .line 5
    invoke-direct {p0}, LQe/b;->i()LJ9/j;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LQe/b;->d:LLi/z;

    .line 6
    invoke-direct {p0}, LQe/b;->m()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LQe/b;->e:LLi/z;

    return-void
.end method

.method public synthetic constructor <init>(LQe/c$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 7
    sget-object p1, LQe/c;->a:LQe/c;

    invoke-virtual {p1}, LQe/c;->a()LQe/c$a;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, LQe/b;-><init>(LQe/c$a;)V

    return-void
.end method

.method private final g(LQe/c$a;Z)LJ9/a;
    .locals 10

    new-instance v9, LJ9/a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {p1}, LQe/c$a;->getTitle()Ls9/d;

    move-result-object v2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LQe/c$a;->getIconSelected()Ls9/b;

    move-result-object p1

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, LQe/c$a;->getIcon()Ls9/b;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move v4, p2

    invoke-direct/range {v0 .. v8}, LJ9/a;-><init>(ILs9/d;Ls9/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method private final i()LJ9/j;
    .locals 4

    iget-object v0, p0, LQe/b;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQe/c$a;

    iget-object v3, p0, LQe/b;->b:LQe/c$a;

    if-ne v2, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-direct {p0, v2, v3}, LQe/b;->g(LQe/c$a;Z)LJ9/a;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LJ9/j;

    invoke-direct {v0, v1}, LJ9/j;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private final m()Z
    .locals 2

    iget-object v0, p0, LQe/b;->b:LQe/c$a;

    sget-object v1, LQe/c;->a:LQe/c;

    invoke-virtual {v1}, LQe/c;->a()LQe/c$a;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, LQe/c;->a:LQe/c;

    invoke-virtual {v0}, LQe/c;->a()LQe/c$a;

    move-result-object v0

    invoke-virtual {p0, v0}, LQe/b;->n(LQe/c$a;)V

    return-void
.end method

.method public b(I)V
    .locals 3

    iget-object v0, p0, LQe/b;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LQe/c$a;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LQe/c$a;

    if-eqz v1, :cond_2

    invoke-virtual {p0, v1}, LQe/b;->n(LQe/c$a;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic c()LLi/N;
    .locals 1

    invoke-virtual {p0}, LQe/b;->h()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()LLi/N;
    .locals 1

    invoke-virtual {p0}, LQe/b;->j()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()LLi/N;
    .locals 1

    invoke-virtual {p0}, LQe/b;->l()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public f(LQe/c$a;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, LQe/c;->a:LQe/c;

    invoke-virtual {p1}, LQe/c;->a()LQe/c$a;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, LQe/b;->n(LQe/c$a;)V

    return-void
.end method

.method public h()LLi/z;
    .locals 1

    iget-object v0, p0, LQe/b;->c:LLi/z;

    return-object v0
.end method

.method public j()LLi/z;
    .locals 1

    iget-object v0, p0, LQe/b;->d:LLi/z;

    return-object v0
.end method

.method public final k()LQe/c$a;
    .locals 1

    iget-object v0, p0, LQe/b;->b:LQe/c$a;

    return-object v0
.end method

.method public l()LLi/z;
    .locals 1

    iget-object v0, p0, LQe/b;->e:LLi/z;

    return-object v0
.end method

.method public final n(LQe/c$a;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LQe/b;->b:LQe/c$a;

    invoke-direct {p0}, LQe/b;->i()LJ9/j;

    move-result-object v0

    invoke-virtual {p0}, LQe/b;->j()LLi/z;

    move-result-object v1

    invoke-interface {v1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, LQe/b;->j()LLi/z;

    move-result-object v1

    invoke-interface {v1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, LQe/b;->h()LLi/z;

    move-result-object v0

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, LQe/b;->h()LLi/z;

    move-result-object v0

    invoke-interface {v0, p1}, LLi/z;->setValue(Ljava/lang/Object;)V

    :cond_1
    invoke-direct {p0}, LQe/b;->m()Z

    move-result p1

    invoke-virtual {p0}, LQe/b;->l()LLi/z;

    move-result-object v0

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eq v0, p1, :cond_2

    invoke-virtual {p0}, LQe/b;->l()LLi/z;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LLi/z;->setValue(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
