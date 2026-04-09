.class final Leb/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c;->j()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$b;

    invoke-direct {v0}, Leb/c$b;-><init>()V

    sput-object v0, Leb/c$b;->a:Leb/c$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/b;)Ljava/util/List;
    .locals 3

    const-string/jumbo v0, "apps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgb/b;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lgb/b;->c()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/List;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgb/b;

    invoke-virtual {p0, p1}, Leb/c$b;->a(Lgb/b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
