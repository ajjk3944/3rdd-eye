.class final Lpg/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Lzg/c;


# direct methods
.method constructor <init>(Lzg/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg/r$b;->a:Lzg/c;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Lpg/r$b;->a:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lpg/r$b;->a:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->a()Z

    move-result v0

    return v0
.end method
