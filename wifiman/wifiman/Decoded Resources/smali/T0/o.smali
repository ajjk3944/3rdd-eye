.class public abstract LT0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT0/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT0/p;-><init>(Z)V

    sput-object v0, LT0/o;->a:LT0/p;

    return-void
.end method

.method public static final synthetic a()LT0/p;
    .locals 1

    sget-object v0, LT0/o;->a:LT0/p;

    return-object v0
.end method
