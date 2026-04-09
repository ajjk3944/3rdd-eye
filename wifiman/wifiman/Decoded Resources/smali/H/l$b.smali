.class public final LH/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LH/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/l$b;

    invoke-direct {v0}, LH/l$b;-><init>()V

    sput-object v0, LH/l$b;->a:LH/l$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LH/l$b;->c(Ljava/lang/Object;)LH/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lc0/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, LH/l;

    invoke-virtual {p0, p1, p2}, LH/l$b;->d(Lc0/m;LH/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;)LH/l;
    .locals 10

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, LL0/T;->b(II)J

    move-result-wide v6

    sget-object v0, LH/p$a$a;->a:LH/p$a$a;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, LH/p$a$a;->c(Ljava/lang/Object;)LH/p;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LH/l;

    const/4 v9, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, LH/l;-><init>(Ljava/lang/String;JLH/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public d(Lc0/m;LH/l;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p2}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, LH/l;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2}, LH/l;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, LH/p$a$a;->a:LH/p$a$a;

    invoke-virtual {p2}, LH/l;->j()LH/p;

    move-result-object p2

    invoke-virtual {v3, p1, p2}, LH/p$a$a;->d(Lc0/m;LH/p;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, v1, v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
