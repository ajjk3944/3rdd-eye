.class public abstract Landroidx/compose/ui/layout/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/l;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Landroidx/compose/ui/layout/u$a;->a:Landroidx/compose/ui/layout/u$a;

    sput-object v0, Landroidx/compose/ui/layout/u;->a:Lmh/l;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/ui/layout/u;->b:J

    return-void
.end method

.method public static final a(LE0/P;)Landroidx/compose/ui/layout/t$a;
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/i;

    invoke-direct {v0, p0}, Landroidx/compose/ui/layout/i;-><init>(LE0/P;)V

    return-object v0
.end method

.method public static final b(LE0/m0;)Landroidx/compose/ui/layout/t$a;
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/s;

    invoke-direct {v0, p0}, Landroidx/compose/ui/layout/s;-><init>(LE0/m0;)V

    return-object v0
.end method

.method public static final synthetic c()J
    .locals 2

    sget-wide v0, Landroidx/compose/ui/layout/u;->b:J

    return-wide v0
.end method

.method public static final synthetic d()Lmh/l;
    .locals 1

    sget-object v0, Landroidx/compose/ui/layout/u;->a:Lmh/l;

    return-object v0
.end method
