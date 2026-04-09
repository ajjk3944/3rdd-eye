.class final LK8/e$w$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e$w;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LK8/e$w$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK8/e$w$e;

    invoke-direct {v0}, LK8/e$w$e;-><init>()V

    sput-object v0, LK8/e$w$e;->a:LK8/e$w$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Ls9/d$a;
    .locals 3

    const-string/jumbo v0, "connectionDuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$a;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LK8/e$w$e$a;

    invoke-direct {v2, p1}, LK8/e$w$e$a;-><init>(Ljava/lang/Long;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LK8/e$w$e;->a(Ljava/lang/Long;)Ls9/d$a;

    move-result-object p1

    return-object p1
.end method
