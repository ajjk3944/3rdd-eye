.class final LT/G$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/G;->t(LT/G$a;Landroidx/compose/runtime/snapshots/g;ZLmh/a;)LT/G$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/G;

.field final synthetic b:Lb0/d;

.field final synthetic c:Lo/E;

.field final synthetic d:I


# direct methods
.method constructor <init>(LT/G;Lb0/d;Lo/E;I)V
    .locals 0

    iput-object p1, p0, LT/G$b;->a:LT/G;

    iput-object p2, p0, LT/G$b;->b:Lb0/d;

    iput-object p3, p0, LT/G$b;->c:Lo/E;

    iput p4, p0, LT/G$b;->d:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LT/G$b;->a:LT/G;

    if-eq p1, v0, :cond_1

    instance-of v0, p1, Ld0/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/G$b;->b:Lb0/d;

    invoke-virtual {v0}, Lb0/d;->a()I

    move-result v0

    iget-object v1, p0, LT/G$b;->c:Lo/E;

    iget v2, p0, LT/G$b;->d:I

    sub-int/2addr v0, v2

    const v2, 0x7fffffff

    invoke-virtual {v1, p1, v2}, Lo/K;->d(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, p1, v0}, Lo/E;->r(Ljava/lang/Object;I)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A derived state calculation cannot read itself"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LT/G$b;->a(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
