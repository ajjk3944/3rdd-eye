.class public final synthetic LK6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LK6/c;


# direct methods
.method public synthetic constructor <init>(LK6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/s;->a:LK6/c;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LK6/s;->a:LK6/c;

    invoke-interface {v0}, LK6/c;->d()LG6/N;

    move-result-object v0

    return-object v0
.end method
