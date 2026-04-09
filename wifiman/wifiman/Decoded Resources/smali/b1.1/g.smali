.class final Lb1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/d;


# instance fields
.field private final a:Landroidx/constraintlayout/core/parser/d;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/core/parser/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/g;->a:Landroidx/constraintlayout/core/parser/d;

    return-void
.end method


# virtual methods
.method public b(Lb1/i$a;FF)V
    .locals 2

    new-instance v0, Lf1/a;

    const/4 v1, 0x0

    new-array v1, v1, [C

    invoke-direct {v0, v1}, Lf1/a;-><init>([C)V

    invoke-virtual {p1}, Lb1/i$a;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lf1/c;->x(Ljava/lang/String;)Lf1/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    const-string p1, "baseline"

    invoke-static {p1}, Lf1/c;->x(Ljava/lang/String;)Lf1/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    new-instance v1, Lf1/b;

    invoke-direct {v1, p2}, Lf1/b;-><init>(F)V

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    new-instance p2, Lf1/b;

    invoke-direct {p2, p3}, Lf1/b;-><init>(F)V

    invoke-virtual {v0, p2}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    iget-object p2, p0, Lb1/g;->a:Landroidx/constraintlayout/core/parser/d;

    invoke-virtual {p2, p1, v0}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    return-void
.end method
