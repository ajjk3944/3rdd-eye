.class final LP8/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/b;->o0(LIf/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/b;


# direct methods
.method constructor <init>(LP8/b;)V
    .locals 0

    iput-object p1, p0, LP8/b$c;->a:LP8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/d$a;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/b$c;->a:LP8/b;

    invoke-static {v0}, LP8/b;->q0(LP8/b;)Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/d$a;->b()Lh9/a;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->b(Lh9/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/d$a;

    invoke-virtual {p0, p1}, LP8/b$c;->a(Lcom/ui/wifiman/model/wmw/d$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
