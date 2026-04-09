.class public final Ls/C;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A0;
.implements LE0/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/C$a;
    }
.end annotation


# static fields
.field public static final q:Ls/C$a;

.field public static final r:I


# instance fields
.field private n:Z

.field private final o:Z

.field private p:LC0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls/C$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls/C;->q:Ls/C$a;

    const/16 v0, 0x8

    sput v0, Ls/C;->r:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    return-void
.end method

.method private final D2()Ls/D;
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ls/D;->p:Ls/D$a;

    invoke-static {p0, v0}, LE0/B0;->a(LE0/j;Ljava/lang/Object;)LE0/A0;

    move-result-object v0

    instance-of v2, v0, Ls/D;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Ls/D;

    :cond_0
    return-object v1
.end method

.method private final E2()V
    .locals 2

    iget-object v0, p0, Ls/C;->p:LC0/r;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ls/C;->D2()Ls/D;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ls/C;->p:LC0/r;

    invoke-virtual {v0, v1}, Ls/D;->D2(LC0/r;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    iput-object p1, p0, Ls/C;->p:LC0/r;

    iget-boolean v0, p0, Ls/C;->n:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LC0/r;->M()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ls/C;->E2()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Ls/C;->D2()Ls/D;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls/D;->D2(LC0/r;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final F2(Z)V
    .locals 2

    iget-boolean v0, p0, Ls/C;->n:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    invoke-direct {p0}, Ls/C;->D2()Ls/D;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls/D;->D2(LC0/r;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Ls/C;->E2()V

    :cond_2
    :goto_0
    iput-boolean p1, p0, Ls/C;->n:Z

    return-void
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ls/C;->q:Ls/C$a;

    return-object v0
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Ls/C;->o:Z

    return v0
.end method
