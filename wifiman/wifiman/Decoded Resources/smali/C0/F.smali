.class final LC0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC0/F$a;,
        LC0/F$b;,
        LC0/F$c;,
        LC0/F$d;
    }
.end annotation


# static fields
.field public static final a:LC0/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC0/F;

    invoke-direct {v0}, LC0/F;-><init>()V

    sput-object v0, LC0/F;->a:LC0/F;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LC0/x;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LC0/F$a;

    sget-object v1, LC0/F$c;->Max:LC0/F$c;

    sget-object v2, LC0/F$d;->Height:LC0/F$d;

    invoke-direct {v0, p3, v1, v2}, LC0/F$a;-><init>(LC0/n;LC0/F$c;LC0/F$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LC0/x;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public final b(LC0/x;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LC0/F$a;

    sget-object v1, LC0/F$c;->Max:LC0/F$c;

    sget-object v2, LC0/F$d;->Width:LC0/F$d;

    invoke-direct {v0, p3, v1, v2}, LC0/F$a;-><init>(LC0/n;LC0/F$c;LC0/F$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LC0/x;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method

.method public final c(LC0/x;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LC0/F$a;

    sget-object v1, LC0/F$c;->Min:LC0/F$c;

    sget-object v2, LC0/F$d;->Height:LC0/F$d;

    invoke-direct {v0, p3, v1, v2}, LC0/F$a;-><init>(LC0/n;LC0/F$c;LC0/F$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LC0/x;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result p1

    return p1
.end method

.method public final d(LC0/x;LC0/o;LC0/n;I)I
    .locals 9

    new-instance v0, LC0/F$a;

    sget-object v1, LC0/F$c;->Min:LC0/F$c;

    sget-object v2, LC0/F$d;->Width:LC0/F$d;

    invoke-direct {v0, p3, v1, v2}, LC0/F$a;-><init>(LC0/n;LC0/F$c;LC0/F$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LC0/x;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result p1

    return p1
.end method
