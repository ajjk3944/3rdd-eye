.class final LM8/g$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/g$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/g$f;

    invoke-direct {v0}, LM8/g$f;-><init>()V

    sput-object v0, LM8/g$f;->a:LM8/g$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lle/f;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lle/f;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lle/i;

    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v2

    invoke-virtual {v2}, LS8/e;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->V0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lle/f;->c()Lle/i;

    move-result-object p1

    invoke-virtual {p1}, Lle/i;->p()LS8/j;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, LAf/y;->c(LS8/j;)Ls9/d;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    new-instance p1, Ls9/d$b;

    const v1, 0x7f1103c6

    invoke-direct {p1, v1}, Ls9/d$b;-><init>(I)V

    :cond_2
    new-instance v1, LDf/b;

    invoke-direct {v1, v0, p1}, LDf/b;-><init>(Ljava/util/List;Ls9/d;)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LM8/g$f;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
