.class public Lorg/msgpack/core/MessageSizeException;
.super Lorg/msgpack/core/MessagePackException;
.source "SourceFile"


# instance fields
.field private final b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lorg/msgpack/core/MessagePackException;-><init>()V

    iput-wide p1, p0, Lorg/msgpack/core/MessageSizeException;->b:J

    return-void
.end method
