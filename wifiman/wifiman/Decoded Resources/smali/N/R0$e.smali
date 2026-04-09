.class final LN/R0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0;-><init>(Ljava/lang/Object;Lr/i;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/R0;


# direct methods
.method constructor <init>(LN/R0;)V
    .locals 0

    iput-object p1, p0, LN/R0$e;->a:LN/R0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LN/R0$e;->a:LN/R0;

    invoke-virtual {v0}, LN/R0;->l()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/R0$e;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
