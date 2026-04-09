.class final Lo7/l$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/l$f;->a(LYg/J;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo7/l;


# direct methods
.method constructor <init>(Lo7/l;)V
    .locals 0

    iput-object p1, p0, Lo7/l$f$a;->a:Lo7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lq7/c;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lo7/l$f$a;->c(Lq7/c;Lgg/j;)V

    return-void
.end method

.method private static final c(Lq7/c;Lgg/j;)V
    .locals 1

    const-string v0, "$cache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lo7/l$f$a;->b(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/s;)LDj/a;
    .locals 4

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq7/c;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance v1, Lo7/m;

    invoke-direct {v1, v0}, Lo7/m;-><init>(Lq7/c;)V

    sget-object v2, Lgg/a;->ERROR:Lgg/a;

    invoke-static {v1, v2}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v1

    iget-object v2, p0, Lo7/l$f$a;->a:Lo7/l;

    const-string/jumbo v3, "servers"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "cache"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1, v0}, Lo7/l;->h(Lo7/l;Ljava/util/List;Lq7/c;)Lgg/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
