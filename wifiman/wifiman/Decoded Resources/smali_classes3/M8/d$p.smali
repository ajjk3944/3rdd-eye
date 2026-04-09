.class final LM8/d$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$p;

    invoke-direct {v0}, LM8/d$p;-><init>()V

    sput-object v0, LM8/d$p;->a:LM8/d$p;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzf/a;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, LM8/d$p;->b(Lzf/a;Ljava/lang/Integer;Ljava/lang/Integer;)Lzf/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lzf/a;Ljava/lang/Integer;Ljava/lang/Integer;)Lzf/f;
    .locals 3

    const-string/jumbo v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "apCount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "apInterfereCount"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzf/f;

    new-instance v1, Lzf/e;

    sget-object v2, Lzf/a;->AP:Lzf/a;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v1, v2, p2}, Lzf/e;-><init>(Lzf/a;I)V

    new-instance p2, Lzf/e;

    sget-object v2, Lzf/a;->INTERFERE:Lzf/a;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {p2, v2, p3}, Lzf/e;-><init>(Lzf/a;I)V

    filled-new-array {v1, p2}, [Lzf/e;

    move-result-object p2

    invoke-static {p2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lzf/f;-><init>(Lzf/a;Ljava/util/List;)V

    return-object v0
.end method
