.class final Lx8/j$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx8/j$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$f;

    invoke-direct {v0}, Lx8/j$f;-><init>()V

    sput-object v0, Lx8/j$f;->a:Lx8/j$f;

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

    check-cast p1, Ll9/a;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ll9/a;

    check-cast p4, Ll9/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lx8/j$f;->b(Ll9/a;Ljava/util/List;Ll9/a;Ll9/a;)LEe/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ljava/util/List;Ll9/a;Ll9/a;)LEe/g;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "signalCards"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEe/g$a;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LEe/g$a$a;

    invoke-virtual {p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LEe/g$a$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    check-cast p2, Ljava/util/Collection;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-eqz p4, :cond_1

    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p3, :cond_2

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance p1, LEe/g;

    invoke-direct {p1, v0}, LEe/g;-><init>(Ljava/util/List;)V

    return-object p1
.end method
