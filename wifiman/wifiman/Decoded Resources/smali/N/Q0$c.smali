.class public final LN/Q0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/Q0;->f(Landroidx/compose/ui/e;LN/R0;Ljava/util/Map;Lw/q;ZZLy/m;Lmh/p;LN/x0;F)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/R0;

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Lw/q;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic f:Ly/m;

.field final synthetic g:Lmh/p;

.field final synthetic h:LN/x0;

.field final synthetic i:F


# direct methods
.method public constructor <init>(LN/R0;Ljava/util/Map;Lw/q;ZZLy/m;Lmh/p;LN/x0;F)V
    .locals 0

    iput-object p1, p0, LN/Q0$c;->a:LN/R0;

    iput-object p2, p0, LN/Q0$c;->b:Ljava/util/Map;

    iput-object p3, p0, LN/Q0$c;->c:Lw/q;

    iput-boolean p4, p0, LN/Q0$c;->d:Z

    iput-boolean p5, p0, LN/Q0$c;->e:Z

    iput-object p6, p0, LN/Q0$c;->f:Ly/m;

    iput-object p7, p0, LN/Q0$c;->g:Lmh/p;

    iput-object p8, p0, LN/Q0$c;->h:LN/x0;

    iput p9, p0, LN/Q0$c;->i:F

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

    invoke-virtual {p0, p1}, LN/Q0$c;->a(Landroidx/compose/ui/platform/B0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
