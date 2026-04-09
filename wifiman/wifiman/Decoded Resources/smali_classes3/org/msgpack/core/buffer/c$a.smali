.class final Lorg/msgpack/core/buffer/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/msgpack/core/buffer/c;->k(Ljava/nio/ByteBuffer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/nio/ByteBuffer;


# direct methods
.method constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lorg/msgpack/core/buffer/c$a;->a:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/msgpack/core/buffer/c$a;->a:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lorg/msgpack/core/buffer/c;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
