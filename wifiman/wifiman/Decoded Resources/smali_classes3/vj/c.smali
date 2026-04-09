.class public final Lvj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvj/c$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:Lvj/c$a;


# direct methods
.method public constructor <init>(ZZLjava/util/Map;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    const-string/jumbo v0, "bindingsMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "callbacks"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "translators"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lvj/c;->a:Ljava/util/Map;

    iput-object p4, p0, Lvj/c;->b:Ljava/util/List;

    iput-object p5, p0, Lvj/c;->c:Ljava/util/List;

    sget-object p3, Lvj/c$a;->Companion:Lvj/c$a$c;

    invoke-virtual {p3, p1, p2}, Lvj/c$a$c;->a(ZZ)Lvj/c$a;

    move-result-object p1

    iput-object p1, p0, Lvj/c;->d:Lvj/c$a;

    return-void
.end method

.method private final b(Z)V
    .locals 1

    iget-object v0, p0, Lvj/c;->d:Lvj/c$a;

    invoke-virtual {v0}, Lvj/c$a;->isAllowed()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/kodein/di/DI$OverridingException;

    const-string/jumbo v0, "Overriding has been forbidden"

    invoke-direct {p1, v0}, Lorg/kodein/di/DI$OverridingException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private final c(Lorg/kodein/di/DI$e;Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, Lvj/c;->d:Lvj/c$a;

    invoke-virtual {v0, p2}, Lvj/c$a;->must(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "Binding "

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvj/c;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lorg/kodein/di/DI$OverridingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " must override an existing binding."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/kodein/di/DI$OverridingException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lvj/c;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p2, Lorg/kodein/di/DI$OverridingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " must not override an existing binding."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/kodein/di/DI$OverridingException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lorg/kodein/di/DI$e;Luj/e;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p4}, Lvj/c;->c(Lorg/kodein/di/DI$e;Ljava/lang/Boolean;)V

    iget-object p4, p0, Lvj/c;->a:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lvj/j;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {p4, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v0, Ljava/util/List;

    new-instance p1, Lrj/j2;

    invoke-direct {p1, p2, p3}, Lrj/j2;-><init>(Luj/e;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lvj/c;->a:Ljava/util/Map;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lvj/c;->b:Ljava/util/List;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lvj/c;->c:Ljava/util/List;

    return-object v0
.end method

.method public g(ZZ)Lvj/c;
    .locals 7

    invoke-direct {p0, p1}, Lvj/c;->b(Z)V

    new-instance v6, Lvj/c;

    iget-object v3, p0, Lvj/c;->a:Ljava/util/Map;

    iget-object v4, p0, Lvj/c;->b:Ljava/util/List;

    iget-object v5, p0, Lvj/c;->c:Ljava/util/List;

    move-object v0, v6

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lvj/c;-><init>(ZZLjava/util/Map;Ljava/util/List;Ljava/util/List;)V

    return-object v6
.end method
