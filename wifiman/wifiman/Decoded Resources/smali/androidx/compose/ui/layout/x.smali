.class public final Landroidx/compose/ui/layout/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/layout/x$a;
    }
.end annotation


# static fields
.field public static final f:I = 0x8


# instance fields
.field private final a:Landroidx/compose/ui/layout/y;

.field private b:Landroidx/compose/ui/layout/h;

.field private final c:Lmh/p;

.field private final d:Lmh/p;

.field private final e:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    sget-object v0, Landroidx/compose/ui/layout/n;->a:Landroidx/compose/ui/layout/n;

    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/x;-><init>(Landroidx/compose/ui/layout/y;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/layout/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/ui/layout/x;->a:Landroidx/compose/ui/layout/y;

    .line 3
    new-instance p1, Landroidx/compose/ui/layout/x$d;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/x$d;-><init>(Landroidx/compose/ui/layout/x;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/x;->c:Lmh/p;

    .line 4
    new-instance p1, Landroidx/compose/ui/layout/x$b;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/x$b;-><init>(Landroidx/compose/ui/layout/x;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/x;->d:Lmh/p;

    .line 5
    new-instance p1, Landroidx/compose/ui/layout/x$c;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/x$c;-><init>(Landroidx/compose/ui/layout/x;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/x;->e:Lmh/p;

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/y;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/layout/x;->a:Landroidx/compose/ui/layout/y;

    return-object p0
.end method

.method public static final synthetic b(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/h;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/layout/x;->h()Landroidx/compose/ui/layout/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/layout/x;Landroidx/compose/ui/layout/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/x;->b:Landroidx/compose/ui/layout/h;

    return-void
.end method

.method private final h()Landroidx/compose/ui/layout/h;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/x;->b:Landroidx/compose/ui/layout/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final d()V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/layout/x;->h()Landroidx/compose/ui/layout/h;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h;->z()V

    return-void
.end method

.method public final e()Lmh/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/x;->d:Lmh/p;

    return-object v0
.end method

.method public final f()Lmh/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/x;->e:Lmh/p;

    return-object v0
.end method

.method public final g()Lmh/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/x;->c:Lmh/p;

    return-object v0
.end method

.method public final i(Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/layout/x$a;
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/layout/x;->h()Landroidx/compose/ui/layout/h;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/layout/h;->G(Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/layout/x$a;

    move-result-object p1

    return-object p1
.end method
