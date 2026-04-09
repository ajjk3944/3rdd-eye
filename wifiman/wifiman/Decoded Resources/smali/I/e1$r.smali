.class public final LI/e1$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;-><init>(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$r;->a:LI/e1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()Lk0/e;
    .locals 2

    iget-object v0, p0, LI/e1$r;->a:LI/e1;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->h()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/e;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 2

    sget-object v0, LR0/r;->b:LR0/r$a;

    invoke-virtual {v0}, LR0/r$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LI/e1$r;->b()Lk0/e;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->e()I

    move-result v0

    invoke-interface {p1, v0}, Lk0/e;->k(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LR0/r$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, LI/e1$r;->b()Lk0/e;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->f()I

    move-result v0

    invoke-interface {p1, v0}, Lk0/e;->k(I)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LR0/r$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LR0/r;->m(II)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LI/e1$r;->a:LI/e1;

    invoke-static {p1}, LI/e1;->R2(LI/e1;)Landroidx/compose/ui/platform/n1;

    move-result-object p1

    invoke-interface {p1}, Landroidx/compose/ui/platform/n1;->c()V

    :cond_2
    :goto_0
    return-void
.end method
