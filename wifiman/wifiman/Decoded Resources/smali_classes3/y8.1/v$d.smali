.class final Ly8/v$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/v;-><init>(Ldd/g;LZc/c;Lad/i;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldd/g;


# direct methods
.method constructor <init>(Ldd/g;)V
    .locals 0

    iput-object p1, p0, Ly8/v$d;->a:Ldd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ly8/v$d;->a:Ldd/g;

    check-cast p1, Linet/ipaddr/g;

    invoke-virtual {p1}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "toNormalizedString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x1388

    const/16 v2, 0x12c

    invoke-interface {v0, p1, v1, v2}, Ldd/a;->a(Ljava/lang/String;II)Lgg/i;

    move-result-object p1

    sget-object v0, Ly8/v$d$a;->a:Ly8/v$d$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ly8/v$d;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
