.class final LM8/A$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;->w0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$s;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS8/c;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0}, LS8/c;->getChannels()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LS8/e;

    invoke-virtual {v3}, LS8/e;->d()I

    move-result v3

    if-ne v3, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, LS8/e;

    if-eqz v2, :cond_2

    iget-object v1, p0, LM8/A$s;->a:LM8/A;

    invoke-static {v1}, LM8/A;->O0(LM8/A;)Li8/a;

    move-result-object v1

    new-instance v3, Li8/a$b$I;

    invoke-direct {v3, v2}, Li8/a$b$I;-><init>(LS8/e;)V

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, LM8/A$s$a;

    invoke-direct {v1, p1, v0}, LM8/A$s$a;-><init>(ILS8/c;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string/jumbo p1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LM8/A$s;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
