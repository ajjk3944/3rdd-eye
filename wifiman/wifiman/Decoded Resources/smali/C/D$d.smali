.class final LC/D$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/D;->k(IFLmh/a;LT/l;II)LC/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:F

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(IFLmh/a;)V
    .locals 0

    iput p1, p0, LC/D$d;->a:I

    iput p2, p0, LC/D$d;->b:F

    iput-object p3, p0, LC/D$d;->c:Lmh/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LC/b;
    .locals 4

    new-instance v0, LC/b;

    iget v1, p0, LC/D$d;->a:I

    iget v2, p0, LC/D$d;->b:F

    iget-object v3, p0, LC/D$d;->c:Lmh/a;

    invoke-direct {v0, v1, v2, v3}, LC/b;-><init>(IFLmh/a;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/D$d;->a()LC/b;

    move-result-object v0

    return-object v0
.end method
