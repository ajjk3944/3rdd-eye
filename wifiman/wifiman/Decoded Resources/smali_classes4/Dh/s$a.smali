.class LDh/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/s;->M0(LDh/s$c;)LBh/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lpi/G0;

.field final synthetic b:LDh/s;


# direct methods
.method constructor <init>(LDh/s;Lpi/G0;)V
    .locals 0

    iput-object p1, p0, LDh/s$a;->b:LDh/s;

    iput-object p2, p0, LDh/s$a;->a:Lpi/G0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 4

    new-instance v0, Lxi/k;

    invoke-direct {v0}, Lxi/k;-><init>()V

    iget-object v1, p0, LDh/s$a;->b:LDh/s;

    invoke-virtual {v1}, LDh/s;->f()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/z;

    iget-object v3, p0, LDh/s$a;->a:Lpi/G0;

    invoke-interface {v2, v3}, LBh/z;->c(Lpi/G0;)LBh/z;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDh/s$a;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
