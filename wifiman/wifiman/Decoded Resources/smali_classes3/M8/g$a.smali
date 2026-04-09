.class final LM8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/g$a$b;
    }
.end annotation


# static fields
.field public static final a:LM8/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/g$a;

    invoke-direct {v0}, LM8/g$a;-><init>()V

    sput-object v0, LM8/g$a;->a:LM8/g$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ljava/util/List;

    check-cast p3, La8/a;

    check-cast p4, Ljava/util/Map;

    check-cast p5, Lde/B;

    invoke-virtual/range {p0 .. p5}, LM8/g$a;->b(Ll9/a;Ljava/util/List;La8/a;Ljava/util/Map;Lde/B;)LEe/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ljava/util/List;La8/a;Ljava/util/Map;Lde/B;)LEe/g;
    .locals 8

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signals"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "devices"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signalStats"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiNetworkConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS8/c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p5}, Lde/B;->b()Lic/a;

    move-result-object p5

    invoke-static {p2, p3, p4, p5, p1}, LM8/r;->s(Ljava/util/List;La8/a;Ljava/util/Map;Lic/a;LS8/c;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LAf/c;

    new-instance p5, LDf/a$a;

    invoke-direct {p5, p4}, LDf/a$a;-><init>(LAf/c;)V

    invoke-interface {p3, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    if-nez p3, :cond_4

    new-instance p2, LDf/a$b;

    const/4 p3, -0x1

    if-nez p1, :cond_2

    move p4, p3

    goto :goto_2

    :cond_2
    sget-object p4, LM8/g$a$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p5

    aget p4, p4, p5

    :goto_2
    if-ne p4, p3, :cond_3

    new-instance p1, Ls9/d$b;

    const p3, 0x7f1103f6

    invoke-direct {p1, p3}, Ls9/d$b;-><init>(I)V

    goto :goto_3

    :cond_3
    new-instance p3, Ls9/d$a;

    new-instance p4, LM8/g$a$a;

    invoke-direct {p4, p1}, LM8/g$a$a;-><init>(LS8/c;)V

    const-string/jumbo p1, "empty"

    invoke-direct {p3, p1, p4}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object p1, p3

    :goto_3
    invoke-direct {p2, p1}, LDf/a$b;-><init>(Ls9/d;)V

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    :cond_4
    move-object v5, p3

    new-instance p1, LEe/g$a$a;

    const-string/jumbo v2, "accessPoints"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, LEe/g;

    invoke-direct {p1, v0}, LEe/g;-><init>(Ljava/util/List;)V

    return-object p1
.end method
