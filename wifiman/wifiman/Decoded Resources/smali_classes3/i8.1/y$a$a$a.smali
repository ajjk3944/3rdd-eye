.class public final Li8/y$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/y$a$a;->a(Li8/s;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/y;

.field final synthetic b:Li8/s;


# direct methods
.method public constructor <init>(Li8/y;Li8/s;)V
    .locals 0

    iput-object p1, p0, Li8/y$a$a$a;->a:Li8/y;

    iput-object p2, p0, Li8/y$a$a$a;->b:Li8/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Li8/y$a$a$a;->a:Li8/y;

    invoke-static {v0}, Li8/y;->i(Li8/y;)LFg/a;

    move-result-object v0

    new-instance v1, Ll9/a;

    iget-object v2, p0, Li8/y$a$a$a;->b:Li8/s;

    invoke-direct {v1, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

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
