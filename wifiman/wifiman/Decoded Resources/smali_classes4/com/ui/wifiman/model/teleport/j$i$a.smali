.class final Lcom/ui/wifiman/model/teleport/j$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$i;->a(LLd/e;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/j$i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/j$i$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/j$i$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/j$i$a;->a:Lcom/ui/wifiman/model/teleport/j$i$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)Lgg/D;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "component1(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "component2(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p1

    const-string v2, "component3(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LTd/a;

    invoke-interface {p1, v1, v0}, LTd/a;->c(Ljava/lang/String;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$i$a;->a(LYg/y;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
