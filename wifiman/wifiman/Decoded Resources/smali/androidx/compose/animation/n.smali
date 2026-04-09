.class final Landroidx/compose/animation/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/v;


# instance fields
.field private final a:Z

.field private final b:Lmh/p;


# direct methods
.method public constructor <init>(ZLmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/animation/n;->a:Z

    iput-object p2, p0, Landroidx/compose/animation/n;->b:Lmh/p;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/animation/n;->a:Z

    return v0
.end method

.method public b(JJ)Lr/H;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/n;->b:Lmh/p;

    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    invoke-static {p3, p4}, LY0/r;->b(J)LY0/r;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/H;

    return-object p1
.end method
