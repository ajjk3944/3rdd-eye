.class final Ln8/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$j;

    invoke-direct {v0}, Ln8/a$j;-><init>()V

    sput-object v0, Ln8/a$j;->a:Ln8/a$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)LKe/a$a;
    .locals 7

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v1, v1}, Lr8/e;->a(LDc/j;ZZ)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {p1}, LCc/a;->p()Lwc/a;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0, v1, v1, v2, v3}, Lq8/f;->b(Lwc/a;ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-interface {p1}, LCc/a;->p()Lwc/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, v1}, Lq8/f;->c(Lwc/a;Z)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-interface {p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v0, v4

    goto :goto_0

    :cond_3
    new-instance v0, Ls9/d$b;

    const v4, 0x7f1100af

    invoke-direct {v0, v4}, Ls9/d$b;-><init>(I)V

    :goto_0
    sget-object v4, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {p1, v4, v3, v2, v3}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object v4

    invoke-interface {p1}, LCc/a;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Ls9/d$c;

    invoke-direct {v3, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_4
    move-object v5, v3

    invoke-interface {p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    move v3, p1

    goto :goto_1

    :cond_5
    move v3, v1

    :goto_1
    new-instance p1, LKe/a$a;

    move-object v1, p1

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, LKe/a$a;-><init>(Ls9/d;ZLs9/a;Ls9/d;Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$j;->a(LCc/a;)LKe/a$a;

    move-result-object p1

    return-object p1
.end method
