.class final Lqg/g0$i;
.super Lqg/g0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# instance fields
.field final e:I


# direct methods
.method constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0, p2}, Lqg/g0$a;-><init>(Z)V

    iput p1, p0, Lqg/g0$i;->e:I

    return-void
.end method


# virtual methods
.method n()V
    .locals 2

    iget v0, p0, Lqg/g0$a;->c:I

    iget v1, p0, Lqg/g0$i;->e:I

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lqg/g0$a;->h()V

    :cond_0
    return-void
.end method
