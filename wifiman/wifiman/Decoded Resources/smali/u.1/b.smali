.class public abstract Lu/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LD0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lu/b$a;->a:Lu/b$a;

    invoke-static {v0}, LD0/e;->a(Lmh/a;)LD0/l;

    move-result-object v0

    sput-object v0, Lu/b;->a:LD0/l;

    return-void
.end method

.method public static final a(LD0/h;)Lu/a;
    .locals 1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lu/b;->a:LD0/l;

    invoke-interface {p0, v0}, LD0/h;->z(LD0/c;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
