.class final Lb1/e$a;
.super Lph/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lb1/e;


# direct methods
.method public constructor <init>(Lb1/e;Lb1/s;)V
    .locals 0

    iput-object p1, p0, Lb1/e$a;->b:Lb1/e;

    invoke-direct {p0, p2}, Lph/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lth/l;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lb1/s;

    check-cast p3, Lb1/s;

    invoke-virtual {p0, p1, p2, p3}, Lb1/e$a;->e(Lth/l;Lb1/s;Lb1/s;)V

    return-void
.end method

.method protected e(Lth/l;Lb1/s;Lb1/s;)V
    .locals 1

    iget-object p2, p0, Lb1/e$a;->b:Lb1/e;

    invoke-virtual {p2}, Lb1/e;->e()Landroidx/constraintlayout/core/parser/d;

    move-result-object p2

    invoke-interface {p1}, Lth/c;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lb1/t;

    invoke-virtual {p3}, Lb1/t;->a()Landroidx/constraintlayout/core/parser/b;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    return-void
.end method
