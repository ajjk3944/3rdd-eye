.class final Lbe/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbe/d;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbe/d;


# direct methods
.method constructor <init>(Lbe/d;)V
    .locals 0

    iput-object p1, p0, Lbe/d$b;->a:Lbe/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lce/b;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbe/d$b;->a:Lbe/d;

    invoke-static {v0}, Lbe/d;->e(Lbe/d;)Lcom/ui/wifiman/model/support/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/support/c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/support/c;-><init>(Lce/b;)V

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/support/a;->b(Lcom/ui/wifiman/model/support/a$a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lce/b;

    invoke-virtual {p0, p1}, Lbe/d$b;->a(Lce/b;)V

    return-void
.end method
