.class final LM2/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:LM2/h;


# direct methods
.method constructor <init>(LM2/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM2/h$b;->a:LM2/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2}, LM2/h$b;->d(Ljava/nio/ByteBuffer;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2, p3, p4}, LM2/h$b;->c(Ljava/nio/ByteBuffer;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILC2/g;)LE2/c;
    .locals 1

    invoke-static {p1}, Lcom/bumptech/glide/load/resource/bitmap/i;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    iget-object v0, p0, LM2/h$b;->a:LM2/h;

    invoke-virtual {v0, p1, p2, p3, p4}, LM2/h;->b(Landroid/graphics/ImageDecoder$Source;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;LC2/g;)Z
    .locals 0

    iget-object p2, p0, LM2/h$b;->a:LM2/h;

    invoke-virtual {p2, p1}, LM2/h;->d(Ljava/nio/ByteBuffer;)Z

    move-result p1

    return p1
.end method
