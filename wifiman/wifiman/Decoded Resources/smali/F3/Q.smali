.class public final synthetic LF3/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LF3/T;


# direct methods
.method public synthetic constructor <init>(LF3/T;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF3/Q;->a:LF3/T;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF3/Q;->a:LF3/T;

    invoke-virtual {v0}, LF3/T;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
