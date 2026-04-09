.class public final LH8/q$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/q$d$a;->a(Ljava/lang/Throwable;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/q;


# direct methods
.method public constructor <init>(LH8/q;)V
    .locals 0

    iput-object p1, p0, LH8/q$d$a$a;->a:LH8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, LH8/q$d$a$a;->a:LH8/q;

    invoke-static {v0}, LH8/q;->u0(LH8/q;)Lhc/b;

    move-result-object v0

    new-instance v1, Lhc/a;

    new-instance v2, Lec/a$a;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const v4, 0x7f11031e

    invoke-direct {v2, v4, v3}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhc/a;-><init>(Lec/a;Z)V

    invoke-interface {v0, v1}, Lhc/b;->a(Lhc/a;)V

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
