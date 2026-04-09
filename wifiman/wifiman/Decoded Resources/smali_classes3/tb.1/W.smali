.class public abstract Ltb/W;
.super Lkb/r;
.source "SourceFile"

# interfaces
.implements Ltb/f$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkb/r;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkb/r;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method
