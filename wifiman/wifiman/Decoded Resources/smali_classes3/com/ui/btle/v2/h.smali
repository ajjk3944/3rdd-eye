.class public final Lcom/ui/btle/v2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/btle/v2/d$b;


# instance fields
.field private final a:Lcom/ui/btle/v2/f$b;

.field private final b:Lgg/y;

.field private final c:Lgg/y;


# direct methods
.method public constructor <init>(Lcom/ui/btle/v2/f$b;Lgg/y;Lgg/y;)V
    .locals 1

    const-string/jumbo v0, "frameWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "writeScheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "processingScheduler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/btle/v2/h;->a:Lcom/ui/btle/v2/f$b;

    iput-object p2, p0, Lcom/ui/btle/v2/h;->b:Lgg/y;

    iput-object p3, p0, Lcom/ui/btle/v2/h;->c:Lgg/y;

    return-void
.end method

.method public static final synthetic b(Lcom/ui/btle/v2/h;)Lcom/ui/btle/v2/f$b;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/v2/h;->a:Lcom/ui/btle/v2/f$b;

    return-object p0
.end method


# virtual methods
.method public a(Lgg/s;LZ8/a;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "packetFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "encryption"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/btle/v2/h$a;

    invoke-direct {v0, p0}, Lcom/ui/btle/v2/h$a;-><init>(Lcom/ui/btle/v2/h;)V

    invoke-virtual {p1, v0}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance v0, Lcom/ui/btle/v2/h$b;

    invoke-direct {v0, p2}, Lcom/ui/btle/v2/h$b;-><init>(LZ8/a;)V

    invoke-virtual {p1, v0}, Lgg/s;->Y(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance p2, Lcom/ui/btle/v2/h$c;

    invoke-direct {p2, p0}, Lcom/ui/btle/v2/h$c;-><init>(Lcom/ui/btle/v2/h;)V

    invoke-virtual {p1, p2}, Lgg/s;->U(Lkg/n;)Lgg/b;

    move-result-object p1

    iget-object p2, p0, Lcom/ui/btle/v2/h;->b:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    iget-object p2, p0, Lcom/ui/btle/v2/h;->c:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->l()Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "override fun send(packet\u2026ler)\n            .cache()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c(Lcom/ui/btle/v2/d;)[B
    .locals 5

    const-string/jumbo v0, "packet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/btle/v2/e$a$c;->a:Lcom/ui/btle/v2/e$a$c;

    invoke-virtual {v0}, Lcom/ui/btle/v2/e$a$c;->a()I

    move-result v1

    sget-object v2, Lcom/ui/btle/v2/e$a$b;->a:Lcom/ui/btle/v2/e$a$b;

    invoke-virtual {v2}, Lcom/ui/btle/v2/e$a$b;->a()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p1}, Lcom/ui/btle/v2/d;->a()[B

    move-result-object v3

    array-length v3, v3

    add-int/2addr v1, v3

    new-array v1, v1, [B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    const-string/jumbo v4, "buffer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/btle/v2/d;->c()S

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/ui/btle/v2/e$a$c;->c(Ljava/nio/ByteBuffer;S)V

    invoke-virtual {p1}, Lcom/ui/btle/v2/d;->b()Lcom/ui/btle/v2/c;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/ui/btle/v2/e$a$b;->c(Ljava/nio/ByteBuffer;Lcom/ui/btle/v2/c;)V

    sget-object v0, Lcom/ui/btle/v2/e$b;->a:Lcom/ui/btle/v2/e$b;

    invoke-virtual {p1}, Lcom/ui/btle/v2/d;->a()[B

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lcom/ui/btle/v2/e$b;->b(Ljava/nio/ByteBuffer;[B)V

    invoke-static {v1}, Lcom/ui/btle/v2/f;->b([B)[B

    move-result-object p1

    return-object p1
.end method
