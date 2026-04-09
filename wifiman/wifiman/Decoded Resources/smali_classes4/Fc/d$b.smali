.class final LFc/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFc/d;-><init>(LFc/a$a;Lle/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LFc/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LFc/d$b;

    invoke-direct {v0}, LFc/d$b;-><init>()V

    sput-object v0, LFc/d$b;->a:LFc/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La8/a;Ljava/util/Map;)Ljava/util/List;
    .locals 11

    const-string v0, "wifiResultLookup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "discoveryResults"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDc/j;

    invoke-virtual {v1}, LDc/j;->getId()La8/b;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, LDc/j;->w()Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {p1, v2}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v7, v1

    check-cast v7, Ljava/util/List;

    const/16 v1, 0x4e20

    int-to-long v1, v1

    add-long v5, v8, v1

    new-instance v10, LFc/a$b;

    move-object v1, v10

    move-object v2, v3

    move-wide v3, v8

    invoke-direct/range {v1 .. v7}, LFc/a$b;-><init>(Linet/ipaddr/g;JJLjava/util/List;)V

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La8/a;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, LFc/d$b;->a(La8/a;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
