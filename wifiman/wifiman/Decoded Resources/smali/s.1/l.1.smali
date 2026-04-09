.class public abstract Ls/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:Landroidx/compose/ui/e;

.field private static final c:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1e

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Ls/l;->a:F

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v1, Ls/l$a;

    invoke-direct {v1}, Ls/l$a;-><init>()V

    invoke-static {v0, v1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    sput-object v1, Ls/l;->b:Landroidx/compose/ui/e;

    new-instance v1, Ls/l$b;

    invoke-direct {v1}, Ls/l$b;-><init>()V

    invoke-static {v0, v1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    sput-object v0, Ls/l;->c:Landroidx/compose/ui/e;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;Lw/q;)Landroidx/compose/ui/e;
    .locals 1

    sget-object v0, Lw/q;->Vertical:Lw/q;

    if-ne p1, v0, :cond_0

    sget-object p1, Ls/l;->c:Landroidx/compose/ui/e;

    goto :goto_0

    :cond_0
    sget-object p1, Ls/l;->b:Landroidx/compose/ui/e;

    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b()F
    .locals 1

    sget v0, Ls/l;->a:F

    return v0
.end method
