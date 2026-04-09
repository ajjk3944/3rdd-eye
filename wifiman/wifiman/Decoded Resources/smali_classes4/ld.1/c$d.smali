.class final Lld/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lld/c;-><init>(LUb/a;Lmd/b;LP7/a;LQ7/a;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lld/c;


# direct methods
.method constructor <init>(Lld/c;)V
    .locals 0

    iput-object p1, p0, Lld/c$d;->a:Lld/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmd/a;)Lgg/f;
    .locals 2

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lld/c$d;->a:Lld/c;

    invoke-static {v0}, Lld/c;->c(Lld/c;)LP7/a;

    move-result-object v0

    new-instance v1, LP7/c$a;

    invoke-virtual {p1}, Lmd/a;->e()LT7/b;

    move-result-object p1

    invoke-direct {v1, p1}, LP7/c$a;-><init>(LT7/b;)V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmd/a;

    invoke-virtual {p0, p1}, Lld/c$d;->a(Lmd/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
