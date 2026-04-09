.class final Ly8/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/h;-><init>(LBc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/h;


# direct methods
.method constructor <init>(Ly8/h;)V
    .locals 0

    iput-object p1, p0, Ly8/h$c;->a:Ly8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly8/h$a;)LTe/J;
    .locals 10

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly8/h$a;->a()Z

    move-result v0

    invoke-virtual {p1}, Ly8/h$a;->b()LBc/a$a;

    move-result-object v1

    invoke-virtual {p1}, Ly8/h$a;->c()Z

    move-result v2

    invoke-virtual {p1}, Ly8/h$a;->d()LBc/a$a;

    move-result-object p1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Ly8/h$c;->a:Ly8/h;

    invoke-virtual {p1}, LBc/a$a;->a()LV7/a;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v4, :cond_0

    move v4, v7

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    invoke-static {v3, v1, v0, v4}, Ly8/h;->i(Ly8/h;LBc/a$a;ZZ)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Ly8/h$c;->a:Ly8/h;

    invoke-virtual {v1}, LBc/a$a;->a()LV7/a;

    move-result-object v3

    if-nez v3, :cond_1

    move v6, v7

    :cond_1
    invoke-static {v0, p1, v2, v6}, Ly8/h;->i(Ly8/h;LBc/a$a;ZZ)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, LTe/J;

    sget-object v4, Lgc/b;->SIGNAL:Lgc/b;

    invoke-virtual {v1}, LBc/a$a;->d()LV7/b;

    move-result-object v2

    instance-of v2, v2, LV7/b$c;

    if-nez v2, :cond_5

    invoke-virtual {v1}, LBc/a$a;->d()LV7/b;

    move-result-object v1

    instance-of v1, v1, LV7/b$d;

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, LBc/a$a;->d()LV7/b;

    move-result-object v1

    instance-of v1, v1, LV7/b$c;

    if-nez v1, :cond_4

    invoke-virtual {p1}, LBc/a$a;->d()LV7/b;

    move-result-object p1

    instance-of p1, p1, LV7/b$d;

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    sget-object p1, LTe/M$b$a$a;->a:LTe/M$b$a$a;

    :goto_1
    move-object v6, p1

    goto :goto_4

    :cond_4
    :goto_2
    sget-object p1, LTe/M$b$a$b;->a:LTe/M$b$a$b;

    goto :goto_1

    :cond_5
    :goto_3
    sget-object p1, LTe/M$b$a$b;->a:LTe/M$b$a$b;

    goto :goto_1

    :goto_4
    iget-object p1, p0, Ly8/h$c;->a:Ly8/h;

    invoke-virtual {p1}, Ly8/f;->e()LTe/L;

    move-result-object v7

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v8

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v9

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, LTe/J;-><init>(Lgc/b;Ljava/util/List;LTe/M;LTe/L;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly8/h$a;

    invoke-virtual {p0, p1}, Ly8/h$c;->a(Ly8/h$a;)LTe/J;

    move-result-object p1

    return-object p1
.end method
