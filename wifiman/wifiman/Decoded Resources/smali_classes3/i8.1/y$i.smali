.class final Li8/y$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/y;->s(Landroid/content/Intent;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/y;


# direct methods
.method constructor <init>(Li8/y;)V
    .locals 0

    iput-object p1, p0, Li8/y$i;->a:Li8/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;)Lgg/r;
    .locals 2

    const-string/jumbo v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li8/y$i;->a:Li8/y;

    invoke-static {v0, p1}, Li8/y;->h(Li8/y;Landroid/net/Uri;)Lgg/n;

    move-result-object v0

    new-instance v1, Li8/y$i$a;

    invoke-direct {v1, p1}, Li8/y$i$a;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lgg/n;->g(Lkg/f;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Li8/y$i;->a(Landroid/net/Uri;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
