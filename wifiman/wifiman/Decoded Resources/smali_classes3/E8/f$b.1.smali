.class final LE8/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/f;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/f$b;

    invoke-direct {v0}, LE8/f$b;-><init>()V

    sput-object v0, LE8/f$b;->a:LE8/f$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgf/b;
    .locals 9

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE8/f$a;

    invoke-virtual {v1}, LE8/f$a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, LE8/f$a;->b()LCc/a;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    sget-object v5, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    const/4 v6, 0x2

    invoke-static {v2, v5, v4, v6, v4}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object v5, v2

    goto :goto_4

    :cond_1
    :goto_2
    invoke-virtual {v1}, LE8/f$a;->a()Lrd/b$a;

    move-result-object v2

    invoke-virtual {v2}, Lrd/b$a;->f()Lrd/b$a$a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lr8/a;->a(Lrd/b$a$a;)Ls9/a$b;

    move-result-object v2

    goto :goto_3

    :cond_2
    move-object v2, v4

    :goto_3
    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    sget-object v2, LPe/a;->a:LPe/a;

    invoke-virtual {v2}, LPe/a;->k()Ls9/b;

    move-result-object v2

    goto :goto_1

    :goto_4
    new-instance v6, Ls9/d$c;

    invoke-virtual {v1}, LE8/f$a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, LE8/f$a;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v1}, LE8/f$a;->c()Linet/ipaddr/g;

    move-result-object v2

    invoke-static {v2}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    new-instance v2, Ls9/d$b;

    invoke-virtual {v1}, LE8/f$a;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, LE8/f$a;->c()Linet/ipaddr/g;

    move-result-object v8

    invoke-static {v8}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const v8, 0x7f1103c3

    invoke-direct {v2, v8, v7}, Ls9/d$b;-><init>(ILjava/util/List;)V

    move-object v7, v2

    goto :goto_7

    :cond_5
    :goto_5
    invoke-virtual {v1}, LE8/f$a;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_6

    :cond_6
    move-object v2, v4

    :goto_6
    if-nez v2, :cond_8

    :cond_7
    invoke-virtual {v1}, LE8/f$a;->c()Linet/ipaddr/g;

    move-result-object v2

    invoke-static {v2}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object v2

    :cond_8
    new-instance v7, Ls9/d$c;

    invoke-direct {v7, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_7
    invoke-virtual {v1}, LE8/f$a;->g()LS8/g;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Ls9/d$a;

    invoke-virtual {v1}, LS8/g;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    new-instance v8, LE8/f$b$a;

    invoke-direct {v8, v1}, LE8/f$b$a;-><init>(LS8/g;)V

    invoke-direct {v2, v4, v8}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object v1, v2

    goto :goto_8

    :cond_9
    move-object v1, v4

    :goto_8
    new-instance v8, Lgf/a;

    move-object v2, v8

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v1

    invoke-direct/range {v2 .. v7}, Lgf/a;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Ls9/d;)V

    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    new-instance p1, Lgf/b;

    invoke-direct {p1, v0}, Lgf/b;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LE8/f$b;->a(Ljava/util/List;)Lgf/b;

    move-result-object p1

    return-object p1
.end method
