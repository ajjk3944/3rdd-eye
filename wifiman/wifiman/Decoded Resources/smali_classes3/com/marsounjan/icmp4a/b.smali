.class public abstract Lcom/marsounjan/icmp4a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private final b:LYg/m;

.field private c:S

.field private final d:S


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "abcdefghijklmnopqrstuvwxyz"

    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string/jumbo v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/marsounjan/icmp4a/b;->a:[B

    new-instance v0, Lcom/marsounjan/icmp4a/b$a;

    invoke-direct {v0, p0}, Lcom/marsounjan/icmp4a/b$a;-><init>(Lcom/marsounjan/icmp4a/b;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lcom/marsounjan/icmp4a/b;->b:LYg/m;

    sget-object v0, Lqh/c;->a:Lqh/c$a;

    invoke-virtual {v0}, Lqh/c$a;->d()I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Lcom/marsounjan/icmp4a/b;->d:S

    return-void
.end method

.method public static final synthetic a(Lcom/marsounjan/icmp4a/b;)[B
    .locals 0

    iget-object p0, p0, Lcom/marsounjan/icmp4a/b;->a:[B

    return-object p0
.end method

.method private final b()[B
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/b;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method


# virtual methods
.method public abstract c()[B
.end method

.method protected abstract d()I
.end method

.method protected abstract e(SS)Ljava/lang/Object;
.end method

.method protected final f()S
    .locals 1

    iget-short v0, p0, Lcom/marsounjan/icmp4a/b;->c:S

    return v0
.end method

.method protected abstract g()Lcom/marsounjan/icmp4a/IcmpMessageSerializer;
.end method

.method protected abstract h(Ljava/lang/Object;)Z
.end method

.method public final i()Ljava/nio/ByteBuffer;
    .locals 4

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/b;->g()Lcom/marsounjan/icmp4a/IcmpMessageSerializer;

    move-result-object v0

    iget-short v1, p0, Lcom/marsounjan/icmp4a/b;->c:S

    add-int/lit8 v1, v1, 0x1

    int-to-short v1, v1

    invoke-static {v1}, LYg/H;->b(S)S

    move-result v1

    iput-short v1, p0, Lcom/marsounjan/icmp4a/b;->c:S

    iget-short v2, p0, Lcom/marsounjan/icmp4a/b;->d:S

    invoke-virtual {p0, v1, v2}, Lcom/marsounjan/icmp4a/b;->e(SS)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/b;->c()[B

    move-result-object v2

    invoke-direct {p0}, Lcom/marsounjan/icmp4a/b;->b()[B

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer;->e(Ljava/lang/Object;[B[B)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method protected abstract j(Ljava/lang/Object;IJ)Lcom/marsounjan/icmp4a/Icmp$c;
.end method

.method public final k(Ljava/nio/ByteBuffer;IJ)Lcom/marsounjan/icmp4a/Icmp$c;
    .locals 2

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/b;->g()Lcom/marsounjan/icmp4a/IcmpMessageSerializer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/marsounjan/icmp4a/b;->h(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/marsounjan/icmp4a/b;->j(Ljava/lang/Object;IJ)Lcom/marsounjan/icmp4a/Icmp$c;

    move-result-object v1

    :cond_1
    return-object v1
.end method
