.class public interface abstract LB/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# virtual methods
.method public abstract getKey()Lmh/l;
.end method

.method public getType()Lmh/l;
    .locals 1

    sget-object v0, LB/o$a$a;->a:LB/o$a$a;

    return-object v0
.end method
