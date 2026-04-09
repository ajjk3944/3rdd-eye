.class public final Landroidx/compose/foundation/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/b;->a(Landroidx/compose/ui/e;Lm0/l0;Lm0/i1;F)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lm0/l0;

.field final synthetic c:Lm0/i1;


# direct methods
.method public constructor <init>(FLm0/l0;Lm0/i1;)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/b$a;->a:F

    iput-object p2, p0, Landroidx/compose/foundation/b$a;->b:Lm0/l0;

    iput-object p3, p0, Landroidx/compose/foundation/b$a;->c:Lm0/i1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/B0;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/b$a;->a(Landroidx/compose/ui/platform/B0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
