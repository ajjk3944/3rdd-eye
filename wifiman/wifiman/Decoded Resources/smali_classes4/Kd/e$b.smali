.class public final LKd/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKd/e;->b(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LKd/e;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LKd/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LKd/e$b;->a:LKd/e;

    iput-object p2, p0, LKd/e$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LKd/e$b;->a:LKd/e;

    invoke-static {v0}, LKd/e;->g(LKd/e;)Lac/e;

    move-result-object v0

    iget-object v1, p0, LKd/e$b;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lac/e;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
