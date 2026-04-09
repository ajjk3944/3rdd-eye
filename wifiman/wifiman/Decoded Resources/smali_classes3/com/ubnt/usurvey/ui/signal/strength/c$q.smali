.class final Lcom/ubnt/usurvey/ui/signal/strength/c$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c;-><init>(Lje/u;Ly8/p;Ly8/d;Ly8/n;Ly8/m;LCd/f;Ly8/v;Lde/z;Lre/a;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/c$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$q;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c$q;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$q;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$q;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lje/r;LS8/c;)Lje/q;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$q;->c(Lje/r;LS8/c;)Lje/q;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lje/r;LS8/c;)Lje/q;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lje/r$b$a$a;

    invoke-virtual {p0, p1}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lje/q;->i()Lke/a;

    move-result-object v0

    instance-of v0, v0, Lke/a$a$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$q;->b(Lje/r;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lje/r;)Ll9/a;
    .locals 7

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lje/r$b$a$b;

    if-eqz v0, :cond_1

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v0

    check-cast p1, Lje/r$b$a$b;

    invoke-virtual {p1}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lje/r$b$a$b;->h()LS8/l;

    move-result-object v2

    invoke-virtual {p1}, Lje/r$b$a$b;->f()LW7/b;

    move-result-object v3

    invoke-virtual {p1}, Lje/r$b$a$b;->l()LS8/d;

    move-result-object p1

    new-instance v4, LTe/l0$a;

    invoke-direct {v4, v1, v2, p1, v3}, LTe/l0$a;-><init>(LS8/c;LS8/l;LS8/d;LW7/b;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {v0}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, LCi/a;->j(Ljava/util/Map;)LCi/d;

    move-result-object p1

    new-instance v0, LTe/l0;

    invoke-direct {v0, p1}, LTe/l0;-><init>(LCi/d;)V

    new-instance p1, LTe/K0$e;

    invoke-direct {p1, v0}, LTe/K0$e;-><init>(LTe/l0;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lje/r$b$a$a;

    if-eqz v0, :cond_3

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v1

    invoke-static {v1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v1

    new-instance v2, Lcom/ubnt/usurvey/ui/signal/strength/d;

    invoke-direct {v2, p1}, Lcom/ubnt/usurvey/ui/signal/strength/d;-><init>(Lje/r;)V

    invoke-static {v1, v2}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lje/q;

    invoke-virtual {v1}, Lje/q;->c()LS8/c;

    move-result-object v2

    invoke-virtual {v1}, Lje/q;->h()LS8/l;

    move-result-object v3

    invoke-virtual {v1}, Lje/q;->g()LW7/b;

    move-result-object v4

    invoke-virtual {v1}, Lje/q;->c()LS8/c;

    move-result-object v5

    invoke-virtual {v1}, Lje/q;->d()LS8/d;

    move-result-object v1

    new-instance v6, LTe/l0$a;

    invoke-direct {v6, v5, v3, v1, v4}, LTe/l0$a;-><init>(LS8/c;LS8/l;LS8/d;LW7/b;)V

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {v0}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, LCi/a;->j(Ljava/util/Map;)LCi/d;

    move-result-object p1

    new-instance v0, LTe/l0;

    invoke-direct {v0, p1}, LTe/l0;-><init>(LCi/d;)V

    new-instance p1, LTe/K0$e;

    invoke-direct {p1, v0}, LTe/K0$e;-><init>(LTe/l0;)V

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    new-instance v0, Ll9/a;

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
