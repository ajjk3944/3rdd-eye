.class public abstract LMi/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LMi/u$a;->a:LMi/u$a;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/q;

    sput-object v0, LMi/u;->a:Lmh/q;

    return-void
.end method

.method public static final synthetic a()Lmh/q;
    .locals 1

    sget-object v0, LMi/u;->a:Lmh/q;

    return-object v0
.end method
