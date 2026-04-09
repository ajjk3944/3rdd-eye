.class public final Ls/x;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/h;
.implements Lk0/h;


# instance fields
.field private final n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    return-void
.end method

.method private final D2()Lv0/b;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->l()LT/H0;

    move-result-object v0

    invoke-static {p0, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/b;

    return-object v0
.end method


# virtual methods
.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Ls/x;->n:Z

    return v0
.end method

.method public o0(Landroidx/compose/ui/focus/k;)V
    .locals 2

    invoke-direct {p0}, Ls/x;->D2()Lv0/b;

    move-result-object v0

    invoke-interface {v0}, Lv0/b;->a()I

    move-result v0

    sget-object v1, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {v1}, Lv0/a$a;->b()I

    move-result v1

    invoke-static {v0, v1}, Lv0/a;->f(II)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/k;->w(Z)V

    return-void
.end method
