.class public abstract LP/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:LP/g;

.field private static final c:LP/g;

.field private static final d:LP/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, LP/s$a;->a:LP/s$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LP/s;->a:LT/H0;

    new-instance v0, LP/g;

    const v1, 0x3e23d70a    # 0.16f

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3da3d70a    # 0.08f

    invoke-direct {v0, v1, v2, v3, v2}, LP/g;-><init>(FFFF)V

    sput-object v0, LP/s;->b:LP/g;

    new-instance v0, LP/g;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3d23d70a    # 0.04f

    invoke-direct {v0, v3, v1, v2, v1}, LP/g;-><init>(FFFF)V

    sput-object v0, LP/s;->c:LP/g;

    new-instance v0, LP/g;

    const v4, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v3, v1, v2, v4}, LP/g;-><init>(FFFF)V

    sput-object v0, LP/s;->d:LP/g;

    return-void
.end method

.method public static final synthetic a()LP/g;
    .locals 1

    sget-object v0, LP/s;->d:LP/g;

    return-object v0
.end method

.method public static final synthetic b()LP/g;
    .locals 1

    sget-object v0, LP/s;->b:LP/g;

    return-object v0
.end method

.method public static final synthetic c()LP/g;
    .locals 1

    sget-object v0, LP/s;->c:LP/g;

    return-object v0
.end method

.method public static final d()LT/H0;
    .locals 1

    sget-object v0, LP/s;->a:LT/H0;

    return-object v0
.end method
