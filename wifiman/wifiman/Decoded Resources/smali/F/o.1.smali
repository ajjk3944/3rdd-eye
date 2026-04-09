.class final LF/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# static fields
.field public static final a:LF/o;

.field private static final b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/o;

    invoke-direct {v0}, LF/o;-><init>()V

    sput-object v0, LF/o;->a:LF/o;

    sget-object v0, LF/o$a;->a:LF/o$a;

    sput-object v0, LF/o;->b:Lmh/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 7

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v2

    sget-object v4, LF/o;->b:Lmh/l;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
