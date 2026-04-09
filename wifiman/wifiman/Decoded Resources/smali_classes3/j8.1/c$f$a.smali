.class public final Lj8/c$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj8/c$f;->a(LT7/b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj8/c;

.field final synthetic b:LT7/b;


# direct methods
.method public constructor <init>(Lj8/c;LT7/b;)V
    .locals 0

    iput-object p1, p0, Lj8/c$f$a;->a:Lj8/c;

    iput-object p2, p0, Lj8/c$f$a;->b:LT7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj8/c$f$a;->a:Lj8/c;

    iget-object v1, p0, Lj8/c$f$a;->b:LT7/b;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Lj8/c$f$a;->b:LT7/b;

    invoke-static {v0, v1}, Lj8/c;->h(Lj8/c;LT7/b;)V

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
