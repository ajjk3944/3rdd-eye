.class final synthetic LIi/D0$i;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIi/D0;->getOnJoin()LSi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:LIi/D0$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/D0$i;

    invoke-direct {v0}, LIi/D0$i;-><init>()V

    sput-object v0, LIi/D0$i;->a:LIi/D0$i;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, LIi/D0;

    const-string v3, "registerSelectForOnJoin"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(LIi/D0;LSi/e;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2, p3}, LIi/D0;->t(LIi/D0;LSi/e;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/D0;

    invoke-static {p2}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, LIi/D0$i;->a(LIi/D0;LSi/e;Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
