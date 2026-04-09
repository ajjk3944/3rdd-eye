.class public abstract Lze/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lze/b;

    invoke-direct {v0}, Lze/b;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Lze/c;->a:LT/H0;

    return-void
.end method

.method public static synthetic a()Lorg/kodein/di/DI;
    .locals 1

    invoke-static {}, Lze/c;->b()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Lorg/kodein/di/DI;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No DI set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c()LT/H0;
    .locals 1

    sget-object v0, Lze/c;->a:LT/H0;

    return-object v0
.end method
