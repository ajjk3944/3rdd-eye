.class final LH8/j$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/j$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/j$o;

    invoke-direct {v0}, LH8/j$o;-><init>()V

    sput-object v0, LH8/j$o;->a:LH8/j$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LCi/c;
    .locals 10

    const-string/jumbo v0, "consoleDeletable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    new-instance v9, LBe/N$a;

    sget-object v1, LH8/j$a;->PASTE_INVITATION:LH8/j$a;

    invoke-virtual {v1}, LH8/j$a;->getId()Ljava/lang/String;

    move-result-object v2

    sget-object v1, LPe/a;->a:LPe/a;

    invoke-virtual {v1}, LPe/a;->j()Ls9/b;

    move-result-object v3

    new-instance v4, Ls9/d$b;

    const v1, 0x7f11030d

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, LBe/N$a;-><init>(Ljava/lang/String;Ls9/b;Ls9/d;ZLBe/N$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LBe/N$a;

    sget-object v1, LH8/j$a;->REMOVE_CONNECTION:LH8/j$a;

    invoke-virtual {v1}, LH8/j$a;->getId()Ljava/lang/String;

    move-result-object v2

    sget-object v1, LN9/b;->a:LN9/b;

    invoke-virtual {v1}, LN9/b;->L()Ls9/b;

    move-result-object v3

    new-instance v4, Ls9/d$b;

    const v1, 0x7f110310

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    sget-object v6, LBe/N$a$a;->DESTRUCTIVE:LBe/N$a$a;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, LBe/N$a;-><init>(Ljava/lang/String;Ls9/b;Ls9/d;ZLBe/N$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LH8/j$o;->a(Ljava/lang/Boolean;)LCi/c;

    move-result-object p1

    return-object p1
.end method
