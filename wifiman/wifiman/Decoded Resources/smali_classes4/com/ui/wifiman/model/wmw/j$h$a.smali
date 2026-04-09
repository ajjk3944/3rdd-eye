.class final Lcom/ui/wifiman/model/wmw/j$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j$h;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$h$a;->a:Lcom/ui/wifiman/model/wmw/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Ll9/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll9/a;

    new-instance v0, Lcom/ui/wifiman/model/wmw/b$c$c$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$h$a;->a:Lcom/ui/wifiman/model/wmw/b;

    sget-object v2, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/b$c$c$b;-><init>(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;)V

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$h$a;->a(Ljava/lang/Long;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
