.class final Lvj/g$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/g;->g(Lrj/N5;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lvj/g$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvj/g$f;

    invoke-direct {v0}, Lvj/g$f;-><init>()V

    sput-object v0, Lvj/g$f;->a:Lvj/g$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map$Entry;)Lzi/j;
    .locals 1

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object p1

    sget-object v0, Lvj/g$f$a;->a:Lvj/g$f$a;

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lvj/g$f;->a(Ljava/util/Map$Entry;)Lzi/j;

    move-result-object p1

    return-object p1
.end method
