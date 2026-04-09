.class public LGj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEj/b;


# instance fields
.field private final a:Ljava/lang/String;

.field private volatile b:LEj/b;

.field private c:Ljava/lang/Boolean;

.field private d:Ljava/lang/reflect/Method;

.field private e:LFj/a;

.field private f:Ljava/util/Queue;

.field private final g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Queue;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGj/f;->a:Ljava/lang/String;

    iput-object p2, p0, LGj/f;->f:Ljava/util/Queue;

    iput-boolean p3, p0, LGj/f;->g:Z

    return-void
.end method

.method private e()LEj/b;
    .locals 2

    iget-object v0, p0, LGj/f;->e:LFj/a;

    if-nez v0, :cond_0

    new-instance v0, LFj/a;

    iget-object v1, p0, LGj/f;->f:Ljava/util/Queue;

    invoke-direct {v0, p0, v1}, LFj/a;-><init>(LGj/f;Ljava/util/Queue;)V

    iput-object v0, p0, LGj/f;->e:LFj/a;

    :cond_0
    iget-object v0, p0, LGj/f;->e:LFj/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method b()LEj/b;
    .locals 1

    iget-object v0, p0, LGj/f;->b:LEj/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, LGj/f;->b:LEj/b;

    return-object v0

    :cond_0
    iget-boolean v0, p0, LGj/f;->g:Z

    if-eqz v0, :cond_1

    sget-object v0, LGj/c;->a:LGj/c;

    return-object v0

    :cond_1
    invoke-direct {p0}, LGj/f;->e()LEj/b;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LGj/f;

    iget-object v2, p0, LGj/f;->a:Ljava/lang/String;

    iget-object p1, p1, LGj/f;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public f()Z
    .locals 3

    iget-object v0, p0, LGj/f;->c:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, LGj/f;->b:LEj/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "log"

    const-class v2, LFj/c;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, LGj/f;->d:Ljava/lang/reflect/Method;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, LGj/f;->c:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, LGj/f;->c:Ljava/lang/Boolean;

    :goto_0
    iget-object v0, p0, LGj/f;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LEj/b;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LGj/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public varargs h(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LGj/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, LGj/f;->b:LEj/b;

    instance-of v0, v0, LGj/c;

    return v0
.end method

.method public isDebugEnabled()Z
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0}, LEj/b;->isDebugEnabled()Z

    move-result v0

    return v0
.end method

.method public j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, LGj/f;->b:LEj/b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1}, LEj/b;->l(Ljava/lang/String;)V

    return-void
.end method

.method public m()Z
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0}, LEj/b;->m()Z

    move-result v0

    return v0
.end method

.method public n(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs o(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public q(LFj/c;)V
    .locals 2

    invoke-virtual {p0}, LGj/f;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, LGj/f;->d:Ljava/lang/reflect/Method;

    iget-object v1, p0, LGj/f;->b:LEj/b;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public r(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public s(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1}, LEj/b;->t(Ljava/lang/String;)V

    return-void
.end method

.method public u(LEj/b;)V
    .locals 0

    iput-object p1, p0, LGj/f;->b:LEj/b;

    return-void
.end method

.method public varargs v(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LGj/f;->b()LEj/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LEj/b;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
