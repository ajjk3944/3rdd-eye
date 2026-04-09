.class final Ln8/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/h;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/h$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/h$c;

    invoke-direct {v0}, Ln8/h$c;-><init>()V

    sput-object v0, Ln8/h$c;->a:Ln8/h$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)LYg/s;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LZc/e$a;->a()Linet/ipaddr/g;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p1}, LZc/e;->c()LZc/e$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LZc/e$a;->a()Linet/ipaddr/g;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, Ln8/h$c;->a(LZc/e;)LYg/s;

    move-result-object p1

    return-object p1
.end method
