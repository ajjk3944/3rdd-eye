.class final LE8/F$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/F;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/F;


# direct methods
.method constructor <init>(LE8/F;)V
    .locals 0

    iput-object p1, p0, LE8/F$g;->a:LE8/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/lang/String;)LE8/F$b;
    .locals 5

    const-string/jumbo v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    iget-object v0, p0, LE8/F$g;->a:LE8/F;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-static {v0}, LE8/F;->v0(LE8/F;)LE8/E;

    move-result-object v4

    invoke-virtual {v4}, Lk8/m;->e()Lmh/l;

    move-result-object v4

    invoke-interface {v4, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, LE8/F$b$a;

    sget-object p2, Lkf/a$b$b;->a:Lkf/a$b$b;

    invoke-direct {p1, p2}, LE8/F$b$a;-><init>(Lkf/a$b;)V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, LE8/F$b$a;

    sget-object p2, Lkf/a$b$a;->a:Lkf/a$b$a;

    invoke-direct {p1, p2}, LE8/F$b$a;-><init>(Lkf/a$b;)V

    goto :goto_1

    :cond_3
    new-instance p1, LE8/F$b$b;

    invoke-direct {p1, v1}, LE8/F$b$b;-><init>(Ljava/util/List;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, LE8/F$g;->a(Ljava/util/List;Ljava/lang/String;)LE8/F$b;

    move-result-object p1

    return-object p1
.end method
