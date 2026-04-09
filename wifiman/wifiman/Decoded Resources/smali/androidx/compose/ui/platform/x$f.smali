.class final Landroidx/compose/ui/platform/x$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/x$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/x$f;

    invoke-direct {v0}, Landroidx/compose/ui/platform/x$f;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/x$f;->a:Landroidx/compose/ui/platform/x$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LJ0/n;LJ0/n;)I
    .locals 2

    invoke-virtual {p1}, LJ0/n;->j()Ll0/i;

    move-result-object p1

    invoke-virtual {p2}, LJ0/n;->j()Ll0/i;

    move-result-object p2

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v0

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Ll0/i;->e()F

    move-result v0

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Ll0/i;->l()F

    move-result p1

    invoke-virtual {p2}, Ll0/i;->l()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LJ0/n;

    check-cast p2, LJ0/n;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/x$f;->a(LJ0/n;LJ0/n;)I

    move-result p1

    return p1
.end method
