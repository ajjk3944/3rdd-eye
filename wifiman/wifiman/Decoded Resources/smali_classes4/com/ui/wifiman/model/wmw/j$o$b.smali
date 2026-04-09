.class final Lcom/ui/wifiman/model/wmw/j$o$b;
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

.field final synthetic b:Lcom/ui/wifiman/model/wmw/b$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$o$b;->a:Lcom/ui/wifiman/model/wmw/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j$o$b;->b:Lcom/ui/wifiman/model/wmw/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/WMWizard$a$a;)Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$o$b;->a:Lcom/ui/wifiman/model/wmw/j;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$o$b;->b:Lcom/ui/wifiman/model/wmw/b$a;

    invoke-static {v0, p1, v1}, Lcom/ui/wifiman/model/wmw/j;->i(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wmw/WMWizard$a$a;Lcom/ui/wifiman/model/wmw/b$a;)Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$o$b;->a(Lcom/ui/wmw/WMWizard$a$a;)Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;

    move-result-object p1

    return-object p1
.end method
