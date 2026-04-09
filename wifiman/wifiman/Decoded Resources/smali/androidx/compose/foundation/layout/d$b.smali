.class final Landroidx/compose/foundation/layout/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/layout/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/foundation/layout/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/d$b;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/d$b;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/d$b;->a:Landroidx/compose/foundation/layout/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 7

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v2

    sget-object v4, Landroidx/compose/foundation/layout/d$b$a;->a:Landroidx/compose/foundation/layout/d$b$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
