.class public final Lcom/ui/btle/v2/encryption/dh/a;
.super Lcom/ui/btle/v2/encryption/dh/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/encryption/dh/a$a;,
        Lcom/ui/btle/v2/encryption/dh/a$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/btle/v2/d$b;

.field private final b:Lcom/ui/btle/v2/d$a;

.field private final c:Lc9/a;

.field private final d:Ljava/lang/String;

.field private final e:Lgg/z;

.field private final f:LZ8/c;

.field private final g:LZ8/c;


# direct methods
.method public constructor <init>(Lcom/ui/btle/v2/d$b;Lcom/ui/btle/v2/d$a;Lc9/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "sender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "reader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packetSequence"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "publicSharedKey"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/btle/v2/encryption/dh/d;-><init>()V

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a;->a:Lcom/ui/btle/v2/d$b;

    iput-object p2, p0, Lcom/ui/btle/v2/encryption/dh/a;->b:Lcom/ui/btle/v2/d$a;

    iput-object p3, p0, Lcom/ui/btle/v2/encryption/dh/a;->c:Lc9/a;

    iput-object p5, p0, Lcom/ui/btle/v2/encryption/dh/a;->d:Ljava/lang/String;

    new-instance p1, Lcom/ui/btle/v2/encryption/dh/a$g;

    invoke-direct {p1, p0}, Lcom/ui/btle/v2/encryption/dh/a$g;-><init>(Lcom/ui/btle/v2/encryption/dh/a;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a;->e:Lgg/z;

    new-instance p1, LZ8/c;

    invoke-static {p4}, Ld9/a;->a(Ljava/lang/String;)[B

    move-result-object p2

    invoke-static {p2}, LZ8/c$a;->b([B)[B

    move-result-object p2

    invoke-interface {p3}, Lc9/a;->b()S

    move-result p5

    const/4 v0, 0x0

    invoke-direct {p1, p2, p5, v0}, LZ8/c;-><init>([BSLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a;->f:LZ8/c;

    new-instance p1, LZ8/c;

    invoke-static {p4}, Ld9/a;->a(Ljava/lang/String;)[B

    move-result-object p2

    invoke-static {p2}, LZ8/c$a;->b([B)[B

    move-result-object p2

    invoke-interface {p3}, Lc9/a;->b()S

    move-result p3

    invoke-direct {p1, p2, p3, v0}, LZ8/c;-><init>([BSLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a;->g:LZ8/c;

    return-void
.end method

.method public static final synthetic d(Lcom/ui/btle/v2/encryption/dh/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/encryption/dh/a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/btle/v2/encryption/dh/a;)Lc9/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/encryption/dh/a;->c:Lc9/a;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/btle/v2/encryption/dh/a;)Lcom/ui/btle/v2/d$a;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/encryption/dh/a;->b:Lcom/ui/btle/v2/d$a;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/btle/v2/encryption/dh/a;)LZ8/c;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/encryption/dh/a;->g:LZ8/c;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/btle/v2/encryption/dh/a;)LZ8/c;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/encryption/dh/a;->f:LZ8/c;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/btle/v2/encryption/dh/a;)Lcom/ui/btle/v2/d$b;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/encryption/dh/a;->a:Lcom/ui/btle/v2/d$b;

    return-object p0
.end method


# virtual methods
.method public j()Lgg/z;
    .locals 2

    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/a;->e:Lgg/z;

    new-instance v1, Lcom/ui/btle/v2/encryption/dh/a$c;

    invoke-direct {v1, p0}, Lcom/ui/btle/v2/encryption/dh/a$c;-><init>(Lcom/ui/btle/v2/encryption/dh/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/btle/v2/encryption/dh/a$d;->a:Lcom/ui/btle/v2/encryption/dh/a$d;

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/btle/v2/encryption/dh/a$e;->a:Lcom/ui/btle/v2/encryption/dh/a$e;

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/btle/v2/encryption/dh/a$f;->a:Lcom/ui/btle/v2/encryption/dh/a$f;

    invoke-virtual {v0, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "override fun keyExchange\u2026Exchange Failed\" }, it) }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
