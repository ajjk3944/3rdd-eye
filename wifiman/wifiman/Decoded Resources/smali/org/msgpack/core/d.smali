.class public abstract Lorg/msgpack/core/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/msgpack/core/d$c;,
        Lorg/msgpack/core/d$b;,
        Lorg/msgpack/core/d$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:Lorg/msgpack/core/d$b;

.field public static final c:Lorg/msgpack/core/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lorg/msgpack/core/d;->a:Ljava/nio/charset/Charset;

    new-instance v0, Lorg/msgpack/core/d$b;

    invoke-direct {v0}, Lorg/msgpack/core/d$b;-><init>()V

    sput-object v0, Lorg/msgpack/core/d;->b:Lorg/msgpack/core/d$b;

    new-instance v0, Lorg/msgpack/core/d$c;

    invoke-direct {v0}, Lorg/msgpack/core/d$c;-><init>()V

    sput-object v0, Lorg/msgpack/core/d;->c:Lorg/msgpack/core/d$c;

    return-void
.end method

.method public static a()Lorg/msgpack/core/b;
    .locals 1

    sget-object v0, Lorg/msgpack/core/d;->b:Lorg/msgpack/core/d$b;

    invoke-virtual {v0}, Lorg/msgpack/core/d$b;->f()Lorg/msgpack/core/b;

    move-result-object v0

    return-object v0
.end method

.method public static b([B)Lorg/msgpack/core/f;
    .locals 1

    sget-object v0, Lorg/msgpack/core/d;->c:Lorg/msgpack/core/d$c;

    invoke-virtual {v0, p0}, Lorg/msgpack/core/d$c;->l([B)Lorg/msgpack/core/f;

    move-result-object p0

    return-object p0
.end method
