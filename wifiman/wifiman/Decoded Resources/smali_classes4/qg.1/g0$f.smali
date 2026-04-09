.class final Lqg/g0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation


# instance fields
.field final a:I

.field final b:Z


# direct methods
.method constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lqg/g0$f;->a:I

    iput-boolean p2, p0, Lqg/g0$f;->b:Z

    return-void
.end method


# virtual methods
.method public a()Lqg/g0$e;
    .locals 3

    new-instance v0, Lqg/g0$i;

    iget v1, p0, Lqg/g0$f;->a:I

    iget-boolean v2, p0, Lqg/g0$f;->b:Z

    invoke-direct {v0, v1, v2}, Lqg/g0$i;-><init>(IZ)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqg/g0$f;->a()Lqg/g0$e;

    move-result-object v0

    return-object v0
.end method
