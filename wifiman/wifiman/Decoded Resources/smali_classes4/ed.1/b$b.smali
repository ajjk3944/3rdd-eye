.class final Led/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/b;->b()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Led/b;


# direct methods
.method constructor <init>(Led/b;)V
    .locals 0

    iput-object p1, p0, Led/b$b;->a:Led/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Led/b$b;->a:Led/b;

    invoke-static {v0}, Led/b;->c(Led/b;)Lcom/ui/wifiman/model/support/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/support/a$a$b;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/support/a$a$b;-><init>(Ljava/util/Set;)V

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/support/a;->b(Lcom/ui/wifiman/model/support/a$a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Led/b$b;->a(Ljava/util/Set;)V

    return-void
.end method
