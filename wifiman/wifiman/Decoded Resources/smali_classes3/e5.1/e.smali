.class public final synthetic Le5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Le5/f;


# direct methods
.method public synthetic constructor <init>(Le5/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/e;->a:Le5/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le5/e;->a:Le5/f;

    invoke-static {v0}, Le5/f;->e(Le5/f;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
