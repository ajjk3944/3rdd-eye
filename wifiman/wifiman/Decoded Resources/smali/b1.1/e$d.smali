.class public final Lb1/e$d;
.super Lph/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/e;-><init>(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lb1/e;


# direct methods
.method constructor <init>(Lb1/e;Lb1/E;)V
    .locals 0

    iput-object p1, p0, Lb1/e$d;->b:Lb1/e;

    invoke-direct {p0, p2}, Lph/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lth/l;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lb1/E;

    check-cast p3, Lb1/E;

    invoke-virtual {p0, p1, p2, p3}, Lb1/e$d;->e(Lth/l;Lb1/E;Lb1/E;)V

    return-void
.end method

.method protected e(Lth/l;Lb1/E;Lb1/E;)V
    .locals 0

    iget-object p2, p0, Lb1/e$d;->b:Lb1/e;

    invoke-virtual {p2}, Lb1/e;->e()Landroidx/constraintlayout/core/parser/d;

    move-result-object p2

    invoke-interface {p1}, Lth/c;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lb1/E;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Landroidx/constraintlayout/core/parser/a;->e0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
