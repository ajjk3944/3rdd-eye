.class public abstract LS6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LYg/q;->NONE:LYg/q;

    new-instance v1, LS6/d;

    invoke-direct {v1}, LS6/d;-><init>()V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, LS6/e;->a:LYg/m;

    return-void
.end method

.method public static synthetic a()Landroid/os/Handler;
    .locals 1

    invoke-static {}, LS6/e;->b()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Landroid/os/Handler;
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method public static final synthetic c(Landroid/graphics/drawable/Drawable;)J
    .locals 2

    invoke-static {p0}, LS6/e;->e(Landroid/graphics/drawable/Drawable;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic d()Landroid/os/Handler;
    .locals 1

    invoke-static {}, LS6/e;->f()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private static final e(Landroid/graphics/drawable/Drawable;)J
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p0

    int-to-float p0, p0

    invoke-static {v0, p0}, Ll0/n;->a(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object p0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {p0}, Ll0/m$a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private static final f()Landroid/os/Handler;
    .locals 1

    sget-object v0, LS6/e;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method
