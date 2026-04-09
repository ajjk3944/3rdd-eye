.class final Lve/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lve/b;->a(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lve/b;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lve/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lve/b$c;->a:Lve/b;

    iput-object p2, p0, Lve/b$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 4

    const-string v0, "logcatPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/e;->a:LAg/e;

    iget-object v1, p0, Lve/b$c;->a:Lve/b;

    invoke-static {v1}, Lve/b;->d(Lve/b;)Lgg/z;

    move-result-object v1

    iget-object v2, p0, Lve/b$c;->a:Lve/b;

    invoke-static {v2}, Lve/b;->h(Lve/b;)Lgg/z;

    move-result-object v2

    iget-object v3, p0, Lve/b$c;->a:Lve/b;

    invoke-static {v3}, Lve/b;->f(Lve/b;)Lve/g;

    move-result-object v3

    invoke-interface {v3}, Lve/g;->b()Lgg/z;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, LAg/e;->b(Lgg/D;Lgg/D;Lgg/D;)Lgg/z;

    move-result-object v0

    new-instance v1, Lve/b$c$a;

    iget-object v2, p0, Lve/b$c;->b:Ljava/lang/String;

    iget-object v3, p0, Lve/b$c;->a:Lve/b;

    invoke-direct {v1, v2, v3, p1}, Lve/b$c$a;-><init>(Ljava/lang/String;Lve/b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lve/b$c;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
