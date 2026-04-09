.class public Lvj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/DI$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvj/b$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/Set;

.field private final d:Lvj/c;

.field private final e:Lorg/kodein/type/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lvj/c;)V
    .locals 1

    const-string/jumbo v0, "prefix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "importedModules"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "containerBuilder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lvj/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lvj/b;->c:Ljava/util/Set;

    iput-object p4, p0, Lvj/b;->d:Lvj/c;

    sget-object p1, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {p1}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object p1

    iput-object p1, p0, Lvj/b;->e:Lorg/kodein/type/q;

    return-void
.end method

.method public static final synthetic g(Lvj/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lvj/b;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Lorg/kodein/di/DI$g;Z)V
    .locals 6

    const-string/jumbo v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lvj/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/kodein/di/DI$g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lvj/b;->c:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Module \""

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" has already been imported!"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, Lvj/b;->c:Ljava/util/Set;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v1, Lvj/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lvj/b;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/kodein/di/DI$g;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lvj/b;->c:Ljava/util/Set;

    invoke-virtual {p0}, Lvj/b;->h()Lvj/c;

    move-result-object v4

    invoke-virtual {p1}, Lorg/kodein/di/DI$g;->a()Z

    move-result v5

    invoke-virtual {v4, p2, v5}, Lvj/c;->g(ZZ)Lvj/c;

    move-result-object p2

    invoke-direct {v1, v0, v2, v3, p2}, Lvj/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lvj/c;)V

    invoke-virtual {p1}, Lorg/kodein/di/DI$g;->b()Lmh/l;

    move-result-object p1

    invoke-interface {p1, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Lvj/b;->e:Lorg/kodein/type/q;

    return-object v0
.end method

.method public c()Luj/q;
    .locals 1

    new-instance v0, Luj/m;

    invoke-direct {v0}, Luj/m;-><init>()V

    return-object v0
.end method

.method public bridge synthetic d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lvj/b;->f(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lvj/b$a;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lvj/b$a;
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvj/b$a;

    invoke-direct {v0, p0, p1, p2, p3}, Lvj/b$a;-><init>(Lvj/b;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public h()Lvj/c;
    .locals 1

    iget-object v0, p0, Lvj/b;->d:Lvj/c;

    return-object v0
.end method
