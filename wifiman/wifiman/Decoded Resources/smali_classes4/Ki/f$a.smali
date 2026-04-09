.class final synthetic LKi/f$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKi/f;->y()Lth/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:LKi/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LKi/f$a;

    invoke-direct {v0}, LKi/f$a;-><init>()V

    sput-object v0, LKi/f$a;->a:LKi/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, LKi/f;

    const-string v3, "createSegment"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(JLKi/m;)LKi/m;
    .locals 0

    invoke-static {p1, p2, p3}, LKi/f;->c(JLKi/m;)LKi/m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, LKi/m;

    invoke-virtual {p0, v0, v1, p2}, LKi/f$a;->a(JLKi/m;)LKi/m;

    move-result-object p1

    return-object p1
.end method
