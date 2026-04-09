.class public abstract Lb1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/v;


# instance fields
.field private final a:Landroidx/constraintlayout/core/parser/d;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/core/parser/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/b;->a:Landroidx/constraintlayout/core/parser/d;

    sget-object p1, Lb1/a;->a:Lb1/a;

    invoke-virtual {p1, p2}, Lb1/a;->a(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lb1/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Lb1/i$b;FF)V
    .locals 3

    sget-object v0, Lb1/a;->a:Lb1/a;

    invoke-virtual {p1}, Lb1/i$b;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lb1/a;->a(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lf1/a;

    const/4 v2, 0x0

    new-array v2, v2, [C

    invoke-direct {v1, v2}, Lf1/a;-><init>([C)V

    invoke-virtual {p1}, Lb1/i$b;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lf1/c;->x(Ljava/lang/String;)Lf1/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    invoke-static {v0}, Lf1/c;->x(Ljava/lang/String;)Lf1/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    new-instance p1, Lf1/b;

    invoke-direct {p1, p2}, Lf1/b;-><init>(F)V

    invoke-virtual {v1, p1}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    new-instance p1, Lf1/b;

    invoke-direct {p1, p3}, Lf1/b;-><init>(F)V

    invoke-virtual {v1, p1}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    iget-object p1, p0, Lb1/b;->a:Landroidx/constraintlayout/core/parser/d;

    iget-object p2, p0, Lb1/b;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, v1}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    return-void
.end method
