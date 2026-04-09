.class final Ltg/X$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltg/X$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/X;
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

    iput p1, p0, Ltg/X$f;->a:I

    iput-boolean p2, p0, Ltg/X$f;->b:Z

    return-void
.end method


# virtual methods
.method public call()Ltg/X$e;
    .locals 3

    new-instance v0, Ltg/X$i;

    iget v1, p0, Ltg/X$f;->a:I

    iget-boolean v2, p0, Ltg/X$f;->b:Z

    invoke-direct {v0, v1, v2}, Ltg/X$i;-><init>(IZ)V

    return-object v0
.end method
