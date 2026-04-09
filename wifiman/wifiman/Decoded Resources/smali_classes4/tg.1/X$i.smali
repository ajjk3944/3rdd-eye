.class final Ltg/X$i;
.super Ltg/X$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# instance fields
.field final d:I


# direct methods
.method constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0, p2}, Ltg/X$a;-><init>(Z)V

    iput p1, p0, Ltg/X$i;->d:I

    return-void
.end method


# virtual methods
.method n()V
    .locals 2

    iget v0, p0, Ltg/X$a;->b:I

    iget v1, p0, Ltg/X$i;->d:I

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Ltg/X$a;->h()V

    :cond_0
    return-void
.end method
