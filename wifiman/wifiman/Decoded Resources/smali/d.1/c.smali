.class public abstract Ld/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ld/c$a;->a:Ld/c$a;

    invoke-static {v0}, LT/w;->e(Lmh/l;)LT/H0;

    move-result-object v0

    sput-object v0, Ld/c;->a:LT/H0;

    return-void
.end method

.method public static final a()LT/H0;
    .locals 1

    sget-object v0, Ld/c;->a:LT/H0;

    return-object v0
.end method
