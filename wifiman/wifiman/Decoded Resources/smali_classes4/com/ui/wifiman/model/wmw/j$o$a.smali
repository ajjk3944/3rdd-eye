.class final Lcom/ui/wifiman/model/wmw/j$o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j$o;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/j;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/d$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$o$a;->a:Lcom/ui/wifiman/model/wmw/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j$o$a;->b:Lcom/ui/wifiman/model/wmw/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j$o$a;->a:Lcom/ui/wifiman/model/wmw/j;

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$o$a;->b:Lcom/ui/wifiman/model/wmw/d$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/d$a;->b()Lh9/a;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$o$a;->b:Lcom/ui/wifiman/model/wmw/d$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/d$a;->a()Lh9/a;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/ui/wifiman/model/wmw/j;->l(Lcom/ui/wifiman/model/wmw/j;Lh9/a;Lh9/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$o$a;->a(Ljava/lang/Long;)LDj/a;

    move-result-object p1

    return-object p1
.end method
