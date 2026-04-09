.class public final LE0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/g0$a;,
        LE0/g0$b;,
        LE0/g0$c;,
        LE0/g0$d;,
        LE0/g0$e;,
        LE0/g0$f;
    }
.end annotation


# static fields
.field public static final a:LE0/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/g0;

    invoke-direct {v0}, LE0/g0;-><init>()V

    sput-object v0, LE0/g0;->a:LE0/g0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LE0/g0$a;LC0/c;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Max:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Height:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/a;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/a;-><init>(LC0/c;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$a;->a(LC0/d;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public final b(LE0/g0$f;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Max:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Height:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$f;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public final c(LE0/g0$a;LC0/c;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Max:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Width:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/a;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/a;-><init>(LC0/c;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$a;->a(LC0/d;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public final d(LE0/g0$f;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Max:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Width:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$f;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public final e(LE0/g0$a;LC0/c;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Min:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Height:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/a;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/a;-><init>(LC0/c;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$a;->a(LC0/d;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public final f(LE0/g0$f;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Min:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Height:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$f;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public final g(LE0/g0$a;LC0/c;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Min:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Width:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/a;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/a;-><init>(LC0/c;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$a;->a(LC0/d;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public final h(LE0/g0$f;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LE0/g0$b;

    sget-object v1, LE0/g0$d;->Min:LE0/g0$d;

    sget-object v2, LE0/g0$e;->Width:LE0/g0$e;

    invoke-direct {v0, p3, v1, v2}, LE0/g0$b;-><init>(LC0/n;LE0/g0$d;LE0/g0$e;)V

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, Landroidx/compose/ui/layout/e;

    invoke-interface {p2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/e;-><init>(LC0/o;LY0/t;)V

    invoke-interface {p1, v1, v0, p3, p4}, LE0/g0$f;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method
