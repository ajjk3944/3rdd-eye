.class final Landroidx/compose/animation/a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->b(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/animation/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/a$d;

    invoke-direct {v0}, Landroidx/compose/animation/a$d;-><init>()V

    sput-object v0, Landroidx/compose/animation/a$d;->a:Landroidx/compose/animation/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/animation/d;)Lq/i;
    .locals 12

    const/16 p1, 0xdc

    const/16 v0, 0x5a

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v2, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v1}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v3

    invoke-static {p1, v0, v1, v2, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const v7, 0x3f6b851f    # 0.92f

    const-wide/16 v8, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/g;->s(Lr/H;FJILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v2, v1, v3, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v0

    invoke-static {v0, v4, v5, v1}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->e(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)Lq/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/animation/d;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/a$d;->a(Landroidx/compose/animation/d;)Lq/i;

    move-result-object p1

    return-object p1
.end method
