.class public abstract Lye/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lye/h;

    invoke-direct {v0}, Lye/h;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Lye/j;->a:LT/H0;

    return-void
.end method

.method public static synthetic a()Landroidx/lifecycle/a;
    .locals 1

    invoke-static {}, Lye/j;->b()Landroidx/lifecycle/a;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Landroidx/lifecycle/a;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No vm provider set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c()LT/H0;
    .locals 1

    sget-object v0, Lye/j;->a:LT/H0;

    return-object v0
.end method
