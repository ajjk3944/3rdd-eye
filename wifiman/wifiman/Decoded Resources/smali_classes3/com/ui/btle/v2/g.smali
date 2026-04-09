.class public final Lcom/ui/btle/v2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/btle/v2/d$a;


# instance fields
.field private final a:Lcom/ui/btle/v2/f$a;

.field private final b:Lgg/y;

.field private final c:Lgg/y;


# direct methods
.method public constructor <init>(Lcom/ui/btle/v2/f$a;Lgg/y;Lgg/y;)V
    .locals 1

    const-string/jumbo v0, "frameReader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "readScheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "processingScheduler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/btle/v2/g;->a:Lcom/ui/btle/v2/f$a;

    iput-object p2, p0, Lcom/ui/btle/v2/g;->b:Lgg/y;

    iput-object p3, p0, Lcom/ui/btle/v2/g;->c:Lgg/y;

    return-void
.end method


# virtual methods
.method public a(LZ8/a;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "encryption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/btle/v2/g;->a:Lcom/ui/btle/v2/f$a;

    invoke-interface {v0}, Lcom/ui/btle/v2/f$a;->f()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/btle/v2/g$a;

    invoke-direct {v1, p1}, Lcom/ui/btle/v2/g$a;-><init>(LZ8/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/btle/v2/g$b;

    invoke-direct {v0, p0}, Lcom/ui/btle/v2/g$b;-><init>(Lcom/ui/btle/v2/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/btle/v2/g;->b:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/btle/v2/g;->c:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "override fun receive(enc\u2026ler)\n            .cache()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b([B)Lcom/ui/btle/v2/d;
    .locals 4

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance v0, Lcom/ui/btle/v2/d;

    sget-object v1, Lcom/ui/btle/v2/e$a$c;->a:Lcom/ui/btle/v2/e$a$c;

    const-string/jumbo v2, "buffer"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/ui/btle/v2/e$a$c;->b(Ljava/nio/ByteBuffer;)S

    move-result v1

    sget-object v2, Lcom/ui/btle/v2/e$a$b;->a:Lcom/ui/btle/v2/e$a$b;

    invoke-virtual {v2, p1}, Lcom/ui/btle/v2/e$a$b;->b(Ljava/nio/ByteBuffer;)Lcom/ui/btle/v2/c;

    move-result-object v2

    sget-object v3, Lcom/ui/btle/v2/e$b;->a:Lcom/ui/btle/v2/e$b;

    invoke-virtual {v3, p1}, Lcom/ui/btle/v2/e$b;->a(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/ui/btle/v2/d;-><init>(SLcom/ui/btle/v2/c;[BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
