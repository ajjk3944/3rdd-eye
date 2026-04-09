.class final Landroidx/compose/ui/platform/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/x$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/x$b;

    invoke-direct {v0}, Landroidx/compose/ui/platform/x$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/x$b;->a:Landroidx/compose/ui/platform/x$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LG1/t;LJ0/n;)V
    .locals 2

    invoke-static {p1}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    sget-object v0, LJ0/i;->a:LJ0/i;

    invoke-virtual {v0}, LJ0/i;->w()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJ0/a;

    if-eqz p1, :cond_0

    new-instance v0, LG1/t$a;

    const v1, 0x102003d

    invoke-virtual {p1}, LJ0/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, LG1/t;->b(LG1/t$a;)V

    :cond_0
    return-void
.end method
