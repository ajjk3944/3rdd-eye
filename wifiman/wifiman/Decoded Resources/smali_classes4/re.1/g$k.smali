.class final Lre/g$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

    iput-object p1, p0, Lre/g$k;->a:Lre/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lre/g$k;->a:Lre/g;

    invoke-static {p1}, Lre/g;->l(Lre/g;)LFg/a;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "APCompare - IN FOREGROUND"

    invoke-static {v1, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lre/g$k;->a(Lhg/c;)V

    return-void
.end method
