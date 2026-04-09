.class public abstract LV6/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:LT/H0;

.field private static final c:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV6/s;

    invoke-direct {v0}, LV6/s;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LV6/v;->a:LT/H0;

    new-instance v0, LV6/t;

    invoke-direct {v0}, LV6/t;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LV6/v;->b:LT/H0;

    new-instance v0, LV6/u;

    invoke-direct {v0}, LV6/u;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LV6/v;->c:LT/H0;

    return-void
.end method

.method public static synthetic a()Lcom/bumptech/glide/j;
    .locals 1

    invoke-static {}, LV6/v;->e()Lcom/bumptech/glide/j;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Lcom/bumptech/glide/i;
    .locals 1

    invoke-static {}, LV6/v;->d()Lcom/bumptech/glide/i;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lcom/bumptech/glide/request/f;
    .locals 1

    invoke-static {}, LV6/v;->f()Lcom/bumptech/glide/request/f;

    move-result-object v0

    return-object v0
.end method

.method private static final d()Lcom/bumptech/glide/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private static final e()Lcom/bumptech/glide/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private static final f()Lcom/bumptech/glide/request/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final g()LT/H0;
    .locals 1

    sget-object v0, LV6/v;->b:LT/H0;

    return-object v0
.end method

.method public static final h()LT/H0;
    .locals 1

    sget-object v0, LV6/v;->c:LT/H0;

    return-object v0
.end method

.method public static final i()LT/H0;
    .locals 1

    sget-object v0, LV6/v;->a:LT/H0;

    return-object v0
.end method
