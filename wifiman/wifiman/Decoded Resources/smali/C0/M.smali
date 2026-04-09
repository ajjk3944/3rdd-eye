.class public abstract LC0/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LC0/M$a;->a:LC0/M$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, LC0/M;->a:LT/H0;

    return-void
.end method

.method public static final a()LT/H0;
    .locals 1

    sget-object v0, LC0/M;->a:LT/H0;

    return-object v0
.end method
