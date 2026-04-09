.class final LI7/P$M$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$M;->h(LI7/P$b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI7/P$M$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/P$M$a;

    invoke-direct {v0}, LI7/P$M$a;-><init>()V

    sput-object v0, LI7/P$M$a;->a:LI7/P$M$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {p1, v2, v3, v0, v1}, Lgg/i;->S(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LI7/P$M$a;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
