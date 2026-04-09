.class final LM8/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$d;

    invoke-direct {v0}, LM8/d$d;-><init>()V

    sput-object v0, LM8/d$d;->a:LM8/d$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, La8/a;

    check-cast p3, Ljava/util/Map;

    check-cast p4, Lde/B;

    invoke-virtual {p0, p1, p2, p3, p4}, LM8/d$d;->b(Ljava/util/List;La8/a;Ljava/util/Map;Lde/B;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;La8/a;Ljava/util/Map;Lde/B;)Ljava/util/List;
    .locals 1

    const-string/jumbo v0, "signals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "devices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "statistics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "detailConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Lde/B;->b()Lic/a;

    move-result-object p4

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, p4, v0}, LM8/r;->s(Ljava/util/List;La8/a;Ljava/util/Map;Lic/a;LS8/c;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
