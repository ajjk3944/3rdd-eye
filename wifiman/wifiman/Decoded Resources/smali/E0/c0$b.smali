.class public final LE0/c0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/c0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LE0/G;JLE0/u;ZZ)V
    .locals 0

    invoke-virtual/range {p1 .. p6}, LE0/G;->z0(JLE0/u;ZZ)V

    return-void
.end method

.method public b()I
    .locals 1

    const/16 v0, 0x8

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    return v0
.end method

.method public c(LE0/G;)Z
    .locals 2

    invoke-virtual {p1}, LE0/G;->I()LJ0/j;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJ0/j;->s()Z

    move-result p1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    xor-int/lit8 p1, v0, 0x1

    return p1
.end method

.method public d(Landroidx/compose/ui/e$c;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
