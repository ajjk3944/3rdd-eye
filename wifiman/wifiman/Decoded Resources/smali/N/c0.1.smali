.class public abstract LN/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:LT/H0;

.field private static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LN/c0$a;->a:LN/c0$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LN/c0;->a:LT/H0;

    sput-object v0, LN/c0;->b:LT/H0;

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v1, v0}, LY0/i;->b(FF)J

    move-result-wide v0

    sput-wide v0, LN/c0;->c:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, LN/c0;->c:J

    return-wide v0
.end method

.method public static final b()LT/H0;
    .locals 1

    sget-object v0, LN/c0;->a:LT/H0;

    return-object v0
.end method

.method public static final c()LT/H0;
    .locals 1

    sget-object v0, LN/c0;->b:LT/H0;

    return-object v0
.end method

.method public static final d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 1

    sget-object v0, Landroidx/compose/material/MinimumInteractiveModifier;->a:Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
