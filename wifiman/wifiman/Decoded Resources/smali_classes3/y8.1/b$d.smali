.class final Ly8/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/b;-><init>(Lhd/a$c;LCc/n;Lnd/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/b$d;

    invoke-direct {v0}, Ly8/b$d;-><init>()V

    sput-object v0, Ly8/b$d;->a:Ly8/b$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La8/a;)Ljava/util/List;
    .locals 8

    const-string/jumbo v0, "events"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "devices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    sub-long/2addr v0, v2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhd/a;

    invoke-virtual {v3}, Lhd/a;->b()J

    move-result-wide v4

    cmp-long v4, v4, v0

    const/4 v5, 0x0

    if-ltz v4, :cond_4

    instance-of v4, v3, Lhd/a$a$c;

    if-eqz v4, :cond_2

    check-cast v3, Lhd/a$a$c;

    invoke-virtual {v3}, Lhd/a$a$c;->b()J

    move-result-wide v6

    invoke-virtual {v3}, Lhd/a$a$c;->e()Lhd/a$d$a$b;

    move-result-object v4

    invoke-virtual {v4}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v4

    invoke-virtual {v4}, Lje/r$b$a;->a()La8/b;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {p2, v4}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LCc/a$b;

    if-eqz v4, :cond_1

    invoke-interface {v4}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v5

    :cond_1
    invoke-virtual {v3}, Lhd/a$a$c;->e()Lhd/a$d$a$b;

    move-result-object v3

    invoke-virtual {v3}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v3

    invoke-virtual {v3}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v3

    new-instance v4, Ly8/a$a;

    invoke-direct {v4, v6, v7, v5, v3}, Ly8/a$a;-><init>(JLjava/lang/String;Lh9/a;)V

    :goto_1
    move-object v5, v4

    goto :goto_2

    :cond_2
    instance-of v4, v3, Lhd/a$a$b;

    if-eqz v4, :cond_4

    check-cast v3, Lhd/a$a$b;

    invoke-virtual {v3}, Lhd/a$a$b;->b()J

    move-result-wide v6

    invoke-virtual {v3}, Lhd/a$a$b;->d()Lhd/a$d$a$b;

    move-result-object v4

    invoke-virtual {v4}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v4

    invoke-virtual {v4}, Lje/r$b$a;->a()La8/b;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p2, v4}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LCc/a$b;

    if-eqz v4, :cond_3

    invoke-interface {v4}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v5

    :cond_3
    invoke-virtual {v3}, Lhd/a$a$b;->d()Lhd/a$d$a$b;

    move-result-object v3

    invoke-virtual {v3}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v3

    invoke-virtual {v3}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v3

    new-instance v4, Ly8/a$a;

    invoke-direct {v4, v6, v7, v5, v3}, Ly8/a$a;-><init>(JLjava/lang/String;Lh9/a;)V

    goto :goto_1

    :cond_4
    :goto_2
    if-eqz v5, :cond_0

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    return-object v2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, La8/a;

    invoke-virtual {p0, p1, p2}, Ly8/b$d;->a(Ljava/util/List;La8/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
