.class final LM8/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$h;

    invoke-direct {v0}, LM8/d$h;-><init>()V

    sput-object v0, LM8/d$h;->a:LM8/d$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    check-cast p2, Lie/d;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, LM8/d$h;->b(Ljava/util/Map;Lie/d;Ll9/a;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Map;Lie/d;Ll9/a;)LCi/c;
    .locals 9

    const-string/jumbo v0, "channelsByBandwidth"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "env"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lle/f;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LS8/e;

    invoke-interface {p2, v1}, Lie/d;->a(LS8/e;)Lie/c;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, LS8/e;->b()LS8/d;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lle/f;->a()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_3

    check-cast v6, Ljava/lang/Iterable;

    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_1

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lle/i;

    invoke-virtual {v7}, Lle/i;->m()Lke/a;

    move-result-object v8

    instance-of v8, v8, Lke/a$a;

    if-eqz v8, :cond_2

    invoke-virtual {v7}, Lle/i;->f()LS8/e;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v5, v4

    :cond_3
    :goto_1
    invoke-virtual {v2}, Lie/c;->b()LS8/f;

    move-result-object v1

    invoke-static {v1, v4}, LNe/j;->c(LS8/f;Z)Ls9/d;

    move-result-object v1

    new-instance v2, Lzf/h;

    invoke-direct {v2, v3, v5, v1}, Lzf/h;-><init>(LS8/d;ZLs9/d;)V

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-static {v0}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1
.end method
