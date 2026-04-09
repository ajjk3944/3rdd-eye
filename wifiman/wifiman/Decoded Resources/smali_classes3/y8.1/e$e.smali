.class final Ly8/e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/e;-><init>(Lre/a;Lje/u;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/e;


# direct methods
.method constructor <init>(Ly8/e;)V
    .locals 0

    iput-object p1, p0, Ly8/e$e;->a:Ly8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ll9/a;

    check-cast p3, La8/a;

    invoke-virtual {p0, p1, p2, p3}, Ly8/e$e;->b(Ljava/util/List;Ll9/a;La8/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;Ll9/a;La8/a;)Ljava/util/List;
    .locals 10

    const-string/jumbo v0, "apComparison"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "devices"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh9/a;

    iget-object v6, p0, Ly8/e$e;->a:Ly8/e;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v7

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v8, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v1, Lre/n$a;

    invoke-virtual {v1}, Lre/n$a;->a()Lre/a$a;

    move-result-object v2

    invoke-static {v6, v0}, Ly8/e;->j(Ly8/e;I)LTe/N;

    move-result-object v3

    sget-object v0, La8/b;->c:La8/b$a;

    invoke-virtual {v1}, Lre/n$a;->a()Lre/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lre/a$a;->b()Lh9/a;

    move-result-object v4

    invoke-virtual {v0, v4}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v0

    invoke-virtual {p3, v0}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LCc/a;

    invoke-virtual {v1}, Lre/n$a;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWc/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS8/l;

    :goto_1
    move-object v5, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, Lre/n$a;->a()Lre/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a$a;->b()Lh9/a;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    move-object v0, v6

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move v5, v9

    invoke-static/range {v0 .. v5}, Ly8/e;->k(Ly8/e;Lre/a$a;LTe/N;LCc/a;LS8/l;Z)LTe/B0;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v8

    goto :goto_0

    :cond_2
    invoke-static {v7}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
