.class public Lkb/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkb/f;

.field private final b:[B

.field private final c:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Lkb/f;[BZ)V
    .locals 7

    const-string/jumbo v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/j;->a:Lkb/f;

    iput-object p2, p0, Lkb/j;->b:[B

    sget-object v1, Lkb/c;->a:Lkb/c;

    invoke-virtual {p1}, Lkb/f;->d()[B

    move-result-object v2

    sget-object v3, Lkb/l$b;->JSON:Lkb/l$b;

    sget-object v5, Lkb/l$b;->BINARY:Lkb/l$b;

    move-object v4, p2

    move v6, p3

    invoke-virtual/range {v1 .. v6}, Lkb/c;->d([BLkb/l$b;[BLkb/l$b;Z)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lkb/j;->c:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final a()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lkb/j;->c:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final b()Lkb/f;
    .locals 1

    iget-object v0, p0, Lkb/j;->a:Lkb/f;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lkb/j;->a:Lkb/f;

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lkb/j;->b:[B

    sget-object v3, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
