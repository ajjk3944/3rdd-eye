.class final Landroidx/compose/ui/platform/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/x$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/x$c;

    invoke-direct {v0}, Landroidx/compose/ui/platform/x$c;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/x$c;->a:Landroidx/compose/ui/platform/x$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LG1/t;LJ0/n;)V
    .locals 4

    invoke-static {p1}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->q()LJ0/v;

    move-result-object v2

    invoke-static {v0, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_0

    new-instance v2, LG1/t$a;

    const v3, 0x1020046

    invoke-virtual {v0}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, LG1/t;->b(LG1/t$a;)V

    :cond_0
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v1}, LJ0/i;->n()LJ0/v;

    move-result-object v2

    invoke-static {v0, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_1

    new-instance v2, LG1/t$a;

    const v3, 0x1020047

    invoke-virtual {v0}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, LG1/t;->b(LG1/t$a;)V

    :cond_1
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v1}, LJ0/i;->o()LJ0/v;

    move-result-object v2

    invoke-static {v0, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_2

    new-instance v2, LG1/t$a;

    const v3, 0x1020048

    invoke-virtual {v0}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, LG1/t;->b(LG1/t$a;)V

    :cond_2
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/i;->p()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJ0/a;

    if-eqz p1, :cond_3

    new-instance v0, LG1/t$a;

    const v1, 0x1020049

    invoke-virtual {p1}, LJ0/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, LG1/t;->b(LG1/t$a;)V

    :cond_3
    return-void
.end method
