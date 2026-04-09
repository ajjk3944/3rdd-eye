.class public abstract LLg/n$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field private static volatile a:LLg/n;


# direct methods
.method public static a()LLg/n;
    .locals 1

    sget-object v0, LLg/n$c;->a:LLg/n;

    if-nez v0, :cond_0

    new-instance v0, LLg/n$e;

    invoke-direct {v0}, LLg/n$e;-><init>()V

    sput-object v0, LLg/n$c;->a:LLg/n;

    :cond_0
    sget-object v0, LLg/n$c;->a:LLg/n;

    return-object v0
.end method
