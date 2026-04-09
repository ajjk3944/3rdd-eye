.class final Lre/g$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/g;-><init>(Ljava/lang/String;Lcom/ui/wifiman/model/wmw/WifimanWizard;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lre/g;


# direct methods
.method constructor <init>(Lre/g;)V
    .locals 0

    iput-object p1, p0, Lre/g$l;->a:Lre/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wmw/g;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lre/g$l;->a:Lre/g;

    invoke-static {v0}, Lre/g;->l(Lre/g;)LFg/a;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    new-instance v1, Lre/g$l$a;

    iget-object v2, p0, Lre/g$l;->a:Lre/g;

    invoke-direct {v1, v2, p1}, Lre/g$l$a;-><init>(Lre/g;Lcom/ui/wmw/g;)V

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lre/g$l;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
