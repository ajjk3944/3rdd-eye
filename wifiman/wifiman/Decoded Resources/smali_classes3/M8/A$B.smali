.class final LM8/A$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;->l1(LS8/c;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LS8/c;

.field final synthetic b:LM8/A;


# direct methods
.method constructor <init>(LS8/c;LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$B;->a:LS8/c;

    iput-object p2, p0, LM8/A$B;->b:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/lang/String;)LM8/A$b;
    .locals 4

    const-string/jumbo v0, "networksOnSpectrum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "searchQuery"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    iget-object p2, p0, LM8/A$B;->b:LM8/A;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lle/f;

    invoke-static {p2}, LM8/A;->N0(LM8/A;)LM8/t;

    move-result-object v3

    invoke-virtual {v3}, Lk8/m;->e()Lmh/l;

    move-result-object v3

    invoke-interface {v3, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, LM8/A$b$c$c;

    iget-object p2, p0, LM8/A$B;->a:LS8/c;

    invoke-direct {p1, p2}, LM8/A$b$c$c;-><init>(LS8/c;)V

    goto :goto_1

    :cond_2
    new-instance p1, LM8/A$b$c$a;

    iget-object p2, p0, LM8/A$B;->a:LS8/c;

    invoke-direct {p1, p2, v0}, LM8/A$b$c$a;-><init>(LS8/c;Ljava/util/List;)V

    goto :goto_1

    :cond_3
    new-instance p2, LM8/A$b$c$a;

    iget-object v0, p0, LM8/A$B;->a:LS8/c;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p2, v0, p1}, LM8/A$b$c$a;-><init>(LS8/c;Ljava/util/List;)V

    move-object p1, p2

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, LM8/A$B;->a(Ljava/util/List;Ljava/lang/String;)LM8/A$b;

    move-result-object p1

    return-object p1
.end method
