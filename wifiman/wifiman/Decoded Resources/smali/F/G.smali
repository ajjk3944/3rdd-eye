.class final LF/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# instance fields
.field private final a:Lmh/a;


# direct methods
.method public constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/G;->a:Lmh/a;

    return-void
.end method

.method public static final synthetic a(LF/G;)Lmh/a;
    .locals 0

    iget-object p0, p0, LF/G;->a:Lmh/a;

    return-object p0
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 7

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v2

    new-instance v4, LF/G$a;

    invoke-direct {v4, p2, p0}, LF/G$a;-><init>(Ljava/util/List;LF/G;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
