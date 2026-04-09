.class final LM8/g$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/g$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/g$h;

    invoke-direct {v0}, LM8/g$h;-><init>()V

    sput-object v0, LM8/g$h;->a:LM8/g$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Ll9/a;)Ljava/util/List;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS8/c;

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lle/f;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lle/f;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lle/f;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lle/i;

    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v2

    invoke-virtual {v2}, LS8/e;->a()LS8/c;

    move-result-object v2

    if-ne v2, p1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v0, :cond_3

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_3
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LM8/g$h;->a(Ll9/a;Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
