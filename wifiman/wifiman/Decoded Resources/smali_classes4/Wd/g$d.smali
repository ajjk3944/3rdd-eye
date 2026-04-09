.class final LWd/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWd/g;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;Lfd/b;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LWd/g;


# direct methods
.method constructor <init>(LWd/g;)V
    .locals 0

    iput-object p1, p0, LWd/g$d;->a:LWd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/D;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, LWd/g$d;->a:LWd/g;

    invoke-static {v0, p1}, LWd/g;->a(LWd/g;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LWd/g$d;->a(Ll9/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
