.class public abstract Lz/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LD0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lz/i0$a;->a:Lz/i0$a;

    invoke-static {v0}, LD0/e;->a(Lmh/a;)LD0/l;

    move-result-object v0

    sput-object v0, Lz/i0;->a:LD0/l;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lz/i0$b;

    invoke-direct {v0, p1}, Lz/i0$b;-><init>(Lz/N;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/z0;->a()Lmh/l;

    move-result-object v0

    :goto_0
    new-instance v1, Lz/i0$c;

    invoke-direct {v1, p1}, Lz/i0$c;-><init>(Lz/N;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lmh/l;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b()LD0/l;
    .locals 1

    sget-object v0, Lz/i0;->a:LD0/l;

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lz/i0$d;

    invoke-direct {v0, p1}, Lz/i0$d;-><init>(Lmh/l;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/z0;->a()Lmh/l;

    move-result-object v0

    :goto_0
    new-instance v1, Lz/i0$e;

    invoke-direct {v1, p1}, Lz/i0$e;-><init>(Lmh/l;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lmh/l;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
