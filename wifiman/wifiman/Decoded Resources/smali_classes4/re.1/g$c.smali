.class final Lre/g$c;
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

    iput-object p1, p0, Lre/g$c;->a:Lre/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lre/g;Lcom/ui/wmw/wifi/a;)Z
    .locals 0

    invoke-static {p0, p1}, Lre/g$c;->d(Lre/g;Lcom/ui/wmw/wifi/a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/ui/wmw/wifi/a;)Lre/a$a;
    .locals 0

    invoke-static {p0}, Lre/g$c;->e(Lcom/ui/wmw/wifi/a;)Lre/a$a;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lre/g;Lcom/ui/wmw/wifi/a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/wifi/a;->n()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lre/g;->f()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final e(Lcom/ui/wmw/wifi/a;)Lre/a$a;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lre/a$a;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/a;->c()Lh9/a;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/a;->a()LS8/c;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/a;->d()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lre/a$a;-><init>(Lh9/a;LS8/c;I)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lre/g$c;->c(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/util/Collection;)Ljava/util/Set;
    .locals 2

    const-string v0, "scanResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    iget-object v0, p0, Lre/g$c;->a:Lre/g;

    new-instance v1, Lre/h;

    invoke-direct {v1, v0}, Lre/h;-><init>(Lre/g;)V

    invoke-static {p1, v1}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    new-instance v0, Lre/i;

    invoke-direct {v0}, Lre/i;-><init>()V

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
