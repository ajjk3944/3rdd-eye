.class final Lcom/ui/btle/v2/encryption/dh/a$c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/encryption/dh/a$c;->b(LYg/s;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/btle/v2/encryption/dh/a;

.field final synthetic b:[B


# direct methods
.method constructor <init>(Lcom/ui/btle/v2/encryption/dh/a;[B)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->a:Lcom/ui/btle/v2/encryption/dh/a;

    iput-object p2, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/btle/v2/encryption/dh/a;[BLgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/btle/v2/encryption/dh/a$c$d;->c(Lcom/ui/btle/v2/encryption/dh/a;[BLgg/t;)V

    return-void
.end method

.method private static final c(Lcom/ui/btle/v2/encryption/dh/a;[BLgg/t;)V
    .locals 3

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$publicKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/btle/v2/d;

    invoke-static {p0}, Lcom/ui/btle/v2/encryption/dh/a;->e(Lcom/ui/btle/v2/encryption/dh/a;)Lc9/a;

    move-result-object p0

    invoke-interface {p0}, Lc9/a;->a()S

    move-result p0

    sget-object v1, Lcom/ui/btle/v2/c;->AUTHENTICATION:Lcom/ui/btle/v2/c;

    sget-object v2, Lcom/ui/btle/v2/encryption/dh/a$a;->Companion:Lcom/ui/btle/v2/encryption/dh/a$a$a;

    invoke-virtual {v2, p1}, Lcom/ui/btle/v2/encryption/dh/a$a$a;->b([B)[B

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, p1, v2}, Lcom/ui/btle/v2/d;-><init>(SLcom/ui/btle/v2/c;[BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    invoke-interface {p2}, Lgg/h;->a()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/encryption/dh/a$c$d;->b([B)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b([B)Lgg/D;
    .locals 4

    const-string/jumbo v0, "sharedKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-static {v0}, Lcom/ui/btle/v2/encryption/dh/a;->i(Lcom/ui/btle/v2/encryption/dh/a;)Lcom/ui/btle/v2/d$b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->a:Lcom/ui/btle/v2/encryption/dh/a;

    iget-object v2, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->b:[B

    new-instance v3, Lcom/ui/btle/v2/encryption/dh/c;

    invoke-direct {v3, v1, v2}, Lcom/ui/btle/v2/encryption/dh/c;-><init>(Lcom/ui/btle/v2/encryption/dh/a;[B)V

    invoke-static {v3}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object v1

    const-string/jumbo v2, "create {\n               \u2026                        }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-static {v2}, Lcom/ui/btle/v2/encryption/dh/a;->h(Lcom/ui/btle/v2/encryption/dh/a;)LZ8/c;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ui/btle/v2/d$b;->a(Lgg/s;LZ8/a;)Lgg/b;

    move-result-object v0

    sget-object v1, Lcom/ui/btle/v2/encryption/dh/a$c$d$a;->a:Lcom/ui/btle/v2/encryption/dh/a$c$d$a;

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-static {v1}, Lcom/ui/btle/v2/encryption/dh/a;->f(Lcom/ui/btle/v2/encryption/dh/a;)Lcom/ui/btle/v2/d$a;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-static {v2}, Lcom/ui/btle/v2/encryption/dh/a;->g(Lcom/ui/btle/v2/encryption/dh/a;)LZ8/c;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ui/btle/v2/d$a;->a(LZ8/a;)Lgg/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/btle/v2/encryption/dh/a$c$d$b;->a:Lcom/ui/btle/v2/encryption/dh/a$c$d$b;

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/btle/v2/encryption/dh/a$c$d$c;

    invoke-direct {v1, p1}, Lcom/ui/btle/v2/encryption/dh/a$c$d$c;-><init>([B)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
