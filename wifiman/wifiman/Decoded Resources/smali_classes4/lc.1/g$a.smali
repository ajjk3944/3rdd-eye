.class public final Llc/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llc/g;->g(Llc/a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Llc/g;

.field final synthetic b:Llc/a;


# direct methods
.method public constructor <init>(Llc/g;Llc/a;)V
    .locals 0

    iput-object p1, p0, Llc/g$a;->a:Llc/g;

    iput-object p2, p0, Llc/g$a;->b:Llc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Llc/g$a;->a:Llc/g;

    invoke-static {v0}, Llc/g;->e(Llc/g;)LFg/c;

    move-result-object v0

    iget-object v1, p0, Llc/g$a;->a:Llc/g;

    iget-object v2, p0, Llc/g$a;->b:Llc/a;

    invoke-static {v1, v2}, Llc/g;->f(Llc/g;Llc/a;)Llc/d$a;

    move-result-object v1

    invoke-virtual {v0, v1}, LFg/c;->h(Ljava/lang/Object;)V

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
