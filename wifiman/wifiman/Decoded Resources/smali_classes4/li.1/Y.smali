.class public abstract Lli/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZh/c;

    const-string v1, "kotlin.coroutines.experimental.Continuation"

    invoke-direct {v0, v1}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lli/Y;->a:LZh/c;

    return-void
.end method

.method public static final synthetic a()LZh/c;
    .locals 1

    sget-object v0, Lli/Y;->a:LZh/c;

    return-object v0
.end method
