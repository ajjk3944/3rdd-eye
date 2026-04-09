.class public final Lg2/m$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m$f;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:Lg2/e;


# direct methods
.method public constructor <init>(LT/z1;Lg2/e;)V
    .locals 0

    iput-object p1, p0, Lg2/m$f$a;->a:LT/z1;

    iput-object p2, p0, Lg2/m$f$a;->b:Lg2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 3

    iget-object v0, p0, Lg2/m$f$a;->a:LT/z1;

    invoke-static {v0}, Lg2/m;->m(LT/z1;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    iget-object v2, p0, Lg2/m$f$a;->b:Lg2/e;

    invoke-virtual {v2, v1}, Lg2/e;->o(Lf2/k;)V

    goto :goto_0

    :cond_0
    return-void
.end method
