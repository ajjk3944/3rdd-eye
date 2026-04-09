.class final Ly8/h$d;
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

    iput-object p1, p0, Ly8/h$d;->a:Ly8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly8/h$a;)Ljava/util/List;
    .locals 6

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/h$d;->a:Ly8/h;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Ly8/h$a;->e()LBc/a$a;

    move-result-object v2

    invoke-virtual {v2}, LBc/a$a;->a()LV7/a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ly8/h$a;->e()LBc/a$a;

    move-result-object v2

    invoke-virtual {p1}, Ly8/h$a;->f()Z

    move-result v3

    invoke-virtual {p1}, Ly8/h$a;->g()LBc/a$a;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v0, v5, v2, v3, v4}, Ly8/h;->j(Ly8/h;ILBc/a$a;ZLBc/a$a;)LTe/B0;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, Ly8/h$a;->g()LBc/a$a;

    move-result-object v2

    invoke-virtual {v2}, LBc/a$a;->a()LV7/a;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ly8/h$a;->g()LBc/a$a;

    move-result-object v2

    invoke-virtual {p1}, Ly8/h$a;->h()Z

    move-result v3

    invoke-virtual {p1}, Ly8/h$a;->e()LBc/a$a;

    move-result-object p1

    const/4 v4, 0x1

    invoke-static {v0, v4, v2, v3, p1}, Ly8/h;->j(Ly8/h;ILBc/a$a;ZLBc/a$a;)LTe/B0;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly8/h$a;

    invoke-virtual {p0, p1}, Ly8/h$d;->a(Ly8/h$a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
