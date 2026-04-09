.class final LO8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO8/c;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lhc/b;LP8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO8/c;


# direct methods
.method constructor <init>(LO8/c;)V
    .locals 0

    iput-object p1, p0, LO8/c$a;->a:LO8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LO8/c$a;->a:LO8/c;

    invoke-static {p1}, LO8/c;->c(LO8/c;)Lgg/b;

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

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LO8/c$a;->a(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
