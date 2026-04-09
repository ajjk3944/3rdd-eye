.class final Lvj/g$e;
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
.field public static final a:Lvj/g$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvj/g$e;

    invoke-direct {v0}, Lvj/g$e;-><init>()V

    sput-object v0, Lvj/g$e;->a:Lvj/g$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)Lzi/j;
    .locals 2

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Luj/d;

    invoke-static {v0}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object v0

    new-instance v1, Lvj/g$e$a;

    invoke-direct {v1, p1}, Lvj/g$e$a;-><init>(Luj/d;)V

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, Lvj/g$e;->a(LYg/y;)Lzi/j;

    move-result-object p1

    return-object p1
.end method
