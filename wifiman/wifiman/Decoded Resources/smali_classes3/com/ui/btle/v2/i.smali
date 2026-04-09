.class public final Lcom/ui/btle/v2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT8/d;


# instance fields
.field private final a:Lcom/ui/btle/v2/d$b;

.field private final b:Lc9/a;

.field private final c:LZ8/a;

.field private final d:LT8/b$c;

.field private final e:Lgg/s;


# direct methods
.method public constructor <init>(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)V
    .locals 1

    const-string/jumbo v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sender"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sequence"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "encryption"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "connectionProperties"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ui/btle/v2/i;->a:Lcom/ui/btle/v2/d$b;

    iput-object p3, p0, Lcom/ui/btle/v2/i;->b:Lc9/a;

    iput-object p4, p0, Lcom/ui/btle/v2/i;->c:LZ8/a;

    iput-object p5, p0, Lcom/ui/btle/v2/i;->d:LT8/b$c;

    new-instance p2, Lcom/ui/btle/v2/i$c;

    invoke-direct {p2, p1, p0}, Lcom/ui/btle/v2/i$c;-><init>(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/i;)V

    invoke-static {p2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/ui/btle/v2/i$a;->a:Lcom/ui/btle/v2/i$a;

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, Lcom/ui/btle/v2/i$b;->a:Lcom/ui/btle/v2/i$b;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->Y()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->t0()Lgg/s;

    move-result-object p1

    const-string/jumbo p2, "single { reader.receive(\u2026e()\n            .repeat()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/btle/v2/i;->e:Lgg/s;

    return-void
.end method

.method public static synthetic c(Ljava/util/List;Lcom/ui/btle/v2/i;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/btle/v2/i;->e(Ljava/util/List;Lcom/ui/btle/v2/i;Lgg/t;)V

    return-void
.end method

.method public static final synthetic d(Lcom/ui/btle/v2/i;)LZ8/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/i;->c:LZ8/a;

    return-object p0
.end method

.method private static final e(Ljava/util/List;Lcom/ui/btle/v2/i;Lgg/t;)V
    .locals 5

    const-string v0, "$messages"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT8/d$a;

    invoke-virtual {v0}, LT8/d$a;->f()[B

    move-result-object v0

    new-instance v1, Lcom/ui/btle/v2/d;

    iget-object v2, p1, Lcom/ui/btle/v2/i;->b:Lc9/a;

    invoke-interface {v2}, Lc9/a;->a()S

    move-result v2

    sget-object v3, Lcom/ui/btle/v2/c;->BINARY_MESSAGE:Lcom/ui/btle/v2/c;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/ui/btle/v2/d;-><init>(SLcom/ui/btle/v2/c;[BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lgg/h;->a()V

    return-void
.end method


# virtual methods
.method public a()Lgg/s;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/i;->e:Lgg/s;

    return-object v0
.end method

.method public b(Ljava/util/List;)Lgg/b;
    .locals 2

    const-string/jumbo v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/btle/v2/i;->a:Lcom/ui/btle/v2/d$b;

    new-instance v1, LY8/a;

    invoke-direct {v1, p1, p0}, LY8/a;-><init>(Ljava/util/List;Lcom/ui/btle/v2/i;)V

    invoke-static {v1}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    const-string/jumbo v1, "create { emitter ->\n    \u2026nComplete()\n            }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ui/btle/v2/i;->c:LZ8/a;

    invoke-interface {v0, p1, v1}, Lcom/ui/btle/v2/d$b;->a(Lgg/s;LZ8/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
