.class final Lre/g$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/g$l;->a(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lre/g;

.field final synthetic b:Lcom/ui/wmw/g;


# direct methods
.method constructor <init>(Lre/g;Lcom/ui/wmw/g;)V
    .locals 0

    iput-object p1, p0, Lre/g$l$a;->a:Lre/g;

    iput-object p2, p0, Lre/g$l$a;->b:Lcom/ui/wmw/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lre/g$l$a;->c()V

    return-void
.end method

.method private static final c()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "APCompare - Requesting to clear priority channels - FINISHED"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lre/g$l$a;->b(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;)Lgg/f;
    .locals 2

    const-string v0, "inForeground"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lre/g$l$a;->a:Lre/g;

    invoke-static {p1}, Lre/g;->k(Lre/g;)Lgg/i;

    move-result-object p1

    new-instance v0, Lre/g$l$a$a;

    iget-object v1, p0, Lre/g$l$a;->b:Lcom/ui/wmw/g;

    invoke-direct {v0, v1}, Lre/g$l$a$a;-><init>(Lcom/ui/wmw/g;)V

    invoke-virtual {p1, v0}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lre/g$l$a;->b:Lcom/ui/wmw/g;

    invoke-interface {p1}, Lcom/ui/wmw/g;->d()Lcom/ui/wmw/wifi/a$a;

    move-result-object p1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wmw/wifi/a$a;->c(Ljava/util/Set;)Lgg/b;

    move-result-object p1

    sget-object v0, Lre/g$l$a$b;->a:Lre/g$l$a$b;

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, Lre/l;

    invoke-direct {v0}, Lre/l;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
