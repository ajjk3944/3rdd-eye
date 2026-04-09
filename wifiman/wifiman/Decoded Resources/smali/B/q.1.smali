.class public abstract LB/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Landroidx/compose/foundation/lazy/layout/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Landroidx/compose/foundation/lazy/layout/b;

    sput-object v0, LB/q;->a:[Landroidx/compose/foundation/lazy/layout/b;

    return-void
.end method

.method public static final synthetic a()[Landroidx/compose/foundation/lazy/layout/b;
    .locals 1

    sget-object v0, LB/q;->a:[Landroidx/compose/foundation/lazy/layout/b;

    return-object v0
.end method

.method public static final synthetic b(Ljava/lang/Object;)LB/i;
    .locals 0

    invoke-static {p0}, LB/q;->c(Ljava/lang/Object;)LB/i;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Object;)LB/i;
    .locals 1

    instance-of v0, p0, LB/i;

    if-eqz v0, :cond_0

    check-cast p0, LB/i;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
