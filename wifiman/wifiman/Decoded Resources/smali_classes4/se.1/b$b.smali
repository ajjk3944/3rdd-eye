.class final Lse/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse/b;-><init>(LWd/f;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lse/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lse/b$b;

    invoke-direct {v0}, Lse/b$b;-><init>()V

    sput-object v0, Lse/b$b;->a:Lse/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ll9/a;
    .locals 6

    const-string v0, "firmwares"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v0

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a()Lcom/ui/common/semver/SemVer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_3

    move-object v0, v3

    move-object v2, v4

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    :goto_0
    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    if-eqz v0, :cond_4

    new-instance v1, Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/wmw/g$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/a;)V

    :cond_4
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lse/b$b;->a(Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
