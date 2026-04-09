.class final Lcom/ui/wifiman/model/teleport/j$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j;->c()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/j$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/j$k;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/j$k;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/j$k;->a:Lcom/ui/wifiman/model/teleport/j$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/Set;
    .locals 1

    const-string v0, "accounts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/j$k$a;->a:Lcom/ui/wifiman/model/teleport/j$k$a;

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$k;->a(Ljava/util/List;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
