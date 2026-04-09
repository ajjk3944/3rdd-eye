.class public abstract Lw/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:Lw/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw/e$a;->a:Lw/e$a;

    invoke-static {v0}, LT/w;->e(Lmh/l;)LT/H0;

    move-result-object v0

    sput-object v0, Lw/e;->a:LT/H0;

    new-instance v0, Lw/e$b;

    invoke-direct {v0}, Lw/e$b;-><init>()V

    sput-object v0, Lw/e;->b:Lw/d;

    return-void
.end method

.method public static final a()LT/H0;
    .locals 1

    sget-object v0, Lw/e;->a:LT/H0;

    return-object v0
.end method

.method public static final b()Lw/d;
    .locals 1

    sget-object v0, Lw/e;->b:Lw/d;

    return-object v0
.end method
