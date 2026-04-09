.class public abstract Lcom/ui/btle/v2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/btle/v2/a;


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ui/btle/v2/b$d;

    invoke-direct {v0, p0}, Lcom/ui/btle/v2/b$d;-><init>(Lcom/ui/btle/v2/b;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/btle/v2/b;->a:LYg/m;

    new-instance v0, Lcom/ui/btle/v2/b$b;

    invoke-direct {v0, p0}, Lcom/ui/btle/v2/b$b;-><init>(Lcom/ui/btle/v2/b;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/btle/v2/b;->b:LYg/m;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/b;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/i;

    return-object v0
.end method

.method protected final c(LZ8/a$a;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;)Lgg/z;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "reader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sender"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packetSequence"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LZ8/a$a$b;->a:LZ8/a$a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LZ8/b;->a:LZ8/b;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "just(BTLEv2EncryptionPlain)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LZ8/a$a$a;

    if-eqz v0, :cond_1

    check-cast p1, LZ8/a$a$a;

    invoke-virtual {p1}, LZ8/a$a$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LZ8/a$a$a;->a()Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lcom/ui/btle/v2/encryption/dh/a;

    move-object v0, p1

    move-object v1, p3

    move-object v2, p2

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lcom/ui/btle/v2/encryption/dh/a;-><init>(Lcom/ui/btle/v2/d$b;Lcom/ui/btle/v2/d$a;Lc9/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/btle/v2/encryption/dh/a;->j()Lgg/z;

    move-result-object p1

    new-instance p2, Lcom/ui/btle/v2/b$a;

    invoke-direct {p2, p4}, Lcom/ui/btle/v2/b$a;-><init>(Lc9/a;)V

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "packetSequence: BTLEv2Pa\u2026      )\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method protected abstract d()Lgg/b;
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/b;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/i;

    return-object v0
.end method

.method protected final f(Lcom/ui/btle/v2/f$a;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$a;
    .locals 1

    const-string/jumbo v0, "frameReader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "schedulerFrameRead"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "schedulerProcessing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/btle/v2/g;

    invoke-direct {v0, p1, p2, p3}, Lcom/ui/btle/v2/g;-><init>(Lcom/ui/btle/v2/f$a;Lgg/y;Lgg/y;)V

    return-object v0
.end method

.method protected final g(Lcom/ui/btle/v2/f$b;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$b;
    .locals 1

    const-string/jumbo v0, "frameWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "schedulerFrameWrite"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "schedulerProcessing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/btle/v2/h;

    invoke-direct {v0, p1, p2, p3}, Lcom/ui/btle/v2/h;-><init>(Lcom/ui/btle/v2/f$b;Lgg/y;Lgg/y;)V

    return-object v0
.end method

.method protected final h()Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/btle/v2/b$c;

    invoke-direct {v0}, Lcom/ui/btle/v2/b$c;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected final i(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)Lcom/ui/btle/v2/i;
    .locals 7

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

    new-instance v0, Lcom/ui/btle/v2/i;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ui/btle/v2/i;-><init>(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)V

    return-object v0
.end method
