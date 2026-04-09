.class final Landroidx/compose/animation/g$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;->e(Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LT/l;I)Lq/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/animation/g$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/g$h;

    invoke-direct {v0}, Landroidx/compose/animation/g$h;-><init>()V

    sput-object v0, Landroidx/compose/animation/g$h;->a:Landroidx/compose/animation/g$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/o0$b;)Lr/H;
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p1, v0, p1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/o0$b;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$h;->a(Lr/o0$b;)Lr/H;

    move-result-object p1

    return-object p1
.end method
