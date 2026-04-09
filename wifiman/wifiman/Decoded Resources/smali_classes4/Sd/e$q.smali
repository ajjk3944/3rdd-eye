.class final LSd/e$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSd/e$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$q;

    invoke-direct {v0}, LSd/e$q;-><init>()V

    sput-object v0, LSd/e$q;->a:LSd/e$q;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;LYg/s;)Ll9/a;
    .locals 9

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSd/d$b;

    invoke-virtual {p2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->n()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    if-nez p1, :cond_1

    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    invoke-virtual {p1}, LSd/d$b;->a()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/console/e;->f()Ljava/lang/String;

    move-result-object p2

    if-nez v0, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    invoke-static {p2, v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    :goto_1
    if-nez p2, :cond_3

    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    new-instance p2, Ll9/a;

    invoke-virtual {p1}, LSd/d$b;->a()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LSd/d$b;->b()Linet/ipaddr/g;

    move-result-object v5

    invoke-virtual {p1}, LSd/d$b;->c()Lh9/a;

    move-result-object v4

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v7

    new-instance p1, LSd/e$b$a;

    const/4 v8, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, LSd/e$b$a;-><init>(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, LYg/s;

    invoke-virtual {p0, p1, p2}, LSd/e$q;->a(Ll9/a;LYg/s;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
