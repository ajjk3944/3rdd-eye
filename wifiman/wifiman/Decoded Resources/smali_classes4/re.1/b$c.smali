.class final Lre/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/b;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lje/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/WifimanWizard;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;)V
    .locals 0

    iput-object p1, p0, Lre/b$c;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lre/b$c;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    new-instance v1, Lre/g;

    invoke-direct {v1, p1, v0}, Lre/g;-><init>(Ljava/lang/String;Lcom/ui/wifiman/model/wmw/WifimanWizard;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lre/b$c;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
