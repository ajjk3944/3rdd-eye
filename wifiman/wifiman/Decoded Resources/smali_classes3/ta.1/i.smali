.class public abstract Lta/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lta/h;

    invoke-direct {v0}, Lta/h;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Lta/i;->a:LT/H0;

    return-void
.end method

.method public static synthetic a()Lta/d;
    .locals 1

    invoke-static {}, Lta/i;->b()Lta/d;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Lta/d;
    .locals 1

    new-instance v0, Lta/g;

    invoke-direct {v0}, Lta/g;-><init>()V

    return-object v0
.end method

.method public static final c()LT/H0;
    .locals 1

    sget-object v0, Lta/i;->a:LT/H0;

    return-object v0
.end method
