.class abstract synthetic LT/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/u1;

.field private static final b:LT/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/u1;

    invoke-direct {v0}, LT/u1;-><init>()V

    sput-object v0, LT/p1;->a:LT/u1;

    new-instance v0, LT/u1;

    invoke-direct {v0}, LT/u1;-><init>()V

    sput-object v0, LT/p1;->b:LT/u1;

    return-void
.end method

.method public static final synthetic a()LT/u1;
    .locals 1

    sget-object v0, LT/p1;->a:LT/u1;

    return-object v0
.end method

.method public static final b()LV/b;
    .locals 4

    sget-object v0, LT/p1;->b:LT/u1;

    invoke-virtual {v0}, LT/u1;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/b;

    if-nez v1, :cond_0

    new-instance v1, LV/b;

    const/4 v2, 0x0

    new-array v3, v2, [LT/I;

    invoke-direct {v1, v3, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, LT/u1;->b(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static final c(LT/n1;Lmh/a;)LT/z1;
    .locals 1

    new-instance v0, LT/G;

    invoke-direct {v0, p1, p0}, LT/G;-><init>(Lmh/a;LT/n1;)V

    return-object v0
.end method

.method public static final d(Lmh/a;)LT/z1;
    .locals 2

    new-instance v0, LT/G;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LT/G;-><init>(Lmh/a;LT/n1;)V

    return-object v0
.end method
