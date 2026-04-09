.class final Ljj/i$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/i;->Q()LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljj/i;


# direct methods
.method constructor <init>(Ljj/i;)V
    .locals 0

    iput-object p1, p0, Ljj/i$i;->a:Ljj/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ljj/i$i;->a:Ljj/i;

    invoke-virtual {v0}, Ljj/i;->G()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljj/i$i;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
