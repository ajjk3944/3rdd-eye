.class public final Lcj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lth/d;

.field private final b:LVi/b;

.field private final c:Ljava/util/List;

.field private d:Lmh/l;

.field private e:Lmh/l;


# direct methods
.method public constructor <init>(Lth/d;LVi/b;)V
    .locals 1

    const-string v0, "baseClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcj/b;->a:Lth/d;

    iput-object p2, p0, Lcj/b;->b:LVi/b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcj/b;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lcj/f;)V
    .locals 10

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcj/b;->b:LVi/b;

    if-eqz v4, :cond_0

    iget-object v3, p0, Lcj/b;->a:Lth/d;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, v3

    invoke-static/range {v1 .. v7}, Lcj/f;->m(Lcj/f;Lth/d;Lth/d;LVi/b;ZILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcj/b;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYg/s;

    invoke-virtual {v1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lth/d;

    invoke-virtual {v1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LVi/b;

    iget-object v4, p0, Lcj/b;->a:Lth/d;

    const-string v1, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Lcj/f;->m(Lcj/f;Lth/d;Lth/d;LVi/b;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcj/b;->d:Lmh/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcj/b;->a:Lth/d;

    invoke-virtual {p1, v2, v0, v1}, Lcj/f;->k(Lth/d;Lmh/l;Z)V

    :cond_2
    iget-object v0, p0, Lcj/b;->e:Lmh/l;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcj/b;->a:Lth/d;

    invoke-virtual {p1, v2, v0, v1}, Lcj/f;->j(Lth/d;Lmh/l;Z)V

    :cond_3
    return-void
.end method

.method public final b(Lmh/l;)V
    .locals 1

    const-string v0, "defaultDeserializerProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcj/b;->e:Lmh/l;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcj/b;->e:Lmh/l;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Default deserializer provider is already registered for class "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcj/b;->a:Lth/d;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcj/b;->e:Lmh/l;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lth/d;LVi/b;)V
    .locals 1

    const-string v0, "subclass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcj/b;->c:Ljava/util/List;

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
